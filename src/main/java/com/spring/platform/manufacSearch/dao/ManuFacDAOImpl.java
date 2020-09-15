package com.spring.platform.manufacSearch.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.spring.platform.manuFac.vo.ManuFacVO;
import com.spring.platform.page.vo.PageVO;

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
	public ManuFacVO viewOneManuFac(String id) {
		System.out.println("ManuFac DAO view");
		return sqlSession.selectOne("mapper.manufac.viewManuFac", id);
	}

	@Override
	public List<ManuFacVO> allManuFac(PageVO pageVO) {
		System.out.println("ManuFac DAO all"+" " + pageVO.getStart() +" 현재페이지 "+ pageVO.getEnd());
		return sqlSession.selectList("mapper.manufac.allManuFac",pageVO);
	}

	@Override
	public int listCount() throws DataAccessException {
		int listCount = sqlSession.selectOne("mapper.manufac.listCount");
		return listCount;
	}



}


