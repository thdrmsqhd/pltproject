package com.spring.plt.production.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.plt.production.vo.ProductionVO;

@Repository
public class ProductionDAOimpl implements ProductionDAO{
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void insertProduction(ProductionVO ProductionVO) {
		System.out.println("Production DAO");
		sqlSession.delete("mapper.Production.insertProduction", ProductionVO);
	}
	@Override
	public List<ProductionVO> ProductionList(){
		System.out.println("Production List DAO");
		return sqlSession.selectList("mapper.Production.ProductionList");
	}
}
