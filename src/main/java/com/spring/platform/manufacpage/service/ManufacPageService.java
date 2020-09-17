package com.spring.platform.manufacpage.service;

import java.util.List;

import com.spring.platform.manufacpage.vo.ManufacPageVO;
import com.spring.platform.page.vo.PageVO;


public interface ManufacPageService {

	int listCount();

	List<ManufacPageVO> listesti(PageVO pagevo);

	List<ManufacPageVO> listprod(PageVO pagevo);

	int deleteesti(int no) throws Exception;

	int updatestatus(int quotestatus, int no);

	int updatestatus_de(int quotestatus, int no);

	List<ManufacPageVO> w_estiList(PageVO pagevo) throws Exception;
	List<ManufacPageVO> i_estiList(PageVO pagevo) throws Exception;
	List<ManufacPageVO> c_estiList(PageVO pagevo) throws Exception;
	List<ManufacPageVO> d_estiList(PageVO pagevo) throws Exception;

	List<ManufacPageVO> d_listprod(PageVO pagevo)throws Exception;
	List<ManufacPageVO> w_listprod(PageVO pagevo)throws Exception;
	List<ManufacPageVO> i_listprod(PageVO pagevo)throws Exception;
	List<ManufacPageVO> c_listprod(PageVO pagevo)throws Exception;
	List<ManufacPageVO> s_listprod(PageVO pagevo)throws Exception;
	List<ManufacPageVO> e_listprod(PageVO pagevo)throws Exception;
	
	int listCount_d() throws Exception;
	int listCount_i() throws Exception;
	int listCount_w() throws Exception;
	int listCount_c() throws Exception;
	

}
