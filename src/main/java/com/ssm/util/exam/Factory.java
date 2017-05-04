package com.ssm.util.exam;

import com.ssm.domain.exam.*;
import com.ssm.util.Pager;

/**
 * Created by OvO on 2017/4/19.
 */
public class Factory {
    public static Pager<?> createPageExam(int id) {
        switch (id) {
            case 1:
                return new Pager<SelectProblemWithBLOBs>();
            case 2:
                return new Pager<BlankProblem>();
            case 3:
                return new Pager<ProgrammeWithBLOBs>();
            case 4:
                return new Pager<Unprogramme>();
            default:
                return null;
        }
    }
}
