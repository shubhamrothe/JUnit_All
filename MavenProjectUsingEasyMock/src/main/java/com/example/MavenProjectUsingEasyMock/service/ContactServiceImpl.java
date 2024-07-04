package com.example.MavenProjectUsingEasyMock.service;

import java.util.List;

import com.example.MavenProjectUsingEasyMock.dao.ContactDao;
import com.example.MavenProjectUsingEasyMock.entity.Contact;
import com.example.MavenProjectUsingEasyMock.exception.NoDataFoundException;

public class ContactServiceImpl implements ContactService {
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

	public List<String> getAllNames() {
		List<String> names = contactDao.findAllNames();
		if (!names.isEmpty())
			return names;
		return null;
	}

	public Contact getContactById(Integer id) {
		Contact contact = contactDao.findById(id);
		if (contact == null) {
			throw new NoDataFoundException();
		}
		return contact;
	}
}
