package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService {

	  List<Contact> getAllContacts();

	  Contact getContactById(Long id);

	  Contact saveContact(Contact contact);

	  void deleteContactById(Long id);
	}