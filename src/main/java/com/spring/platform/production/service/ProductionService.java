package com.spring.platform.production.service;

import java.util.List;

import com.spring.platform.production.vo.ProductionVO;

public interface ProductionService {

	void insertProduction(ProductionVO ProductionVO);

	List<ProductionVO> ProductionList();

}
