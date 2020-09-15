
package com.spring.platform.manufacSearch.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.manuFac.vo.ManuFacVO;
import com.spring.platform.page.vo.PageVO;

public interface ManuFacDAO {

	List<ManuFacVO> serchByManuType(String manuType);

	List<ManuFacVO> serchByManuMinimunPrice(int price);


	List<ManuFacVO> serchByManuLoc(String loc);

	ManuFacVO viewOneManuFac(String id);

	int listCount() throws DataAccessException;

	List<ManuFacVO> allManuFac(PageVO pageVO);

}
