package com.narayanatutorial.controller;

import javax.xml.ws.Response;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narayanatutorial.request.RequestDetails;
import com.narayanatutorial.request.RequestDetailsDto;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/home/")
public class HomeController {

	
	@PostMapping("checkdate")
	public  RequestDetailsDto checkDateInJson(@RequestBody RequestDetails rd) {
		System.out.println("name:"+rd.getName());
		System.out.println("date:"+rd.getInitDate());
		
		ModelMapper modelMapper = new ModelMapper();
		RequestDetailsDto rdDto =modelMapper.map(rd, RequestDetailsDto.class);
		System.out.println("request details name: "+rd.getName());
		System.out.println("RequestDetailsDto details name: "+rdDto.getName());
		System.out.println("RequestDetailsDto details date: "+rdDto.getInitDate());
		System.out.println("RequestDetailsDto details audit date: "+rdDto.getAuditDate());
		return rdDto;
	}
	
	@GetMapping("status")
	public ResponseEntity<String> checkDateInJson() {
		
		return ResponseEntity.ok().body("success");
	}
	
}
