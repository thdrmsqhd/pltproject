package com.spring.platform.mypage.dao;

import java.util.List;

import com.spring.platform.alluser.vo.AlluserVO;
import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.quotation.vo.QuotationVO;
import com.spring.platform.scrap.vo.ScrapVO;

public interface MyPageDAO {

	AlluserVO getUserVO(String userId);

	List<QuotationVO> getQuotation(String userId);

	List<ConsultingVO> getConsulting(String userId);

	List<ScrapVO> getManuScrap(String userId);

	List<ScrapVO> getExpertScrap(String userId);

}
