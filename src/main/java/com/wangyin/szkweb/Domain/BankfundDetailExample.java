package com.wangyin.szkweb.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankfundDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankfundDetailExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFinancetypeIsNull() {
            addCriterion("financetype is null");
            return (Criteria) this;
        }

        public Criteria andFinancetypeIsNotNull() {
            addCriterion("financetype is not null");
            return (Criteria) this;
        }

        public Criteria andFinancetypeEqualTo(Integer value) {
            addCriterion("financetype =", value, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeNotEqualTo(Integer value) {
            addCriterion("financetype <>", value, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeGreaterThan(Integer value) {
            addCriterion("financetype >", value, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("financetype >=", value, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeLessThan(Integer value) {
            addCriterion("financetype <", value, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeLessThanOrEqualTo(Integer value) {
            addCriterion("financetype <=", value, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeIn(List<Integer> values) {
            addCriterion("financetype in", values, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeNotIn(List<Integer> values) {
            addCriterion("financetype not in", values, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeBetween(Integer value1, Integer value2) {
            addCriterion("financetype between", value1, value2, "financetype");
            return (Criteria) this;
        }

        public Criteria andFinancetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("financetype not between", value1, value2, "financetype");
            return (Criteria) this;
        }

        public Criteria andTobankidIsNull() {
            addCriterion("tobankid is null");
            return (Criteria) this;
        }

        public Criteria andTobankidIsNotNull() {
            addCriterion("tobankid is not null");
            return (Criteria) this;
        }

        public Criteria andTobankidEqualTo(String value) {
            addCriterion("tobankid =", value, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidNotEqualTo(String value) {
            addCriterion("tobankid <>", value, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidGreaterThan(String value) {
            addCriterion("tobankid >", value, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidGreaterThanOrEqualTo(String value) {
            addCriterion("tobankid >=", value, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidLessThan(String value) {
            addCriterion("tobankid <", value, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidLessThanOrEqualTo(String value) {
            addCriterion("tobankid <=", value, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidLike(String value) {
            addCriterion("tobankid like", value, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidNotLike(String value) {
            addCriterion("tobankid not like", value, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidIn(List<String> values) {
            addCriterion("tobankid in", values, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidNotIn(List<String> values) {
            addCriterion("tobankid not in", values, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidBetween(String value1, String value2) {
            addCriterion("tobankid between", value1, value2, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTobankidNotBetween(String value1, String value2) {
            addCriterion("tobankid not between", value1, value2, "tobankid");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("transdate is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("transdate is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(String value) {
            addCriterion("transdate =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(String value) {
            addCriterion("transdate <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(String value) {
            addCriterion("transdate >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(String value) {
            addCriterion("transdate >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(String value) {
            addCriterion("transdate <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(String value) {
            addCriterion("transdate <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLike(String value) {
            addCriterion("transdate like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotLike(String value) {
            addCriterion("transdate not like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<String> values) {
            addCriterion("transdate in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<String> values) {
            addCriterion("transdate not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(String value1, String value2) {
            addCriterion("transdate between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(String value1, String value2) {
            addCriterion("transdate not between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNull() {
            addCriterion("transtype is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("transtype is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("transtype =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("transtype <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("transtype >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("transtype >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("transtype <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("transtype <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("transtype like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("transtype not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("transtype in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("transtype not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("transtype between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("transtype not between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("accountno is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("accountno is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("accountno =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("accountno <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("accountno >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("accountno >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("accountno <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("accountno <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("accountno like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("accountno not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("accountno in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("accountno not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("accountno between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("accountno not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountIsNull() {
            addCriterion("involaccount is null");
            return (Criteria) this;
        }

        public Criteria andInvolaccountIsNotNull() {
            addCriterion("involaccount is not null");
            return (Criteria) this;
        }

        public Criteria andInvolaccountEqualTo(String value) {
            addCriterion("involaccount =", value, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountNotEqualTo(String value) {
            addCriterion("involaccount <>", value, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountGreaterThan(String value) {
            addCriterion("involaccount >", value, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountGreaterThanOrEqualTo(String value) {
            addCriterion("involaccount >=", value, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountLessThan(String value) {
            addCriterion("involaccount <", value, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountLessThanOrEqualTo(String value) {
            addCriterion("involaccount <=", value, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountLike(String value) {
            addCriterion("involaccount like", value, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountNotLike(String value) {
            addCriterion("involaccount not like", value, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountIn(List<String> values) {
            addCriterion("involaccount in", values, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountNotIn(List<String> values) {
            addCriterion("involaccount not in", values, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountBetween(String value1, String value2) {
            addCriterion("involaccount between", value1, value2, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolaccountNotBetween(String value1, String value2) {
            addCriterion("involaccount not between", value1, value2, "involaccount");
            return (Criteria) this;
        }

        public Criteria andInvolnameIsNull() {
            addCriterion("involname is null");
            return (Criteria) this;
        }

        public Criteria andInvolnameIsNotNull() {
            addCriterion("involname is not null");
            return (Criteria) this;
        }

        public Criteria andInvolnameEqualTo(String value) {
            addCriterion("involname =", value, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameNotEqualTo(String value) {
            addCriterion("involname <>", value, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameGreaterThan(String value) {
            addCriterion("involname >", value, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameGreaterThanOrEqualTo(String value) {
            addCriterion("involname >=", value, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameLessThan(String value) {
            addCriterion("involname <", value, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameLessThanOrEqualTo(String value) {
            addCriterion("involname <=", value, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameLike(String value) {
            addCriterion("involname like", value, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameNotLike(String value) {
            addCriterion("involname not like", value, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameIn(List<String> values) {
            addCriterion("involname in", values, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameNotIn(List<String> values) {
            addCriterion("involname not in", values, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameBetween(String value1, String value2) {
            addCriterion("involname between", value1, value2, "involname");
            return (Criteria) this;
        }

        public Criteria andInvolnameNotBetween(String value1, String value2) {
            addCriterion("involname not between", value1, value2, "involname");
            return (Criteria) this;
        }

        public Criteria andBiztypeIsNull() {
            addCriterion("biztype is null");
            return (Criteria) this;
        }

        public Criteria andBiztypeIsNotNull() {
            addCriterion("biztype is not null");
            return (Criteria) this;
        }

        public Criteria andBiztypeEqualTo(String value) {
            addCriterion("biztype =", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotEqualTo(String value) {
            addCriterion("biztype <>", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeGreaterThan(String value) {
            addCriterion("biztype >", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeGreaterThanOrEqualTo(String value) {
            addCriterion("biztype >=", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLessThan(String value) {
            addCriterion("biztype <", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLessThanOrEqualTo(String value) {
            addCriterion("biztype <=", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLike(String value) {
            addCriterion("biztype like", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotLike(String value) {
            addCriterion("biztype not like", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeIn(List<String> values) {
            addCriterion("biztype in", values, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotIn(List<String> values) {
            addCriterion("biztype not in", values, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeBetween(String value1, String value2) {
            addCriterion("biztype between", value1, value2, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotBetween(String value1, String value2) {
            addCriterion("biztype not between", value1, value2, "biztype");
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

        public Criteria andMerchantnoIsNull() {
            addCriterion("merchantno is null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIsNotNull() {
            addCriterion("merchantno is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoEqualTo(String value) {
            addCriterion("merchantno =", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotEqualTo(String value) {
            addCriterion("merchantno <>", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThan(String value) {
            addCriterion("merchantno >", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThanOrEqualTo(String value) {
            addCriterion("merchantno >=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThan(String value) {
            addCriterion("merchantno <", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThanOrEqualTo(String value) {
            addCriterion("merchantno <=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLike(String value) {
            addCriterion("merchantno like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotLike(String value) {
            addCriterion("merchantno not like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIn(List<String> values) {
            addCriterion("merchantno in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotIn(List<String> values) {
            addCriterion("merchantno not in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoBetween(String value1, String value2) {
            addCriterion("merchantno between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotBetween(String value1, String value2) {
            addCriterion("merchantno not between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andEqualdateIsNull() {
            addCriterion("equaldate is null");
            return (Criteria) this;
        }

        public Criteria andEqualdateIsNotNull() {
            addCriterion("equaldate is not null");
            return (Criteria) this;
        }

        public Criteria andEqualdateEqualTo(String value) {
            addCriterion("equaldate =", value, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateNotEqualTo(String value) {
            addCriterion("equaldate <>", value, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateGreaterThan(String value) {
            addCriterion("equaldate >", value, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateGreaterThanOrEqualTo(String value) {
            addCriterion("equaldate >=", value, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateLessThan(String value) {
            addCriterion("equaldate <", value, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateLessThanOrEqualTo(String value) {
            addCriterion("equaldate <=", value, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateLike(String value) {
            addCriterion("equaldate like", value, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateNotLike(String value) {
            addCriterion("equaldate not like", value, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateIn(List<String> values) {
            addCriterion("equaldate in", values, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateNotIn(List<String> values) {
            addCriterion("equaldate not in", values, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateBetween(String value1, String value2) {
            addCriterion("equaldate between", value1, value2, "equaldate");
            return (Criteria) this;
        }

        public Criteria andEqualdateNotBetween(String value1, String value2) {
            addCriterion("equaldate not between", value1, value2, "equaldate");
            return (Criteria) this;
        }

        public Criteria andReconstatusIsNull() {
            addCriterion("reconstatus is null");
            return (Criteria) this;
        }

        public Criteria andReconstatusIsNotNull() {
            addCriterion("reconstatus is not null");
            return (Criteria) this;
        }

        public Criteria andReconstatusEqualTo(Byte value) {
            addCriterion("reconstatus =", value, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusNotEqualTo(Byte value) {
            addCriterion("reconstatus <>", value, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusGreaterThan(Byte value) {
            addCriterion("reconstatus >", value, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("reconstatus >=", value, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusLessThan(Byte value) {
            addCriterion("reconstatus <", value, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusLessThanOrEqualTo(Byte value) {
            addCriterion("reconstatus <=", value, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusIn(List<Byte> values) {
            addCriterion("reconstatus in", values, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusNotIn(List<Byte> values) {
            addCriterion("reconstatus not in", values, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusBetween(Byte value1, Byte value2) {
            addCriterion("reconstatus between", value1, value2, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andReconstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("reconstatus not between", value1, value2, "reconstatus");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNull() {
            addCriterion("modified_date is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNotNull() {
            addCriterion("modified_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateEqualTo(Date value) {
            addCriterion("modified_date =", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotEqualTo(Date value) {
            addCriterion("modified_date <>", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThan(Date value) {
            addCriterion("modified_date >", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_date >=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThan(Date value) {
            addCriterion("modified_date <", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("modified_date <=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIn(List<Date> values) {
            addCriterion("modified_date in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotIn(List<Date> values) {
            addCriterion("modified_date not in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateBetween(Date value1, Date value2) {
            addCriterion("modified_date between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("modified_date not between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andSideremarkIsNull() {
            addCriterion("sideremark is null");
            return (Criteria) this;
        }

        public Criteria andSideremarkIsNotNull() {
            addCriterion("sideremark is not null");
            return (Criteria) this;
        }

        public Criteria andSideremarkEqualTo(String value) {
            addCriterion("sideremark =", value, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkNotEqualTo(String value) {
            addCriterion("sideremark <>", value, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkGreaterThan(String value) {
            addCriterion("sideremark >", value, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkGreaterThanOrEqualTo(String value) {
            addCriterion("sideremark >=", value, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkLessThan(String value) {
            addCriterion("sideremark <", value, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkLessThanOrEqualTo(String value) {
            addCriterion("sideremark <=", value, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkLike(String value) {
            addCriterion("sideremark like", value, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkNotLike(String value) {
            addCriterion("sideremark not like", value, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkIn(List<String> values) {
            addCriterion("sideremark in", values, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkNotIn(List<String> values) {
            addCriterion("sideremark not in", values, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkBetween(String value1, String value2) {
            addCriterion("sideremark between", value1, value2, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSideremarkNotBetween(String value1, String value2) {
            addCriterion("sideremark not between", value1, value2, "sideremark");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andUsesIsNull() {
            addCriterion("uses is null");
            return (Criteria) this;
        }

        public Criteria andUsesIsNotNull() {
            addCriterion("uses is not null");
            return (Criteria) this;
        }

        public Criteria andUsesEqualTo(String value) {
            addCriterion("uses =", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotEqualTo(String value) {
            addCriterion("uses <>", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesGreaterThan(String value) {
            addCriterion("uses >", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesGreaterThanOrEqualTo(String value) {
            addCriterion("uses >=", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLessThan(String value) {
            addCriterion("uses <", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLessThanOrEqualTo(String value) {
            addCriterion("uses <=", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLike(String value) {
            addCriterion("uses like", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotLike(String value) {
            addCriterion("uses not like", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesIn(List<String> values) {
            addCriterion("uses in", values, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotIn(List<String> values) {
            addCriterion("uses not in", values, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesBetween(String value1, String value2) {
            addCriterion("uses between", value1, value2, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotBetween(String value1, String value2) {
            addCriterion("uses not between", value1, value2, "uses");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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