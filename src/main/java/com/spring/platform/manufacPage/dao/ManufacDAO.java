package com.spring.platform.manufacPage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.manuFac.vo.ManuFacVO;
import com.spring.platform.page.vo.PageVO;


public interface ManufacDAO {

	int listCount() throws DataAccessException;

	List<ManuFacVO> selectAllEstiList(PageVO pagevo) throws DataAccessException;


	List<ManuFacVO> selectAllProdList(PageVO pagevo) throws DataAccessException;

	

	int deleteesti(int no) throws DataAccessException;

	

	int quotestatus(int quotestatus, int no) throws DataAccessException;

	int quotestatus_de(int quotestatus, int no);

	List<ManuFacVO> selectWaitingEstiList(PageVO pagevo) throws Exception;
	public List<ManuFacVO> selectIngEstiList(PageVO pagevo) throws Exception;
	public List<ManuFacVO> selectComEstiList(PageVO pagevo) throws Exception;
	public List<ManuFacVO> selectDeEstiList(PageVO pagevo) throws Exception;

	List<ManuFacVO> selectWaitProdList(PageVO pagevo) throws DataAccessException;

	List<ManuFacVO> selectIngProdList(PageVO pagevo) throws DataAccessException;

	List<ManuFacVO> selectComProdList(PageVO pagevo) throws DataAccessException;

	List<ManuFacVO> selectSailProdList(PageVO pagevo) throws DataAccessException;

	List<ManuFacVO> selectEndProdList(PageVO pagevo) throws DataAccessException;

	List<ManuFacVO> selectDeProdList(PageVO pagevo) throws DataAccessException;

	int estilistCount_i() throws Exception;

	int estilistCount_w() throws Exception;

	int estilistCount_c() throws Exception;

	int estilistCount_d() throws Exception;

}
