package com.spring.plt.manuFac.service;

import java.util.List;

import com.spring.plt.manuFac.vo.ManuFacVO;

public interface ManuFacService {


	List<ManuFacVO> serchByManuType(String manuType);

	List<ManuFacVO> serchByManuMinimumPrice(int iPrice);

	ManuFacVO viewManuFac(String id);

	List<ManuFacVO> allManuFac();

	List<ManuFacVO> serchByManuLoc(String loc);

}
