package com.spring.platform.manufacSearch.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.manufac.vo.ManufacVO;
import com.spring.platform.page.vo.PageVO;

public interface ManufacSearchService {


	List<ManufacVO> serchByManuType(String manuType);

	List<ManufacVO> serchByManuMinimumPrice(int iPrice);

	ManufacVO viewManuFac(String id);

	List<ManufacVO> allManuFac(PageVO pageVO);

	List<ManufacVO> serchByManuLoc(String loc);

	int listCount() throws DataAccessException;

}
