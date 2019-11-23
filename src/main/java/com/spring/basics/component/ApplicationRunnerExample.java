package com.spring.basics.component;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerExample {

	@Autowired
	public ApplicationRunnerExample(ApplicationArguments args) {
		System.out.println(
				"Application Runner provide access to application arguments and run after Spring Application started.");

	}

}
