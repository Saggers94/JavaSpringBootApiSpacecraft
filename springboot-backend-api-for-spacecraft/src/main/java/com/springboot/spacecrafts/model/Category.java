package com.springboot.spacecrafts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="categories")
public class Category {
//	id bigint(20) UN AI PK 
//	name varchar(255) 
//	created_at timestamp 
//	updated_at timestamp
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long category_id;
	
	@Column(name="category_name")
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created",nullable=false)
	private Date created;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated", nullable=false)
	private Date updated;

	@PrePersist
	protected void onCreate() {
		updated=created=new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		updated = new Date();
	}
	
	public Category(){
	
	}
	
	public Category(String name, Date created, Date updated) {
		super();
		this.name = name;
		this.created = created;
		this.updated = updated;
	}

	public long getId() {
		return category_id;
	}

	public void setId(long category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	
	
	
	
}
