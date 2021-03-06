package com.rb.sz.cmb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
  @Autowired
  RestTemplate restTemplate;
  public String hi(String name){
	return  restTemplate.getForObject("http://eurekaClient/hi?name="+name, String.class);
  }
}
