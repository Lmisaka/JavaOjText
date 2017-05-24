package com.ssm.service.exam;

import com.ssm.dao.exam.BlankProblemDao;
import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.service.exam.total.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class BlankProblemService implements ProblemService {
    @Autowired
    private BlankProblemDao blankProblemDao;

    @Override
    public int insert(ProblemEntity record) {
        return blankProblemDao.insert((BlankProblem) record);
    }

    @Override
    public ProblemEntity selectById(Integer id) {
        return blankProblemDao.selectByPrimaryKey(id);
    }

    @Override
    public ProblemEntity selectByKeyWorld(String keyWord) {
        return blankProblemDao.selectByKeyWorld(keyWord);
    }

    @Override
    public int updateByPrimaryKeySelective(ProblemEntity record) {
        return blankProblemDao.updateByPrimaryKeySelective((BlankProblem) record);
    }

    @Override
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
    @Override
    public int getTotalCount() {
        return blankProblemDao.getTotalCount();
    }

    /**
     * 获取指定页数数据
     *
     * @param paraMap
     * @return
     */
    public List<BlankProblem> getLimitList(HashMap<String, Object> paraMap) {
        return blankProblemDao.getLimitList(paraMap);
    }

    /**
     * 获取指定页的id和detail
     * @param paraMap
     * @return
     */
    public List<HashMap<String,String>> getSubStrLimitList(HashMap<String, Object> paraMap){
        return blankProblemDao.getSubStrLimitList(paraMap);
    }

    public String getAnswerById(Integer id){
        return blankProblemDao.getAnswerById(id);
    }
}
