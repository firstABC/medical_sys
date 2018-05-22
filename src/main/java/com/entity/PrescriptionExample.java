package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrescriptionExample() {
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

        public Criteria andPrscriptionidIsNull() {
            addCriterion("prscriptionId is null");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidIsNotNull() {
            addCriterion("prscriptionId is not null");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidEqualTo(String value) {
            addCriterion("prscriptionId =", value, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidNotEqualTo(String value) {
            addCriterion("prscriptionId <>", value, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidGreaterThan(String value) {
            addCriterion("prscriptionId >", value, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidGreaterThanOrEqualTo(String value) {
            addCriterion("prscriptionId >=", value, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidLessThan(String value) {
            addCriterion("prscriptionId <", value, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidLessThanOrEqualTo(String value) {
            addCriterion("prscriptionId <=", value, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidLike(String value) {
            addCriterion("prscriptionId like", value, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidNotLike(String value) {
            addCriterion("prscriptionId not like", value, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidIn(List<String> values) {
            addCriterion("prscriptionId in", values, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidNotIn(List<String> values) {
            addCriterion("prscriptionId not in", values, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidBetween(String value1, String value2) {
            addCriterion("prscriptionId between", value1, value2, "prscriptionid");
            return (Criteria) this;
        }

        public Criteria andPrscriptionidNotBetween(String value1, String value2) {
            addCriterion("prscriptionId not between", value1, value2, "prscriptionid");
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

        public Criteria andPaageEqualTo(Integer value) {
            addCriterion("paAge =", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageNotEqualTo(Integer value) {
            addCriterion("paAge <>", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageGreaterThan(Integer value) {
            addCriterion("paAge >", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageGreaterThanOrEqualTo(Integer value) {
            addCriterion("paAge >=", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageLessThan(Integer value) {
            addCriterion("paAge <", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageLessThanOrEqualTo(Integer value) {
            addCriterion("paAge <=", value, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageIn(List<Integer> values) {
            addCriterion("paAge in", values, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageNotIn(List<Integer> values) {
            addCriterion("paAge not in", values, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageBetween(Integer value1, Integer value2) {
            addCriterion("paAge between", value1, value2, "paage");
            return (Criteria) this;
        }

        public Criteria andPaageNotBetween(Integer value1, Integer value2) {
            addCriterion("paAge not between", value1, value2, "paage");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDruggistIsNull() {
            addCriterion("druggist is null");
            return (Criteria) this;
        }

        public Criteria andDruggistIsNotNull() {
            addCriterion("druggist is not null");
            return (Criteria) this;
        }

        public Criteria andDruggistEqualTo(String value) {
            addCriterion("druggist =", value, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistNotEqualTo(String value) {
            addCriterion("druggist <>", value, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistGreaterThan(String value) {
            addCriterion("druggist >", value, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistGreaterThanOrEqualTo(String value) {
            addCriterion("druggist >=", value, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistLessThan(String value) {
            addCriterion("druggist <", value, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistLessThanOrEqualTo(String value) {
            addCriterion("druggist <=", value, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistLike(String value) {
            addCriterion("druggist like", value, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistNotLike(String value) {
            addCriterion("druggist not like", value, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistIn(List<String> values) {
            addCriterion("druggist in", values, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistNotIn(List<String> values) {
            addCriterion("druggist not in", values, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistBetween(String value1, String value2) {
            addCriterion("druggist between", value1, value2, "druggist");
            return (Criteria) this;
        }

        public Criteria andDruggistNotBetween(String value1, String value2) {
            addCriterion("druggist not between", value1, value2, "druggist");
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

        public Criteria andRegistrationcodeIsNull() {
            addCriterion("registrationCode is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeIsNotNull() {
            addCriterion("registrationCode is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeEqualTo(String value) {
            addCriterion("registrationCode =", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeNotEqualTo(String value) {
            addCriterion("registrationCode <>", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeGreaterThan(String value) {
            addCriterion("registrationCode >", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("registrationCode >=", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeLessThan(String value) {
            addCriterion("registrationCode <", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeLessThanOrEqualTo(String value) {
            addCriterion("registrationCode <=", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeLike(String value) {
            addCriterion("registrationCode like", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeNotLike(String value) {
            addCriterion("registrationCode not like", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeIn(List<String> values) {
            addCriterion("registrationCode in", values, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeNotIn(List<String> values) {
            addCriterion("registrationCode not in", values, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeBetween(String value1, String value2) {
            addCriterion("registrationCode between", value1, value2, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeNotBetween(String value1, String value2) {
            addCriterion("registrationCode not between", value1, value2, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeIsNull() {
            addCriterion("prescriptionCode is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeIsNotNull() {
            addCriterion("prescriptionCode is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeEqualTo(String value) {
            addCriterion("prescriptionCode =", value, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeNotEqualTo(String value) {
            addCriterion("prescriptionCode <>", value, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeGreaterThan(String value) {
            addCriterion("prescriptionCode >", value, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("prescriptionCode >=", value, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeLessThan(String value) {
            addCriterion("prescriptionCode <", value, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeLessThanOrEqualTo(String value) {
            addCriterion("prescriptionCode <=", value, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeLike(String value) {
            addCriterion("prescriptionCode like", value, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeNotLike(String value) {
            addCriterion("prescriptionCode not like", value, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeIn(List<String> values) {
            addCriterion("prescriptionCode in", values, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeNotIn(List<String> values) {
            addCriterion("prescriptionCode not in", values, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeBetween(String value1, String value2) {
            addCriterion("prescriptionCode between", value1, value2, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPrescriptioncodeNotBetween(String value1, String value2) {
            addCriterion("prescriptionCode not between", value1, value2, "prescriptioncode");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("payee is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("payee is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(String value) {
            addCriterion("payee =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(String value) {
            addCriterion("payee <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(String value) {
            addCriterion("payee >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("payee >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(String value) {
            addCriterion("payee <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(String value) {
            addCriterion("payee <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLike(String value) {
            addCriterion("payee like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotLike(String value) {
            addCriterion("payee not like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<String> values) {
            addCriterion("payee in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<String> values) {
            addCriterion("payee not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(String value1, String value2) {
            addCriterion("payee between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(String value1, String value2) {
            addCriterion("payee not between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("lastTime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("lastTime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterion("lastTime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterion("lastTime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterion("lastTime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastTime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterion("lastTime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("lastTime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterion("lastTime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterion("lastTime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterion("lastTime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("lastTime not between", value1, value2, "lasttime");
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