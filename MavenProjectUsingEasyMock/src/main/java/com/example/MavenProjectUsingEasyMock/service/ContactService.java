package com.example.MavenProjectUsingEasyMock.service;

import java.util.List;

import com.example.MavenProjectUsingEasyMock.entity.Contact;

public interface ContactService{// implements ContactDao{

	public String getNameById(Integer id);
	
	public List<String> getAllNames();
	
	public Contact getContactById(Integer id);
}
