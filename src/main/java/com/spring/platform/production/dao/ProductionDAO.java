package com.spring.platform.production.dao;

import java.util.List;

import com.spring.platform.production.vo.ProductionVO;

public interface ProductionDAO {

	void insertProduction(ProductionVO ProductionVO);

	List<ProductionVO> ProductionList();

}
