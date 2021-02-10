package com.example.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContoMutuo {

	@Id
	@GeneratedValue
	private Long id;

	private String description;

	private double capitalInvestment;

	
	private Long idLineaCredito;
	private Long idcarattCm;

	
	
	

	public ContoMutuo(double capitalInvestment, String description, Long idLineaCredito,
			Long idcarattCm) {
		
		this.capitalInvestment = capitalInvestment;
		this.idLineaCredito = idLineaCredito;
		this.idcarattCm = idcarattCm;
		this.description = description;
	}
	
	

	public ContoMutuo() {
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

	public double getCapitalInvestment() {
		return capitalInvestment;
	}

	public void setCapitalInvestment(double capitalInvestment) {
		this.capitalInvestment = capitalInvestment;
	}



	public Long getIdLineaCredito() {
		return idLineaCredito;
	}



	public void setIdLineaCredito(Long idLineaCredito) {
		this.idLineaCredito = idLineaCredito;
	}



	public Long getIdcarattCm() {
		return idcarattCm;
	}



	public void setIdcarattCm(Long idcarattCm) {
		this.idcarattCm = idcarattCm;
	}
	
	

}
