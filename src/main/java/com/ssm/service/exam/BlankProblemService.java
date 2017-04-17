package com.ssm.service.exam;

import com.ssm.dao.exam.BlankProblemDao;
import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.ProblemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class BlankProblemService implements ProblemService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private BlankProblemDao blankProblemDao;

    public int insert(ProblemEntity record) {
        return blankProblemDao.insert((BlankProblem) record);
    }


    public ProblemEntity selectById(Integer id) {
        return blankProblemDao.selectByPrimaryKey(id);
    }


    public ProblemEntity selectByKeyWorld(String keyWord) {
        return blankProblemDao.selectByKeyWorld(keyWord);
    }


    public int updateByPrimaryKeySelective(ProblemEntity record) {
        return blankProblemDao.updateByPrimaryKeySelective((BlankProblem) record);
    }


    public int deleteByPrimaryKey(Integer id) {
        return blankProblemDao.deleteByPrimaryKey(id);
    }


    public List<ProblemEntity> selectAll() {
        return null;
    }


    /**
     * 获取信息条数
     *
     * @return
     */

    public int getTotalCount() {
        return blankProblemDao.getTotalCount();
    }

    /**
     * 获取指定页数数据
     *
     * @param paraMap
     * @return
     */

    public List<ProblemEntity> getLimitList(HashMap<String, Object> paraMap) {
        return null;
    }
}
