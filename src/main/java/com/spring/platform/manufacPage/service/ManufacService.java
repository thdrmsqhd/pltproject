package com.spring.platform.manufacPage.service;

import java.util.List;

import com.spring.platform.manuFac.vo.ManuFacVO;
import com.spring.platform.page.vo.PageVO;


public interface ManufacService {

	int listCount();

	List<ManuFacVO> listesti(PageVO pagevo);

	List<ManuFacVO> listprod(PageVO pagevo);

	int deleteesti(int no) throws Exception;

	int updatestatus(int quotestatus, int no);

	int updatestatus_de(int quotestatus, int no);

	List<ManuFacVO> w_estiList(PageVO pagevo) throws Exception;
	List<ManuFacVO> i_estiList(PageVO pagevo) throws Exception;
	List<ManuFacVO> c_estiList(PageVO pagevo) throws Exception;
	List<ManuFacVO> d_estiList(PageVO pagevo) throws Exception;

	List<ManuFacVO> d_listprod(PageVO pagevo)throws Exception;
	List<ManuFacVO> w_listprod(PageVO pagevo)throws Exception;
	List<ManuFacVO> i_listprod(PageVO pagevo)throws Exception;
	List<ManuFacVO> c_listprod(PageVO pagevo)throws Exception;
	List<ManuFacVO> s_listprod(PageVO pagevo)throws Exception;
	List<ManuFacVO> e_listprod(PageVO pagevo)throws Exception;
	
	int listCount_d() throws Exception;
	int listCount_i() throws Exception;
	int listCount_w() throws Exception;
	int listCount_c() throws Exception;
	

}
