package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class GhsunitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GhsunitExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGhsnameIsNull() {
            addCriterion("GHSName is null");
            return (Criteria) this;
        }

        public Criteria andGhsnameIsNotNull() {
            addCriterion("GHSName is not null");
            return (Criteria) this;
        }

        public Criteria andGhsnameEqualTo(String value) {
            addCriterion("GHSName =", value, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameNotEqualTo(String value) {
            addCriterion("GHSName <>", value, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameGreaterThan(String value) {
            addCriterion("GHSName >", value, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GHSName >=", value, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameLessThan(String value) {
            addCriterion("GHSName <", value, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameLessThanOrEqualTo(String value) {
            addCriterion("GHSName <=", value, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameLike(String value) {
            addCriterion("GHSName like", value, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameNotLike(String value) {
            addCriterion("GHSName not like", value, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameIn(List<String> values) {
            addCriterion("GHSName in", values, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameNotIn(List<String> values) {
            addCriterion("GHSName not in", values, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameBetween(String value1, String value2) {
            addCriterion("GHSName between", value1, value2, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhsnameNotBetween(String value1, String value2) {
            addCriterion("GHSName not between", value1, value2, "ghsname");
            return (Criteria) this;
        }

        public Criteria andGhslbIsNull() {
            addCriterion("GHSLb is null");
            return (Criteria) this;
        }

        public Criteria andGhslbIsNotNull() {
            addCriterion("GHSLb is not null");
            return (Criteria) this;
        }

        public Criteria andGhslbEqualTo(String value) {
            addCriterion("GHSLb =", value, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbNotEqualTo(String value) {
            addCriterion("GHSLb <>", value, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbGreaterThan(String value) {
            addCriterion("GHSLb >", value, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbGreaterThanOrEqualTo(String value) {
            addCriterion("GHSLb >=", value, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbLessThan(String value) {
            addCriterion("GHSLb <", value, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbLessThanOrEqualTo(String value) {
            addCriterion("GHSLb <=", value, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbLike(String value) {
            addCriterion("GHSLb like", value, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbNotLike(String value) {
            addCriterion("GHSLb not like", value, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbIn(List<String> values) {
            addCriterion("GHSLb in", values, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbNotIn(List<String> values) {
            addCriterion("GHSLb not in", values, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbBetween(String value1, String value2) {
            addCriterion("GHSLb between", value1, value2, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslbNotBetween(String value1, String value2) {
            addCriterion("GHSLb not between", value1, value2, "ghslb");
            return (Criteria) this;
        }

        public Criteria andGhslxrIsNull() {
            addCriterion("GHSLxr is null");
            return (Criteria) this;
        }

        public Criteria andGhslxrIsNotNull() {
            addCriterion("GHSLxr is not null");
            return (Criteria) this;
        }

        public Criteria andGhslxrEqualTo(String value) {
            addCriterion("GHSLxr =", value, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrNotEqualTo(String value) {
            addCriterion("GHSLxr <>", value, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrGreaterThan(String value) {
            addCriterion("GHSLxr >", value, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrGreaterThanOrEqualTo(String value) {
            addCriterion("GHSLxr >=", value, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrLessThan(String value) {
            addCriterion("GHSLxr <", value, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrLessThanOrEqualTo(String value) {
            addCriterion("GHSLxr <=", value, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrLike(String value) {
            addCriterion("GHSLxr like", value, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrNotLike(String value) {
            addCriterion("GHSLxr not like", value, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrIn(List<String> values) {
            addCriterion("GHSLxr in", values, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrNotIn(List<String> values) {
            addCriterion("GHSLxr not in", values, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrBetween(String value1, String value2) {
            addCriterion("GHSLxr between", value1, value2, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhslxrNotBetween(String value1, String value2) {
            addCriterion("GHSLxr not between", value1, value2, "ghslxr");
            return (Criteria) this;
        }

        public Criteria andGhsphoneIsNull() {
            addCriterion("GHSPhone is null");
            return (Criteria) this;
        }

        public Criteria andGhsphoneIsNotNull() {
            addCriterion("GHSPhone is not null");
            return (Criteria) this;
        }

        public Criteria andGhsphoneEqualTo(String value) {
            addCriterion("GHSPhone =", value, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneNotEqualTo(String value) {
            addCriterion("GHSPhone <>", value, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneGreaterThan(String value) {
            addCriterion("GHSPhone >", value, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("GHSPhone >=", value, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneLessThan(String value) {
            addCriterion("GHSPhone <", value, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneLessThanOrEqualTo(String value) {
            addCriterion("GHSPhone <=", value, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneLike(String value) {
            addCriterion("GHSPhone like", value, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneNotLike(String value) {
            addCriterion("GHSPhone not like", value, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneIn(List<String> values) {
            addCriterion("GHSPhone in", values, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneNotIn(List<String> values) {
            addCriterion("GHSPhone not in", values, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneBetween(String value1, String value2) {
            addCriterion("GHSPhone between", value1, value2, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsphoneNotBetween(String value1, String value2) {
            addCriterion("GHSPhone not between", value1, value2, "ghsphone");
            return (Criteria) this;
        }

        public Criteria andGhsxkzIsNull() {
            addCriterion("GHSXkz is null");
            return (Criteria) this;
        }

        public Criteria andGhsxkzIsNotNull() {
            addCriterion("GHSXkz is not null");
            return (Criteria) this;
        }

        public Criteria andGhsxkzEqualTo(String value) {
            addCriterion("GHSXkz =", value, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzNotEqualTo(String value) {
            addCriterion("GHSXkz <>", value, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzGreaterThan(String value) {
            addCriterion("GHSXkz >", value, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzGreaterThanOrEqualTo(String value) {
            addCriterion("GHSXkz >=", value, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzLessThan(String value) {
            addCriterion("GHSXkz <", value, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzLessThanOrEqualTo(String value) {
            addCriterion("GHSXkz <=", value, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzLike(String value) {
            addCriterion("GHSXkz like", value, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzNotLike(String value) {
            addCriterion("GHSXkz not like", value, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzIn(List<String> values) {
            addCriterion("GHSXkz in", values, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzNotIn(List<String> values) {
            addCriterion("GHSXkz not in", values, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzBetween(String value1, String value2) {
            addCriterion("GHSXkz between", value1, value2, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsxkzNotBetween(String value1, String value2) {
            addCriterion("GHSXkz not between", value1, value2, "ghsxkz");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwIsNull() {
            addCriterion("GHSJyfw is null");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwIsNotNull() {
            addCriterion("GHSJyfw is not null");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwEqualTo(String value) {
            addCriterion("GHSJyfw =", value, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwNotEqualTo(String value) {
            addCriterion("GHSJyfw <>", value, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwGreaterThan(String value) {
            addCriterion("GHSJyfw >", value, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwGreaterThanOrEqualTo(String value) {
            addCriterion("GHSJyfw >=", value, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwLessThan(String value) {
            addCriterion("GHSJyfw <", value, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwLessThanOrEqualTo(String value) {
            addCriterion("GHSJyfw <=", value, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwLike(String value) {
            addCriterion("GHSJyfw like", value, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwNotLike(String value) {
            addCriterion("GHSJyfw not like", value, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwIn(List<String> values) {
            addCriterion("GHSJyfw in", values, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwNotIn(List<String> values) {
            addCriterion("GHSJyfw not in", values, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwBetween(String value1, String value2) {
            addCriterion("GHSJyfw between", value1, value2, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhsjyfwNotBetween(String value1, String value2) {
            addCriterion("GHSJyfw not between", value1, value2, "ghsjyfw");
            return (Criteria) this;
        }

        public Criteria andGhshomeIsNull() {
            addCriterion("GHSHome is null");
            return (Criteria) this;
        }

        public Criteria andGhshomeIsNotNull() {
            addCriterion("GHSHome is not null");
            return (Criteria) this;
        }

        public Criteria andGhshomeEqualTo(String value) {
            addCriterion("GHSHome =", value, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeNotEqualTo(String value) {
            addCriterion("GHSHome <>", value, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeGreaterThan(String value) {
            addCriterion("GHSHome >", value, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeGreaterThanOrEqualTo(String value) {
            addCriterion("GHSHome >=", value, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeLessThan(String value) {
            addCriterion("GHSHome <", value, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeLessThanOrEqualTo(String value) {
            addCriterion("GHSHome <=", value, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeLike(String value) {
            addCriterion("GHSHome like", value, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeNotLike(String value) {
            addCriterion("GHSHome not like", value, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeIn(List<String> values) {
            addCriterion("GHSHome in", values, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeNotIn(List<String> values) {
            addCriterion("GHSHome not in", values, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeBetween(String value1, String value2) {
            addCriterion("GHSHome between", value1, value2, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhshomeNotBetween(String value1, String value2) {
            addCriterion("GHSHome not between", value1, value2, "ghshome");
            return (Criteria) this;
        }

        public Criteria andGhsaddrIsNull() {
            addCriterion("GHSAddr is null");
            return (Criteria) this;
        }

        public Criteria andGhsaddrIsNotNull() {
            addCriterion("GHSAddr is not null");
            return (Criteria) this;
        }

        public Criteria andGhsaddrEqualTo(String value) {
            addCriterion("GHSAddr =", value, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrNotEqualTo(String value) {
            addCriterion("GHSAddr <>", value, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrGreaterThan(String value) {
            addCriterion("GHSAddr >", value, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrGreaterThanOrEqualTo(String value) {
            addCriterion("GHSAddr >=", value, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrLessThan(String value) {
            addCriterion("GHSAddr <", value, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrLessThanOrEqualTo(String value) {
            addCriterion("GHSAddr <=", value, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrLike(String value) {
            addCriterion("GHSAddr like", value, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrNotLike(String value) {
            addCriterion("GHSAddr not like", value, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrIn(List<String> values) {
            addCriterion("GHSAddr in", values, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrNotIn(List<String> values) {
            addCriterion("GHSAddr not in", values, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrBetween(String value1, String value2) {
            addCriterion("GHSAddr between", value1, value2, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhsaddrNotBetween(String value1, String value2) {
            addCriterion("GHSAddr not between", value1, value2, "ghsaddr");
            return (Criteria) this;
        }

        public Criteria andGhszzcIsNull() {
            addCriterion("GHSZzc is null");
            return (Criteria) this;
        }

        public Criteria andGhszzcIsNotNull() {
            addCriterion("GHSZzc is not null");
            return (Criteria) this;
        }

        public Criteria andGhszzcEqualTo(String value) {
            addCriterion("GHSZzc =", value, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcNotEqualTo(String value) {
            addCriterion("GHSZzc <>", value, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcGreaterThan(String value) {
            addCriterion("GHSZzc >", value, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcGreaterThanOrEqualTo(String value) {
            addCriterion("GHSZzc >=", value, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcLessThan(String value) {
            addCriterion("GHSZzc <", value, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcLessThanOrEqualTo(String value) {
            addCriterion("GHSZzc <=", value, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcLike(String value) {
            addCriterion("GHSZzc like", value, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcNotLike(String value) {
            addCriterion("GHSZzc not like", value, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcIn(List<String> values) {
            addCriterion("GHSZzc in", values, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcNotIn(List<String> values) {
            addCriterion("GHSZzc not in", values, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcBetween(String value1, String value2) {
            addCriterion("GHSZzc between", value1, value2, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhszzcNotBetween(String value1, String value2) {
            addCriterion("GHSZzc not between", value1, value2, "ghszzc");
            return (Criteria) this;
        }

        public Criteria andGhsfrIsNull() {
            addCriterion("GHSFr is null");
            return (Criteria) this;
        }

        public Criteria andGhsfrIsNotNull() {
            addCriterion("GHSFr is not null");
            return (Criteria) this;
        }

        public Criteria andGhsfrEqualTo(String value) {
            addCriterion("GHSFr =", value, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrNotEqualTo(String value) {
            addCriterion("GHSFr <>", value, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrGreaterThan(String value) {
            addCriterion("GHSFr >", value, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrGreaterThanOrEqualTo(String value) {
            addCriterion("GHSFr >=", value, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrLessThan(String value) {
            addCriterion("GHSFr <", value, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrLessThanOrEqualTo(String value) {
            addCriterion("GHSFr <=", value, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrLike(String value) {
            addCriterion("GHSFr like", value, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrNotLike(String value) {
            addCriterion("GHSFr not like", value, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrIn(List<String> values) {
            addCriterion("GHSFr in", values, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrNotIn(List<String> values) {
            addCriterion("GHSFr not in", values, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrBetween(String value1, String value2) {
            addCriterion("GHSFr between", value1, value2, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhsfrNotBetween(String value1, String value2) {
            addCriterion("GHSFr not between", value1, value2, "ghsfr");
            return (Criteria) this;
        }

        public Criteria andGhszczjIsNull() {
            addCriterion("GHSZczj is null");
            return (Criteria) this;
        }

        public Criteria andGhszczjIsNotNull() {
            addCriterion("GHSZczj is not null");
            return (Criteria) this;
        }

        public Criteria andGhszczjEqualTo(String value) {
            addCriterion("GHSZczj =", value, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjNotEqualTo(String value) {
            addCriterion("GHSZczj <>", value, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjGreaterThan(String value) {
            addCriterion("GHSZczj >", value, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjGreaterThanOrEqualTo(String value) {
            addCriterion("GHSZczj >=", value, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjLessThan(String value) {
            addCriterion("GHSZczj <", value, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjLessThanOrEqualTo(String value) {
            addCriterion("GHSZczj <=", value, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjLike(String value) {
            addCriterion("GHSZczj like", value, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjNotLike(String value) {
            addCriterion("GHSZczj not like", value, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjIn(List<String> values) {
            addCriterion("GHSZczj in", values, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjNotIn(List<String> values) {
            addCriterion("GHSZczj not in", values, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjBetween(String value1, String value2) {
            addCriterion("GHSZczj between", value1, value2, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhszczjNotBetween(String value1, String value2) {
            addCriterion("GHSZczj not between", value1, value2, "ghszczj");
            return (Criteria) this;
        }

        public Criteria andGhsjjIsNull() {
            addCriterion("GHSJj is null");
            return (Criteria) this;
        }

        public Criteria andGhsjjIsNotNull() {
            addCriterion("GHSJj is not null");
            return (Criteria) this;
        }

        public Criteria andGhsjjEqualTo(String value) {
            addCriterion("GHSJj =", value, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjNotEqualTo(String value) {
            addCriterion("GHSJj <>", value, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjGreaterThan(String value) {
            addCriterion("GHSJj >", value, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjGreaterThanOrEqualTo(String value) {
            addCriterion("GHSJj >=", value, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjLessThan(String value) {
            addCriterion("GHSJj <", value, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjLessThanOrEqualTo(String value) {
            addCriterion("GHSJj <=", value, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjLike(String value) {
            addCriterion("GHSJj like", value, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjNotLike(String value) {
            addCriterion("GHSJj not like", value, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjIn(List<String> values) {
            addCriterion("GHSJj in", values, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjNotIn(List<String> values) {
            addCriterion("GHSJj not in", values, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjBetween(String value1, String value2) {
            addCriterion("GHSJj between", value1, value2, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsjjNotBetween(String value1, String value2) {
            addCriterion("GHSJj not between", value1, value2, "ghsjj");
            return (Criteria) this;
        }

        public Criteria andGhsotherIsNull() {
            addCriterion("GHSother is null");
            return (Criteria) this;
        }

        public Criteria andGhsotherIsNotNull() {
            addCriterion("GHSother is not null");
            return (Criteria) this;
        }

        public Criteria andGhsotherEqualTo(String value) {
            addCriterion("GHSother =", value, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherNotEqualTo(String value) {
            addCriterion("GHSother <>", value, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherGreaterThan(String value) {
            addCriterion("GHSother >", value, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherGreaterThanOrEqualTo(String value) {
            addCriterion("GHSother >=", value, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherLessThan(String value) {
            addCriterion("GHSother <", value, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherLessThanOrEqualTo(String value) {
            addCriterion("GHSother <=", value, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherLike(String value) {
            addCriterion("GHSother like", value, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherNotLike(String value) {
            addCriterion("GHSother not like", value, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherIn(List<String> values) {
            addCriterion("GHSother in", values, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherNotIn(List<String> values) {
            addCriterion("GHSother not in", values, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherBetween(String value1, String value2) {
            addCriterion("GHSother between", value1, value2, "ghsother");
            return (Criteria) this;
        }

        public Criteria andGhsotherNotBetween(String value1, String value2) {
            addCriterion("GHSother not between", value1, value2, "ghsother");
            return (Criteria) this;
        }
    }

    /**
     */
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