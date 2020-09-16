package com.spring.platform.expSearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.platform.expSearch.dao.ExpertSearchDAO;
import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.page.vo.PageVO;

@Service
public class ExpertSearchServiceImpl implements ExpertSearchService{
	
	@Autowired
	ExpertSearchDAO dao;
	
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
	public List<ExpertVO> allExpert(PageVO pageVO) {
		System.out.println("expert Service all");
		return dao.allExpert(pageVO);
	}

	@Override
	public int listCount() {
		return dao.listCount();
	}
}
