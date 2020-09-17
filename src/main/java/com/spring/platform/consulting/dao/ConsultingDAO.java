package com.spring.platform.consulting.dao;

import java.util.List;

import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.quotation.vo.QuotationVO;

public interface ConsultingDAO {

	void insertConsulting(ConsultingVO consultingVO);

	List<ConsultingVO> ConsultingList();

	ConsultingVO viewOneConsulting(String no);

	List<QuotationVO> alarmConsulting(String compId);

}
