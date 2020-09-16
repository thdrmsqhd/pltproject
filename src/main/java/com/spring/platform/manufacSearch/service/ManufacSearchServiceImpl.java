package com.spring.platform.manufacSearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.spring.platform.manufac.vo.ManufacVO;
import com.spring.platform.manufacSearch.dao.ManufacSearchDAO;
import com.spring.platform.page.vo.PageVO;

@Service
public class ManufacSearchServiceImpl implements ManufacSearchService{

	@Autowired
	ManufacSearchDAO dao;
	
	@Override
	public List<ManufacVO> serchByManuType(String manuType) {
		System.out.println("ManuFac service Type");
		return dao.serchByManuType(manuType);
	}

	@Override
	public List<ManufacVO> serchByManuMinimumPrice(int price) {
		System.out.println("ManuFac service price");
		return dao.serchByManuMinimunPrice(price);
	}

	@Override
	public ManufacVO viewManuFac(String id) {
		System.out.println("ManuFac service view");
		return dao.viewOneManuFac(id);
	}

	@Override
	public List<ManufacVO> allManuFac(PageVO pageVO) {
		System.out.println("ManuFac service all");
		return dao.allManuFac(pageVO);
	}

	@Override
	public List<ManufacVO> serchByManuLoc(String loc) {
		System.out.println("ManuFac service loc");
		return dao.serchByManuLoc(loc);
	}
	
	@Override
	public int listCount() throws DataAccessException {
		int listCount = dao.listCount();
		return listCount;
	}
	
}
