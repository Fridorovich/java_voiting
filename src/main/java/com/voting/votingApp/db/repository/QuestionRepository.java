package com.voting.votingApp.db.repository;

import com.voting.votingApp.db.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
