package com.dimi.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);
	}

	boolean lengthEquals0(String string) {
		return string.length() == 0;
	}

	boolean equalsEmptyString(String string, boolean s) {
		return string.equals("");
	}
}
