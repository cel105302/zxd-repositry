package com.rb.sz.cmb.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eurekaClient")
public interface HelloService {
  @RequestMapping(value="/hi",method=RequestMethod.GET)
  public String sayHello(@RequestParam("name") String name);
}
