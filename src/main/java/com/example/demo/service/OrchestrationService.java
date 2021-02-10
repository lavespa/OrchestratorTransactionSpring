/**
 * 
 */
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.InvalidContoMutuoException;
import com.example.demo.model.CaratteristicheContoMutuo;
import com.example.demo.model.ContoMutuo;
import com.example.demo.model.LineeCredito;
import com.example.demo.repo.CaratteristicheContoMutuoRepository;
import com.example.demo.repo.ContoMutuoRepository;
import com.example.demo.repo.LineeCreditoRepository;

/**
 * @author Alex
 *
 */
@Service
@Transactional
public class OrchestrationService {
	
	@Autowired
	private ContoMutuoRepository cmRepo;
	
	
	@Autowired
	private  LineeCreditoRepository lineeCrRepo;
	
	@Autowired
	private CaratteristicheContoMutuoRepository carattCmRepo;
	
	@Transactional(rollbackFor = InvalidContoMutuoException.class)
	public ContoMutuo apriContoMutuo(LineeCredito lineaCr, 
			                         CaratteristicheContoMutuo caratCM, 
			                         String description,
			                         double capitalInvestment) throws InvalidContoMutuoException
	{
		
		//Salvo linee credito
		LineeCredito linCrSaved =  lineeCrRepo.save(lineaCr);
		//Salvo caratteristiche
		CaratteristicheContoMutuo caratCMsaved = carattCmRepo.save(caratCM);
		
		if(capitalInvestment <= 75000d)
		{
			throw new InvalidContoMutuoException("Importo finanziabile deve eesere almeno di 75.000 euro");
		}
		
		//Salvo contomutuo
		ContoMutuo cm = new ContoMutuo(capitalInvestment,description,linCrSaved.getId(),caratCMsaved.getId());
		ContoMutuo cmSaved = cmRepo.save(cm);
			
		
		return cmSaved;
	}

}
