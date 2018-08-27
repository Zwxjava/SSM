package com.text.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.text.dao.UserinfoMapper;
import com.text.entitys.Userinfo;
import com.text.services.IUserInfoService;




@Service
public class UserInfoServiceImpl implements IUserInfoService{
	
	
	    @Autowired
	 	private UserinfoMapper userInfoDao;

		
		public List<Userinfo> loadPersons() {
			// TODO Auto-generated method stub
			return userInfoDao.queryAll(); 
		}

}
