package com.studyspring.service;

import java.util.List;
import java.util.Map;

import com.studyspring.vo.UserInfoVO;

public interface UserInfoService {
	public String searchNameService(Map<String, Object> info);
	// 여기 하나 안
	public List<UserInfoVO> getUserInfoListService();
}
