package com.studyspring.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyspring.dao.UserInfoDao;
import com.studyspring.vo.UserInfoEnrollRequestVO;
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


	@Override
	public int enrollUserInfoService(UserInfoEnrollRequestVO userInfoEnrollRequestVO) {
		// TODO Auto-generated method stub
		return userInfoDao.enrollUserInfoDao(userInfoEnrollRequestVO);
	}

	@Override
	public List<Map<String, Object>> searchUserInfoDBService(Map<String, Object> params) {
		// TODO Auto-generated method stub
		System.out.println("hijlkjdslk");
		
		List<Map<String, Object>> test = userInfoDao.searchUserInfoDBDao(params);
		test.get(0);
		
		System.out.println("ewe : " + test.get(0));
		return userInfoDao.searchUserInfoDBDao(params);
	}
	
}
