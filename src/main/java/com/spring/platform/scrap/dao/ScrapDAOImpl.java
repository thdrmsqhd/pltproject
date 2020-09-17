package com.spring.platform.scrap.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.scrap.vo.ScrapVO;

@Repository
public class ScrapDAOImpl implements ScrapDAO{

	@Autowired
	private SqlSession sqlSession;
	
	//scrap
	//?��문�? 4개만 출력
	@Override
	public List<ScrapVO> printExpertScrap(String compId) throws DataAccessException{
		List<ScrapVO> expertScrapList = sqlSession.selectList("mapper.expertScrap.printExpertScrap", compId);
		return expertScrapList;
	}
	
	//?��문�? * 출력
	@Override
	public List<ScrapVO> printExpertScrapAll(Map compMap) throws DataAccessException{
		List<ScrapVO> expertScrapAllList = sqlSession.selectList("mapper.expertScrap.printExpertScrapAll", compMap);
		return expertScrapAllList;
	}
	
	//?��조업�? 4개만 출력
	@Override
	public List<ScrapVO> printManuScrap(String compId) throws DataAccessException{
		List<ScrapVO> manuScrapList = sqlSession.selectList("mapper.manuScrap.printManuScrap", compId);
		return manuScrapList;
	}
	
	//?��조업�? * 출력
	@Override
	public List<ScrapVO> printManuScrapAll(Map compMap) throws DataAccessException{
		List<ScrapVO> manuScrapAllList = sqlSession.selectList("mapper.manuScrap.printManuScrapAll", compMap);
		return manuScrapAllList;
		}
		
	//insert scrap
	@Override
	public void scrapExpert(ScrapVO scrapVO) throws DataAccessException{
		sqlSession.insert("mapper.expertScrap.scrapExpert", scrapVO);
	}
	
	@Override
	public void scrapManu(ScrapVO scrapVO) throws DataAccessException{
		sqlSession.insert("mapper.manuScrap.scrapManu", scrapVO);
	}
	
	
	
	//delete scrap
	@Override
	public int deleteExpertScrap(int no) throws DataAccessException{
		int result = sqlSession.delete("mapper.expertScrap.deleteExpertScrap", no);
		return result;
	}
	
	@Override
	public int deleteManuScrap(int no) throws DataAccessException{
		int result = sqlSession.delete("mapper.manuScrap.deleteManuScrap", no);
		return result;
	}
	
	public int listCount(String compId) throws Exception{
		return sqlSession.selectOne("mapper.manuScrap.listCount", compId);
	}
	
	public int listExpScrapCount(String compId) throws Exception{
		return sqlSession.selectOne("mapper.expertScrap.listCount", compId);
	}
	
	public int isOverlapE(String expId) throws Exception{
		return sqlSession.selectOne("mapper.expertScrap.overlap", expId);
	}
	
	public int isOverlapM(String expId) throws Exception{
		return sqlSession.selectOne("mapper.manuScrap.overlap", expId);
	}
		
	
}
