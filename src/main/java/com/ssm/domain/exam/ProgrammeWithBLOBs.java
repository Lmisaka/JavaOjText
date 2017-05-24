package com.ssm.domain.exam;

public class ProgrammeWithBLOBs extends Programme {
    private String detail;

    private String output;

    private String textCase;

    @Override
    public String toString() {
        return "ProgrammeWithBLOBs{" +
                "detail='" + detail + '\'' +
                ", output='" + output + '\'' +
                ", textCase='" + textCase + '\'' +
                '}';
    }

    public String getTextCase() {
        return textCase;
    }

    public void setTextCase(String textCase) {
        this.textCase = textCase == null ? null : textCase.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }
}