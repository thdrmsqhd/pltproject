package com.spring.plt.consulting.service;

import java.util.List;

import com.spring.plt.consulting.vo.ConsultingVO;

public interface ConsultingService {

	void insertConsulting(ConsultingVO consultingVO);

	List<ConsultingVO> ConsultingList();

}
