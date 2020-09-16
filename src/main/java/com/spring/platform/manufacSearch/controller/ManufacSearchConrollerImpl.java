package com.spring.platform.manufacSearch.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.manufac.vo.ManufacVO;
import com.spring.platform.manufacSearch.service.ManufacSearchService;
import com.spring.platform.page.vo.PageVO;

@Controller
public class ManufacSearchConrollerImpl implements ManufacSearchController{
	
	@Autowired
	ManufacSearchService service;
	
	@Autowired
	ManufacVO manufacVO;
	
	@RequestMapping(value="/allManufac")
	@Override
	public ModelAndView allManufac(PageVO pageVO, @RequestParam(value="nowPage", required = false) String nowPage, @RequestParam(value="cntPerPage", required=false)String cntPerPage,HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("ManuFac Controller allManuFac");
		request.setCharacterEncoding("utf-8");
		response.setContentType("html/text;charset=utf-8");
		String viewName = (String) request.getAttribute("viewName");
		int total = service.listCount();
		if(nowPage == null && cntPerPage == null) {
	         nowPage = "1";
	         cntPerPage = "9";
	      }else if(nowPage == null) {
	         nowPage = "1";
	      }else if(cntPerPage == null) {
	         cntPerPage = "9";
	      } //nowPage 현재 페이지, cntPerPage = 한페이지당 글 개수
	    System.out.println(cntPerPage+" 한페이지당 글 개수");
	    pageVO = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));

		List<ManufacVO> manufacList= new ArrayList<ManufacVO>();
		manufacList = service.allManuFac(pageVO);
		ModelAndView mav = new ModelAndView(viewName);//뷰 설정할것 
		mav.addObject("manufacList",manufacList);
		mav.addObject("pageVO", pageVO);
		return mav;
	}
	
	
	@RequestMapping(value="/serchByManufacLoc", method = RequestMethod.GET)
	@Override//위치기반 검색
	@ResponseBody
	public Map<Integer, Map<String, Object>> serchByLoc(@RequestParam("loc") String loc,HttpServletRequest request, HttpServletResponse response) {
		System.out.println(loc);
		System.out.println("Manufac controller");
		List<ManufacVO> manufacList= new ArrayList<ManufacVO>();
		manufacList = service.serchByManuLoc(loc);
		Map<Integer, Map<String, Object>> map = new HashMap<Integer, Map<String,Object>>();
		for(int i =0; i<manufacList.size(); i++) {
			map.put(i,putMapManufac(i,manufacList));
		}
		return map;
	}
	
	@RequestMapping(value="/serchByManuType", method = RequestMethod.GET)
	@Override//업종기반 검색
	@ResponseBody
	public Map<Integer, Map<String, Object>> serchByManuType(@RequestParam("manuType") String manuType,HttpServletRequest request, HttpServletResponse response) {
		System.out.println(manuType);
		System.out.println("Manufac controller");
		List<ManufacVO> manufacList= new ArrayList<ManufacVO>();
		manufacList = service.serchByManuType(manuType);
		Map<Integer, Map<String, Object>> map = new HashMap<Integer, Map<String,Object>>();
		for(int i =0; i<manufacList.size(); i++) {
			map.put(i,putMapManufac(i,manufacList));
		}
		return map;//리턴을 맵타입으로 시도 해볼것,ajax가 리턴 받을수 있는것은 json,xml,text...이기때문에 json으로 반환해주는것이 맞다
	}
	
	@RequestMapping(value="/serchByPrice", method = RequestMethod.GET)
	@Override//최소주문금액 기반 검색
	@ResponseBody
	public Map<Integer, Map<String, Object>> serchByManuMinimumPrice(@RequestParam("price") String price,HttpServletRequest request, HttpServletResponse response) {
		price += "0000";
		int iPrice = Integer.parseInt(price);
		System.out.println(iPrice);
		System.out.println("Manufac controller");
		List<ManufacVO> manufacList= new ArrayList<ManufacVO>();
		manufacList = service.serchByManuMinimumPrice(iPrice);
		Map<Integer, Map<String, Object>> map = new HashMap<Integer, Map<String,Object>>();
		for(int i =0; i<manufacList.size(); i++) {
			map.put(i,putMapManufac(i,manufacList));
		}
		return map;
	}
	
	@RequestMapping(value="/viewManufac", method= RequestMethod.GET)
	@Override//뷰 출력
	public ModelAndView viewManufac(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(id);
		System.out.println("Manufac View");
		String viewName = (String) request.getAttribute("viewName");
		manufacVO = service.viewManuFac(id);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("manufacVO", manufacVO);
		System.out.println(mav);
		return mav;
	}
	
	public Map<String, Object> putMapManufac(int i,List<ManufacVO> manufacList){
		Map<String, Object> manufac = new HashMap<String, Object>();
		String id = manufacList.get(i).getId();
		manufac.put("id", id);
		String pwd = manufacList.get(i).getPwd();
		manufac.put("pwd", pwd);
		String name = manufacList.get(i).getManuName();
		manufac.put("name", name);
		String ceoName = manufacList.get(i).getManuCeoName();
		manufac.put("ceoName", ceoName);
		String email = manufacList.get(i).getManuEmail();
		manufac.put("email", email);
		String bizNo = manufacList.get(i).getManuBizNo();
		manufac.put("bizNo",bizNo);
		String bizType = manufacList.get(i).getManuBizType();
		manufac.put("bizType",bizType);
		String addr = manufacList.get(i).getManuAddr();
		manufac.put("addr",addr);
		String detailAddr = manufacList.get(i).getManuDetailAddr();
		manufac.put("detailAddr",detailAddr);
		String tel = manufacList.get(i).getManuTel();
		manufac.put("tel",tel);
		String start = manufacList.get(i).getManuStart();
		manufac.put("start",start);
		String detail = manufacList.get(i).getManuDetail();
		manufac.put("detail",detail);
		String img = manufacList.get(i).getManuImg();
		manufac.put("img",img);
		int price = manufacList.get(i).getProductPrice();
		manufac.put("price",price);
		String auth = manufacList.get(i).getManuAuth();
		manufac.put("auth",auth);
		String Type = manufacList.get(i).getType();
		manufac.put("Type", Type);
		return manufac;
	}
	
	

}
