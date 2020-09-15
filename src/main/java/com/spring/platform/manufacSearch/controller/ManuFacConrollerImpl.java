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

import com.spring.platform.manuFac.vo.ManuFacVO;
import com.spring.platform.manufacSearch.service.ManuFacService;
import com.spring.platform.page.vo.PageVO;

@Controller
public class ManuFacConrollerImpl implements ManuFacController{
	
	@Autowired
	ManuFacService service;
	
	@Autowired
	ManuFacVO manuFacVO;
	
	@RequestMapping(value="/allManuFac")
	@Override
	public ModelAndView allManuFac(PageVO pageVO, @RequestParam(value="nowPage", required = false) String nowPage, @RequestParam(value="cntPerPage", required=false)String cntPerPage,HttpServletRequest request, HttpServletResponse response) throws Exception {
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
	      } //nowPage ���� ������, cntPerPage = ���������� �� ����
	    System.out.println(cntPerPage+" ���������� �� ����");
	    pageVO = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));

		List<ManuFacVO> manuFacList= new ArrayList<ManuFacVO>();
		manuFacList = service.allManuFac(pageVO);
		ModelAndView mav = new ModelAndView(viewName);//�� �����Ұ� 
		mav.addObject("manuFacList",manuFacList);
		mav.addObject("pageVO", pageVO);
		return mav;
	}
	
	
	@RequestMapping(value="/serchByManuFacLoc", method = RequestMethod.GET)
	@Override//��ġ��� �˻�
	@ResponseBody
	public Map<Integer, Map<String, Object>> serchByLoc(@RequestParam("loc") String loc,HttpServletRequest request, HttpServletResponse response) {
		System.out.println(loc);
		System.out.println("ManuFac controller");
		List<ManuFacVO> manuFacList= new ArrayList<ManuFacVO>();
		manuFacList = service.serchByManuLoc(loc);
		Map<Integer, Map<String, Object>> map = new HashMap<Integer, Map<String,Object>>();
		for(int i =0; i<manuFacList.size(); i++) {
			map.put(i,putMapManuFac(i,manuFacList));
		}
		return map;
	}
	
	@RequestMapping(value="/serchByManuType", method = RequestMethod.GET)
	@Override//������� �˻�
	@ResponseBody
	public Map<Integer, Map<String, Object>> serchByManuType(@RequestParam("manuType") String manuType,HttpServletRequest request, HttpServletResponse response) {
		System.out.println(manuType);
		System.out.println("ManuFac controller");
		List<ManuFacVO> manuFacList= new ArrayList<ManuFacVO>();
		manuFacList = service.serchByManuType(manuType);
		Map<Integer, Map<String, Object>> map = new HashMap<Integer, Map<String,Object>>();
		for(int i =0; i<manuFacList.size(); i++) {
			map.put(i,putMapManuFac(i,manuFacList));
		}
		return map;//������ ��Ÿ������ �õ� �غ���,ajax�� ���� ������ �ִ°��� json,xml,text...�̱⶧���� json���� ��ȯ���ִ°��� �´�
	}
	
	@RequestMapping(value="/serchByPrice", method = RequestMethod.GET)
	@Override//�ּ��ֹ��ݾ� ��� �˻�
	@ResponseBody
	public Map<Integer, Map<String, Object>> serchByManuMinimumPrice(@RequestParam("price") String price,HttpServletRequest request, HttpServletResponse response) {
		price += "0000";
		int iPrice = Integer.parseInt(price);
		System.out.println(iPrice);
		System.out.println("ManuFac controller");
		List<ManuFacVO> manuFacList= new ArrayList<ManuFacVO>();
		manuFacList = service.serchByManuMinimumPrice(iPrice);
		Map<Integer, Map<String, Object>> map = new HashMap<Integer, Map<String,Object>>();
		for(int i =0; i<manuFacList.size(); i++) {
			map.put(i,putMapManuFac(i,manuFacList));
		}
		return map;
	}
	
	@RequestMapping(value="/viewManuFac", method= RequestMethod.GET)
	@Override//�� ���
	public ModelAndView viewManuFac(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(id);
		System.out.println("ManuFac View");
		String viewName = (String) request.getAttribute("viewName");
		manuFacVO = service.viewManuFac(id);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("manuFacVO", manuFacVO);
		System.out.println(manuFacVO);
		return mav;
	}
	
	public Map<String, Object> putMapManuFac(int i,List<ManuFacVO> manuFacList){
		Map<String, Object> manuFac = new HashMap<String, Object>();
		String id = manuFacList.get(i).getId();
		manuFac.put("id", id);
		String pwd = manuFacList.get(i).getPwd();
		manuFac.put("pwd", pwd);
		String name = manuFacList.get(i).getManuName();
		manuFac.put("name", name);
		String ceoName = manuFacList.get(i).getManuCeoName();
		manuFac.put("ceoName", ceoName);
		String email = manuFacList.get(i).getManuEmail();
		manuFac.put("email", email);
		String bizNo = manuFacList.get(i).getManuBizNo();
		manuFac.put("bizNo",bizNo);
		String bizType = manuFacList.get(i).getManuBizType();
		manuFac.put("bizType",bizType);
		String addr = manuFacList.get(i).getManuAddr();
		manuFac.put("addr",addr);
		String detailAddr = manuFacList.get(i).getManuDetailAddr();
		manuFac.put("detailAddr",detailAddr);
		String tel = manuFacList.get(i).getManuTel();
		manuFac.put("tel",tel);
		String start = manuFacList.get(i).getManuStart();
		manuFac.put("start",start);
		String detail = manuFacList.get(i).getManuDetail();
		manuFac.put("detail",detail);
		String img = manuFacList.get(i).getManuImg();
		manuFac.put("img",img);
		int price = manuFacList.get(i).getProductPrice();
		manuFac.put("price",price);
		String auth = manuFacList.get(i).getManuAuth();
		manuFac.put("auth",auth);
		String Type = manuFacList.get(i).getType();
		manuFac.put("Type", Type);
		return manuFac;
	}
	
	
	@RequestMapping(value="/test")
	public void test() {
		System.out.println("test");
	}
}
