package com.cognizant.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.quiz.model.Attempt;
import com.cognizant.quiz.model.AttemptQuestion;
import com.cognizant.quiz.service.AttemptService;

@SpringBootApplication
public class QuizApplication {

	private static AttemptService attemptService; 
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QuizApplication.class, args);
		
		
		attemptService=context.getBean(AttemptService.class);
		getAttemptDetail();
		
	}
		
		public static void  getAttemptDetail()
		{
			Attempt at = attemptService.getAttempt(1, 1);
			System.out.println(at.getId());
			System.out.println(at.getDate());
			System.out.println(at.getUser_id().getName());
			System.out.println(at.getScore());
			for(AttemptQuestion aq :at.getAttemptQuestion())
			{
				System.out.println(aq.getQuestion().getText());
			}
		}

}
