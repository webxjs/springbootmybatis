package com.example.demo;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.mybatis.domain.Contact;

@SpringBootApplication
@ComponentScan("com.example")

//configuration for mybatis
@MappedTypes(Contact.class)
@MapperScan("com.example.mybatis.dao")
public class MybatisExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisExampleApplication.class, args);
	}
}
