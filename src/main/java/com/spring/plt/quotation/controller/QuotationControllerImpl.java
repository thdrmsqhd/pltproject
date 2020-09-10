package com.spring.plt.quotation.controller;

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

import com.spring.plt.quotation.service.QuotationService;
import com.spring.plt.quotation.vo.QuotationVO;

@Controller
public class QuotationControllerImpl implements QuotationController {
	
	@Autowired
	QuotationService service;
	@RequestMapping(value = "/insertQuotationForm.do", method = RequestMethod.GET)
	@Override
	public ModelAndView insertQuotationView(@RequestParam("manuId") String manuId, HttpServletRequest request,HttpServletResponse response) {
		String viewName = (String) request.getAttribute("viewName");
		System.out.println(viewName);
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	
	@RequestMapping(value = "/insertQuotation.do")
	@Override
	public ModelAndView insertQuotation(@ModelAttribute QuotationVO quotationVO, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("insert Quotation Controller");
		System.out.println(quotationVO.getManuId());
		System.out.println(quotationVO);
		service.insertQuotation(quotationVO);
		String viewName = "redirect:/viewManuFac?id=" + quotationVO.getManuId();
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	@RequestMapping(value = "/quotationList.do",  produces="application/json; charset=UTF8")
	@Override
	@ResponseBody
	public List<QuotationVO> quotationList(HttpServletRequest request, HttpServletResponse responset){
		System.out.println("Quotation List Controller");
		List<QuotationVO> list = service.quotationList();
		System.out.println(list);
		return list;
	}
	
}
