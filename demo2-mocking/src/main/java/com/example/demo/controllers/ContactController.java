package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;
import com.example.demo.services.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

  @Autowired
  private ContactService service;

  @GetMapping
  public ResponseEntity<List<Contact>> getAllContacts() {
    List<Contact> contacts = service.getAllContacts();
    return new ResponseEntity<>(contacts, HttpStatus.OK);
  }
}
