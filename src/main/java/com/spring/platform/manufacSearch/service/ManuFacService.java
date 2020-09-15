package com.spring.platform.manufacSearch.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.manuFac.vo.ManuFacVO;
import com.spring.platform.page.vo.PageVO;

public interface ManuFacService {


	List<ManuFacVO> serchByManuType(String manuType);

	List<ManuFacVO> serchByManuMinimumPrice(int iPrice);

	ManuFacVO viewManuFac(String id);

	List<ManuFacVO> allManuFac(PageVO pageVO);

	List<ManuFacVO> serchByManuLoc(String loc);

	int listCount() throws DataAccessException;

}
