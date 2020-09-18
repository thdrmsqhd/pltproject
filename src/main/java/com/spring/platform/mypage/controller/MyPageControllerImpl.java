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
		
		//로그인된 유저의 정보를 가져온다.
		//String session = request.getSession();
		//String userId = session.getAttribute("member");
		String userId = "op3838";
		
		//아이디로 allUser테이블에서 유저의 타입을 찾는다.
		String userType = myPageService.getUserType(userId);
		
		//가져온 아이디의 타입으로 분기 하여 vo를 조회 한다.
		if(userType.equals("startup")) {
			//스타트 업이라면 스타트업 테이블 조회
			StartUpVO startup = (StartUpVO) myPageService.getUserVO(userId);
			mav.addObject("startup",startup );
		}else if(userType.equals("manufac")) {
			//제조업체라면 제조업체 제조업체 테이블 조회
			ManufacVO manufac = (ManufacVO) myPageService.getUserVO(userId); 
			mav.addObject("manufac", manufac);
		}else {
			//전문가라면 전문가 테이블 조회
			ExpertVO expert = (ExpertVO) myPageService.getUserVO(userId);
			mav.addObject("expert", expert);
		}
		// 아이디에 해당하는 스크랩 리스트를 가져온다.
		Map<String,List<ScrapVO>> scrap = scrapService.printScrap(userId);
		mav.addObject("scrap", scrap);
		// 아이디에 해당하는 견적 ,발주, 컨설팅 현황을 가져온다.
		// 1. 컨설팅 현황을 userId기준으로 불러온다.
		List<ConsultingVO> consulting = myPageService.getConsulting(userId);
		// 2. 견적 현황을 userId기준으로 불러온다. 
		List<QuotationVO> quotation = myPageService.getQuotation(userId);
		//mav.addObject(attributeName, attributeValue); 해당 vo(정보 출력을 위한 vo),스크랩, 견적, 컨설팅 현황을 모델에 담는다.
		mav.addObject("consulting", consulting);
		mav.addObject("quotation", quotation);
		return mav;
	}
}
