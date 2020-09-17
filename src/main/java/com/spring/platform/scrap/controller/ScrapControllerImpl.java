package com.spring.platform.scrap.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.platform.page.vo.PageVO;
import com.spring.platform.scrap.service.ScrapService;
import com.spring.platform.scrap.vo.ScrapVO;

@Controller
public class ScrapControllerImpl implements ScrapController{
	@Autowired
	private ScrapService scrapService;
	@Autowired
	private ScrapVO scrapVO;
	
	
//	compId�? 로그?�� ?�� session?��?�� 받아?��?�� 것으�? ?��?��?��?��?��?��?��  - parent key ?���?
	
//	scrap출력
	//?��문�? * 출력
	@Override
	@RequestMapping(value="/scrap/printExpertScrap.do", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView printExpertScrapAll(PageVO pageVO, @RequestParam(value="nowPage", required = false) String nowPage, @RequestParam(value="cntPerPage", required=false)String cntPerPage, HttpServletRequest request, HttpServletResponse response) throws Exception{
		String viewName = (String)request.getAttribute("viewName");
		HttpSession session = request.getSession();
		String compId = "op3838";
//		String compId = (String) session.getAttribute("member");
		
//		paging code
		int total = scrapService.listExpScrapCount(compId);
	    if(nowPage == null && cntPerPage == null) {
	        nowPage = "1";
	        cntPerPage = "8";
	    }else if(nowPage == null) {
	        nowPage = "1";
	    }else if(cntPerPage == null) {
	        cntPerPage = "8";
	    } //nowPage ?��?�� ?��?���?, cntPerPage = ?��?��?���??�� �? 개수
	    pageVO = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
	    Map compMap = new HashMap();
	    compMap.put("compId", compId);//���ǿ��� �����ð�
	    compMap.put("pageVO", pageVO);
		List expertScrapAllList = scrapService.printExpertScrapAll(compMap);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("expertScrapAllList", expertScrapAllList);
		mav.addObject("pageVO", pageVO);
		return mav;		
	}
	
	
	//?��조업�? * 출력
	@Override
	@RequestMapping(value="/scrap/printManuScrap.do", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView printManuScrapAll(PageVO pageVO, @RequestParam(value="nowPage", required = false) String nowPage,
			@RequestParam(value="cntPerPage", required=false)String cntPerPage, 
			HttpServletRequest request, HttpServletResponse response) throws Exception{
		String viewName = (String)request.getAttribute("viewName");
		
		HttpSession session = request.getSession();
		String compId = "op3838";
//		String compId = (String) session.getAttribute("member");
		
//		paging code
		int total = scrapService.listCount(compId);
	    if(nowPage == null && cntPerPage == null) {
	        nowPage = "1";
	        cntPerPage = "8";
	    }else if(nowPage == null) {
	        nowPage = "1";
	    }else if(cntPerPage == null) {
	        cntPerPage = "8";
	    } //nowPage ?��?�� ?��?���?, cntPerPage = ?��?��?���??�� �? 개수
	    pageVO = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
	    Map compMap = new HashMap();
	    compMap.put("compId", compId);
	    compMap.put("pageVO", pageVO);
		List manuScrapAllList = scrapService.printManuScrapAll(compMap);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("manuScrapAllList", manuScrapAllList);
		mav.addObject("pageVO", pageVO);
		return mav;
	}
	
	//?��조업�?/?��문�? 4개씩 출력
	@Override
	@RequestMapping(value="/scrap/printScrapAll.do",method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView printScrapAll(@RequestParam("compId") String compId,
			HttpServletRequest request, HttpServletResponse response) throws Exception{
		String viewName = (String)request.getAttribute("viewName");
		Map allScrapMap = scrapService.printScrap(compId);
		List expertScrapList = scrapService.printExpertScrap(compId);
		List manuScrapList = scrapService.printManuScrap(compId);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("expertScrapList", expertScrapList);
		mav.addObject("manuScrapList", manuScrapList);
		mav.addObject("allScrapMap", allScrapMap);
		return mav;
	}
	
	//insert scrap
	@Override
	@RequestMapping(value="/scrap/scrapExpert.do", method= {RequestMethod.GET, RequestMethod.POST})
	public void scrapExpert(@RequestParam("id") String expId,
							HttpServletRequest request, HttpServletResponse response) throws Exception{

//		?��?�� else?��?�� alert기능?�� ?��?��?���? ?��?�� ?��?���? ?��?? 코드?��?��?��
//		response.setCharacterEncoding("utf-8");
//		PrintWriter out = response.getWriter();
		int Overlapped = scrapService.isOverlapE(expId);
		if(Overlapped == 0) {
			request.setCharacterEncoding("utf-8");
			response.setContentType("html/text;charset=utf-8");
			HttpSession session = request.getSession();
	//		String compId = (String)session.getAttribute("compId"); �α��� ���? ���� �Ǹ� �Է� �ּ� ���� �Ұ�
			String compId = "op3838";// ���ǿ��� ���̵� �����ð�
			scrapVO.setCompid(compId);
			scrapVO.setExpid(expId);
			scrapService.scrapExpert(scrapVO);
		}
		else {
//			중복?�� ?���? ?�� alert�? ?��?��?���? ?��?��?��?�� ?��?��?��
			System.out.println("===========controller scrapExpert() 중복?�� expid?��?��?��===========");
		}

	}
	
	@Override
	@RequestMapping(value="/scrap/scrapManu.do", method= {RequestMethod.GET, RequestMethod.POST})
	public void scrapManu(@RequestParam("id") String manuId,
							HttpServletRequest request, HttpServletResponse response) throws Exception{
		int Overlapped = scrapService.isOverlapM(manuId);
		if(Overlapped == 0) {
			request.setCharacterEncoding("utf-8");
			response.setContentType("html/text;charset=utf-8");
			HttpSession session = request.getSession();
	//		String compId = (String)session.getAttribute("compId"); �α��� ���? ���� �Ǹ� �Է� �ּ� ���� �Ұ�
			String compId = "op3838"; // ���ǿ��� ���̵� �����ð�
			scrapVO.setCompid(compId);
			scrapVO.setManuid(manuId);
			scrapService.scrapManu(scrapVO);
		}
		else {
//			중복?�� ?���? ?�� alert�? ?��?��?���? ?��?��?��?�� ?��?��?��
			System.out.println("===========controller scrapExpert() 중복?�� manuid?��?��?��===========");
		}
		
	}
	
	
	//delete scrap
	@Override
	@RequestMapping(value="/scrap/deleteExpertScrap.do", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView deleteExpertScrap(@RequestParam("no") int no,
						HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
//		String compId = (String)session.getAttribute("compId"); �α��� ���? ���� �Ǹ� �Է� �ּ� ���� �Ұ�
		String compId = "compId";
		scrapService.deleteExpertScrap(no);
		ModelAndView mav = new ModelAndView("redirect:/scrap/printExpertScrap.do?compId=" + compId);
		return mav;
		
		
	}
	
	@Override
	@RequestMapping(value="/scrap/deleteManuScrap.do", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView deleteManuScrap(@RequestParam("no") int no, 
						HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		scrapService.deleteManuScrap(no);
		HttpSession session = request.getSession();
//		String compId = (String)session.getAttribute("compId"); �α��� ���? ���� �Ǹ� �Է� �ּ� ���� �Ұ�
		String compId = "compId";
		ModelAndView mav = new ModelAndView("redirect:/scrap/printManuScrap.do?compId=" + compId);
		return mav;
	}
	
	

}
