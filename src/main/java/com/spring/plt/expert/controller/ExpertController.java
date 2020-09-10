package com.spring.plt.expert.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface ExpertController {

	Map<Integer, Map<String, Object>> serchByExpertType(String type, HttpServletRequest request, HttpServletResponse response);

	Map<Integer, Map<String, Object>> serchByExpertName(String name, HttpServletRequest request, HttpServletResponse response);

	ModelAndView viewExpert(String id, HttpServletRequest request, HttpServletResponse response);

	ModelAndView allExpert(HttpServletRequest request, HttpServletResponse response);

}
