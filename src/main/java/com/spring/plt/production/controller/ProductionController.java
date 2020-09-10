package com.spring.plt.production.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.plt.production.vo.ProductionVO;

public interface ProductionController {

	ModelAndView insertProductionView(String manuId, HttpServletRequest request, HttpServletResponse response);

	ModelAndView insertProduction(ProductionVO ProductionVO, HttpServletRequest request, HttpServletResponse response);

	List<ProductionVO> ProductionList(HttpServletRequest request, HttpServletResponse responset);

}
