package pe.edu.cibertec.app_feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppFeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppFeignclientApplication.class, args);
	}

}
