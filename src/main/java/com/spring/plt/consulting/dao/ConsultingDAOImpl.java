package com.spring.plt.consulting.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.plt.consulting.vo.ConsultingVO;

@Repository
public class ConsultingDAOImpl implements ConsultingDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void insertConsulting(ConsultingVO ConsultingVO) {
		System.out.println("Consulting DAO");
		sqlSession.insert("mapper.consulting.insertConsulting", ConsultingVO);
	}
	@Override
	public List<ConsultingVO> ConsultingList(){
		System.out.println("Consulting List DAO");
		return sqlSession.selectList("mapper.consulting.ConsultingList");
	}
}
