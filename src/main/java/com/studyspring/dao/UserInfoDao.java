package com.studyspring.dao;

import java.util.List;
import java.util.Map;

import com.studyspring.vo.UserInfoVO;

public interface UserInfoDao {
	public String searchNameDao(Map<String, Object> info);
	public List<UserInfoVO> getUserInfoListDao();
}
