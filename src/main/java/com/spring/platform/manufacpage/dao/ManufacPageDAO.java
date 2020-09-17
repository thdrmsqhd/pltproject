package com.spring.platform.manufacpage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.platform.manufacpage.vo.ManufacPageVO;
import com.spring.platform.page.vo.PageVO;

public interface ManufacPageDAO {

	int listCount() throws DataAccessException;

	List<ManufacPageVO> selectAllEstiList(PageVO pagevo) throws DataAccessException;


	List<ManufacPageVO> selectAllProdList(PageVO pagevo) throws DataAccessException;

	

	int deleteesti(int no) throws DataAccessException;

	

	int quotestatus(int quotestatus, int no) throws DataAccessException;

	int quotestatus_de(int quotestatus, int no);

	List<ManufacPageVO> selectWaitingEstiList(PageVO pagevo) throws Exception;
	public List<ManufacPageVO> selectIngEstiList(PageVO pagevo) throws Exception;
	public List<ManufacPageVO> selectComEstiList(PageVO pagevo) throws Exception;
	public List<ManufacPageVO> selectDeEstiList(PageVO pagevo) throws Exception;

	List<ManufacPageVO> selectWaitProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacPageVO> selectIngProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacPageVO> selectComProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacPageVO> selectSailProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacPageVO> selectEndProdList(PageVO pagevo) throws DataAccessException;

	List<ManufacPageVO> selectDeProdList(PageVO pagevo) throws DataAccessException;

	int estilistCount_i() throws Exception;

	int estilistCount_w() throws Exception;

	int estilistCount_c() throws Exception;

	int estilistCount_d() throws Exception;

}
