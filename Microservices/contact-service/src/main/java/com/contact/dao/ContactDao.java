package com.contact.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.entity.Contact;

@Repository
public interface ContactDao extends JpaRepository<Contact, Long> {
 
	 List<Contact> findByUserId(Long userId);
	 
}
