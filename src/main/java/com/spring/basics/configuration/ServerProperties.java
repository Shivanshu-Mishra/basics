package com.spring.basics.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my")
public class ServerProperties {
	private List<String> servers=new ArrayList<>();
	
	public void setServers(List<String> servers) {
		this.servers = servers;
	}

	public List<String> getServers(){
		return this.servers;
	}

}
