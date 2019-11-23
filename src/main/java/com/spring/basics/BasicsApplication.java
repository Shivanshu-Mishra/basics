package com.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.spring.basics.services.BasicService;

@SpringBootApplication
@EnableConfigurationProperties
@PropertySource("classpath:application.yaml")
public class BasicsApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(BasicsApplication.class);

	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(BasicsApplication.class);
//		app.setLazyInitialization(false);
//		app.setBannerMode(Banner.Mode.OFF);
//		System.exit(SpringApplication.exit(app.run(args)));
		SpringApplication.run(BasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Command Line runner started after SpringApplication Intialization.");

	}
	
	@Bean
	public ApplicationRunner getServer(BasicService service) {
		return args ->{
			service.printServerList();
		};
	}

}
