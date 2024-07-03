package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private ContactService contactService;

    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable Integer id) {
        return contactService.getContactById(id);
    }

    @GetMapping("/name/{id}")
    public String getNameById(@PathVariable Integer id) {
        return contactService.getNameById(id);
    }

    @GetMapping("/names")
    public List<String> getAllContactNames() {
        return contactService.getAllContactName();
    }
}
