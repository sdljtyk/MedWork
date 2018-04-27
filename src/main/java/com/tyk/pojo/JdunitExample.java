package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class JdunitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public JdunitExample() {
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

        public Criteria andJdnameIsNull() {
            addCriterion("JDName is null");
            return (Criteria) this;
        }

        public Criteria andJdnameIsNotNull() {
            addCriterion("JDName is not null");
            return (Criteria) this;
        }

        public Criteria andJdnameEqualTo(String value) {
            addCriterion("JDName =", value, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameNotEqualTo(String value) {
            addCriterion("JDName <>", value, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameGreaterThan(String value) {
            addCriterion("JDName >", value, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameGreaterThanOrEqualTo(String value) {
            addCriterion("JDName >=", value, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameLessThan(String value) {
            addCriterion("JDName <", value, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameLessThanOrEqualTo(String value) {
            addCriterion("JDName <=", value, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameLike(String value) {
            addCriterion("JDName like", value, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameNotLike(String value) {
            addCriterion("JDName not like", value, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameIn(List<String> values) {
            addCriterion("JDName in", values, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameNotIn(List<String> values) {
            addCriterion("JDName not in", values, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameBetween(String value1, String value2) {
            addCriterion("JDName between", value1, value2, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdnameNotBetween(String value1, String value2) {
            addCriterion("JDName not between", value1, value2, "jdname");
            return (Criteria) this;
        }

        public Criteria andJdaddrIsNull() {
            addCriterion("JDAddr is null");
            return (Criteria) this;
        }

        public Criteria andJdaddrIsNotNull() {
            addCriterion("JDAddr is not null");
            return (Criteria) this;
        }

        public Criteria andJdaddrEqualTo(String value) {
            addCriterion("JDAddr =", value, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrNotEqualTo(String value) {
            addCriterion("JDAddr <>", value, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrGreaterThan(String value) {
            addCriterion("JDAddr >", value, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrGreaterThanOrEqualTo(String value) {
            addCriterion("JDAddr >=", value, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrLessThan(String value) {
            addCriterion("JDAddr <", value, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrLessThanOrEqualTo(String value) {
            addCriterion("JDAddr <=", value, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrLike(String value) {
            addCriterion("JDAddr like", value, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrNotLike(String value) {
            addCriterion("JDAddr not like", value, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrIn(List<String> values) {
            addCriterion("JDAddr in", values, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrNotIn(List<String> values) {
            addCriterion("JDAddr not in", values, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrBetween(String value1, String value2) {
            addCriterion("JDAddr between", value1, value2, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdaddrNotBetween(String value1, String value2) {
            addCriterion("JDAddr not between", value1, value2, "jdaddr");
            return (Criteria) this;
        }

        public Criteria andJdyzIsNull() {
            addCriterion("JDYZ is null");
            return (Criteria) this;
        }

        public Criteria andJdyzIsNotNull() {
            addCriterion("JDYZ is not null");
            return (Criteria) this;
        }

        public Criteria andJdyzEqualTo(String value) {
            addCriterion("JDYZ =", value, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzNotEqualTo(String value) {
            addCriterion("JDYZ <>", value, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzGreaterThan(String value) {
            addCriterion("JDYZ >", value, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzGreaterThanOrEqualTo(String value) {
            addCriterion("JDYZ >=", value, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzLessThan(String value) {
            addCriterion("JDYZ <", value, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzLessThanOrEqualTo(String value) {
            addCriterion("JDYZ <=", value, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzLike(String value) {
            addCriterion("JDYZ like", value, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzNotLike(String value) {
            addCriterion("JDYZ not like", value, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzIn(List<String> values) {
            addCriterion("JDYZ in", values, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzNotIn(List<String> values) {
            addCriterion("JDYZ not in", values, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzBetween(String value1, String value2) {
            addCriterion("JDYZ between", value1, value2, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdyzNotBetween(String value1, String value2) {
            addCriterion("JDYZ not between", value1, value2, "jdyz");
            return (Criteria) this;
        }

        public Criteria andJdlxrIsNull() {
            addCriterion("JDLXR is null");
            return (Criteria) this;
        }

        public Criteria andJdlxrIsNotNull() {
            addCriterion("JDLXR is not null");
            return (Criteria) this;
        }

        public Criteria andJdlxrEqualTo(String value) {
            addCriterion("JDLXR =", value, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrNotEqualTo(String value) {
            addCriterion("JDLXR <>", value, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrGreaterThan(String value) {
            addCriterion("JDLXR >", value, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrGreaterThanOrEqualTo(String value) {
            addCriterion("JDLXR >=", value, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrLessThan(String value) {
            addCriterion("JDLXR <", value, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrLessThanOrEqualTo(String value) {
            addCriterion("JDLXR <=", value, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrLike(String value) {
            addCriterion("JDLXR like", value, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrNotLike(String value) {
            addCriterion("JDLXR not like", value, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrIn(List<String> values) {
            addCriterion("JDLXR in", values, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrNotIn(List<String> values) {
            addCriterion("JDLXR not in", values, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrBetween(String value1, String value2) {
            addCriterion("JDLXR between", value1, value2, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdlxrNotBetween(String value1, String value2) {
            addCriterion("JDLXR not between", value1, value2, "jdlxr");
            return (Criteria) this;
        }

        public Criteria andJdphoneIsNull() {
            addCriterion("JDPhone is null");
            return (Criteria) this;
        }

        public Criteria andJdphoneIsNotNull() {
            addCriterion("JDPhone is not null");
            return (Criteria) this;
        }

        public Criteria andJdphoneEqualTo(String value) {
            addCriterion("JDPhone =", value, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneNotEqualTo(String value) {
            addCriterion("JDPhone <>", value, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneGreaterThan(String value) {
            addCriterion("JDPhone >", value, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("JDPhone >=", value, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneLessThan(String value) {
            addCriterion("JDPhone <", value, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneLessThanOrEqualTo(String value) {
            addCriterion("JDPhone <=", value, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneLike(String value) {
            addCriterion("JDPhone like", value, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneNotLike(String value) {
            addCriterion("JDPhone not like", value, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneIn(List<String> values) {
            addCriterion("JDPhone in", values, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneNotIn(List<String> values) {
            addCriterion("JDPhone not in", values, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneBetween(String value1, String value2) {
            addCriterion("JDPhone between", value1, value2, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJdphoneNotBetween(String value1, String value2) {
            addCriterion("JDPhone not between", value1, value2, "jdphone");
            return (Criteria) this;
        }

        public Criteria andJddqidIsNull() {
            addCriterion("JDDqId is null");
            return (Criteria) this;
        }

        public Criteria andJddqidIsNotNull() {
            addCriterion("JDDqId is not null");
            return (Criteria) this;
        }

        public Criteria andJddqidEqualTo(Integer value) {
            addCriterion("JDDqId =", value, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidNotEqualTo(Integer value) {
            addCriterion("JDDqId <>", value, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidGreaterThan(Integer value) {
            addCriterion("JDDqId >", value, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JDDqId >=", value, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidLessThan(Integer value) {
            addCriterion("JDDqId <", value, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidLessThanOrEqualTo(Integer value) {
            addCriterion("JDDqId <=", value, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidIn(List<Integer> values) {
            addCriterion("JDDqId in", values, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidNotIn(List<Integer> values) {
            addCriterion("JDDqId not in", values, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidBetween(Integer value1, Integer value2) {
            addCriterion("JDDqId between", value1, value2, "jddqid");
            return (Criteria) this;
        }

        public Criteria andJddqidNotBetween(Integer value1, Integer value2) {
            addCriterion("JDDqId not between", value1, value2, "jddqid");
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