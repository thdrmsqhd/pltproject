package com.spring.platform.consulting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.platform.consulting.dao.ConsultingDAO;
import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.quotation.vo.QuotationVO;

@Service
public class ConsultingServiceImpl implements ConsultingService {
	@Autowired
	ConsultingDAO dao;
	
	@Override
	public void insertConsulting(ConsultingVO ConsultingVO) {
		System.out.println("insert ConsultingVO Service");
		dao.insertConsulting(ConsultingVO);
	}
	
	@Override
	public List<ConsultingVO> ConsultingList(){
		return dao.ConsultingList();
	}

	@Override
	public ConsultingVO viewOneConsulting(String no) {
		return dao.viewOneConsulting(no);
	}

	@Override
	public List<QuotationVO> alarmConsulting(String compId) {
		return dao.alarmConsulting(compId);
	}
}
