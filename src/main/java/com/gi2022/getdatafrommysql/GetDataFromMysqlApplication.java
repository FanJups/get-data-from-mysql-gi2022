package com.gi2022.getdatafrommysql;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class)
public class GetDataFromMysqlApplication {
	
	//spring-boot:run -Dspring-boot.run.profiles=prod
	
	

	public static void main(String[] args) {
		
		
		SpringApplication.run(GetDataFromMysqlApplication.class, args);
		
		
				
				
	}

}
