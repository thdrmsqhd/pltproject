package com.spring.platform.mypage.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.expertpage.service.ExpertPageService;
import com.spring.platform.manufac.vo.ManufacVO;
import com.spring.platform.manufacpage.service.ManufacPageService;
import com.spring.platform.mypage.service.MyPageService;
import com.spring.platform.quotation.vo.QuotationVO;
import com.spring.platform.scrap.service.ScrapService;
import com.spring.platform.scrap.service.ScrapServiceImpl;
import com.spring.platform.scrap.vo.ScrapVO;
import com.spring.platform.startup.vo.StartUpVO;
import com.spring.platform.startuppage.service.StartupPageService;
import com.spring.platform.startuppage.service.StartupPageServiceImpl;

@Controller
public class MyPageControllerImpl implements MyPageController{
	
	@Autowired
	MyPageService myPageService;
	
	@Autowired
	ScrapService scrapService;
	
	@Autowired
	StartupPageService startupPageService;
	
	@Autowired
	ManufacPageService manufacPageService;
	
	@Autowired
	ExpertPageService expertPageService;
	
	
	@RequestMapping(value="/viewMyPage.do", method = RequestMethod.GET)
	public ModelAndView viewMyPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
			StartUpVO startup = (StartUpVO) myPageService.getUserVO(userId);
			mav.addObject("startup",startup );
		}else if(userType.equals("manufac")) {
			//������ü��� ������ü ������ü ���̺� ��ȸ
			ManufacVO manufac = (ManufacVO) myPageService.getUserVO(userId); 
			mav.addObject("manufac", manufac);
		}else {
			//��������� ������ ���̺� ��ȸ
			ExpertVO expert = (ExpertVO) myPageService.getUserVO(userId);
			mav.addObject("expert", expert);
		}
		// ���̵� �ش��ϴ� ��ũ�� ����Ʈ�� �����´�.
		Map<String,List<ScrapVO>> scrap = scrapService.printScrap(userId);
		mav.addObject("scrap", scrap);
		// ���̵� �ش��ϴ� ���� ,����, ������ ��Ȳ�� �����´�.
		// 1. ������ ��Ȳ�� userId�������� �ҷ��´�.
		List<ConsultingVO> consulting = myPageService.getConsulting(userId);
		// 2. ���� ��Ȳ�� userId�������� �ҷ��´�. 
		List<QuotationVO> quotation = myPageService.getQuotation(userId);
		//mav.addObject(attributeName, attributeValue); �ش� vo(���� ����� ���� vo),��ũ��, ����, ������ ��Ȳ�� �𵨿� ��´�.
		mav.addObject("consulting", consulting);
		mav.addObject("quotation", quotation);
		return mav;
	}
}
