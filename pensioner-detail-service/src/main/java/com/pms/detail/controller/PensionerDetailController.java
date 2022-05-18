package com.pms.detail.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.pms.detail.model.BankLog;
import com.pms.detail.repository.BankRepository;
import com.pms.detail.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pms.detail.exception.AadharNumberNotFound;
import com.pms.detail.exception.AuthorizationException;
import com.pms.detail.model.PensionerDetail;
import com.pms.detail.repository.AuthClient;
import com.pms.detail.service.PensionerDetailServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@RestController
public class PensionerDetailController extends BaseController {
	
	@Autowired
	PensionerDetailServiceImpl pensionerDetailServiceImpl;
	
	@Autowired
	private AuthClient authClient;

	@Autowired
	private BankRepository bankRepository;
	
	
	@GetMapping("/getAllPensioner")
	@ApiOperation(notes = "Returns the Pension Details", value = "Find All PensionerDetail Details")
	public List<PensionerDetail> getAllPensioner(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader) throws AuthorizationException, NumberFormatException, IOException
	{
		 log.debug("Token Passed: "+requestTokenHeader );
		if (authClient.authorizeTheRequest(requestTokenHeader).isValid())
		{
			log.info("Token valid :"+authClient.authorizeTheRequest(requestTokenHeader).isValid());
			return pensionerDetailServiceImpl.getAllPensioner();
		}
		
		else
		{
			log.error("Invalid Token");
			throw new AuthorizationException("Not allowed, Please pass a valid token");
		}
		
		
	}
		

	@GetMapping("/PensionerDetailByAadhaar/{aadharNumber}")
	@ApiOperation(notes = "Returns the Pension Details by aadharCard Number", value = "Find Pension Details By Aadhar Card number")
	public PensionerDetail getPensionerDetailByAadhar(
			@RequestHeader(value = "Authorization", required = false) String requestTokenHeader,
			@ApiParam(name = "aadharNumber", value = "Aadhar Card Number") 
			@PathVariable long aadharNumber) throws AuthorizationException, AadharNumberNotFound, NumberFormatException, IOException
	{
		   log.debug("aadharNumber Input :" +aadharNumber+"  "+requestTokenHeader );
		if (authClient.authorizeTheRequest(requestTokenHeader).isValid())
		{
			log.info("Token valid :"+authClient.authorizeTheRequest(requestTokenHeader).isValid());
			return pensionerDetailServiceImpl.getPensionerDetailByAadharCard(aadharNumber);
		}
		
		else
		{
			log.error("Invalid Token");
			throw new AuthorizationException("Not allowed, Please pass a valid token");
		}
		
		
	}

	@PostMapping("/LogTransaction")
	@ApiOperation(value = "Saves the bank details to the database")
	public boolean logTransaction(@RequestHeader("Authorization") String token, @RequestBody BankLog bankLog) throws AuthorizationException {
		log.info("START");
		if (authClient.authorizeTheRequest(token).isValid())
		{
			log.info("Token valid :"+authClient.authorizeTheRequest(token).isValid());
			if(!bankRepository.findByAadhaarNumber(bankLog.getAadhaarNumber()).isPresent())
				bankRepository.save(bankLog);
			return true;
		}

		else
		{
			log.error("Invalid Token");
			throw new AuthorizationException("Not allowed, Please pass a valid token");
		}
	}
			
}
