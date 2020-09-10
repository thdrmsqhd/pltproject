package com.spring.plt.consulting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.plt.consulting.dao.ConsultingDAO;
import com.spring.plt.consulting.vo.ConsultingVO;

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
}
