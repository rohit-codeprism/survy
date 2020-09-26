package com.bnm.surv.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bnm.surv.repository.SurveyRepository;

public class surveyServiceImpl implements SurveyService{

	@Autowired
	public SurveyRepository surveyRepository;
	
	
	@Override
	public String getSurvey(String str) {
		String name=surveyRepository.getSurvey(str);
		return name;
	}

}
