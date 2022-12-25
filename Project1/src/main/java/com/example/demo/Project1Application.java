package com.example.demo;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
 

	@SpringBootApplication
	
	public class  Project1Application implements CommandLineRunner {

	    @Autowired userrepo ob;

	    public static void main(String[] args)

	    {

	        SpringApplication.run( Project1Application.class, args);

	    }
	 

	    @Override

	    public void run(String... args) throws Exception

	    {

	        // Inserting the data in the mysql table.

	        //user first = new user(1, "Aayush");

	        // ob.save() method 

	        //ob.save(first);

	    }
	}