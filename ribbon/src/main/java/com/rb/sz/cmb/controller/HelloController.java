package com.rb.sz.cmb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rb.sz.cmb.service.HelloService;
@RestController
public class HelloController {

	@Autowired
	HelloService helloService;
	@RequestMapping("/hi")
	public String hi(@RequestParam String name){
		return helloService.hi(name);
	}
}
