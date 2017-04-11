package com.ssm.domain.exam;

public class BlankProblem implements ProblemEntity {
    private Integer id;

    private String blankDetail;

    private String keyWord;

    @Override
    public String toString() {
        return "BlankProblem{" +
                "id=" + id +
                ", blankDetail='" + blankDetail + '\'' +
                ", keyWord='" + keyWord + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlankDetail() {
        return blankDetail;
    }

    public void setBlankDetail(String blankDetail) {
        this.blankDetail = blankDetail == null ? null : blankDetail.trim();
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }
}