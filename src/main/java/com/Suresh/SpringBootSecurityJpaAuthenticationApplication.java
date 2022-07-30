package com.Suresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Suresh.Repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringBootSecurityJpaAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJpaAuthenticationApplication.class, args);
	}

}
