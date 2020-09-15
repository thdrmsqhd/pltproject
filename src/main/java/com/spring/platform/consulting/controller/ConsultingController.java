package com.spring.platform.consulting.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.consulting.vo.ConsultingVO;
import com.spring.platform.quotation.vo.QuotationVO;

public interface ConsultingController {

	ModelAndView insertConsulting(ConsultingVO ConsultingVO, HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView insertConsultingView(String manuId, HttpServletRequest request, HttpServletResponse response);

	List<ConsultingVO> ConsultingList(HttpServletRequest request, HttpServletResponse responset);

	ModelAndView viewOneConsulting(String no, HttpServletRequest request, HttpServletResponse response);

	List<QuotationVO> alarmConsulting(String compId, HttpServletRequest request, HttpServletResponse response);

}
