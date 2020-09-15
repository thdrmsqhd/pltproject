package com.spring.platform.scrap.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.platform.expert.vo.ExpertVO;
import com.spring.platform.scrap.dao.ScrapDAO;
import com.spring.platform.scrap.vo.PageVO;
import com.spring.platform.scrap.vo.ScrapVO;

@Service("scrapService")
@Transactional(propagation = Propagation.REQUIRED)
public class ScrapServiceImpl implements ScrapService{
	@Autowired
	ScrapDAO scrapDAO;
	
	@Autowired
	private PageVO pagevo;
	
	//scrap
	//�쟾臾멸� * 異쒕젰
	@Override
	public List<ScrapVO> printExpertScrapAll(Map compMap) throws Exception{
		List<ScrapVO> expertScrapAllList = scrapDAO.printExpertScrapAll(compMap);
		return expertScrapAllList;
	}
	
	//�쟾臾멸� 4媛쒕쭔 異쒕젰
	@Override
	public List<ScrapVO> printExpertScrap(String compId) throws Exception{
		List<ScrapVO> expertScrapList = scrapDAO.printExpertScrap(compId);
		System.out.println("ScrapService printExpertScrap(�쟾臾멸� * 異쒕젰) �젙�긽�옉�룞");
		return expertScrapList;
	}
	
	//�젣議곗뾽泥� * 異쒕젰
	@Override
	public List<ScrapVO> printManuScrapAll(Map compMap) throws Exception{
		List<ScrapVO> manuScrapAllList = scrapDAO.printManuScrapAll(compMap);
		return manuScrapAllList;
	}
	
	//�젣議곗뾽泥� 4媛쒕쭔 異쒕젰
		@Override
		public List<ScrapVO> printManuScrap(String compId) throws Exception{
			List<ScrapVO> manuScrapList = scrapDAO.printManuScrap(compId);
			return manuScrapList;
		}
		
	@Override
	public Map<String, List<ScrapVO>> printScrap(String compId) throws Exception{
		Map<String, List<ScrapVO>> allScrapMap = new HashMap<String, List<ScrapVO>>();
		List<ScrapVO> expertScrapList = scrapDAO.printExpertScrap(compId);
		List<ScrapVO> manuScrapList = scrapDAO.printManuScrap(compId);
		allScrapMap.put("expertScrap", expertScrapList);
		allScrapMap.put("manuScrap", manuScrapList);
		System.out.println("allScrap 異쒕젰" + allScrapMap);
		return allScrapMap;
	}
	
	//insert scrap
	@Override
	public void scrapExpert(ScrapVO scrap) throws DataAccessException{
		scrapDAO.scrapExpert(scrap);
	}

	@Override
	public void scrapManu(ScrapVO scrap) throws DataAccessException{
		scrapDAO.scrapManu(scrap);
		System.out.println("scrapService 占싹뤄옙");
	}

	
	
	
//	@Override
//	public int scrapExpert(Map<String, Object> scrapMap) throws Exception{
//		System.out.println("scrapExpert() now loading..." + scrapMap);
//		return scrapDAO.scrapExpert(scrapMap);		
//	}
	
//	@Override
//	public int scrapExpert(ScrapVO scrap) throws Exception{
//		return scrapDAO.scrapExpert(scrap);
//	}
	
	//scrap delete
	@Override
	public int deleteExpertScrap(int no) throws DataAccessException{
		return scrapDAO.deleteExpertScrap(no);
	}
	
	@Override
	public int deleteManuScrap(int no) throws DataAccessException{
		return scrapDAO.deleteManuScrap(no);
	}

	public int listCount(String compId) throws Exception{
		return scrapDAO.listCount(compId);
	}
	
	public int listExpScrapCount(String compId) throws Exception{
		return scrapDAO.listExpScrapCount(compId);
	}

}
