package com.studyspring.controller;

import static org.hamcrest.CoreMatchers.is;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studyspring.service.UserInfoService;
import com.studyspring.vo.UserInfoEnrollRequestVO;
import com.studyspring.vo.UserInfoVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	@Autowired
	UserInfoService userInfoService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	// value = "/main.do" > 보안을 위해
	public ModelAndView home(ModelAndView mv) {
		
		mv.setViewName("main");

		// Study 1
		mv.addObject("modelvalue", "Hello Spring");
		
		// Study 2
		mv.addObject("value1", "5");
		mv.addObject("value2", "6");
		
		// Study 3
		Map<String, Object> info = new HashMap<String, Object>();
		info.put("name", "Riley");
		
		mv.addObject("searchname", userInfoService.searchNameService(info));
		// 뿌려주기 쉽기 때문에 map 사용 
		
		// Study 4
		UserInfoEnrollRequestVO userInfoEnrollRequestVO = new UserInfoEnrollRequestVO();
		Map<String, Object> result = new HashMap<String, Object>();
		
		userInfoEnrollRequestVO.setUserName("Riley");
		userInfoEnrollRequestVO.setUserAge(25);
		userInfoEnrollRequestVO.setUserImage("sampleimage1.png");
		
		/*
		if(userInfoService.enrollUserInfoService(userInfoEnrollRequestVO)==1){
			result.put("flag", "success");
		} else {
			result.put("flag", "fail");
		}
		*/
		
		mv.addObject("result", result);
		
		// Study 5
		boolean isCheck = true;
		
		// 서비스 호출하는 부분 
		if(isCheck == true){
			Map<String, Object> retVal = new HashMap<String, Object>();
			
			retVal.put("type", 2);
			
			mv.addObject("retType", retVal);
		}
		
		mv.addObject("value", isCheck);
		
		// Study 6
		List<UserInfoVO> listuser = userInfoService.getUserInfoListService();
		
		System.out.println("user count : " + listuser.size());
		
		mv.addObject("listuser", listuser);
		
		return mv;
		
	}
	
	// Study 8
	
	@RequestMapping(value = "/samplepage.do", method = RequestMethod.POST)
	public ModelAndView sample(ModelAndView mv, HttpServletRequest request){
		mv.setViewName("samplepage");
				
		mv.addObject("name", request.getParameter("inputname"));
		mv.addObject("age", request.getParameter("inputage"));
		
		return mv;
				
	}
	
}
