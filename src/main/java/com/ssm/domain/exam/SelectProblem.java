package com.ssm.domain.exam;

public class SelectProblem implements ProblemEntity {
    private Integer id;

    private Integer correct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }
}