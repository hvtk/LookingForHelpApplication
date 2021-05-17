package henkvantkruijs.LookingForHelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

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
