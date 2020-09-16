
package com.spring.platform.manufacSearch.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.manufac.vo.ManufacVO;
import com.spring.platform.page.vo.PageVO;

public interface ManufacSearchDAO {

	List<ManufacVO> serchByManuType(String manuType);

	List<ManufacVO> serchByManuMinimunPrice(int price);


	List<ManufacVO> serchByManuLoc(String loc);

	ManufacVO viewOneManuFac(String id);

	int listCount() throws DataAccessException;

	List<ManufacVO> allManuFac(PageVO pageVO);

}
