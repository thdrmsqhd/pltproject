package com.spring.platform.expertpage.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.page.vo.PageVO;

public interface ExpertPageService {
	public int listCount() throws Exception;
	public int listCount_i() throws Exception;
	public int listCount_c() throws Exception;
	public int listCount_w() throws Exception;
	public int listCount_d() throws Exception;
	
	
	public List<ConsultingVO> w_listcon(PageVO pagevo) throws DataAccessException;
	public List<ConsultingVO> i_listcon(PageVO pagevo) throws DataAccessException;
	public List<ConsultingVO> c_listcon(PageVO pagevo) throws DataAccessException;
	public List<ConsultingVO> d_listcon(PageVO pagevo) throws DataAccessException;
	public List<ConsultingVO> listcon(PageVO pagevo) throws DataAccessException;
	public int deleteesti(int no) throws Exception;
	public int status_n(int status, int no)throws Exception;
	public int status_y(int status, int no)throws Exception;
}
