package com.entity;

public class MybatisTest {
    private String testgenerator;

    private String testmybatis;

    public String getTestgenerator() {
        return testgenerator;
    }

    public void setTestgenerator(String testgenerator) {
        this.testgenerator = testgenerator == null ? null : testgenerator.trim();
    }

    public String getTestmybatis() {
        return testmybatis;
    }

    public void setTestmybatis(String testmybatis) {
        this.testmybatis = testmybatis == null ? null : testmybatis.trim();
    }
}