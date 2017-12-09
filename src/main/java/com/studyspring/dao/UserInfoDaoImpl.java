package com.studyspring.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.studyspring.vo.UserInfoVO;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	@Override
	public String searchNameDao(Map<String, Object> info) {
		// TODO Auto-generated method stub
		
		System.out.println("user dao call(search name: " + info.get("name").toString());
		
		String name = info.get("name").toString() + "!!";
		
		return name;
	}

	@Override
	public List<UserInfoVO> getUserInfoListDao() {
		// TODO Auto-generated method stub
		List<UserInfoVO> listuser = new ArrayList<UserInfoVO>();
		
		// DB 작업 
		
		UserInfoVO user_one = new UserInfoVO();
		user_one.setUserName("김기태");
		user_one.setUserAge(32);
		user_one.setUserImage("sample1.png");
		
		listuser.add(user_one);
		
		UserInfoVO user_two = new UserInfoVO();
		user_two.setUserName("김멍무");
		user_two.setUserAge(29);
		user_two.setUserImage("sample2.png");
		
		listuser.add(user_two);
		
		UserInfoVO user_three = new UserInfoVO();
		user_three.setUserName("알파까");
		user_three.setUserAge(33);
		user_three.setUserImage("sample3.png");
		
		listuser.add(user_three);
		return listuser;
	}
	
	

}
