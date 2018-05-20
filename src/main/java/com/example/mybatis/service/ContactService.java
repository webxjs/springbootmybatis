package com.example.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.dao.ContactDao;
import com.example.mybatis.domain.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactDao contactDao;
	
	public List<Contact> findAll() {
		return contactDao.findAll();
	}
}
