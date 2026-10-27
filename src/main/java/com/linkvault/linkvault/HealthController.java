package com.linkvault.linkvault;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class HealthController {
	@GetMapping("/health")
	String health() {
		return "LinkVault is running";
	}
}

