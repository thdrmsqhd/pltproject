package com.spring.platform.mypage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.mypage.service.MyPageService;

@Controller
public class MyPageControllerImpl implements MyPageController{
	
	@Autowired
	MyPageService myPageService;
	
	@RequestMapping(value="/viewMyPage.do", method = RequestMethod.GET)
	public ModelAndView viewMyPage(HttpServletRequest request, HttpServletResponse response) {
		String viewName = request.getParameter("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		//제조업체, 전문가 , 스타트업 정보를 가져온다.
		//String session = request.getSession();
		//String userId = session.getAttribute("member");
		String userId = "op3838";
		//아이디로 allUser테이블에서 유저의 타입을 찾는다.
		//가져온 아이디의 타입으로 vo를 조회 한다.
		
		// 아이디에 해당하는 스크랩 리스트를 가져온다.
		// 아이디에 해당하는 견적 ,발주, 컨설팅 현황을 가져온다.
		//mav.addObject(attributeName, attributeValue); 스크랩, 견적, 컨설팅 현황을 모델에 담는다.
		return mav;
	}
}
