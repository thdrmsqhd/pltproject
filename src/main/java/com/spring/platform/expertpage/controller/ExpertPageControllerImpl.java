package com.spring.platform.expertpage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.expertpage.service.ExpertPageService;
import com.spring.platform.page.vo.PageVO;

@Controller
public class ExpertPageControllerImpl implements ExpertPageController{
	
	@Autowired
	private ExpertPageService consultingservice;
	
	@RequestMapping(value = "/expertpage/consulting.do",method = RequestMethod.GET)
	public ModelAndView prodlist(PageVO pagevo, @RequestParam(value="nowPage", required = false)String nowPage, @RequestParam(value  = "cntPerPage", required = false)String cntPerPage, HttpServletRequest request, HttpServletResponse response) throws Exception{
			request.setCharacterEncoding("utf-8");
			response.setContentType("html/text;charset=utf-8");
			System.out.println("++++++++++++++++++++++++");
			int total = consultingservice.listCount();
			System.out.println("-----------------------");
			if(nowPage == null && cntPerPage == null) {
				nowPage = "1";
				cntPerPage = "10";
			}else if(nowPage == null) {
				nowPage = "1";
			}else if(cntPerPage == null) {
				cntPerPage = "10";
			}
			System.out.println(nowPage);
			pagevo = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
			List<ConsultingVO> conlist = consultingservice.listcon(pagevo);
			List<ConsultingVO> c_conlist = consultingservice.c_listcon(pagevo);//c == 완료
			List<ConsultingVO> w_conlist = consultingservice.w_listcon(pagevo);//w == 대기
			List<ConsultingVO> i_conlist = consultingservice.i_listcon(pagevo);//i == 진행중
			List<ConsultingVO> d_conlist = consultingservice.d_listcon(pagevo);//d == 거절
			
			ModelAndView mav = new ModelAndView();
			mav.addObject("conlist",conlist);
			mav.addObject("w_conlist",w_conlist);
			mav.addObject("i_conlist",i_conlist);
			mav.addObject("c_conlist",c_conlist);
			mav.addObject("d_conlist",d_conlist);
			mav.addObject("pagevo",pagevo);
	
			
			return mav;
	}
	
	
	@RequestMapping(value="/expertpage/con_wait.do",method = RequestMethod.GET)
	public ModelAndView con_wait(PageVO pagevo, @RequestParam(value="nowPage", required = false)String nowPage, @RequestParam(value  = "cntPerPage", required = false)String cntPerPage, HttpServletRequest request, HttpServletResponse response) throws Exception{
		int total = consultingservice.listCount_w();
		if(nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "10";
		}else if(nowPage == null) {
			nowPage = "1";
		}else if(cntPerPage == null) {
			cntPerPage = "10";
		}
		pagevo = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
		List<ConsultingVO> w_conlist = consultingservice.w_listcon(pagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("w_conlist",w_conlist);
		mav.addObject("pagevo",pagevo);
		
		
		return mav;
	}
	
	@RequestMapping(value="/com_expertpage/com_consulting.do",method = RequestMethod.GET)
	public ModelAndView con_com(PageVO pagevo, @RequestParam(value="nowPage", required = false)String nowPage, @RequestParam(value  = "cntPerPage", required = false)String cntPerPage, HttpServletRequest request, HttpServletResponse response) throws Exception{
		int total = consultingservice.listCount_c();
		if(nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "10";
		}else if(nowPage == null) {
			nowPage = "1";
		}else if(cntPerPage == null) {
			cntPerPage = "10";
		}
		pagevo = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
		List<ConsultingVO> c_conlist = consultingservice.c_listcon(pagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("c_conlist",c_conlist);
		mav.addObject("pagevo",pagevo);
		
		
		return mav;
	}
	@RequestMapping(value="/expertpage/con_ing.do",method = RequestMethod.GET)
	public ModelAndView con_ing(PageVO pagevo, @RequestParam(value="nowPage", required = false)String nowPage, @RequestParam(value  = "cntPerPage", required = false)String cntPerPage, HttpServletRequest request, HttpServletResponse response) throws Exception{
		int total = consultingservice.listCount_i();
		if(nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "10";
		}else if(nowPage == null) {
			nowPage = "1";
		}else if(cntPerPage == null) {
			cntPerPage = "10";
		}
		pagevo = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
		List<ConsultingVO> i_conlist = consultingservice.i_listcon(pagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("i_conlist",i_conlist);
		mav.addObject("pagevo",pagevo);
		
		
		return mav;
	}
	@RequestMapping(value="/expertpage/con_de.do",method = RequestMethod.GET)
	public ModelAndView con_de(PageVO pagevo, @RequestParam(value="nowPage", required = false)String nowPage, @RequestParam(value  = "cntPerPage", required = false)String cntPerPage, HttpServletRequest request, HttpServletResponse response) throws Exception{
		int total = consultingservice.listCount_d();
		if(nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "10";
		}else if(nowPage == null) {
			nowPage = "1";
		}else if(cntPerPage == null) {
			cntPerPage = "10";
		}
		pagevo = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
		List<ConsultingVO> d_conlist = consultingservice.d_listcon(pagevo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("d_conlist",d_conlist);
		mav.addObject("pagevo",pagevo);
		
		
		return mav;
	}
	
	
	
	
	
	@RequestMapping(value="/expertpage/estilist_del.do" , method = RequestMethod.GET)
	public ModelAndView deletestatus(@RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response)throws Exception{
		request.setCharacterEncoding("utf-8");
		System.out.println("delete NO: "+no);
		consultingservice.deleteesti(no);
		ModelAndView mav = new ModelAndView("redirect:/expertpage/consulting.do");
		return mav;
	}
	@RequestMapping(value="/expertpage/com_estilist_del.do" , method = RequestMethod.GET)
	public ModelAndView com_deletestatus(@RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response)throws Exception{
		request.setCharacterEncoding("utf-8");
		System.out.println("delete NO: "+no);
		consultingservice.deleteesti(no);
		ModelAndView mav = new ModelAndView("redirect:/com_expertpage/com_consulting.do");
		return mav;
	}
	@RequestMapping(value ="/expertpage/updatestatus_y.do", method = RequestMethod.GET)
	public ModelAndView updatestatus_y(@RequestParam("status") int status, @RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response)throws Exception{
		request.setCharacterEncoding("utf-8");
		consultingservice.status_y(status,no);
		ModelAndView mav = new ModelAndView("redirect:/expertpage/consulting.do");
		return mav;
	}
	@RequestMapping(value ="/expertpage/updatestatus_n.do", method = RequestMethod.GET)
	public ModelAndView updatestatus_n(@RequestParam("status") int status, @RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response)throws Exception{
		request.setCharacterEncoding("utf-8");
		consultingservice.status_n(status,no);
		ModelAndView mav = new ModelAndView("redirect:/expertpage/consulting.do");
	
		return mav;
	}
}
