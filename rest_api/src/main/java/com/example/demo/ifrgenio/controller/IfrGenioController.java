package com.example.demo.ifrgenio.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.ifrgenio.domain.GenioForm;
import com.example.demo.ifrgenio.repository.IfrGenioRepository;
import com.example.demo.member.domain.Member;

import io.swagger.annotations.Api;

@Api("Genio event 수신")
@RestController
//@RequestMapping("${property.api.end-poing}")
@RequestMapping("/api")
public class IfrGenioController {

	@Autowired
	IfrGenioRepository ifrGenioRepository;
	
//    @PostMapping("/genio/add")
//    public void add(@RequestBody GenioForm.Request.GenioAdd genio, @RequestHeader Map<String, String> autorization) {
//    	ifrGenioRepository.save(genio);
//        	
////        	return genio;
//    }
    @PostMapping("/genio/test01")
//    public Member add(@RequestBody Member member) {
  public void add(@RequestBody Member member) {
    	ifrGenioRepository.save(member);
        	
//        	return member;
    }

    @PostMapping("/genio/test02")
    public String test01() {
//    	ifrGenioRepository.save(genio);
        	
        	return "http://www.naver.com";
    }
    
}
