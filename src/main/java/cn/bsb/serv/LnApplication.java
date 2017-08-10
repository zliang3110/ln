package cn.bsb.serv;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@Log4j2
public class LnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LnApplication.class, args);
	}
}
