package com.entity;

import java.util.ArrayList;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
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

        public Criteria andDrugidIsNull() {
            addCriterion("drugId is null");
            return (Criteria) this;
        }

        public Criteria andDrugidIsNotNull() {
            addCriterion("drugId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugidEqualTo(String value) {
            addCriterion("drugId =", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotEqualTo(String value) {
            addCriterion("drugId <>", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidGreaterThan(String value) {
            addCriterion("drugId >", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidGreaterThanOrEqualTo(String value) {
            addCriterion("drugId >=", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidLessThan(String value) {
            addCriterion("drugId <", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidLessThanOrEqualTo(String value) {
            addCriterion("drugId <=", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidLike(String value) {
            addCriterion("drugId like", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotLike(String value) {
            addCriterion("drugId not like", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidIn(List<String> values) {
            addCriterion("drugId in", values, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotIn(List<String> values) {
            addCriterion("drugId not in", values, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidBetween(String value1, String value2) {
            addCriterion("drugId between", value1, value2, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotBetween(String value1, String value2) {
            addCriterion("drugId not between", value1, value2, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugnameIsNull() {
            addCriterion("drugName is null");
            return (Criteria) this;
        }

        public Criteria andDrugnameIsNotNull() {
            addCriterion("drugName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugnameEqualTo(String value) {
            addCriterion("drugName =", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotEqualTo(String value) {
            addCriterion("drugName <>", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameGreaterThan(String value) {
            addCriterion("drugName >", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameGreaterThanOrEqualTo(String value) {
            addCriterion("drugName >=", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLessThan(String value) {
            addCriterion("drugName <", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLessThanOrEqualTo(String value) {
            addCriterion("drugName <=", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLike(String value) {
            addCriterion("drugName like", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotLike(String value) {
            addCriterion("drugName not like", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameIn(List<String> values) {
            addCriterion("drugName in", values, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotIn(List<String> values) {
            addCriterion("drugName not in", values, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameBetween(String value1, String value2) {
            addCriterion("drugName between", value1, value2, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotBetween(String value1, String value2) {
            addCriterion("drugName not between", value1, value2, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnumIsNull() {
            addCriterion("drugNum is null");
            return (Criteria) this;
        }

        public Criteria andDrugnumIsNotNull() {
            addCriterion("drugNum is not null");
            return (Criteria) this;
        }

        public Criteria andDrugnumEqualTo(Integer value) {
            addCriterion("drugNum =", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumNotEqualTo(Integer value) {
            addCriterion("drugNum <>", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumGreaterThan(Integer value) {
            addCriterion("drugNum >", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugNum >=", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumLessThan(Integer value) {
            addCriterion("drugNum <", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumLessThanOrEqualTo(Integer value) {
            addCriterion("drugNum <=", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumIn(List<Integer> values) {
            addCriterion("drugNum in", values, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumNotIn(List<Integer> values) {
            addCriterion("drugNum not in", values, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumBetween(Integer value1, Integer value2) {
            addCriterion("drugNum between", value1, value2, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumNotBetween(Integer value1, Integer value2) {
            addCriterion("drugNum not between", value1, value2, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIsNull() {
            addCriterion("drugPrice is null");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIsNotNull() {
            addCriterion("drugPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDrugpriceEqualTo(Long value) {
            addCriterion("drugPrice =", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotEqualTo(Long value) {
            addCriterion("drugPrice <>", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceGreaterThan(Long value) {
            addCriterion("drugPrice >", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("drugPrice >=", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceLessThan(Long value) {
            addCriterion("drugPrice <", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceLessThanOrEqualTo(Long value) {
            addCriterion("drugPrice <=", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIn(List<Long> values) {
            addCriterion("drugPrice in", values, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotIn(List<Long> values) {
            addCriterion("drugPrice not in", values, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceBetween(Long value1, Long value2) {
            addCriterion("drugPrice between", value1, value2, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotBetween(Long value1, Long value2) {
            addCriterion("drugPrice not between", value1, value2, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugunitIsNull() {
            addCriterion("drugUnit is null");
            return (Criteria) this;
        }

        public Criteria andDrugunitIsNotNull() {
            addCriterion("drugUnit is not null");
            return (Criteria) this;
        }

        public Criteria andDrugunitEqualTo(String value) {
            addCriterion("drugUnit =", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitNotEqualTo(String value) {
            addCriterion("drugUnit <>", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitGreaterThan(String value) {
            addCriterion("drugUnit >", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitGreaterThanOrEqualTo(String value) {
            addCriterion("drugUnit >=", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitLessThan(String value) {
            addCriterion("drugUnit <", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitLessThanOrEqualTo(String value) {
            addCriterion("drugUnit <=", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitLike(String value) {
            addCriterion("drugUnit like", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitNotLike(String value) {
            addCriterion("drugUnit not like", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitIn(List<String> values) {
            addCriterion("drugUnit in", values, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitNotIn(List<String> values) {
            addCriterion("drugUnit not in", values, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitBetween(String value1, String value2) {
            addCriterion("drugUnit between", value1, value2, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitNotBetween(String value1, String value2) {
            addCriterion("drugUnit not between", value1, value2, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugremarkIsNull() {
            addCriterion("drugRemark is null");
            return (Criteria) this;
        }

        public Criteria andDrugremarkIsNotNull() {
            addCriterion("drugRemark is not null");
            return (Criteria) this;
        }

        public Criteria andDrugremarkEqualTo(String value) {
            addCriterion("drugRemark =", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkNotEqualTo(String value) {
            addCriterion("drugRemark <>", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkGreaterThan(String value) {
            addCriterion("drugRemark >", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkGreaterThanOrEqualTo(String value) {
            addCriterion("drugRemark >=", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkLessThan(String value) {
            addCriterion("drugRemark <", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkLessThanOrEqualTo(String value) {
            addCriterion("drugRemark <=", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkLike(String value) {
            addCriterion("drugRemark like", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkNotLike(String value) {
            addCriterion("drugRemark not like", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkIn(List<String> values) {
            addCriterion("drugRemark in", values, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkNotIn(List<String> values) {
            addCriterion("drugRemark not in", values, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkBetween(String value1, String value2) {
            addCriterion("drugRemark between", value1, value2, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkNotBetween(String value1, String value2) {
            addCriterion("drugRemark not between", value1, value2, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIsNull() {
            addCriterion("drugCode is null");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIsNotNull() {
            addCriterion("drugCode is not null");
            return (Criteria) this;
        }

        public Criteria andDrugcodeEqualTo(String value) {
            addCriterion("drugCode =", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotEqualTo(String value) {
            addCriterion("drugCode <>", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeGreaterThan(String value) {
            addCriterion("drugCode >", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeGreaterThanOrEqualTo(String value) {
            addCriterion("drugCode >=", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeLessThan(String value) {
            addCriterion("drugCode <", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeLessThanOrEqualTo(String value) {
            addCriterion("drugCode <=", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeLike(String value) {
            addCriterion("drugCode like", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotLike(String value) {
            addCriterion("drugCode not like", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIn(List<String> values) {
            addCriterion("drugCode in", values, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotIn(List<String> values) {
            addCriterion("drugCode not in", values, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeBetween(String value1, String value2) {
            addCriterion("drugCode between", value1, value2, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotBetween(String value1, String value2) {
            addCriterion("drugCode not between", value1, value2, "drugcode");
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