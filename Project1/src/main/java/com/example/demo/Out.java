package com.example.demo;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="Out/{name}")

public class Out {
	
		String LogTyp="Out",i;
	    LocalDate d;
		LocalTime t;
		
	@Autowired userrepo ob;
	@GetMapping()
	public String getCustomer(@PathVariable("name") String name)
	{
		d=LocalDate.now();
		t=LocalTime.now();
		i=name.concat(t.toString());
		
		user store=new user();
		store.setD(d.toString());
		store.setT(t.toString());
		store.setI(i.toString());
		store.setLogType(LogTyp);
		
		
		user first=new user(LogTyp, d.toString(), t.toString(),i);
		ob.save(first);
		return "Out"+" "+d.toString()+" "+t.toString()+" "+i;
		
	}
	}


