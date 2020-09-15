package com.spring.platform.expSearch.dao;

import java.util.List;

import com.spring.platform.expert.vo.ExpertVO;

public interface ExpertDAO {

	List<ExpertVO> serchByExpertName(String name);

	List<ExpertVO> serchByExpertType(String type);

	ExpertVO viewExpert(String id);

	List<ExpertVO> allExpert();

}
