package com.voting.votingApp.db.repository;

import com.voting.votingApp.db.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
