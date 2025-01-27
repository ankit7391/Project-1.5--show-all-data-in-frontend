package com.webapp.entity;


import javax.persistence.*;


@Entity
@Table(name="Registration") // (entitiy name)-(database table name) are same  used this anotation
public class Registration {
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name="first_name",length = 45)
	private String firstName;
	
	@Column(name="last_name",length=45)
	private String lastName;
	
	@Column(name="email",unique = true, length = 128)
	private String email;
	
	@Column(name="mobile")
	private long mobile;
	
	// Apply Getters and setter
	
	public long getId() {

		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	

	
}

