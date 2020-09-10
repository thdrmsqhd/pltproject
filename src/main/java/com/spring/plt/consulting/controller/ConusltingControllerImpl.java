package com.spring.plt.consulting.controller;

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

import com.spring.plt.consulting.service.ConsultingService;
import com.spring.plt.consulting.vo.ConsultingVO;

@Controller
public class ConusltingControllerImpl implements ConsultingController {
	@Autowired
	ConsultingService service;
	@RequestMapping(value = "/insertConsultingForm.do", method = RequestMethod.GET)
	@Override
	public ModelAndView insertConsultingView(@RequestParam("expId") String expId, HttpServletRequest request,HttpServletResponse response) {
		String viewName = (String) request.getAttribute("viewName");
		System.out.println(viewName);
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	
	@RequestMapping(value = "/insertConsulting.do")
	@Override
	public ModelAndView insertConsulting(@ModelAttribute ConsultingVO ConsultingVO, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("insert Consulting Controller");
		System.out.println(ConsultingVO.getFileName());
		service.insertConsulting(ConsultingVO);
		String viewName = "redirect:/viewExpert?id=" + ConsultingVO.getExpId();
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
	@RequestMapping(value = "/ConsultingList.do",  produces="application/json; charset=UTF8")
	@Override
	@ResponseBody
	public List<ConsultingVO> ConsultingList(HttpServletRequest request, HttpServletResponse responset){
		System.out.println("Consulting List Controller");
		List<ConsultingVO> list = service.ConsultingList();
		System.out.println(list);
		return list;
	}
}
