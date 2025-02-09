package com.revature.repos;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.models.*;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface InterviewRepo extends JpaRepository<Interview, Integer>, JpaSpecificationExecutor<Interview> {
	
	List<Interview> findByAssociateEmail(String email);
	List<Interview> findByScheduledBetween(Date first, Date last);

	Optional<Interview> save(Optional<Interview> i);

	List<Interview> findByFeedbackIsNotNullOrderByFeedbackFeedbackRequested();
	
	//Page<Interview> findAll(Specification<Interview> spec, Pageable pageable);

}
