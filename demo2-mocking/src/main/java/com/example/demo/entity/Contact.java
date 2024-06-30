package com.example.demo.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;


@Entity
public class Contact {

  
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String mobileNo;

  
  
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}

public Contact(Long id, String name, String mobileNo) {
	super();
	this.id = id;
	this.name = name;
	this.mobileNo = mobileNo;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

@Override
public String toString() {
	return "Contact [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + "]";
}

 
}