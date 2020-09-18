package com.spring.platform.mypage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.platform.alluser.vo.AlluserVO;
import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.quotation.vo.QuotationVO;
import com.spring.platform.scrap.vo.ScrapVO;

@Repository
public class MyPageDAOImpl implements MyPageDAO{
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public AlluserVO getUserVO(String userId) {
		return sqlSession.selectOne("mapper.mypage.getUserVO",userId);
	}

	@Override
	public List<ScrapVO> getManuScrap(String userId) {
		return sqlSession.selectList("mapper.mypage.getManuScrap",userId);
	}
	
	@Override
	public List<ScrapVO> getExpertScrap(String userId) {
		return sqlSession.selectList("mapper.mypage.getExpertScrap",userId);
	}

	@Override
	public List<QuotationVO> getQuotation(String userId) {
		return sqlSession.selectList("mapper.mypage.getQuotation",userId);
	}

	@Override
	public List<ConsultingVO> getConsulting(String userId) {
		return sqlSession.selectList("mapper.mypage.getConsulting",userId);
	}
}
