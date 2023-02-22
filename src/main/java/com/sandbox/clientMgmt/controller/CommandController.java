package com.sandbox.clientMgmt.controller;

import com.sandbox.clientMgmt.command.RegisterClientCommand;
import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@RequestMapping("/v1")
public class CommandController {

    Logger logger = Logger.getLogger("CommandControllerLogger");
    @RequestMapping(method = RequestMethod.POST, value = "/register/client", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String registerClient(@RequestBody RegisterClientCommand command){
        logger.debug("POST /individual/ JSON=" + command.toString());

        return "1234";
    }


}
