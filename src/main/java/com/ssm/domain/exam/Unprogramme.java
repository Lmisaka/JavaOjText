package com.ssm.domain.exam;

public class Unprogramme implements ProblemEntity {
    private Integer id;

    private String detail;

    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Unprogramme{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}