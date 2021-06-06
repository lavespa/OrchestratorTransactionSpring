/**
 * 
 */
package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.InvalidContoMutuoException;
import com.example.demo.model.CaratteristicheContoMutuo;
import com.example.demo.model.ContoMutuo;
import com.example.demo.model.LineeCredito;
import com.example.demo.service.OrchestrationService;
import com.example.demo.web.CreateContoMutuoRequest;


/**
 * @author Alex
 *
 */
@RestController
@RequestMapping("contomutuo")
public class ContoMutuoController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContoMutuoController.class);
	
	@Autowired
	private OrchestrationService orchestrService;
	
	@ResponseBody
	@PostMapping(value="/apriContoMutuo",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	public ContoMutuo apriCM(@RequestBody CreateContoMutuoRequest request) {
		
		LineeCredito lineaCr = request.getLineaCr();
		CaratteristicheContoMutuo caratCm = request.getCaratCm();//Init ccm
		String descrCm = request.getDescriptionCM();
		double capitalInv = request.getCapitalInvestment();
		
		//Effettuo il salvataggio dell'apertura conto mutuo
		
		ContoMutuo cm2 = null;
		try {
			cm2 = orchestrService.apriContoMutuo(lineaCr, caratCm, descrCm, capitalInv);
		} catch (InvalidContoMutuoException e) {
			logger.error("Errore in apertura mutuo",e);
			throw new InvalidContoMutuoException(e.getMessage());
		}
		
		
		return cm2;
		
	}
							 

}
