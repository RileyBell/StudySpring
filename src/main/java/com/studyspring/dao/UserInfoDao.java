package com.studyspring.dao;

import java.util.List;
import java.util.Map;

import com.studyspring.vo.UserInfoEnrollRequestVO;
import com.studyspring.vo.UserInfoVO;

public interface UserInfoDao {
	public String searchNameDao(Map<String, Object> info);
	public List<UserInfoVO> getUserInfoListDao();
	public int enrollUserInfoDao(UserInfoEnrollRequestVO userInfoEnrollRequestVO);
	public List<Map<String, Object>> searchUserInfoDBDao(Map<String, Object> params);
}
