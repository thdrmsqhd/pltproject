package com.spring.platform.scrap.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.scrap.vo.PageVO;
import com.spring.platform.scrap.vo.ScrapVO;

public interface ScrapController {

	public ModelAndView printExpertScrapAll(PageVO pageVO, @RequestParam(value="nowPage", required = false) String nowPage,
			@RequestParam(value="cntPerPage", required=false)String cntPerPage, 
			@RequestParam("compId") String compId,
			HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView printManuScrapAll(PageVO pageVO, @RequestParam(value="nowPage", required = false) String nowPage,
			@RequestParam(value="cntPerPage", required=false)String cntPerPage, 
			@RequestParam("compId") String compId,
			HttpServletRequest request, HttpServletResponse response) throws Exception;

//	public ModelAndView scrapExpert(@ModelAttribute("scrap") ScrapVO scrap,
//			HttpServletRequest request, HttpServletResponse response) throws Exception;


	public ModelAndView deleteExpertScrap(@RequestParam("no") int no, 
			HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView deleteManuScrap(@RequestParam("no") int no, 
			HttpServletRequest request, HttpServletResponse response) throws Exception;

	public void scrapExpert(String expId, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void scrapManu(String manuId, HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView printScrapAll(@RequestParam("compId") String compId,
			HttpServletRequest request, HttpServletResponse response) throws Exception;


	
}
