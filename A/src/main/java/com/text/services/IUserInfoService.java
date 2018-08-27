package com.text.services;

import java.util.List;

import com.text.entitys.Userinfo;





public interface IUserInfoService {
	
	/**
     * 加载全部的person
     * @return 
     */
    List<Userinfo> loadPersons();

}
