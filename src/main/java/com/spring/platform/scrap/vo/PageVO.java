package com.spring.platform.scrap.vo;

import org.springframework.stereotype.Component;

@Component("pagevo")
public class PageVO {

	private int nowPage, startPage, endPage, total, cntPerPage, lastPage, start, end;
	private int cntPage = 5;
	
//nowPage : �쁽�옱 �럹�씠吏� startPage : �떆�옉 �럹�씠吏�, endPage:�걹�럹�씠吏�, total :  寃뚯떆湲� 珥� 媛쒖닔, cntPerPage : �럹�씠吏��떦 湲� �닔, lastPage: 留덉�留� �럹�씠吏�, start , end: 荑쇰━臾몄뿉 �벝 蹂��닔, cntPage: �븳 踰붿쐞�궡 �럹�씠吏�媛쒖닔
	
	public PageVO() {
	}
	public PageVO(int total, int nowPage, int cntPerPage) {
		setNowPage(nowPage);
		setCntPerPage(cntPerPage);
		setTotal(total);
		calcLastPage(getTotal(), getCntPerPage());
		calcStartEndPage(getNowPage(), cntPage);
		calcStartEnd(getNowPage(), getCntPerPage());
	}
	
	public void calcLastPage(int total, int cntPerPage) {
		setLastPage((int) Math.ceil((double)total / (double)cntPerPage));
	}  // �젣�씪 留덉�留� �럹�씠吏� 怨꾩궛 , Meth.ceil : �냼�닔�젏 �씠�븯 �삱由� eg 寃뚯떆湲� 珥� 17媛� / �럹�씠吏��떦 湲� �닔 5媛� = 3.4 -> �삱由쇳빐�꽌 4�럹�씠吏�
	
	public void calcStartEndPage(int nowPage, int cntPage) {
		setEndPage(((int)Math.ceil((double)nowPage / (double)cntPage)) * cntPage);
		if (getLastPage() < getEndPage()) {
			setEndPage(getLastPage());
		} //�걹�럹�씠吏� 怨꾩궛 
		setStartPage(getEndPage() - cntPage + 1);
		if (getStartPage() < 1) {
			setStartPage(1);
		}// �떆�옉 �럹�씠吏� 怨꾩궛
	}  


// DB 荑쇰━�뿉�꽌 �궗�슜�븷 start, end媛� 怨꾩궛
	public void calcStartEnd(int nowPage, int cntPerPage) {
		setEnd(nowPage * cntPerPage);
		setStart(getEnd() - cntPerPage + 1);
	}
	
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCntPerPage() {
		return cntPerPage;
	}
	public void setCntPerPage(int cntPerPage) {
		this.cntPerPage = cntPerPage;
	}
	public int getLastPage() {
		return lastPage;
	}
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}	
	public int setCntPage() {
		return cntPage;
	}
	public void getCntPage(int cntPage) {
		this.cntPage = cntPage;
	}
	@Override
	public String toString() {
		return "PageVO [nowPage=" + nowPage + ", startPage=" + startPage + ", endPage=" + endPage + ", total=" + total
				+ ", cntPerPage=" + cntPerPage + ", lastPage=" + lastPage + ", start=" + start + ", end=" + end
				+ ", cntPage=" + cntPage + "]";
	}
}
