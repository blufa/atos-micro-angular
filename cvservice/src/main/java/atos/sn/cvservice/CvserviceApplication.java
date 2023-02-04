package atos.sn.cvservice;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CvserviceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CvserviceApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

}
