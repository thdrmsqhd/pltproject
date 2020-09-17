package com.spring.platform.scrap.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.scrap.vo.ScrapVO;

public interface ScrapDAO {
	
	//? „ë¬¸ê? 4ê°œë§Œ ì¶œë ¥
	public List<ScrapVO> printExpertScrap(String compId) throws DataAccessException;
	
	//? „ë¬¸ê? * ì¶œë ¥
	public List<ScrapVO> printExpertScrapAll(Map compMap) throws DataAccessException;

	
	//? œì¡°ì—…ì²? 4ê°œë§Œ ì¶œë ¥
	public List<ScrapVO> printManuScrap(String compId) throws DataAccessException;
	
	//? œì¡°ì—…ì²? * ì¶œë ¥
	public List<ScrapVO> printManuScrapAll(Map compMap) throws DataAccessException;
		
	//insert scrap
	public void scrapExpert(ScrapVO scrapVO) throws DataAccessException;
	
	public void scrapManu(ScrapVO scrapVO) throws DataAccessException;
		
	//delete scrap
	public int deleteExpertScrap(int no) throws DataAccessException;

	public int deleteManuScrap(int no) throws DataAccessException;

	public int listCount(String compId) throws Exception;
	
	public int listExpScrapCount(String compId) throws Exception;

	public int isOverlapE(String expId) throws Exception;

	public int isOverlapM(String expId) throws Exception;


}
