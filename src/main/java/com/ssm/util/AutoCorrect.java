package com.ssm.util;

import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.SelectProblem;
import com.ssm.domain.exam.Unprogramme;
import com.ssm.service.exam.BlankProblemService;
import com.ssm.service.exam.ProgrammeService;
import com.ssm.service.exam.SelectProblemService;
import com.ssm.service.exam.UnProgrammeService;
import com.ssm.util.exam.ProblemCount;
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

    public int selectCorrect(List<SelectProblem> selectProblemList) {
        int selectCount = 0;
        for (SelectProblem selectProblem : selectProblemList) {
            int correct = selectProblemService.getAnswerById(selectProblem.getId());
            if (correct == selectProblem.getCorrect())
                selectCount += ProblemCount.SELECT_COUNT;
        }
        return selectCount;
    }

    public int blankCorrect(List<BlankProblem> blankProblemList) {
        int blankCount = 0;
        for (BlankProblem blankProblem : blankProblemList) {
            String correctAnswer = blankProblemService.getAnswerById(blankProblem.getId());
            String[] correctList = correctAnswer.split(",");
            String[] userList = blankProblem.getKeyWord().split(",");
            int correctNum = 0;
            for (int i = 0; i < correctList.length; i++) {
                if (correctList[i].equals(userList[i])) {
                    correctNum++;
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
    public int unProgrammeCorrect(List<Unprogramme> unprogrammeList){
        int unProgrammeCount=0;

        for (Unprogramme unprogramme:unprogrammeList){
//            String correctAnswer=unProgrammeService.
        }

        return  unProgrammeCount;
    }
}
