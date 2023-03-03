package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.mailService;

@RestController
public class mailcontroller {
	@Autowired
	private mailService service;
	
	private int ss ;
	
	@GetMapping("/")
	public String home() {
		
		this.service.mailsend("HemantKumar1840136@akgec.ac.in", "send", "bhai your otp"+ss);
		System.out.println(ss);
		return "welcom";
	}
	@GetMapping("/hh")
	public String hhh() {
		System.out.println("hhhh");
		double sst= (double) Math.random();
	    ss =  (int) (sst*10000);
		System.out.println(ss);
		return "hhhh";
	}

}
