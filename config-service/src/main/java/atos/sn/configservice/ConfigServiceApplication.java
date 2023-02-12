package atos.sn.configservice;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
=======

>>>>>>> refs/remotes/origin/develop
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
<<<<<<< HEAD
public class ConfigServiceApplication implements CommandLineRunner {
	@Autowired
	@Value("${myVariable2}")
	private int port;
=======
public class ConfigServiceApplication {
>>>>>>> refs/remotes/origin/develop
	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Port : "+port);
	}
}
