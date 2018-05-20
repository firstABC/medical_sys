package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trading_recordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Trading_recordExample() {
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

        public Criteria andTridIsNull() {
            addCriterion("trId is null");
            return (Criteria) this;
        }

        public Criteria andTridIsNotNull() {
            addCriterion("trId is not null");
            return (Criteria) this;
        }

        public Criteria andTridEqualTo(String value) {
            addCriterion("trId =", value, "trid");
            return (Criteria) this;
        }

        public Criteria andTridNotEqualTo(String value) {
            addCriterion("trId <>", value, "trid");
            return (Criteria) this;
        }

        public Criteria andTridGreaterThan(String value) {
            addCriterion("trId >", value, "trid");
            return (Criteria) this;
        }

        public Criteria andTridGreaterThanOrEqualTo(String value) {
            addCriterion("trId >=", value, "trid");
            return (Criteria) this;
        }

        public Criteria andTridLessThan(String value) {
            addCriterion("trId <", value, "trid");
            return (Criteria) this;
        }

        public Criteria andTridLessThanOrEqualTo(String value) {
            addCriterion("trId <=", value, "trid");
            return (Criteria) this;
        }

        public Criteria andTridLike(String value) {
            addCriterion("trId like", value, "trid");
            return (Criteria) this;
        }

        public Criteria andTridNotLike(String value) {
            addCriterion("trId not like", value, "trid");
            return (Criteria) this;
        }

        public Criteria andTridIn(List<String> values) {
            addCriterion("trId in", values, "trid");
            return (Criteria) this;
        }

        public Criteria andTridNotIn(List<String> values) {
            addCriterion("trId not in", values, "trid");
            return (Criteria) this;
        }

        public Criteria andTridBetween(String value1, String value2) {
            addCriterion("trId between", value1, value2, "trid");
            return (Criteria) this;
        }

        public Criteria andTridNotBetween(String value1, String value2) {
            addCriterion("trId not between", value1, value2, "trid");
            return (Criteria) this;
        }

        public Criteria andTrtypeIsNull() {
            addCriterion("trType is null");
            return (Criteria) this;
        }

        public Criteria andTrtypeIsNotNull() {
            addCriterion("trType is not null");
            return (Criteria) this;
        }

        public Criteria andTrtypeEqualTo(String value) {
            addCriterion("trType =", value, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeNotEqualTo(String value) {
            addCriterion("trType <>", value, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeGreaterThan(String value) {
            addCriterion("trType >", value, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeGreaterThanOrEqualTo(String value) {
            addCriterion("trType >=", value, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeLessThan(String value) {
            addCriterion("trType <", value, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeLessThanOrEqualTo(String value) {
            addCriterion("trType <=", value, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeLike(String value) {
            addCriterion("trType like", value, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeNotLike(String value) {
            addCriterion("trType not like", value, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeIn(List<String> values) {
            addCriterion("trType in", values, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeNotIn(List<String> values) {
            addCriterion("trType not in", values, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeBetween(String value1, String value2) {
            addCriterion("trType between", value1, value2, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrtypeNotBetween(String value1, String value2) {
            addCriterion("trType not between", value1, value2, "trtype");
            return (Criteria) this;
        }

        public Criteria andTrmoneyIsNull() {
            addCriterion("trMoney is null");
            return (Criteria) this;
        }

        public Criteria andTrmoneyIsNotNull() {
            addCriterion("trMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTrmoneyEqualTo(Long value) {
            addCriterion("trMoney =", value, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyNotEqualTo(Long value) {
            addCriterion("trMoney <>", value, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyGreaterThan(Long value) {
            addCriterion("trMoney >", value, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("trMoney >=", value, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyLessThan(Long value) {
            addCriterion("trMoney <", value, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyLessThanOrEqualTo(Long value) {
            addCriterion("trMoney <=", value, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyIn(List<Long> values) {
            addCriterion("trMoney in", values, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyNotIn(List<Long> values) {
            addCriterion("trMoney not in", values, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyBetween(Long value1, Long value2) {
            addCriterion("trMoney between", value1, value2, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrmoneyNotBetween(Long value1, Long value2) {
            addCriterion("trMoney not between", value1, value2, "trmoney");
            return (Criteria) this;
        }

        public Criteria andTrbalanceIsNull() {
            addCriterion("trBalance is null");
            return (Criteria) this;
        }

        public Criteria andTrbalanceIsNotNull() {
            addCriterion("trBalance is not null");
            return (Criteria) this;
        }

        public Criteria andTrbalanceEqualTo(Long value) {
            addCriterion("trBalance =", value, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceNotEqualTo(Long value) {
            addCriterion("trBalance <>", value, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceGreaterThan(Long value) {
            addCriterion("trBalance >", value, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("trBalance >=", value, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceLessThan(Long value) {
            addCriterion("trBalance <", value, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceLessThanOrEqualTo(Long value) {
            addCriterion("trBalance <=", value, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceIn(List<Long> values) {
            addCriterion("trBalance in", values, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceNotIn(List<Long> values) {
            addCriterion("trBalance not in", values, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceBetween(Long value1, Long value2) {
            addCriterion("trBalance between", value1, value2, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrbalanceNotBetween(Long value1, Long value2) {
            addCriterion("trBalance not between", value1, value2, "trbalance");
            return (Criteria) this;
        }

        public Criteria andTrtimeIsNull() {
            addCriterion("trTime is null");
            return (Criteria) this;
        }

        public Criteria andTrtimeIsNotNull() {
            addCriterion("trTime is not null");
            return (Criteria) this;
        }

        public Criteria andTrtimeEqualTo(Date value) {
            addCriterion("trTime =", value, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeNotEqualTo(Date value) {
            addCriterion("trTime <>", value, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeGreaterThan(Date value) {
            addCriterion("trTime >", value, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trTime >=", value, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeLessThan(Date value) {
            addCriterion("trTime <", value, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeLessThanOrEqualTo(Date value) {
            addCriterion("trTime <=", value, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeIn(List<Date> values) {
            addCriterion("trTime in", values, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeNotIn(List<Date> values) {
            addCriterion("trTime not in", values, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeBetween(Date value1, Date value2) {
            addCriterion("trTime between", value1, value2, "trtime");
            return (Criteria) this;
        }

        public Criteria andTrtimeNotBetween(Date value1, Date value2) {
            addCriterion("trTime not between", value1, value2, "trtime");
            return (Criteria) this;
        }

        public Criteria andIccardnumIsNull() {
            addCriterion("icCardNum is null");
            return (Criteria) this;
        }

        public Criteria andIccardnumIsNotNull() {
            addCriterion("icCardNum is not null");
            return (Criteria) this;
        }

        public Criteria andIccardnumEqualTo(String value) {
            addCriterion("icCardNum =", value, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumNotEqualTo(String value) {
            addCriterion("icCardNum <>", value, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumGreaterThan(String value) {
            addCriterion("icCardNum >", value, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumGreaterThanOrEqualTo(String value) {
            addCriterion("icCardNum >=", value, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumLessThan(String value) {
            addCriterion("icCardNum <", value, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumLessThanOrEqualTo(String value) {
            addCriterion("icCardNum <=", value, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumLike(String value) {
            addCriterion("icCardNum like", value, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumNotLike(String value) {
            addCriterion("icCardNum not like", value, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumIn(List<String> values) {
            addCriterion("icCardNum in", values, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumNotIn(List<String> values) {
            addCriterion("icCardNum not in", values, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumBetween(String value1, String value2) {
            addCriterion("icCardNum between", value1, value2, "iccardnum");
            return (Criteria) this;
        }

        public Criteria andIccardnumNotBetween(String value1, String value2) {
            addCriterion("icCardNum not between", value1, value2, "iccardnum");
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