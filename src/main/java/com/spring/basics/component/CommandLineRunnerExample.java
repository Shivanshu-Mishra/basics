package com.spring.basics.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.basics.configuration.ServerProperties;

@Component
public class CommandLineRunnerExample implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(
				"Command line runner have access to arguments provided to application and run application specific code after application been started.");

	}

}
