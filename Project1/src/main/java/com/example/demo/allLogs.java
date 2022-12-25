package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")

public class allLogs {


	@Autowired userrepo ob;
	 @GetMapping()
	    public List<user> getAllNotes()
	    {
	        return ob.findAll();
	    }
	
}
