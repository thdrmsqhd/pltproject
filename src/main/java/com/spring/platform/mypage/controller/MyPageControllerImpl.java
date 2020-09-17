package com.spring.platform.mypage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.manufac.vo.ManufacVO;
import com.spring.platform.mypage.service.MyPageService;

@Controller
public class MyPageControllerImpl implements MyPageController{
	
	@Autowired
	MyPageService myPageService;
	
	@RequestMapping(value="/viewMyPage.do", method = RequestMethod.GET)
	public ModelAndView viewMyPage(HttpServletRequest request, HttpServletResponse response) {
		String viewName = request.getParameter("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		
		//�α��ε� ������ ������ �����´�.
		//String session = request.getSession();
		//String userId = session.getAttribute("member");
		String userId = "op3838";
		
		//���̵�� allUser���̺��� ������ Ÿ���� ã�´�.
		String userType = myPageService.getUserType(userId);
		
		//������ ���̵��� Ÿ������ �б� �Ͽ� vo�� ��ȸ �Ѵ�.
		if(userType.equals("startup")) {
			//��ŸƮ ���̶�� ��ŸƮ�� ���̺� ��ȸ
			StartUpVO startup = myPageService.getUserVO(userId);
			mav.addObject("startup",startup );
		}else if(userType.equals("manufac")) {
			//������ü��� ������ü ������ü ���̺� ��ȸ
			ManufacVO manufac = myPageService.getUserVO(userId); 
			mav.addObject("manufac", manufac);
		}else {
			//��������� ������ ���̺� ��ȸ
			ExpertVO expert = myPageService.getUserVO(userId);
			mav.addObject("expert", expert);
		}
		// ���̵� �ش��ϴ� ��ũ�� ����Ʈ�� �����´�.
		// ���̵� �ش��ϴ� ���� ,����, ������ ��Ȳ�� �����´�.
		//mav.addObject(attributeName, attributeValue); �ش� vo(���� ����� ���� vo),��ũ��, ����, ������ ��Ȳ�� �𵨿� ��´�.
		return mav;
	}
}
