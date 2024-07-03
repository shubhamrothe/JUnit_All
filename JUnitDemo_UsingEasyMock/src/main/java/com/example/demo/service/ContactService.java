package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contact;


public interface ContactService {

	public String getNameById(Integer id);
	public List<String> getAllContactName();
	public  Contact getContactById(Integer id);

}

