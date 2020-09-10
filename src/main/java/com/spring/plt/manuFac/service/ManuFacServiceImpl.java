package com.spring.plt.manuFac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.plt.manuFac.dao.ManuFacDAO;
import com.spring.plt.manuFac.vo.ManuFacVO;

@Service
public class ManuFacServiceImpl implements ManuFacService{

	@Autowired
	ManuFacDAO dao;
	
	@Override
	public List<ManuFacVO> serchByManuType(String manuType) {
		System.out.println("ManuFac service Type");
		return dao.serchByManuType(manuType);
	}

	@Override
	public List<ManuFacVO> serchByManuMinimumPrice(int price) {
		System.out.println("ManuFac service price");
		return dao.serchByManuMinimunPrice(price);
	}

	@Override
	public ManuFacVO viewManuFac(String id) {
		System.out.println("ManuFac service view");
		return dao.viewManuFac(id);
	}

	@Override
	public List<ManuFacVO> allManuFac() {
		System.out.println("ManuFac service all");
		return dao.viewManuFac();
	}

	@Override
	public List<ManuFacVO> serchByManuLoc(String loc) {
		System.out.println("ManuFac service loc");
		return dao.serchByManuLoc(loc);
	}
	
}
