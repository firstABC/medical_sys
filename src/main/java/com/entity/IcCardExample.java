package com.entity;

import java.util.ArrayList;
import java.util.List;

public class IcCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IcCardExample() {
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

        public Criteria andIcidIsNull() {
            addCriterion("icId is null");
            return (Criteria) this;
        }

        public Criteria andIcidIsNotNull() {
            addCriterion("icId is not null");
            return (Criteria) this;
        }

        public Criteria andIcidEqualTo(String value) {
            addCriterion("icId =", value, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidNotEqualTo(String value) {
            addCriterion("icId <>", value, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidGreaterThan(String value) {
            addCriterion("icId >", value, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidGreaterThanOrEqualTo(String value) {
            addCriterion("icId >=", value, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidLessThan(String value) {
            addCriterion("icId <", value, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidLessThanOrEqualTo(String value) {
            addCriterion("icId <=", value, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidLike(String value) {
            addCriterion("icId like", value, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidNotLike(String value) {
            addCriterion("icId not like", value, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidIn(List<String> values) {
            addCriterion("icId in", values, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidNotIn(List<String> values) {
            addCriterion("icId not in", values, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidBetween(String value1, String value2) {
            addCriterion("icId between", value1, value2, "icid");
            return (Criteria) this;
        }

        public Criteria andIcidNotBetween(String value1, String value2) {
            addCriterion("icId not between", value1, value2, "icid");
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

        public Criteria andIcbalanceIsNull() {
            addCriterion("icBalance is null");
            return (Criteria) this;
        }

        public Criteria andIcbalanceIsNotNull() {
            addCriterion("icBalance is not null");
            return (Criteria) this;
        }

        public Criteria andIcbalanceEqualTo(Long value) {
            addCriterion("icBalance =", value, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceNotEqualTo(Long value) {
            addCriterion("icBalance <>", value, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceGreaterThan(Long value) {
            addCriterion("icBalance >", value, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("icBalance >=", value, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceLessThan(Long value) {
            addCriterion("icBalance <", value, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceLessThanOrEqualTo(Long value) {
            addCriterion("icBalance <=", value, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceIn(List<Long> values) {
            addCriterion("icBalance in", values, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceNotIn(List<Long> values) {
            addCriterion("icBalance not in", values, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceBetween(Long value1, Long value2) {
            addCriterion("icBalance between", value1, value2, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIcbalanceNotBetween(Long value1, Long value2) {
            addCriterion("icBalance not between", value1, value2, "icbalance");
            return (Criteria) this;
        }

        public Criteria andIsstatusIsNull() {
            addCriterion("isStatus is null");
            return (Criteria) this;
        }

        public Criteria andIsstatusIsNotNull() {
            addCriterion("isStatus is not null");
            return (Criteria) this;
        }

        public Criteria andIsstatusEqualTo(String value) {
            addCriterion("isStatus =", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusNotEqualTo(String value) {
            addCriterion("isStatus <>", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusGreaterThan(String value) {
            addCriterion("isStatus >", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusGreaterThanOrEqualTo(String value) {
            addCriterion("isStatus >=", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusLessThan(String value) {
            addCriterion("isStatus <", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusLessThanOrEqualTo(String value) {
            addCriterion("isStatus <=", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusLike(String value) {
            addCriterion("isStatus like", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusNotLike(String value) {
            addCriterion("isStatus not like", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusIn(List<String> values) {
            addCriterion("isStatus in", values, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusNotIn(List<String> values) {
            addCriterion("isStatus not in", values, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusBetween(String value1, String value2) {
            addCriterion("isStatus between", value1, value2, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusNotBetween(String value1, String value2) {
            addCriterion("isStatus not between", value1, value2, "isstatus");
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