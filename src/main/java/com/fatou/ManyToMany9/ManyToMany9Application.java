package com.fatou.ManyToMany9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToMany9Application implements CommandLineRunner {
	
	@Autowired
	StudentRepository sr;

	public static void main(String[] args) {
		SpringApplication.run(ManyToMany9Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		sr.insertHardcodeStudentANDCOURSE();
		
	}

}
