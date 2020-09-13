package com.spring.plt.consulting.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.plt.consulting.vo.ConsultingVO;
import com.spring.plt.quotation.vo.QuotationVO;

public interface ConsultingController {

	ModelAndView insertConsulting(ConsultingVO ConsultingVO, HttpServletRequest request, HttpServletResponse response);

	ModelAndView insertConsultingView(String manuId, HttpServletRequest request, HttpServletResponse response);

	List<ConsultingVO> ConsultingList(HttpServletRequest request, HttpServletResponse responset);

	ModelAndView viewOneConsulting(String no, HttpServletRequest request, HttpServletResponse response);

	List<QuotationVO> alarmConsulting(String compId, HttpServletRequest request, HttpServletResponse response);

}
