package com.bridgelabz.eureka;

/***************************************************************************************
 * Created By:Medini P.D 
 * Date:- 11/08/2018 
 * Purpose: EurekaServerApplication main class
 ***************************************************************************************/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UserEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserEurekaServerApplication.class, args);
	}
}
