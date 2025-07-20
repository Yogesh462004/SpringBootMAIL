package com.nit;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class Service1 {
  @Autowired	
 private JavaMailSender sender;
  @Value("${spring.mail.username}")
 private String frommail ;
  
  public String Sendmsg(String msg,String[]tomails) throws Exception {
	  MimeMessage messag=sender.createMimeMessage();
	  MimeMessageHelper helper=new MimeMessageHelper(messag,true);
	  helper.setFrom(frommail);
	  helper.setCc(tomails);
	  helper.setSubject("OPEN IT TO KNOW");
	  helper.setText(msg);
	  sender.send(messag);
	  return "mail sent";
	  
  }
}
