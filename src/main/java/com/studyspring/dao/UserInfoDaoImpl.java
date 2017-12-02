package com.studyspring.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	@Override
	public String searchNameDao(Map<String, Object> info) {
		// TODO Auto-generated method stub
		
		System.out.println("user dao call(search name: " + info.get("name").toString());
		
		String name = info.get("name").toString() + "!!";
		
		return name;
	}

}
