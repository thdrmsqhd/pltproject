package com.spring.plt.production.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.plt.production.dao.ProductionDAO;
import com.spring.plt.production.vo.ProductionVO;

@Service
public class ProductionServiceImpl implements ProductionService {
	@Autowired
	ProductionDAO dao;
	
	@Override
	public void insertProduction(ProductionVO ProductionVO) {
		System.out.println("insert ProductionVO Service");
		dao.insertProduction(ProductionVO);
	}
	
	@Override
	public List<ProductionVO> ProductionList(){
		return dao.ProductionList();
	}
}
