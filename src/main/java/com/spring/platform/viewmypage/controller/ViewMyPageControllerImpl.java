package com.spring.platform.viewmypage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.alluser.vo.AlluserVO;
import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.quotation.vo.QuotationVO;
import com.spring.platform.scrap.vo.ScrapVO;

@Controller
public class ViewMyPageControllerImpl {
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("/MyPage")
	public ModelAndView MyPage(HttpServletRequest request, HttpServletResponse response) {
		String viewName = (String) request.getAttribute("viewName");
		System.out.println(viewName);
//		HttpSession session = request.getSession();
//		String userId = (String) session.getAttribute("member");
		String userId = "op3838";
		ModelAndView mav = new ModelAndView(viewName);
		
		AlluserVO userVO = sqlSession.selectOne("mapper.mypage.getUserVO", userId);
		String userType = userVO.getType();
		if(userType.equals("startup")) {
			mav.addObject("user", sqlSession.selectOne("mapper.mypage.getStartUpVO", userId));
			mav.addObject("userType","startup");
		}else if(userType.equals("manufac")){
			mav.addObject("user", sqlSession.selectOne("mapper.mypage.getManufacVO",userId));
			mav.addObject("userType","manu");
		}else if(userType.equals("expert")) {
			mav.addObject("user", sqlSession.selectOne("mapper.mypage.getExpertVO",userId));
			mav.addObject("userType","expert");
		}
		
		String compid = userId;
		List<ScrapVO> manuScrapList = sqlSession.selectList("mapper.mypage.getManuScrap", compid);
		List<ScrapVO> expertScrapList = sqlSession.selectList("mapper.mypage.getExpertScrap",compid);
		mav.addObject("manuList", manuScrapList);//제조업체 스크랩 리스트 3개만 불러옴 -- (스크랩리스트 - 제조업체 vo조인하여 제조업체 vo가져옴)
		mav.addObject("expertList", expertScrapList);//전문가 스크랩 리스트 3개만 불러옴 -- (스크랩 리스트 - 전문가 vo조인하여 전문가 vo가져옴)
		
		List<ConsultingVO> consultingList = sqlSession.selectList("mapper.mypage.getConsulting",userId);
		List<QuotationVO> quotationList = sqlSession.selectList("mapper.mypage.getQuotation",userId);
		mav.addObject("consultingList", consultingList); // 컨설팅 리스트 5개만 불러옴
		mav.addObject("quotationList", quotationList);  // 견적리스트 5개만 불러옴
		
		return mav;
	}
}
