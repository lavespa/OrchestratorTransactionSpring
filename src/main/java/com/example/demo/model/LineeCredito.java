/**
 * 
 */
package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Alex
 *
 */

@Entity
public class LineeCredito {
	
	  @Id
	  @GeneratedValue
	  private Long id;
	  
	  private String description;
	  
	  

	public LineeCredito() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	  
	  

}
