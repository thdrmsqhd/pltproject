package com.spring.plt.manufacPage.service;

import java.util.List;

import com.spring.plt.manufacPage.vo.ManufacVO;
import com.spring.plt.startuppage.vo.PageVO;

public interface ManufacService {

	int listCount();

	List<ManufacVO> listesti(PageVO pagevo);

	List<ManufacVO> listprod(PageVO pagevo);

	int deleteesti(int no) throws Exception;

	int updatestatus(int quotestatus, int no);

	int updatestatus_de(int quotestatus, int no);

	List<ManufacVO> w_estiList(PageVO pagevo) throws Exception;
	List<ManufacVO> i_estiList(PageVO pagevo) throws Exception;
	List<ManufacVO> c_estiList(PageVO pagevo) throws Exception;
	List<ManufacVO> d_estiList(PageVO pagevo) throws Exception;

	List<ManufacVO> d_listprod(PageVO pagevo)throws Exception;
	List<ManufacVO> w_listprod(PageVO pagevo)throws Exception;
	List<ManufacVO> i_listprod(PageVO pagevo)throws Exception;
	List<ManufacVO> c_listprod(PageVO pagevo)throws Exception;
	List<ManufacVO> s_listprod(PageVO pagevo)throws Exception;
	List<ManufacVO> e_listprod(PageVO pagevo)throws Exception;
	
	int listCount_d() throws Exception;
	int listCount_i() throws Exception;
	int listCount_w() throws Exception;
	int listCount_c() throws Exception;
	

}
