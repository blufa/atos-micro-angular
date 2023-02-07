package atos.sn.userservice;

import atos.sn.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDiscoveryClient
@SpringBootApplication
public class UserserviceApplication {
	@Autowired
	private UserRepository _repository;

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

}
