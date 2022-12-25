package com.example.demo;

//import java.time.LocalDate;
//import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class user {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String LogType;
    private String d;
    private String t;
    private String i;
    
    

    user() {}

    user(String LogType,String d,String t,String i)

    {

        this.setLogType(LogType);

        this.setD(d);
        
        this.setT(t);
        
        this.setI(i);

    }

	public String getLogType() {
		return LogType;
	}

	public void setLogType(String logType) {
		LogType = logType;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}
}
