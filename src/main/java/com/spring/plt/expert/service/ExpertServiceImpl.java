package com.spring.plt.expert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.plt.expert.dao.ExpertDAO;
import com.spring.plt.expert.vo.ExpertVO;

@Service
public class ExpertServiceImpl implements ExpertService{
	
	@Autowired
	ExpertDAO dao;
	
	@Override
	public List<ExpertVO> serchByExpertName(String name) {
		System.out.println("expert Service name");
		return dao.serchByExpertName(name);
	}

	@Override
	public List<ExpertVO> serchByExpertType(String type) {
		System.out.println("expert Service type");
		return dao.serchByExpertType(type);
	}

	@Override
	public ExpertVO viewExpert(String id) {
		System.out.println("expert service view");
		return dao.viewExpert(id);
	}

	@Override
	public List<ExpertVO> allExpert() {
		System.out.println("expert Service all");
		return dao.allExpert();
	}
}
