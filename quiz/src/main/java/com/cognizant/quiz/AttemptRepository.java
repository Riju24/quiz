package com.cognizant.quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.quiz.model.*;


@Repository
public interface AttemptRepository extends JpaRepository<Attempt,Integer> {
	

}
