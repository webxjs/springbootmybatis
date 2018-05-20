package com.example.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatis.domain.Contact;
import com.example.mybatis.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	@RequestMapping(value = "/mybatis/contacts", method = RequestMethod.GET)
	public List<Contact> getUsers() {
		return contactService.findAll();
	}
}
