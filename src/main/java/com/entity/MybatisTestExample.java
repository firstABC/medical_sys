package com.entity;

import java.util.ArrayList;
import java.util.List;

public class MybatisTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MybatisTestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTestgeneratorIsNull() {
            addCriterion("testGenerator is null");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorIsNotNull() {
            addCriterion("testGenerator is not null");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorEqualTo(String value) {
            addCriterion("testGenerator =", value, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorNotEqualTo(String value) {
            addCriterion("testGenerator <>", value, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorGreaterThan(String value) {
            addCriterion("testGenerator >", value, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorGreaterThanOrEqualTo(String value) {
            addCriterion("testGenerator >=", value, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorLessThan(String value) {
            addCriterion("testGenerator <", value, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorLessThanOrEqualTo(String value) {
            addCriterion("testGenerator <=", value, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorLike(String value) {
            addCriterion("testGenerator like", value, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorNotLike(String value) {
            addCriterion("testGenerator not like", value, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorIn(List<String> values) {
            addCriterion("testGenerator in", values, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorNotIn(List<String> values) {
            addCriterion("testGenerator not in", values, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorBetween(String value1, String value2) {
            addCriterion("testGenerator between", value1, value2, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestgeneratorNotBetween(String value1, String value2) {
            addCriterion("testGenerator not between", value1, value2, "testgenerator");
            return (Criteria) this;
        }

        public Criteria andTestmybatisIsNull() {
            addCriterion("testMybatis is null");
            return (Criteria) this;
        }

        public Criteria andTestmybatisIsNotNull() {
            addCriterion("testMybatis is not null");
            return (Criteria) this;
        }

        public Criteria andTestmybatisEqualTo(String value) {
            addCriterion("testMybatis =", value, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisNotEqualTo(String value) {
            addCriterion("testMybatis <>", value, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisGreaterThan(String value) {
            addCriterion("testMybatis >", value, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisGreaterThanOrEqualTo(String value) {
            addCriterion("testMybatis >=", value, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisLessThan(String value) {
            addCriterion("testMybatis <", value, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisLessThanOrEqualTo(String value) {
            addCriterion("testMybatis <=", value, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisLike(String value) {
            addCriterion("testMybatis like", value, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisNotLike(String value) {
            addCriterion("testMybatis not like", value, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisIn(List<String> values) {
            addCriterion("testMybatis in", values, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisNotIn(List<String> values) {
            addCriterion("testMybatis not in", values, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisBetween(String value1, String value2) {
            addCriterion("testMybatis between", value1, value2, "testmybatis");
            return (Criteria) this;
        }

        public Criteria andTestmybatisNotBetween(String value1, String value2) {
            addCriterion("testMybatis not between", value1, value2, "testmybatis");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}