package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long userId;
	private String name;
	private String phone;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	List<Contact> contacts;
	
}
