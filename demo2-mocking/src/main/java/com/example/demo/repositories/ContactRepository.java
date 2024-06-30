package com.example.demo.repositories;

import com.example.demo.entity.Contact;
import jakarta.persistence.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}