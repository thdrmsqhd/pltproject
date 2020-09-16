package com.spring.platform.manufacPage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.spring.platform.manuFac.vo.ManuFacVO;
import com.spring.platform.manufacPage.dao.ManufacDAO;
import com.spring.platform.manufacPage.service.ManufacService;
import com.spring.platform.page.vo.PageVO;


@Service
public class ManufacServiceImpl implements ManufacService{

		@Autowired
		private ManufacDAO manufacdao;
		@Autowired
		private PageVO pagevo;
		
		public List<ManuFacVO> listesti(PageVO pagevo) throws DataAccessException{
			List<ManuFacVO> estilist = null;
			estilist = manufacdao.selectAllEstiList(pagevo);
			System.out.println("service, estiList" + estilist);
			return estilist;
		}
		public List<ManuFacVO> w_estiList(PageVO pagevo) throws Exception{
			List<ManuFacVO> estilist = null;
			estilist = manufacdao.selectWaitingEstiList(pagevo);
			return estilist;
		}
		public List<ManuFacVO> i_estiList(PageVO pagevo) throws Exception{
			List<ManuFacVO> estilist = null;
			estilist = manufacdao.selectIngEstiList(pagevo);
			return estilist;
		}
		public List<ManuFacVO> c_estiList(PageVO pagevo) throws Exception{
			List<ManuFacVO> estilist = null;
			estilist = manufacdao.selectComEstiList(pagevo);
			return estilist;
		}
		public List<ManuFacVO> d_estiList(PageVO pagevo) throws Exception{
			List<ManuFacVO> estilist = null;
			estilist = manufacdao.selectDeEstiList(pagevo);
			return estilist;
		}
		public int listCount() throws DataAccessException{
			return manufacdao.listCount();
		}
		public List<ManuFacVO> listprod(PageVO pagevo) throws DataAccessException{
			List<ManuFacVO> prodlist = null;
			prodlist = manufacdao.selectAllProdList(pagevo);
			System.out.println("service, prodList" + prodlist);
			return prodlist;
		}
		public List<ManuFacVO> w_listprod(PageVO pagevo) throws DataAccessException{
			List<ManuFacVO> w_prodlist = null;
			w_prodlist = manufacdao.selectAllProdList(pagevo);
			System.out.println("service, prodList" + w_prodlist);
			return w_prodlist;
		}
		public List<ManuFacVO> i_listprod(PageVO pagevo) throws DataAccessException{
			List<ManuFacVO> i_prodlist = null;
			i_prodlist = manufacdao.selectAllProdList(pagevo);
			System.out.println("service, prodList" + i_prodlist);
			return i_prodlist;
		}
		public List<ManuFacVO> c_listprod(PageVO pagevo) throws DataAccessException{
			List<ManuFacVO> c_prodlist = null;
			c_prodlist = manufacdao.selectAllProdList(pagevo);
			System.out.println("service, prodList" + c_prodlist);
			return c_prodlist;
		}
		public List<ManuFacVO> s_listprod(PageVO pagevo) throws DataAccessException{
			List<ManuFacVO> s_prodlist = null;
			s_prodlist = manufacdao.selectAllProdList(pagevo);
			System.out.println("service, prodList" + s_prodlist);
			return s_prodlist;
		}
		public List<ManuFacVO> e_listprod(PageVO pagevo) throws DataAccessException{
			List<ManuFacVO> e_prodlist = null;
			e_prodlist = manufacdao.selectAllProdList(pagevo);
			System.out.println("service, prodList" + e_prodlist);
			return e_prodlist;
		}
		public List<ManuFacVO> d_listprod(PageVO pagevo) throws DataAccessException{
			List<ManuFacVO> d_prodlist = null;
			d_prodlist = manufacdao.selectAllProdList(pagevo);
			System.out.println("service, prodList" + d_prodlist);
			return d_prodlist;
		}
		public int deleteesti(int no) throws Exception {
			return manufacdao.deleteesti(no);
		}
		public int updatestatus(int quotestatus, int no)throws DataAccessException{
			return manufacdao.quotestatus(quotestatus,no);
		}
		public int updatestatus_de(int quotestatus, int no)throws DataAccessException{
			return manufacdao.quotestatus_de(quotestatus,no);
		}
		public int listCount_i() throws Exception{
			return manufacdao.estilistCount_i();
		}
		public int listCount_w() throws Exception{
			return manufacdao.estilistCount_w();
		}
		public int listCount_d() throws Exception{
			return manufacdao.estilistCount_d();
		}
		public int listCount_c() throws Exception{
			return manufacdao.estilistCount_c();
		}
}
