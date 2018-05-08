package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class GhsmedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GhsmedExample() {
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

        public Criteria andGhsunitidIsNull() {
            addCriterion("GHSUnitID is null");
            return (Criteria) this;
        }

        public Criteria andGhsunitidIsNotNull() {
            addCriterion("GHSUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andGhsunitidEqualTo(Integer value) {
            addCriterion("GHSUnitID =", value, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidNotEqualTo(Integer value) {
            addCriterion("GHSUnitID <>", value, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidGreaterThan(Integer value) {
            addCriterion("GHSUnitID >", value, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GHSUnitID >=", value, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidLessThan(Integer value) {
            addCriterion("GHSUnitID <", value, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidLessThanOrEqualTo(Integer value) {
            addCriterion("GHSUnitID <=", value, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidIn(List<Integer> values) {
            addCriterion("GHSUnitID in", values, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidNotIn(List<Integer> values) {
            addCriterion("GHSUnitID not in", values, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidBetween(Integer value1, Integer value2) {
            addCriterion("GHSUnitID between", value1, value2, "ghsunitid");
            return (Criteria) this;
        }

        public Criteria andGhsunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("GHSUnitID not between", value1, value2, "ghsunitid");
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

        public Criteria andMeddjIsNull() {
            addCriterion("MedDj is null");
            return (Criteria) this;
        }

        public Criteria andMeddjIsNotNull() {
            addCriterion("MedDj is not null");
            return (Criteria) this;
        }

        public Criteria andMeddjEqualTo(Float value) {
            addCriterion("MedDj =", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjNotEqualTo(Float value) {
            addCriterion("MedDj <>", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjGreaterThan(Float value) {
            addCriterion("MedDj >", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjGreaterThanOrEqualTo(Float value) {
            addCriterion("MedDj >=", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjLessThan(Float value) {
            addCriterion("MedDj <", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjLessThanOrEqualTo(Float value) {
            addCriterion("MedDj <=", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjIn(List<Float> values) {
            addCriterion("MedDj in", values, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjNotIn(List<Float> values) {
            addCriterion("MedDj not in", values, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjBetween(Float value1, Float value2) {
            addCriterion("MedDj between", value1, value2, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjNotBetween(Float value1, Float value2) {
            addCriterion("MedDj not between", value1, value2, "meddj");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateIsNull() {
            addCriterion("GHSMedState is null");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateIsNotNull() {
            addCriterion("GHSMedState is not null");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateEqualTo(Integer value) {
            addCriterion("GHSMedState =", value, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateNotEqualTo(Integer value) {
            addCriterion("GHSMedState <>", value, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateGreaterThan(Integer value) {
            addCriterion("GHSMedState >", value, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("GHSMedState >=", value, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateLessThan(Integer value) {
            addCriterion("GHSMedState <", value, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateLessThanOrEqualTo(Integer value) {
            addCriterion("GHSMedState <=", value, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateIn(List<Integer> values) {
            addCriterion("GHSMedState in", values, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateNotIn(List<Integer> values) {
            addCriterion("GHSMedState not in", values, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateBetween(Integer value1, Integer value2) {
            addCriterion("GHSMedState between", value1, value2, "ghsmedstate");
            return (Criteria) this;
        }

        public Criteria andGhsmedstateNotBetween(Integer value1, Integer value2) {
            addCriterion("GHSMedState not between", value1, value2, "ghsmedstate");
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