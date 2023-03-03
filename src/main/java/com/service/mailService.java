package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class mailService {
   
	@Autowired
	private JavaMailSender mailsender;
	
	public void mailsend(String to,String Subject , String body) {
		
		SimpleMailMessage  message= new SimpleMailMessage();
		message.setFrom("yadavhema9719@gmail.com");
		message.setTo(to);
		message.setSubject(Subject);
		message.setText(body);
		
		mailsender.send(message);
		System.out.println("good");
	}
}
