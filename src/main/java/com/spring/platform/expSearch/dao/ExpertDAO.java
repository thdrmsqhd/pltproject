package com.spring.platform.expSearch.dao;

import java.util.List;

import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.page.vo.PageVO;

public interface ExpertDAO {

	List<ExpertVO> serchByExpertName(String name);

	List<ExpertVO> serchByExpertType(String type);

	ExpertVO viewExpert(String id);

	int listCount();

	List<ExpertVO> allExpert(PageVO pageVO);

}
