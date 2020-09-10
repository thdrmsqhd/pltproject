package com.spring.plt.consulting.dao;

import java.util.List;

import com.spring.plt.consulting.vo.ConsultingVO;

public interface ConsultingDAO {

	void insertConsulting(ConsultingVO consultingVO);

	List<ConsultingVO> ConsultingList();

}
