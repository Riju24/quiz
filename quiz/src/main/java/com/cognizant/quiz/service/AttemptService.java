package com.cognizant.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.quiz.AttemptRepository;
import com.cognizant.quiz.model.Attempt;


@Service
public class AttemptService {
	
	
	@Autowired
	AttemptRepository attemptRepository;
	
	public Attempt getAttempt(int userId, int attemptId)
	{
		
		return attemptRepository.findById(attemptId).get();
		
		
	}
	

}