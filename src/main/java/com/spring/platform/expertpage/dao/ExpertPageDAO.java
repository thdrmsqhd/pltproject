package com.spring.platform.expertpage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.expertpage.vo.ExpertPageVO;
import com.spring.platform.page.vo.PageVO;


public interface ExpertPageDAO {
	public int listCount() throws Exception;
	public List<ExpertPageVO> selectAllEstiList(PageVO pagevo) throws DataAccessException;
	public int deleteesti(int no) throws DataAccessException;
	public List<ExpertPageVO> selectWaitEstiList(PageVO pagevo) throws DataAccessException;
	public List<ExpertPageVO> selectIngEstiList(PageVO pagevo) throws DataAccessException;
	public List<ExpertPageVO> selectComEstiList(PageVO pagevo) throws DataAccessException;
	public List<ExpertPageVO> selectDeEstiList(PageVO pagevo) throws DataAccessException;
	public int status_n(int status, int no) throws DataAccessException;
	public int status_y(int status, int no) throws DataAccessException;
	int listCount_i() throws Exception;
	int listCount_w() throws Exception;
	int listCount_c() throws Exception;
	int listCount_d() throws Exception;
	
}
