package com.spring.platform.mypage.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.platform.alluser.vo.AlluserVO;
import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.mypage.dao.MyPageDAO;
import com.spring.platform.quotation.vo.QuotationVO;
import com.spring.platform.scrap.vo.ScrapVO;

@Service
public class MyPageServiceImpl implements MyPageService{
	
	@Autowired
	MyPageDAO myPageDAO;

	@Override
	public String getUserType(String userId) {
		//user id 기준으로 vo조회
		AlluserVO userVO = myPageDAO.getUserVO(userId);
		//vo에서 타입을 반환한다.
		String userType = userVO.getType();
		return userType;
	}
	
	@Override
	public Object getUserVO(String userId) {
		return myPageDAO.getUserVO(userId);
	}
	
	@Override
	public Map<String, List<ScrapVO>> getScrap(String userId) {
		Map<String, List<ScrapVO>> scrap = new HashMap<String, List<ScrapVO>>();
		scrap.put("expert", myPageDAO.getExpertScrap(userId));
		scrap.put("expert", myPageDAO.getManuScrap(userId));
		return scrap;
	}
	
	@Override
	public List<QuotationVO> getQuotation(String userId) {
		return myPageDAO.getQuotation(userId);
	}
	
	@Override
	public List<ConsultingVO> getConsulting(String userId) {
		return myPageDAO.getConsulting(userId);
	}
}
