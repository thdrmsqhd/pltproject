package com.spring.platform.scrap.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.scrap.vo.PageVO;
import com.spring.platform.scrap.vo.ScrapVO;

@Repository("scrapDAO")
public class ScrapDAOImpl implements ScrapDAO{

	@Autowired
	private SqlSession sqlSession;
	
	//scrap
	//�쟾臾멸� 4媛쒕쭔 異쒕젰
	@Override
	public List<ScrapVO> printExpertScrap(String compId) throws DataAccessException{
		List<ScrapVO> expertScrapList = sqlSession.selectList("mapper.expertScrap.printExpertScrap", compId);
		System.out.println("ScrapDAO printExpertScrap(�쟾臾멸� * 異쒕젰) �젙�긽�옉�룞");
		return expertScrapList;
	}
	
	//�쟾臾멸� * 異쒕젰
	@Override
	public List<ScrapVO> printExpertScrapAll(Map compMap) throws DataAccessException{
		System.out.println("==============expert !!"+compMap);
		List<ScrapVO> expertScrapAllList = sqlSession.selectList("mapper.expertScrap.printExpertScrapAll", compMap);
		return expertScrapAllList;
	}
	
	//�젣議곗뾽泥� 4媛쒕쭔 異쒕젰
	@Override
	public List<ScrapVO> printManuScrap(String compId) throws DataAccessException{
		List<ScrapVO> manuScrapList = sqlSession.selectList("mapper.manuScrap.printManuScrap", compId);
		return manuScrapList;
	}
	
	//�젣議곗뾽泥� * 異쒕젰
	@Override
	public List<ScrapVO> printManuScrapAll(Map compMap) throws DataAccessException{
		System.out.println("==============manu !!"+compMap);
		List<ScrapVO> manuScrapAllList = sqlSession.selectList("mapper.manuScrap.printManuScrapAll", compMap);
		return manuScrapAllList;
		}
		
	//insert scrap
	@Override
	public void scrapExpert(ScrapVO scrapVO) throws DataAccessException{
		sqlSession.insert("mapper.expertScrap.scrapExpert", scrapVO);
		System.out.println("scrapDAO query 占쏙옙占쏙옙 占싹뤄옙!");
	}
	
	@Override
	public void scrapManu(ScrapVO scrapVO) throws DataAccessException{
		System.out.println("sqlDAO 占쏙옙占쏙옙");
		sqlSession.insert("mapper.manuScrap.scrapManu", scrapVO);
		System.out.println("scrapDAO query 占쏙옙占쏙옙 占싹뤄옙!");
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
	
}
