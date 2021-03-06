package com.spring.platform.expSearch.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.page.vo.PageVO;

public interface ExpertSearchController {

	Map<Integer, Map<String, Object>> serchByExpertType(String type, HttpServletRequest request, HttpServletResponse response);

	Map<Integer, Map<String, Object>> serchByExpertName(String name, HttpServletRequest request, HttpServletResponse response);

	ModelAndView viewExpert(String id, HttpServletRequest request, HttpServletResponse response) throws Exception;


	ModelAndView allExpert(PageVO pageVO, String nowPage, String cntPage, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

}
