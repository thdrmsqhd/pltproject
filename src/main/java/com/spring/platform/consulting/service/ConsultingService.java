package com.spring.platform.consulting.service;

import java.util.List;

import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.quotation.vo.QuotationVO;

public interface ConsultingService {

	void insertConsulting(ConsultingVO consultingVO);

	List<ConsultingVO> ConsultingList();

	ConsultingVO viewOneConsulting(String no);

	List<QuotationVO> alarmConsulting(String compId);

}
