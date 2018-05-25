package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionDrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrescriptionDrugExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidIsNull() {
            addCriterion("prescriptionId is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidIsNotNull() {
            addCriterion("prescriptionId is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidEqualTo(String value) {
            addCriterion("prescriptionId =", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidNotEqualTo(String value) {
            addCriterion("prescriptionId <>", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidGreaterThan(String value) {
            addCriterion("prescriptionId >", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidGreaterThanOrEqualTo(String value) {
            addCriterion("prescriptionId >=", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidLessThan(String value) {
            addCriterion("prescriptionId <", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidLessThanOrEqualTo(String value) {
            addCriterion("prescriptionId <=", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidLike(String value) {
            addCriterion("prescriptionId like", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidNotLike(String value) {
            addCriterion("prescriptionId not like", value, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidIn(List<String> values) {
            addCriterion("prescriptionId in", values, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidNotIn(List<String> values) {
            addCriterion("prescriptionId not in", values, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidBetween(String value1, String value2) {
            addCriterion("prescriptionId between", value1, value2, "prescriptionid");
            return (Criteria) this;
        }

        public Criteria andPrescriptionidNotBetween(String value1, String value2) {
            addCriterion("prescriptionId not between", value1, value2, "prescriptionid");
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

        public Criteria andDrugpriceEqualTo(BigDecimal value) {
            addCriterion("drugPrice =", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotEqualTo(BigDecimal value) {
            addCriterion("drugPrice <>", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceGreaterThan(BigDecimal value) {
            addCriterion("drugPrice >", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drugPrice >=", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceLessThan(BigDecimal value) {
            addCriterion("drugPrice <", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drugPrice <=", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIn(List<BigDecimal> values) {
            addCriterion("drugPrice in", values, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotIn(List<BigDecimal> values) {
            addCriterion("drugPrice not in", values, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugPrice between", value1, value2, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andUsagetextIsNull() {
            addCriterion("usageText is null");
            return (Criteria) this;
        }

        public Criteria andUsagetextIsNotNull() {
            addCriterion("usageText is not null");
            return (Criteria) this;
        }

        public Criteria andUsagetextEqualTo(String value) {
            addCriterion("usageText =", value, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextNotEqualTo(String value) {
            addCriterion("usageText <>", value, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextGreaterThan(String value) {
            addCriterion("usageText >", value, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextGreaterThanOrEqualTo(String value) {
            addCriterion("usageText >=", value, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextLessThan(String value) {
            addCriterion("usageText <", value, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextLessThanOrEqualTo(String value) {
            addCriterion("usageText <=", value, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextLike(String value) {
            addCriterion("usageText like", value, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextNotLike(String value) {
            addCriterion("usageText not like", value, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextIn(List<String> values) {
            addCriterion("usageText in", values, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextNotIn(List<String> values) {
            addCriterion("usageText not in", values, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextBetween(String value1, String value2) {
            addCriterion("usageText between", value1, value2, "usagetext");
            return (Criteria) this;
        }

        public Criteria andUsagetextNotBetween(String value1, String value2) {
            addCriterion("usageText not between", value1, value2, "usagetext");
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