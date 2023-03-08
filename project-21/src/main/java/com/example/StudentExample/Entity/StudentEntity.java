package com.example.StudentExample.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class StudentEntity {
	@Id
	@Column(name="bookid")
	private int bookid;
	
   @Column(name="bname")
   private String bname;
   
   @Column(name="price")
   private String price;
   
   @Column(name="authorname")
   private String authorname;
   
   public int getBookid() {
	return bookid;
}

public void setBookid(int bookid) {
	this.bookid = bookid;
}

public String getBname() {
	return bname;
}

public void setBname(String bname) {
	this.bname = bname;
}

public String getAuthorname() {
	return authorname;
}

public void setAuthorname(String authorname) {
	this.authorname = authorname;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public StudentEntity(int bookid, String bname, String authorname, String price) {
	super();
	this.bookid = bookid;
	this.bname = bname;
	this.authorname = authorname;
	this.price = price;
}

public StudentEntity () {
	
}}