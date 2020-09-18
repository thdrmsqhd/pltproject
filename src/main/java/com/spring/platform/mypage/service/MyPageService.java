package com.spring.platform.mypage.service;

import java.util.List;
import java.util.Map;

import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.quotation.vo.QuotationVO;
import com.spring.platform.scrap.vo.ScrapVO;

public interface MyPageService {

	String getUserType(String userId);

	Object getUserVO(String userId);

	Map<String, List<ScrapVO>> getScrap(String userId);

	List<QuotationVO> getQuotation(String userId);

	List<ConsultingVO> getConsulting(String userId);

}
