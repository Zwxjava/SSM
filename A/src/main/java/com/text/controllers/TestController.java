package com.text.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.text.entitys.Userinfo;
import com.text.serviceimpl.UserInfoServiceImpl;
import com.text.services.IUserInfoService;


@Controller
public class TestController {
	
	@Autowired
	private IUserInfoService userInfoService;

	@RequestMapping(value = "test/getUserModel", method ={RequestMethod.GET})
	public void getUserModel(){
		  System.out.println("调用了getUserModel()方法");
             
		  List<Userinfo> list   = userInfoService.loadPersons();
		  System.err.println(list.size());
		  for(int i = 0 ; i < list.size() ; i++){
			 System.out.println(list.get(i).toString());
		  }
    }
}
