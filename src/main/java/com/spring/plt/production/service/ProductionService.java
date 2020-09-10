package com.spring.plt.production.service;

import java.util.List;

import com.spring.plt.production.vo.ProductionVO;

public interface ProductionService {

	void insertProduction(ProductionVO ProductionVO);

	List<ProductionVO> ProductionList();

}
