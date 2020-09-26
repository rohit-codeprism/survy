package com.bnm.surv.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository {
	
	public String getSurvey(String str);

}
