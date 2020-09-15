package com.spring.platform.manufacPage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.spring.platform.manufacPage.dao.ManufacDAO;
import com.spring.platform.manufacPage.service.ManufacService;
import com.spring.platform.manufacPage.vo.ManufacVO;
import com.spring.platform.startuppage.vo.PageVO;


@Service("manufacservice")
public class ManufacServiceImpl implements ManufacService{

		@Autowired
		private ManufacDAO manufacdao;
		@Autowired
		private PageVO pagevo;
		
		public List<ManufacVO> listesti(PageVO pagevo) throws DataAccessException{
			List<ManufacVO> estilist = null;
			estilist = manufacdao.selectAllEstiList(pagevo);
			System.out.println("service" + estilist);
			return estilist;
		}
		public int listCount() throws DataAccessException{
			return manufacdao.listCount();
		}
		public List<ManufacVO> listprod(PageVO pagevo) throws DataAccessException{
			List<ManufacVO> prodlist = null;
			prodlist = manufacdao.selectAllEstiList(pagevo);
			System.out.println("service" + prodlist);
			return prodlist;
		}
		
		public int deleteesti(int no) throws Exception {
			return manufacdao.deleteesti(no);
		}
		@Override
		public void updatestatus(int quotestatus, int no) {
			// TODO Auto-generated method stub
			
		}
}