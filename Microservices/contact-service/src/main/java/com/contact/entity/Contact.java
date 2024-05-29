package com.contact.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Contact {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long cId;
	private String cname;
	private String cnumbers;
	private long userId;
	
}