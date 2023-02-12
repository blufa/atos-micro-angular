package atos.sn.cvservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CvserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvserviceApplication.class, args);
	}

}
