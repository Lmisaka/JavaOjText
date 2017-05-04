package com.ssm.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页类
 * Created by OvO on 2017/4/16.
 */
public class Pager<T> {
    /**
     * 每页显示信息条数
     */
    public static final int PAGE_SIZE = 15;
    /**
     * 默认页数
     */
    public static final int PAGE_NUM = 1;
    /**
     * 页数
     */
    private int page = PAGE_SIZE;
    /**
     * 每页显示数
     */
    private int limit = PAGE_SIZE;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 总条数
     */
    private int totalCount;
    /**
     * 存储分页数据
     */
    private List<T> rows = new ArrayList<T>();
    /**
     * 分页信息开始值
     */
    private int start;
    /**
     * 分页信息结束值
     */
    private int endIndex;

    /**
     * 设置要显示的起始值
     *
     * @param pageNum
     */
    public void setPageNum(int pageNum) {
        if (pageNum <= 0) {
            pageNum = PAGE_NUM;
        }
        if (pageNum >= totalPage) {
            pageNum = totalPage;
        }
        if (pageNum == 0) {
            start = 0;
        } else {
            start = (pageNum - 1) * limit;
        }
        this.page = pageNum;
    }

    /**
     * 设置每页显示条数
     *
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        if (pageSize <= 0) {
            pageSize = PAGE_SIZE;
        }
        // 计算最大页数
        int pageCount = totalCount / pageSize;
        if (totalCount % pageSize == 0) {
            totalPage = pageCount;
        } else {
            totalPage = pageCount + 1;
        }
        this.limit = pageSize;
    }

    /**
     * 根据输入条数生成页数
     *
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        if (totalCount > 0) {
            if (page <= 0) {
                page = PAGE_NUM;
            }
            // 计算最大页数
            int pageCount = totalCount / PAGE_SIZE;
            if (totalCount % PAGE_SIZE == 0) {
                totalPage = pageCount;
            } else {
                totalPage = pageCount + 1;
            }
        } else {
            totalPage = 0;
        }

        if (page > totalPage) {
            page = totalPage;
        }
    }

    public static int getPageSize() {
        return PAGE_SIZE;
    }

    public static int getPageNum() {
        return PAGE_NUM;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    /**
     * 返回查询起始值
     *
     * @return
     */
    public int getStart() {
        if (page == 0) {
            start = 0;
        } else {
            start = (page - 1) * limit;
        }
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
