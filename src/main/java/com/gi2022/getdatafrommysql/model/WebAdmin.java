package com.gi2022.getdatafrommysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "web_admin")
public class WebAdmin implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8309086353676745061L;

	@Id
	@GeneratedValue
	@Column
	private int id;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String remember_token;
	
	public WebAdmin()
	{
		super();
	}

	public WebAdmin(String username, String email, String password, String remember_token) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.remember_token = remember_token;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the remember_token
	 */
	public String getRemember_token() {
		return remember_token;
	}

	/**
	 * @param remember_token the remember_token to set
	 */
	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WebAdmin [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", remember_token=" + remember_token + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(email, id, password, remember_token, username);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof WebAdmin)) {
			return false;
		}
		WebAdmin other = (WebAdmin) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(remember_token, other.remember_token)
				&& Objects.equals(username, other.username);
	}
	
	
	
	

}
