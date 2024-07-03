package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.entity.Contact;

import java.util.List;

public interface ContactDao extends JpaRepository<Contact, Integer> {
    
    @Query("SELECT c.contactName FROM Contact c WHERE c.contactId = :id")
    String findNameById(Integer id);
    
    @Query("SELECT c.contactName FROM Contact c")
    List<String> findAllContactNames();
}
