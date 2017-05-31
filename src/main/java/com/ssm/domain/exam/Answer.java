package com.ssm.domain.exam;

import java.util.List;

/**用于接受用户试卷的实体
 * Created by OvO on 2017/5/7.
 */
public class Answer {
    private List<SelectProblem> selectAnswer;
    private List<BlankProblem> blankAnswer;
    private List<Unprogramme> unProgrammeAnswer;
    private List<ProgrammeWithBLOBs> programmeAnswer;

    public List<SelectProblem> getSelectAnswer() {
        return selectAnswer;
    }

    public void setSelectAnswer(List<SelectProblem> selectAnswer) {
        this.selectAnswer = selectAnswer;
    }

    public List<BlankProblem> getBlankAnswer() {
        return blankAnswer;
    }

    public void setBlankAnswer(List<BlankProblem> blankAnswer) {
        this.blankAnswer = blankAnswer;
    }

    public List<Unprogramme> getUnProgrammeAnswer() {
        return unProgrammeAnswer;
    }

    public void setUnProgrammeAnswer(List<Unprogramme> unProgrammeAnswer) {
        this.unProgrammeAnswer = unProgrammeAnswer;
    }

    public List<ProgrammeWithBLOBs> getProgrammeAnswer() {
        return programmeAnswer;
    }

    public void setProgrammeAnswer(List<ProgrammeWithBLOBs> programmeAnswer) {
        this.programmeAnswer = programmeAnswer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "selectAnswer=" + selectAnswer +
                ", blankAnswer=" + blankAnswer +
                ", unProgrammeAnswer=" + unProgrammeAnswer +
                ", programmeAnswer=" + programmeAnswer +
                '}';
    }

}
