package com.example.MavenProjectUsingEasyMock.service;

import com.example.MavenProjectUsingEasyMock.dao.ContactDao;

public class ContactServiceImpl implements ContactService{
//it is not spring-boot project so it not auto wired thats why we uses setter() to inject value into contactDao
	private ContactDao contactDao;
//to inject Dao object implementation into our service class
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	public String getNameById(Integer id) {
		String nameById = contactDao.findNameById(id);
		String formatedName = nameById.toUpperCase();
		return formatedName;
	}

	
}
