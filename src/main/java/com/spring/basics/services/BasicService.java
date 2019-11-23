package com.spring.basics.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.basics.configuration.ServerProperties;

@Service
public class BasicService {
	private Logger logger=LoggerFactory.getLogger(BasicService.class);
	
	private ServerProperties serverProperties;
	
	@Autowired
	public BasicService(ServerProperties serverProperties) {
		this.serverProperties=serverProperties;
	}
	
	public void printServerList() {
		serverProperties.getServers()
		.forEach(System.out::println);
	}
}
