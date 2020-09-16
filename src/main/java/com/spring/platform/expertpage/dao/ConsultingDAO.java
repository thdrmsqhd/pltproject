package com.spring.platform.expertpage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.expertpage.vo.ConsultingVO;
import com.spring.platform.startuppage.vo.PageVO;

public interface ConsultingDAO {
	public int listCount() throws Exception;
	public List<ConsultingVO> selectAllEstiList(PageVO pagevo) throws DataAccessException;
	public int deleteesti(int no) throws DataAccessException;
	public List<ConsultingVO> selectWaitEstiList(PageVO pagevo) throws DataAccessException;
	public List<ConsultingVO> selectIngEstiList(PageVO pagevo) throws DataAccessException;
	public List<ConsultingVO> selectComEstiList(PageVO pagevo) throws DataAccessException;
	public List<ConsultingVO> selectDeEstiList(PageVO pagevo) throws DataAccessException;
	public int status_n(int status, int no) throws DataAccessException;
	public int status_y(int status, int no) throws DataAccessException;
	int listCount_i() throws Exception;
	int listCount_w() throws Exception;
	int listCount_c() throws Exception;
	int listCount_d() throws Exception;
	
}
