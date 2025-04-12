package com.voting.votingApp.db.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "survey_id", nullable = false)
    private Survey survey;

    @Column(nullable = false)
    private String text;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private QuestionType questionType;

    @ElementCollection
    @CollectionTable(name = "variant", joinColumns = @JoinColumn(name = "question_id"))
    @Column(nullable = false)
    private List<String> answerVariant;

}

enum QuestionType{
    SINGLE, MULTIPLE
}
