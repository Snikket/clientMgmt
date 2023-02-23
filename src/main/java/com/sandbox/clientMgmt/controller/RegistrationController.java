package com.sandbox.clientMgmt.controller;

import com.sandbox.clientMgmt.command.RegisterClientCommand;
import com.sandbox.clientMgmt.command.RegisterConversionCommand;
import com.sandbox.clientMgmt.entity.AffiliateClient;
import com.sandbox.clientMgmt.model.RegisterClientModel;
import com.sandbox.clientMgmt.model.RegisterConversionModel;
import com.sandbox.clientMgmt.repository.AffiliateClientRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.UUID;


@RestController
@RequestMapping("/register")
public class RegistrationController {

    Logger logger = Logger.getLogger("CommandControllerLogger");
    @Autowired
    AffiliateClientRepository repository;
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test(){
        AffiliateClient client = new AffiliateClient();
        client.setClickId(UUID.randomUUID());
        client.setCreationDate(new Date());
        client.setUserAgent("Agent");
        client.setReferralCode("12345");
        repository.save(client);
        return client.getClientId().toString();
    }
    /** Registers a new client with the system.
     * @return A UUID string representing the new client's ID
     * @param command includes all the information needed to register the new client
     *
     */
    @RequestMapping(method = RequestMethod.POST, value = "/client", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String registerClient(@RequestBody RegisterClientCommand command){
        logger.debug("POST /individual/ JSON=" + command.toString());
        RestTemplate restTemplate = new RestTemplate();
        RegisterClientModel model = restTemplate.getForObject("https://v14ok.wiremockapi.cloud/tap/clicks", RegisterClientModel.class );
        return "1234";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/conversion", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public RegisterConversionModel registerConversion(@RequestBody RegisterConversionCommand command){

        return new RegisterConversionModel();
    }

}
