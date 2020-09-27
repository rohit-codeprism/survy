package com.bnm.surv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bnm.surv.model.Test;

@Repository
public interface SurveyRepository  extends CrudRepository<Test, Long>{

    @Query(" from Test ")
    public List<Test> getSurvey();

}