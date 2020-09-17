package com.spring.platform.expSearch.service;

import java.util.List;

import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.page.vo.PageVO;

public interface ExpertSearchService {

	List<ExpertVO> serchByExpertName(String name);


	List<ExpertVO> serchByExpertType(String type);


	ExpertVO viewExpert(String id);


	List<ExpertVO> allExpert(PageVO pageVO);


	int listCount();

}
