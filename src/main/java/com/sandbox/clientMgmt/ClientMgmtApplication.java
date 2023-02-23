package com.sandbox.clientMgmt;

import com.sandbox.clientMgmt.repository.AffiliateClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientMgmtApplication.class, args);
		System.out.println("Hello World!");

	}

}
