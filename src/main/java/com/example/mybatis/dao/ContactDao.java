package com.example.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.mybatis.domain.Contact;

@Mapper
public interface ContactDao {

	@Select("select * from t_contact")
	@Results({
        @Result(property = "phone", column = "phone1"),
        @Result(property = "id", column = "id")
    })
	public List<Contact> findAll();
}
