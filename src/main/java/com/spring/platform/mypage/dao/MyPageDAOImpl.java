package com.spring.platform.mypage.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.platform.alluser.vo.AlluserVO;

@Repository
public class MyPageDAOImpl implements MyPageDAO{
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public AlluserVO getUserVO(String userId) {
		return sqlSession.selectOne("mapper.mypage.getUserVO",userId);
	}
}
