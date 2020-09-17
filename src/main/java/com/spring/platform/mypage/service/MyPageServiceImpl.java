package com.spring.platform.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.platform.alluser.vo.AlluserVO;
import com.spring.platform.mypage.dao.MyPageDAO;

@Service
public class MyPageServiceImpl implements MyPageService{
	
	@Autowired
	MyPageDAO myPageDAO;

	@Override
	public String getUserType(String userId) {
		//user id �������� vo��ȸ
		AlluserVO userVO = myPageDAO.getUserVO(userId);
		//vo���� Ÿ���� ��ȯ�Ѵ�.
		String userType = userVO.getType();
		return userType;
	}
}
