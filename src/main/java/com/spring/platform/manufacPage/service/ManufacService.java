package com.spring.platform.manufacPage.service;

import java.util.List;

import com.spring.platform.manufacPage.vo.ManufacVO;
import com.spring.platform.startuppage.vo.PageVO;

public interface ManufacService {

	int listCount();

	List<ManufacVO> listesti(PageVO pagevo);

	List<ManufacVO> listprod(PageVO pagevo);

	int deleteesti(int no) throws Exception;

	void updatestatus(int quotestatus, int no);

}
