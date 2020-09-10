package com.spring.plt.quotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.plt.quotation.dao.QuotationDAO;
import com.spring.plt.quotation.vo.QuotationVO;

@Service
public class QuotationServiceImpl implements QuotationService{
	@Autowired
	QuotationDAO dao;
	
	@Override
	public void insertQuotation(QuotationVO quotationVO) {
		System.out.println("insert QuotationVO Service");
		dao.insertQuotation(quotationVO);
	}
	
	@Override
	public List<QuotationVO> quotationList(){
		return dao.quotationList();
	}
}
