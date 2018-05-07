package com.entity;

import java.util.ArrayList;
import java.util.List;

public class PermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionsExample() {
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

        public Criteria andPeridIsNull() {
            addCriterion("perId is null");
            return (Criteria) this;
        }

        public Criteria andPeridIsNotNull() {
            addCriterion("perId is not null");
            return (Criteria) this;
        }

        public Criteria andPeridEqualTo(String value) {
            addCriterion("perId =", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotEqualTo(String value) {
            addCriterion("perId <>", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridGreaterThan(String value) {
            addCriterion("perId >", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridGreaterThanOrEqualTo(String value) {
            addCriterion("perId >=", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLessThan(String value) {
            addCriterion("perId <", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLessThanOrEqualTo(String value) {
            addCriterion("perId <=", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLike(String value) {
            addCriterion("perId like", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotLike(String value) {
            addCriterion("perId not like", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridIn(List<String> values) {
            addCriterion("perId in", values, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotIn(List<String> values) {
            addCriterion("perId not in", values, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridBetween(String value1, String value2) {
            addCriterion("perId between", value1, value2, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotBetween(String value1, String value2) {
            addCriterion("perId not between", value1, value2, "perid");
            return (Criteria) this;
        }

        public Criteria andPernameIsNull() {
            addCriterion("perName is null");
            return (Criteria) this;
        }

        public Criteria andPernameIsNotNull() {
            addCriterion("perName is not null");
            return (Criteria) this;
        }

        public Criteria andPernameEqualTo(String value) {
            addCriterion("perName =", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotEqualTo(String value) {
            addCriterion("perName <>", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameGreaterThan(String value) {
            addCriterion("perName >", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameGreaterThanOrEqualTo(String value) {
            addCriterion("perName >=", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLessThan(String value) {
            addCriterion("perName <", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLessThanOrEqualTo(String value) {
            addCriterion("perName <=", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLike(String value) {
            addCriterion("perName like", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotLike(String value) {
            addCriterion("perName not like", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameIn(List<String> values) {
            addCriterion("perName in", values, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotIn(List<String> values) {
            addCriterion("perName not in", values, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameBetween(String value1, String value2) {
            addCriterion("perName between", value1, value2, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotBetween(String value1, String value2) {
            addCriterion("perName not between", value1, value2, "pername");
            return (Criteria) this;
        }

        public Criteria andPercodeIsNull() {
            addCriterion("perCode is null");
            return (Criteria) this;
        }

        public Criteria andPercodeIsNotNull() {
            addCriterion("perCode is not null");
            return (Criteria) this;
        }

        public Criteria andPercodeEqualTo(String value) {
            addCriterion("perCode =", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotEqualTo(String value) {
            addCriterion("perCode <>", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeGreaterThan(String value) {
            addCriterion("perCode >", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeGreaterThanOrEqualTo(String value) {
            addCriterion("perCode >=", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLessThan(String value) {
            addCriterion("perCode <", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLessThanOrEqualTo(String value) {
            addCriterion("perCode <=", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLike(String value) {
            addCriterion("perCode like", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotLike(String value) {
            addCriterion("perCode not like", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeIn(List<String> values) {
            addCriterion("perCode in", values, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotIn(List<String> values) {
            addCriterion("perCode not in", values, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeBetween(String value1, String value2) {
            addCriterion("perCode between", value1, value2, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotBetween(String value1, String value2) {
            addCriterion("perCode not between", value1, value2, "percode");
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