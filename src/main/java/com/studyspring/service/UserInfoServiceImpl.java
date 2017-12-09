package com.studyspring.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyspring.dao.UserInfoDao;
import com.studyspring.vo.UserInfoVO;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoDao userInfoDao;
	
	@Override
	public String searchNameService(Map<String, Object> info) {
		// TODO Auto-generated method stub
		
		return userInfoDao.searchNameDao(info);
	}

	@Override
	public List<UserInfoVO> getUserInfoListService(){
		return userInfoDao.getUserInfoListDao();
	}
	
}
