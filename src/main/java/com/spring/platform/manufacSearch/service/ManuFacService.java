package com.spring.platform.manufacSearch.service;

import java.util.List;

import com.spring.platform.manuFac.vo.ManuFacVO;

public interface ManuFacService {


	List<ManuFacVO> serchByManuType(String manuType);

	List<ManuFacVO> serchByManuMinimumPrice(int iPrice);

	ManuFacVO viewManuFac(String id);

	List<ManuFacVO> allManuFac();

	List<ManuFacVO> serchByManuLoc(String loc);

}
