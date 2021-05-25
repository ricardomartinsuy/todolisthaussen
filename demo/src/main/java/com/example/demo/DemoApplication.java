
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TodoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
	
	@GetMapping("/add")
	public String add(@RequestParam(value = "task", defaultValue = "") String name) {
		return "";
	}

	@GetMapping("/remove")
	public String remove(@RequestParam(value = "id", defaultValue = "") Integer id) {
		return "";
	}

	@GetMapping("/update")
	public String update(@RequestParam(value = "id", defaultValue = "") Integer id) {
		return "";
	}

	@GetMapping("/conclude")
	public String conclude(@RequestParam(value = "id", defaultValue = "") Integer id) {
		return "";
	}

}
