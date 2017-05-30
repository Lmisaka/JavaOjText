package com.ssm.util;

import com.ssm.domain.exam.*;
import com.ssm.service.exam.BlankProblemService;
import com.ssm.service.exam.ProgrammeService;
import com.ssm.service.exam.SelectProblemService;
import com.ssm.service.exam.UnProgrammeService;
import com.ssm.util.exam.JavaUnit;
import com.ssm.util.exam.ProblemCount;
import oj.java.Javac;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 自动批改
 * Created by OvO on 2017/4/23.
 */
public class AutoCorrect {
    @Autowired
    private BlankProblemService blankProblemService;
    @Autowired
    private SelectProblemService selectProblemService;
    @Autowired
    private ProgrammeService programmeService;
    @Autowired
    private UnProgrammeService unProgrammeService;

    private int selectCorrect(List<SelectProblem> selectProblemList) {
        int selectCount = 0;
        for (SelectProblem selectProblem : selectProblemList) {
            int correct;
            try {
                correct = selectProblemService.getAnswerById(selectProblem.getId());
            } catch (NullPointerException e) {
                correct = 0;
            }
            if (correct == selectProblem.getCorrect())
                selectCount += ProblemCount.SELECT_COUNT;
        }
        return selectCount;
    }

    private int blankCorrect(List<BlankProblem> blankProblemList) {
        int blankCount = 0;
        for (BlankProblem blankProblem : blankProblemList) {
            String correctAnswer = "";
            try {
                correctAnswer = blankProblemService.getAnswerById(blankProblem.getId());
            } catch (NullPointerException e) {

            }
            String[] correctList = correctAnswer.split(",");
            String[] userList = new String[correctAnswer.length()];
            if (blankProblem.getKeyWord() != null) {
                userList = blankProblem.getKeyWord().split(",");
            }
            int correctNum = 0;
            for (String c:correctList) {
                for (String u:userList){
                    if (c.equalsIgnoreCase(u)){
                        correctNum++;
                    }
                }
            }
            if (correctNum == correctList.length)
                blankCount += ProblemCount.BLANK_COUNT;
            else {
                blankCount += ProblemCount.BLANK_COUNT * (correctNum / correctList.length);
            }
        }
        return blankCount;
    }

    private int unProgrammeCorrect(List<Unprogramme> unprogrammeList) {
        int unProgrammeCount = 0;

        for (Unprogramme unprogramme : unprogrammeList) {
            String correctAnswer = "";
            try {
                correctAnswer = unProgrammeService.getAnswerById(unprogramme.getId());
            } catch (NullPointerException e) {

            }
            if (correctAnswer.equalsIgnoreCase(unprogramme.getAnswer()))
                unProgrammeCount += ProblemCount.UNPROGRAMME_COUNT;
        }
        return unProgrammeCount;
    }

    private int programmeCorrect(List<ProgrammeWithBLOBs> programmeWithBLOBsList) throws Exception {
        int programmeCount = 0;
        JavaUnit javaUnit = new JavaUnit();
        Javac javac = new Javac();
        for (ProgrammeWithBLOBs programmeWithBLOBs : programmeWithBLOBsList) {
            javaUnit.writeInputFile(programmeWithBLOBs.getTextCase());
            try {
                javac.java(programmeWithBLOBs.getDetail());
            }catch (NullPointerException e){

            }
            String output = "";
            try {
                output = programmeService.getOutPutById(programmeWithBLOBs.getId());
            } catch (NullPointerException e) {

            }
            if (javaUnit.IsOutPutCorrect(output))
                programmeCount += ProblemCount.PROGRAMME_COUNT;
        }
        return programmeCount;
    }

    public int ExamCorrect(Answer answerPage) throws Exception {
        int totalCount = 0;
        totalCount += selectCorrect(answerPage.getSelectAnswer());
        totalCount += blankCorrect(answerPage.getBlankAnswer());
        totalCount += unProgrammeCorrect(answerPage.getUnProgrammeAnswer());
        totalCount += programmeCorrect(answerPage.getProgrammeAnswer());
        return totalCount;
    }

    public static void main(String[] args) {
        String text = "abc";
        String[] t = text.split("\\.");
        for (String x : t) {
            System.out.println(x);
        }
    }
}
