package com.user.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Contact {

	@Id
	private long cId;
	private String cname;
	private String cnumbers;
	
	@ManyToOne
    private User user;
	
}