package com.spring.platform.startuppage.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.startuppage.vo.PageVO;
import com.spring.platform.startuppage.vo.StartupPageVO;

public interface StartupPageService {
	public List<StartupPageVO> listesti(PageVO pagevo) throws DataAccessException;  
	public int listCount() throws DataAccessException;
	public List<StartupPageVO> listprod(PageVO pagevo) throws DataAccessException;
	public List<StartupPageVO> listcon(PageVO pagevo) throws DataAccessException;
}
