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
		//������ü, ������ , ��ŸƮ�� ������ �����´�.
		//String session = request.getSession();
		//String userId = session.getAttribute("member");
		String userId = "op3838";
		//���̵�� allUser���̺��� ������ Ÿ���� ã�´�.
		//������ ���̵��� Ÿ������ vo�� ��ȸ �Ѵ�.
		
		// ���̵� �ش��ϴ� ��ũ�� ����Ʈ�� �����´�.
		// ���̵� �ش��ϴ� ���� ,����, ������ ��Ȳ�� �����´�.
		//mav.addObject(attributeName, attributeValue); ��ũ��, ����, ������ ��Ȳ�� �𵨿� ��´�.
		return mav;
	}
}
