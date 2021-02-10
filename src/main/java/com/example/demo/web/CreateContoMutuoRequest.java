/**
 * 
 */
package com.example.demo.web;

import com.example.demo.model.CaratteristicheContoMutuo;
import com.example.demo.model.LineeCredito;

/**
 * @author Alex
 *
 */
public class CreateContoMutuoRequest {
	
	private LineeCredito lineaCr;
	private CaratteristicheContoMutuo caratCm;
	private String descriptionCM;
	private Double capitalInvestment;
	/**
	 * @param lineaCr
	 * @param caratCm
	 * @param descriptionCM
	 * @param capitalInvestment
	 */
	public CreateContoMutuoRequest(LineeCredito lineaCr, CaratteristicheContoMutuo caratCm, String descriptionCM,
			Double capitalInvestment) {
		this.lineaCr = lineaCr;
		this.caratCm = caratCm;
		this.descriptionCM = descriptionCM;
		this.capitalInvestment = capitalInvestment;
	}
	public LineeCredito getLineaCr() {
		return lineaCr;
	}
	public void setLineaCr(LineeCredito lineaCr) {
		this.lineaCr = lineaCr;
	}
	public CaratteristicheContoMutuo getCaratCm() {
		return caratCm;
	}
	public void setCaratCm(CaratteristicheContoMutuo caratCm) {
		this.caratCm = caratCm;
	}
	public String getDescriptionCM() {
		return descriptionCM;
	}
	public void setDescriptionCM(String descriptionCM) {
		this.descriptionCM = descriptionCM;
	}
	public double getCapitalInvestment() {
		return capitalInvestment;
	}
	public void setCapitalInvestment(double capitalInvestment) {
		this.capitalInvestment = capitalInvestment;
	}
	
	

}
