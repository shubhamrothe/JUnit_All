package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repositories.ContactRepository;

@Service
public abstract class ContactServiceImpl implements ContactService {

  @Autowired
  private ContactRepository repository;

  @Override
  public List<Contact> getAllContacts() {
    return repository.findAll();
  }

  @Override
  public Contact getContactById(Long id) {
    Optional<Contact> contact = repository.findById(id);
    return contact.orElse(null);
  }

  @Override
  public Contact saveContact(Contact contact) {
    return repository.save(contact);
  }

  @Override
  public void deleteContactById(Long id) {
    repository.deleteById(id);
  }
}
