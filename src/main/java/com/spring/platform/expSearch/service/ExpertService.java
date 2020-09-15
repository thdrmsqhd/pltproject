package com.spring.platform.expSearch.service;

import java.util.List;

import com.spring.platform.expert.vo.ExpertVO;

public interface ExpertService {

	List<ExpertVO> serchByExpertName(String name);


	List<ExpertVO> serchByExpertType(String type);


	ExpertVO viewExpert(String id);


	List<ExpertVO> allExpert();

}
