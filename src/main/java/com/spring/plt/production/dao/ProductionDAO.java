package com.spring.plt.production.dao;

import java.util.List;

import com.spring.plt.production.vo.ProductionVO;

public interface ProductionDAO {

	void insertProduction(ProductionVO ProductionVO);

	List<ProductionVO> ProductionList();

}
