package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

void m1(){

System.out.println("m1() method ");
SpringApplication.run("m2() method ");

}

void m2(){
SpringApplication.run("m1() method ");
}



}
