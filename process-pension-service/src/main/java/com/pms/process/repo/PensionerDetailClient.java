package com.pms.process.repo;

import com.pms.process.model.BankLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import com.pms.process.exception.AadharNumberNotFound;
import com.pms.process.exception.AuthorizationException;
import com.pms.process.model.PensionerDetail;

import io.swagger.annotations.ApiParam;

@FeignClient(name ="PensionerDetail-Microservice",url = "${url.app.details}")
public interface PensionerDetailClient {
	
	@GetMapping("/PensionerDetailByAadhaar/{aadharNumber}")
	public PensionerDetail getPensionerDetailByAadhaar(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@ApiParam(name = "aadharNumber", value = "Aadhar Card Number") 
			@PathVariable long aadharNumber) throws AuthorizationException, AadharNumberNotFound;

	@PostMapping("/LogTransaction")
	public boolean saveBankLog(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@RequestBody BankLog bankLog) throws AuthorizationException, AadharNumberNotFound;

}
