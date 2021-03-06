package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class YymedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public YymedExample() {
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

        public Criteria andMedidIsNull() {
            addCriterion("MedID is null");
            return (Criteria) this;
        }

        public Criteria andMedidIsNotNull() {
            addCriterion("MedID is not null");
            return (Criteria) this;
        }

        public Criteria andMedidEqualTo(Integer value) {
            addCriterion("MedID =", value, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidNotEqualTo(Integer value) {
            addCriterion("MedID <>", value, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidGreaterThan(Integer value) {
            addCriterion("MedID >", value, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedID >=", value, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidLessThan(Integer value) {
            addCriterion("MedID <", value, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidLessThanOrEqualTo(Integer value) {
            addCriterion("MedID <=", value, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidIn(List<Integer> values) {
            addCriterion("MedID in", values, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidNotIn(List<Integer> values) {
            addCriterion("MedID not in", values, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidBetween(Integer value1, Integer value2) {
            addCriterion("MedID between", value1, value2, "medid");
            return (Criteria) this;
        }

        public Criteria andMedidNotBetween(Integer value1, Integer value2) {
            addCriterion("MedID not between", value1, value2, "medid");
            return (Criteria) this;
        }

        public Criteria andMedsumIsNull() {
            addCriterion("MedSum is null");
            return (Criteria) this;
        }

        public Criteria andMedsumIsNotNull() {
            addCriterion("MedSum is not null");
            return (Criteria) this;
        }

        public Criteria andMedsumEqualTo(Integer value) {
            addCriterion("MedSum =", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumNotEqualTo(Integer value) {
            addCriterion("MedSum <>", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumGreaterThan(Integer value) {
            addCriterion("MedSum >", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedSum >=", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumLessThan(Integer value) {
            addCriterion("MedSum <", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumLessThanOrEqualTo(Integer value) {
            addCriterion("MedSum <=", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumIn(List<Integer> values) {
            addCriterion("MedSum in", values, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumNotIn(List<Integer> values) {
            addCriterion("MedSum not in", values, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumBetween(Integer value1, Integer value2) {
            addCriterion("MedSum between", value1, value2, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumNotBetween(Integer value1, Integer value2) {
            addCriterion("MedSum not between", value1, value2, "medsum");
            return (Criteria) this;
        }

        public Criteria andYyidIsNull() {
            addCriterion("YYID is null");
            return (Criteria) this;
        }

        public Criteria andYyidIsNotNull() {
            addCriterion("YYID is not null");
            return (Criteria) this;
        }

        public Criteria andYyidEqualTo(Integer value) {
            addCriterion("YYID =", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidNotEqualTo(Integer value) {
            addCriterion("YYID <>", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidGreaterThan(Integer value) {
            addCriterion("YYID >", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YYID >=", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidLessThan(Integer value) {
            addCriterion("YYID <", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidLessThanOrEqualTo(Integer value) {
            addCriterion("YYID <=", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidIn(List<Integer> values) {
            addCriterion("YYID in", values, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidNotIn(List<Integer> values) {
            addCriterion("YYID not in", values, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidBetween(Integer value1, Integer value2) {
            addCriterion("YYID between", value1, value2, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidNotBetween(Integer value1, Integer value2) {
            addCriterion("YYID not between", value1, value2, "yyid");
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