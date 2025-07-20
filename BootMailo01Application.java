package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMailo01Application implements CommandLineRunner {
    @Autowired
	private Service1 ser;
	public static void main(String[] args) {
		SpringApplication.run(BootMailo01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     		 System.out.println(ser.Sendmsg("Hello Guys",new String[] {"yp6495080@gmail.com","mohandhoni8150@gmail.com"}));
	}

}
