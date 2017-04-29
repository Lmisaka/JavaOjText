package com.ssm.domain.exam;

public class SelectProblemWithBLOBs extends SelectProblem {
    private String selectDetail;

    private String selectA;

    private String selectB;

    private String selectC;

    private String selectD;

    @Override
    public String toString() {
        return super.toString() + "SelectProblemWithBLOBs{" +
                "selectDetail='" + selectDetail + '\'' +
                ", selectA='" + selectA + '\'' +
                ", selectB='" + selectB + '\'' +
                ", selectC='" + selectC + '\'' +
                ", selectD='" + selectD + '\'' +
                '}';
    }

    public String getSelectDetail() {
        return selectDetail;
    }

    public void setSelectDetail(String selectDetail) {
        this.selectDetail = selectDetail == null ? null : selectDetail.trim();
    }

    public String getSelectA() {
        return selectA;
    }

    public void setSelectA(String selectA) {
        this.selectA = selectA == null ? null : selectA.trim();
    }

    public String getSelectB() {
        return selectB;
    }

    public void setSelectB(String selectB) {
        this.selectB = selectB == null ? null : selectB.trim();
    }

    public String getSelectC() {
        return selectC;
    }

    public void setSelectC(String selectC) {
        this.selectC = selectC == null ? null : selectC.trim();
    }

    public String getSelectD() {
        return selectD;
    }

    public void setSelectD(String selectD) {
        this.selectD = selectD == null ? null : selectD.trim();
    }
}