package com.rest.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

//@NamedQueries(value = { @NamedQuery(name = "findBook", query = "from Book where author='Test'") })

@Entity(name = "book")
public class Book {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "title")
	private String title;

	private String author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}