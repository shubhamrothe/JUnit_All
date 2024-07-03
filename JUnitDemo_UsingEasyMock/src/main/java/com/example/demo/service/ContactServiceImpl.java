package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.ContactDao;
import com.example.demo.entity.Contact;
import com.example.demo.exceptions.NoDataFoundException;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactDao contactDao;

    @Autowired
    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    @Override
    public String getNameById(Integer id) {
        String name = contactDao.findNameById(id);
        return name != null ? name.toUpperCase() : null;
    }

    @Override
    public List<String> getAllContactName() {
        List<String> names = contactDao.findAllContactNames();
        if (!names.isEmpty()) {
            return names;
        }
        return null;
    }

    @Override
    public Contact getContactById(Integer id) {
        Optional<Contact> contact = contactDao.findById(id);
        return contact.orElseThrow(NoDataFoundException::new);
    }
}
