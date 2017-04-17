package com.ssm.service.exam;

import com.ssm.dao.exam.SelectProblemDao;
import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.domain.exam.SelectProblemWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class SelectProblemService implements ProblemService{
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SelectProblemDao selectProblemDao;

    
    public int insert(ProblemEntity record) {
        return selectProblemDao.insert((SelectProblemWithBLOBs) record);
    }

    
    public ProblemEntity selectById(Integer id) {
        return selectProblemDao.selectByPrimaryKey(id);
    }

    /**
     * 通过关键字查询
     *
     * @param keyWord
     * @return
     */
    
    public ProblemEntity selectByKeyWorld(String keyWord) {
        return selectProblemDao.selectByKeyWord(keyWord);
    }

    
    public int updateByPrimaryKeySelective(ProblemEntity record) {
        return selectProblemDao.updateByPrimaryKeySelective((SelectProblemWithBLOBs) record);
    }

    /**
     * 通过ID进行删除
     *
     * @param id
     * @return
     */
    
    public int deleteByPrimaryKey(Integer id) {
        return selectProblemDao.deleteByPrimaryKey(id);
    }

    
    public List<BlankProblem> selectAll() {
        return null;
    }

    /**
     * 获取信息条数
     *
     * @return
     */
    
    public int getTotalCount() {
        return selectProblemDao.getTotalCount();
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
