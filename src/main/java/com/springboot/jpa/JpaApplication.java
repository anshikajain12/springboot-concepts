package com.springboot.jpa;

import com.springboot.jpa.controller.ContactMasterController;
import com.springboot.jpa.entity.ContactsMasterEntity;
import com.springboot.jpa.repositories.ContactsMasterRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springboot.jpa.repositories")

public class JpaApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(JpaApplication.class, args);

//		ContactsMasterRepo bean = context.getBean(ContactsMasterRepo.class);
//
//		ContactsMasterEntity entity = new ContactsMasterEntity();
//		entity.setContactId(101);
//		entity.setContactName("ABC");
//		entity.setContactNumber(Long.valueOf(1234567891));
//		bean.save(entity);
//		context.close();
		SpringApplication.run(JpaApplication.class, args);
	}

}
