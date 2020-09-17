package com.spring.platform.quotation.dao;

import java.util.List;

import com.spring.platform.quotation.vo.QuotationVO;

public interface QuotationDAO {

	void insertQuotation(QuotationVO quotationVO);

	List<QuotationVO> quotationList();

	QuotationVO viewOneQuotation(String no);

	List<QuotationVO> alarmQuotation(String compId);


}
