package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalRecordExample() {
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

        public Criteria andSelfReportedIsNull() {
            addCriterion("self_reported is null");
            return (Criteria) this;
        }

        public Criteria andSelfReportedIsNotNull() {
            addCriterion("self_reported is not null");
            return (Criteria) this;
        }

        public Criteria andSelfReportedEqualTo(String value) {
            addCriterion("self_reported =", value, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedNotEqualTo(String value) {
            addCriterion("self_reported <>", value, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedGreaterThan(String value) {
            addCriterion("self_reported >", value, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedGreaterThanOrEqualTo(String value) {
            addCriterion("self_reported >=", value, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedLessThan(String value) {
            addCriterion("self_reported <", value, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedLessThanOrEqualTo(String value) {
            addCriterion("self_reported <=", value, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedLike(String value) {
            addCriterion("self_reported like", value, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedNotLike(String value) {
            addCriterion("self_reported not like", value, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedIn(List<String> values) {
            addCriterion("self_reported in", values, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedNotIn(List<String> values) {
            addCriterion("self_reported not in", values, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedBetween(String value1, String value2) {
            addCriterion("self_reported between", value1, value2, "selfReported");
            return (Criteria) this;
        }

        public Criteria andSelfReportedNotBetween(String value1, String value2) {
            addCriterion("self_reported not between", value1, value2, "selfReported");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordIsNull() {
            addCriterion("now_medical_record is null");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordIsNotNull() {
            addCriterion("now_medical_record is not null");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordEqualTo(String value) {
            addCriterion("now_medical_record =", value, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordNotEqualTo(String value) {
            addCriterion("now_medical_record <>", value, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordGreaterThan(String value) {
            addCriterion("now_medical_record >", value, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordGreaterThanOrEqualTo(String value) {
            addCriterion("now_medical_record >=", value, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordLessThan(String value) {
            addCriterion("now_medical_record <", value, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordLessThanOrEqualTo(String value) {
            addCriterion("now_medical_record <=", value, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordLike(String value) {
            addCriterion("now_medical_record like", value, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordNotLike(String value) {
            addCriterion("now_medical_record not like", value, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordIn(List<String> values) {
            addCriterion("now_medical_record in", values, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordNotIn(List<String> values) {
            addCriterion("now_medical_record not in", values, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordBetween(String value1, String value2) {
            addCriterion("now_medical_record between", value1, value2, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andNowMedicalRecordNotBetween(String value1, String value2) {
            addCriterion("now_medical_record not between", value1, value2, "nowMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNull() {
            addCriterion("diagnosis is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNotNull() {
            addCriterion("diagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisEqualTo(String value) {
            addCriterion("diagnosis =", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotEqualTo(String value) {
            addCriterion("diagnosis <>", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThan(String value) {
            addCriterion("diagnosis >", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis >=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThan(String value) {
            addCriterion("diagnosis <", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("diagnosis <=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLike(String value) {
            addCriterion("diagnosis like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotLike(String value) {
            addCriterion("diagnosis not like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIn(List<String> values) {
            addCriterion("diagnosis in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotIn(List<String> values) {
            addCriterion("diagnosis not in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisBetween(String value1, String value2) {
            addCriterion("diagnosis between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotBetween(String value1, String value2) {
            addCriterion("diagnosis not between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPhysicianIsNull() {
            addCriterion("physician is null");
            return (Criteria) this;
        }

        public Criteria andPhysicianIsNotNull() {
            addCriterion("physician is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicianEqualTo(String value) {
            addCriterion("physician =", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianNotEqualTo(String value) {
            addCriterion("physician <>", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianGreaterThan(String value) {
            addCriterion("physician >", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianGreaterThanOrEqualTo(String value) {
            addCriterion("physician >=", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianLessThan(String value) {
            addCriterion("physician <", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianLessThanOrEqualTo(String value) {
            addCriterion("physician <=", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianLike(String value) {
            addCriterion("physician like", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianNotLike(String value) {
            addCriterion("physician not like", value, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianIn(List<String> values) {
            addCriterion("physician in", values, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianNotIn(List<String> values) {
            addCriterion("physician not in", values, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianBetween(String value1, String value2) {
            addCriterion("physician between", value1, value2, "physician");
            return (Criteria) this;
        }

        public Criteria andPhysicianNotBetween(String value1, String value2) {
            addCriterion("physician not between", value1, value2, "physician");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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