package com.spring.plt.manuFac.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.spring.plt.manuFac.vo.ManuFacVO;

@Repository
public class ManuFacDAOImpl implements ManuFacDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<ManuFacVO> serchByManuLoc(String loc) throws DataAccessException{
		System.out.println("ManuFac DAO loc");
		System.out.println(loc);
		List<ManuFacVO> manuFacList = null;
		manuFacList = sqlSession.selectList("mapper.manufac.selectByManuLoc",loc);
		System.out.println(manuFacList);
		return manuFacList;
	}

	@Override
	public List<ManuFacVO> serchByManuType(String manuType) {
		System.out.println("ManuFac DAO type");
		return sqlSession.selectList("mapper.manufac.serchByManuType", manuType);
	}

	@Override
	public List<ManuFacVO> serchByManuMinimunPrice(int price) {
		System.out.println("ManuFac DAO price");
		return sqlSession.selectList("mapper.manufac.serchByManuMinimumPrice", price);
	}

	@Override
	public ManuFacVO viewManuFac(String id) {
		System.out.println("ManuFac DAO view");
		return sqlSession.selectOne("mapper.manufac.viewManuFac", id);
	}

	@Override
	public List<ManuFacVO> viewManuFac() {
		System.out.println("ManuFac DAO all");
		return sqlSession.selectList("mapper.manufac.allManuFac");
	}
	
}


