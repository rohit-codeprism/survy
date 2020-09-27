package com.bnm.surv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnm.surv.model.Test;
import com.bnm.surv.repository.SurveyRepository;

@Service
public class surveyServiceImpl implements SurveyService{

	@Autowired
	public SurveyRepository surveyRepository;
	
	
	@Override
	public String getSurvey(String str) {
		List<Test> name = surveyRepository.getSurvey();
		return "abc";
	}

}
