package com.entity;

import java.util.ArrayList;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andPatientidIsNull() {
            addCriterion("patientId is null");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNotNull() {
            addCriterion("patientId is not null");
            return (Criteria) this;
        }

        public Criteria andPatientidEqualTo(String value) {
            addCriterion("patientId =", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotEqualTo(String value) {
            addCriterion("patientId <>", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThan(String value) {
            addCriterion("patientId >", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThanOrEqualTo(String value) {
            addCriterion("patientId >=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThan(String value) {
            addCriterion("patientId <", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThanOrEqualTo(String value) {
            addCriterion("patientId <=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLike(String value) {
            addCriterion("patientId like", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotLike(String value) {
            addCriterion("patientId not like", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidIn(List<String> values) {
            addCriterion("patientId in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotIn(List<String> values) {
            addCriterion("patientId not in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidBetween(String value1, String value2) {
            addCriterion("patientId between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotBetween(String value1, String value2) {
            addCriterion("patientId not between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPanameIsNull() {
            addCriterion("paName is null");
            return (Criteria) this;
        }

        public Criteria andPanameIsNotNull() {
            addCriterion("paName is not null");
            return (Criteria) this;
        }

        public Criteria andPanameEqualTo(String value) {
            addCriterion("paName =", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotEqualTo(String value) {
            addCriterion("paName <>", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameGreaterThan(String value) {
            addCriterion("paName >", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameGreaterThanOrEqualTo(String value) {
            addCriterion("paName >=", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLessThan(String value) {
            addCriterion("paName <", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLessThanOrEqualTo(String value) {
            addCriterion("paName <=", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLike(String value) {
            addCriterion("paName like", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotLike(String value) {
            addCriterion("paName not like", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameIn(List<String> values) {
            addCriterion("paName in", values, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotIn(List<String> values) {
            addCriterion("paName not in", values, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameBetween(String value1, String value2) {
            addCriterion("paName between", value1, value2, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotBetween(String value1, String value2) {
            addCriterion("paName not between", value1, value2, "paname");
            return (Criteria) this;
        }

        public Criteria andPaidcardIsNull() {
            addCriterion("paIDCard is null");
            return (Criteria) this;
        }

        public Criteria andPaidcardIsNotNull() {
            addCriterion("paIDCard is not null");
            return (Criteria) this;
        }

        public Criteria andPaidcardEqualTo(String value) {
            addCriterion("paIDCard =", value, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardNotEqualTo(String value) {
            addCriterion("paIDCard <>", value, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardGreaterThan(String value) {
            addCriterion("paIDCard >", value, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardGreaterThanOrEqualTo(String value) {
            addCriterion("paIDCard >=", value, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardLessThan(String value) {
            addCriterion("paIDCard <", value, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardLessThanOrEqualTo(String value) {
            addCriterion("paIDCard <=", value, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardLike(String value) {
            addCriterion("paIDCard like", value, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardNotLike(String value) {
            addCriterion("paIDCard not like", value, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardIn(List<String> values) {
            addCriterion("paIDCard in", values, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardNotIn(List<String> values) {
            addCriterion("paIDCard not in", values, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardBetween(String value1, String value2) {
            addCriterion("paIDCard between", value1, value2, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaidcardNotBetween(String value1, String value2) {
            addCriterion("paIDCard not between", value1, value2, "paidcard");
            return (Criteria) this;
        }

        public Criteria andPaphoneIsNull() {
            addCriterion("paPhone is null");
            return (Criteria) this;
        }

        public Criteria andPaphoneIsNotNull() {
            addCriterion("paPhone is not null");
            return (Criteria) this;
        }

        public Criteria andPaphoneEqualTo(String value) {
            addCriterion("paPhone =", value, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneNotEqualTo(String value) {
            addCriterion("paPhone <>", value, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneGreaterThan(String value) {
            addCriterion("paPhone >", value, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneGreaterThanOrEqualTo(String value) {
            addCriterion("paPhone >=", value, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneLessThan(String value) {
            addCriterion("paPhone <", value, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneLessThanOrEqualTo(String value) {
            addCriterion("paPhone <=", value, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneLike(String value) {
            addCriterion("paPhone like", value, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneNotLike(String value) {
            addCriterion("paPhone not like", value, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneIn(List<String> values) {
            addCriterion("paPhone in", values, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneNotIn(List<String> values) {
            addCriterion("paPhone not in", values, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneBetween(String value1, String value2) {
            addCriterion("paPhone between", value1, value2, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaphoneNotBetween(String value1, String value2) {
            addCriterion("paPhone not between", value1, value2, "paphone");
            return (Criteria) this;
        }

        public Criteria andPaageIsNull() {
            addCriterion("paAge is null");
            return (Criteria) this;
        }

        public Criteria andPaageIsNotNull() {
            addCriterion("paAge is not null");
            return (Criteria) this;
        }

        public Criteria andPaageEqualTo(String value) {
            addCriterion("paAge =", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageNotEqualTo(String value) {
            addCriterion("paAge <>", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageGreaterThan(String value) {
            addCriterion("paAge >", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageGreaterThanOrEqualTo(String value) {
            addCriterion("paAge >=", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageLessThan(String value) {
            addCriterion("paAge <", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageLessThanOrEqualTo(String value) {
            addCriterion("paAge <=", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageLike(String value) {
            addCriterion("paAge like", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageNotLike(String value) {
            addCriterion("paAge not like", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageIn(List<String> values) {
            addCriterion("paAge in", values, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageNotIn(List<String> values) {
            addCriterion("paAge not in", values, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageBetween(String value1, String value2) {
            addCriterion("paAge between", value1, value2, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageNotBetween(String value1, String value2) {
            addCriterion("paAge not between", value1, value2, "paage");
            return (Criteria) this;
        }

        public Criteria andPasexIsNull() {
            addCriterion("paSex is null");
            return (Criteria) this;
        }

        public Criteria andPasexIsNotNull() {
            addCriterion("paSex is not null");
            return (Criteria) this;
        }

        public Criteria andPasexEqualTo(String value) {
            addCriterion("paSex =", value, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexNotEqualTo(String value) {
            addCriterion("paSex <>", value, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexGreaterThan(String value) {
            addCriterion("paSex >", value, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexGreaterThanOrEqualTo(String value) {
            addCriterion("paSex >=", value, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexLessThan(String value) {
            addCriterion("paSex <", value, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexLessThanOrEqualTo(String value) {
            addCriterion("paSex <=", value, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexLike(String value) {
            addCriterion("paSex like", value, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexNotLike(String value) {
            addCriterion("paSex not like", value, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexIn(List<String> values) {
            addCriterion("paSex in", values, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexNotIn(List<String> values) {
            addCriterion("paSex not in", values, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexBetween(String value1, String value2) {
            addCriterion("paSex between", value1, value2, "pasex");
            return (Criteria) this;
        }

        public Criteria andPasexNotBetween(String value1, String value2) {
            addCriterion("paSex not between", value1, value2, "pasex");
            return (Criteria) this;
        }

        public Criteria andPamarriageIsNull() {
            addCriterion("paMarriage is null");
            return (Criteria) this;
        }

        public Criteria andPamarriageIsNotNull() {
            addCriterion("paMarriage is not null");
            return (Criteria) this;
        }

        public Criteria andPamarriageEqualTo(String value) {
            addCriterion("paMarriage =", value, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageNotEqualTo(String value) {
            addCriterion("paMarriage <>", value, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageGreaterThan(String value) {
            addCriterion("paMarriage >", value, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageGreaterThanOrEqualTo(String value) {
            addCriterion("paMarriage >=", value, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageLessThan(String value) {
            addCriterion("paMarriage <", value, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageLessThanOrEqualTo(String value) {
            addCriterion("paMarriage <=", value, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageLike(String value) {
            addCriterion("paMarriage like", value, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageNotLike(String value) {
            addCriterion("paMarriage not like", value, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageIn(List<String> values) {
            addCriterion("paMarriage in", values, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageNotIn(List<String> values) {
            addCriterion("paMarriage not in", values, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageBetween(String value1, String value2) {
            addCriterion("paMarriage between", value1, value2, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPamarriageNotBetween(String value1, String value2) {
            addCriterion("paMarriage not between", value1, value2, "pamarriage");
            return (Criteria) this;
        }

        public Criteria andPaaddressIsNull() {
            addCriterion("paAddress is null");
            return (Criteria) this;
        }

        public Criteria andPaaddressIsNotNull() {
            addCriterion("paAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPaaddressEqualTo(String value) {
            addCriterion("paAddress =", value, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressNotEqualTo(String value) {
            addCriterion("paAddress <>", value, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressGreaterThan(String value) {
            addCriterion("paAddress >", value, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressGreaterThanOrEqualTo(String value) {
            addCriterion("paAddress >=", value, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressLessThan(String value) {
            addCriterion("paAddress <", value, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressLessThanOrEqualTo(String value) {
            addCriterion("paAddress <=", value, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressLike(String value) {
            addCriterion("paAddress like", value, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressNotLike(String value) {
            addCriterion("paAddress not like", value, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressIn(List<String> values) {
            addCriterion("paAddress in", values, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressNotIn(List<String> values) {
            addCriterion("paAddress not in", values, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressBetween(String value1, String value2) {
            addCriterion("paAddress between", value1, value2, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPaaddressNotBetween(String value1, String value2) {
            addCriterion("paAddress not between", value1, value2, "paaddress");
            return (Criteria) this;
        }

        public Criteria andPacreatorIsNull() {
            addCriterion("paCreator is null");
            return (Criteria) this;
        }

        public Criteria andPacreatorIsNotNull() {
            addCriterion("paCreator is not null");
            return (Criteria) this;
        }

        public Criteria andPacreatorEqualTo(String value) {
            addCriterion("paCreator =", value, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorNotEqualTo(String value) {
            addCriterion("paCreator <>", value, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorGreaterThan(String value) {
            addCriterion("paCreator >", value, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorGreaterThanOrEqualTo(String value) {
            addCriterion("paCreator >=", value, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorLessThan(String value) {
            addCriterion("paCreator <", value, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorLessThanOrEqualTo(String value) {
            addCriterion("paCreator <=", value, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorLike(String value) {
            addCriterion("paCreator like", value, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorNotLike(String value) {
            addCriterion("paCreator not like", value, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorIn(List<String> values) {
            addCriterion("paCreator in", values, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorNotIn(List<String> values) {
            addCriterion("paCreator not in", values, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorBetween(String value1, String value2) {
            addCriterion("paCreator between", value1, value2, "pacreator");
            return (Criteria) this;
        }

        public Criteria andPacreatorNotBetween(String value1, String value2) {
            addCriterion("paCreator not between", value1, value2, "pacreator");
            return (Criteria) this;
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