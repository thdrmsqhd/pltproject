package com.spring.platform.manufacSearch.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.page.vo.PageVO;


public interface ManufacSearchController {

	Map<Integer, Map<String, Object>> serchByLoc(String loc, HttpServletRequest request, HttpServletResponse response);

	Map<Integer, Map<String, Object>> serchByManuType(String manuType, HttpServletRequest request, HttpServletResponse response);

	Map<Integer, Map<String, Object>> serchByManuMinimumPrice(String price, HttpServletRequest request, HttpServletResponse response);

	ModelAndView viewManuFac(String id, HttpServletRequest request, HttpServletResponse response);

	ModelAndView allManuFac(PageVO pagevo, String nowPage, String cntPerPage, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

}
