package com.springboot.spacecrafts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="spacecrafts")
public class Spacecraft {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long spacecraft_id;
	
	@Column(name="spacecraft_name")
	private String spacecraft_name;
	
	@Column(name="spacecraft_image")
	private String spacecraft_image;
	
	@Column(name="spacecraft_mission",length=2147483647,columnDefinition="text")
	private String spacecraft_mission;
	
	@Column(name="spacecraft_description_of_mission",length=2147483647,columnDefinition="text")
	private String spacecraft_description_of_mission;
	
	@Column(name="spacecraft_phase")
	@Enumerated(EnumType.STRING)
	private Phase spacecraft_phase; 
	
	@Column(name="spacecraft_launch")
	private String spacecraft_launch;
	
	@Column(name="spacecraft_days_in_orbit")
	private int spacecraft_days_in_orbit;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created",nullable=false)
	private Date created;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated",nullable=false)
	private Date updated;	
	
	@PrePersist
	protected void onCreate() {
		updated = created = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		updated = new Date();
	}
	
	
	public Spacecraft() {
		
	}

	public Spacecraft(String spacecraft_name, String spacecraft_image, String spacecraft_mission,
			String spacecraft_description_of_mission, Phase spacecraft_phase, String spacecraft_launch,
			int spacecraft_days_in_orbit, Category category, Date created, Date updated) {
		super();
		this.spacecraft_name = spacecraft_name;
		this.spacecraft_image = spacecraft_image;
		this.spacecraft_mission = spacecraft_mission;
		this.spacecraft_description_of_mission = spacecraft_description_of_mission;
		this.spacecraft_phase = spacecraft_phase;
		this.spacecraft_launch = spacecraft_launch;
		this.spacecraft_days_in_orbit = spacecraft_days_in_orbit;
		this.category = category;
		this.created = created;
		this.updated = updated;
	}

	public long getSpacecraft_id() {
		return spacecraft_id;
	}

	public void setSpacecraft_id(long spacecraft_id) {
		this.spacecraft_id = spacecraft_id;
	}

	public String getSpacecraft_name() {
		return spacecraft_name;
	}

	public void setSpacecraft_name(String spacecraft_name) {
		this.spacecraft_name = spacecraft_name;
	}

	public String getSpacecraft_image() {
		return spacecraft_image;
	}

	public void setSpacecraft_image(String spacecraft_image) {
		this.spacecraft_image = spacecraft_image;
	}

	public String getSpacecraft_mission() {
		return spacecraft_mission;
	}

	public void setSpacecraft_mission(String spacecraft_mission) {
		this.spacecraft_mission = spacecraft_mission;
	}

	public String getSpacecraft_description_of_mission() {
		return spacecraft_description_of_mission;
	}

	public void setSpacecraft_description_of_mission(String spacecraft_description_of_mission) {
		this.spacecraft_description_of_mission = spacecraft_description_of_mission;
	}

	public Phase getSpacecraft_phase() {
		return spacecraft_phase;
	}

	public void setSpacecraft_phase(Phase spacecraft_phase) {
		this.spacecraft_phase = spacecraft_phase;
	}

	public String getSpacecraft_launch() {
		return spacecraft_launch;
	}

	public void setSpacecraft_launch(String spacecraft_launch) {
		this.spacecraft_launch = spacecraft_launch;
	}

	public int getSpacecraft_days_in_orbit() {
		return spacecraft_days_in_orbit;
	}

	public void setSpacecraft_days_in_orbit(int spacecraft_days_in_orbit) {
		this.spacecraft_days_in_orbit = spacecraft_days_in_orbit;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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
