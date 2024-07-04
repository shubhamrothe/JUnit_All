package com.example.MavenProjectUsingEasyMock.dao;

import java.util.List;

import com.example.MavenProjectUsingEasyMock.entity.Contact;

public interface ContactDao {

	public String findNameById(Integer id);
	
	public List<String> findAllNames();	
	
	public Contact findById(Integer id);
}
