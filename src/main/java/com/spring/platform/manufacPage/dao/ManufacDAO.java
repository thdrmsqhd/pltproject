package com.spring.platform.manufacPage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.manufacPage.vo.ManufacVO;
import com.spring.platform.startuppage.vo.PageVO;

public interface ManufacDAO {

	int listCount() throws DataAccessException;

	List<ManufacVO> selectAllEstiList(PageVO pagevo) throws DataAccessException;


	List<ManufacVO> selectAllProdList(PageVO pagevo) throws DataAccessException;



	int deleteesti(int no) throws DataAccessException;

}
