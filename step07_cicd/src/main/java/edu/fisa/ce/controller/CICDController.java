package edu.fisa.ce.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("reqRES************");
		
		return "success";
	}
}