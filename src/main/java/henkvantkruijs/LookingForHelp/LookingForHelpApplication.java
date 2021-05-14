package henkvantkruijs.LookingForHelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class LookingForHelpApplication {

	public static void main(String[] args) {

		SpringApplication.run(LookingForHelpApplication.class, args);
	}

	@GetMapping("/")
	public String say_hello() {
		return "Hello world!!! with HTTPS";
	}
}
