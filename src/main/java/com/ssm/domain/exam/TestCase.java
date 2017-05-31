package com.ssm.domain.exam;

/**
 * 测试用例实体
 */
public class TestCase {
    private Integer id;

    private String testCase;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestCase() {
        return testCase;
    }

    public void setTestCase(String testCase) {
        this.testCase = testCase == null ? null : testCase.trim();
    }
}