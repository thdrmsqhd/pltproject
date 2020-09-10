package com.spring.plt.expert.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.plt.expert.vo.ExpertVO;

@Repository
public class ExpertDAOImpl implements ExpertDAO {
	
	@Autowired
	SqlSession sqlSession;
	

	@Override
	public List<ExpertVO> serchByExpertName(String name) {
		System.out.println("expert DAO name");
		System.out.println(name);
		return sqlSession.selectList("mapper.expert.serchByName", name);
	}

	@Override
	public List<ExpertVO> serchByExpertType(String type) {
		System.out.println("expert DAO type");
		return sqlSession.selectList("mapper.expert.serchByType", type);
	}

	@Override
	public ExpertVO viewExpert(String id) {
		System.out.println("expert DAO view");
		return sqlSession.selectOne("mapper.expert.viewExpert", id);
	}
	
	@Override
	public List<ExpertVO> allExpert(){
		System.out.println("expert DAO all");
		return sqlSession.selectList("mapper.expert.allExpert");
	}
}
