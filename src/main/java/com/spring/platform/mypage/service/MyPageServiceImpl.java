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
		//user id 기준으로 vo조회
		AlluserVO userVO = myPageDAO.getUserVO(userId);
		//vo에서 타입을 반환한다.
		String userType = userVO.getType();
		return userType;
	}
}
