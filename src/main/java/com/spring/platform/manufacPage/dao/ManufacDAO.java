package com.spring.plt.manufacPage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.plt.manufacPage.vo.ManufacVO;
import com.spring.plt.startuppage.vo.PageVO;

public interface ManufacDAO {

	int listCount() throws DataAccessException;

	List<ManufacVO> selectAllEstiList(PageVO pagevo) throws DataAccessException;


	List<ManufacVO> selectAllProdList(PageVO pagevo) throws DataAccessException;

	

	int deleteesti(int no) throws DataAccessException;

	

	int quotestatus(int quotestatus, int no) throws DataAccessException;

	int quotestatus_de(int quotestatus, int no);

	List<ManufacVO> selectWaitingEstiList(PageVO pagevo) throws Exception;
	public List<ManufacVO> selectIngEstiList(PageVO pagevo) throws Exception;
	public List<ManufacVO> selectComEstiList(PageVO pagevo) throws Exception;
	public List<ManufacVO> selectDeEstiList(PageVO pagevo) throws Exception;

	List<ManufacVO> selectWaitProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacVO> selectIngProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacVO> selectComProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacVO> selectSailProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacVO> selectEndProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacVO> selectDeProdList(PageVO pagevo) throws DataAccessException;

	int estilistCount_i() throws Exception;

	int estilistCount_w() throws Exception;

	int estilistCount_c() throws Exception;

	int estilistCount_d() throws Exception;

}
