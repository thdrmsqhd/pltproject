
package com.spring.plt.manuFac.dao;

import java.util.List;

import com.spring.plt.manuFac.vo.ManuFacVO;

public interface ManuFacDAO {

	List<ManuFacVO> serchByManuType(String manuType);

	List<ManuFacVO> serchByManuMinimunPrice(int price);

	ManuFacVO viewManuFac(String id);

	List<ManuFacVO> viewManuFac();

	List<ManuFacVO> serchByManuLoc(String loc);

}
