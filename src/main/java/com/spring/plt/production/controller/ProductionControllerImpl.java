package com.spring.plt.production.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.plt.production.service.ProductionService;
import com.spring.plt.production.vo.ProductionVO;

@Controller
public class ProductionControllerImpl implements ProductionController{
	@Autowired
	ProductionService service;
	@RequestMapping(value = "/insertProductionForm.do", method = RequestMethod.GET)
	@Override
	public ModelAndView insertProductionView(@RequestParam("manuId") String manuId, HttpServletRequest request,HttpServletResponse response) {
		String viewName = (String) request.getAttribute("viewName");
		System.out.println(viewName);
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	
	@RequestMapping(value = "/insertProduction.do")
	@Override
	public ModelAndView insertProduction(@ModelAttribute ProductionVO ProductionVO, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("insert Production Controller");
		System.out.println(ProductionVO.getCompId());
		service.insertProduction(ProductionVO);
		String viewName = "redirect:/viewExpert?id=" + ProductionVO.getCompId();
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	@RequestMapping(value = "/ProductionList.do",  produces="application/json; charset=UTF8")
	@Override
	@ResponseBody
	public List<ProductionVO> ProductionList(HttpServletRequest request, HttpServletResponse responset){
		System.out.println("Production List Controller");
		List<ProductionVO> list = service.ProductionList();
		System.out.println(list);
		return list;
	}
}
