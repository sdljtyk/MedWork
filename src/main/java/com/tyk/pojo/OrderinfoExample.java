package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderinfoExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderID not between", value1, value2, "orderid");
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

        public Criteria andGhsidIsNull() {
            addCriterion("GHSID is null");
            return (Criteria) this;
        }

        public Criteria andGhsidIsNotNull() {
            addCriterion("GHSID is not null");
            return (Criteria) this;
        }

        public Criteria andGhsidEqualTo(Integer value) {
            addCriterion("GHSID =", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidNotEqualTo(Integer value) {
            addCriterion("GHSID <>", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidGreaterThan(Integer value) {
            addCriterion("GHSID >", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GHSID >=", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidLessThan(Integer value) {
            addCriterion("GHSID <", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidLessThanOrEqualTo(Integer value) {
            addCriterion("GHSID <=", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidIn(List<Integer> values) {
            addCriterion("GHSID in", values, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidNotIn(List<Integer> values) {
            addCriterion("GHSID not in", values, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidBetween(Integer value1, Integer value2) {
            addCriterion("GHSID between", value1, value2, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidNotBetween(Integer value1, Integer value2) {
            addCriterion("GHSID not between", value1, value2, "ghsid");
            return (Criteria) this;
        }

        public Criteria andMeddjIsNull() {
            addCriterion("MedDJ is null");
            return (Criteria) this;
        }

        public Criteria andMeddjIsNotNull() {
            addCriterion("MedDJ is not null");
            return (Criteria) this;
        }

        public Criteria andMeddjEqualTo(Float value) {
            addCriterion("MedDJ =", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjNotEqualTo(Float value) {
            addCriterion("MedDJ <>", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjGreaterThan(Float value) {
            addCriterion("MedDJ >", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjGreaterThanOrEqualTo(Float value) {
            addCriterion("MedDJ >=", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjLessThan(Float value) {
            addCriterion("MedDJ <", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjLessThanOrEqualTo(Float value) {
            addCriterion("MedDJ <=", value, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjIn(List<Float> values) {
            addCriterion("MedDJ in", values, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjNotIn(List<Float> values) {
            addCriterion("MedDJ not in", values, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjBetween(Float value1, Float value2) {
            addCriterion("MedDJ between", value1, value2, "meddj");
            return (Criteria) this;
        }

        public Criteria andMeddjNotBetween(Float value1, Float value2) {
            addCriterion("MedDJ not between", value1, value2, "meddj");
            return (Criteria) this;
        }

        public Criteria andMednumIsNull() {
            addCriterion("Mednum is null");
            return (Criteria) this;
        }

        public Criteria andMednumIsNotNull() {
            addCriterion("Mednum is not null");
            return (Criteria) this;
        }

        public Criteria andMednumEqualTo(Integer value) {
            addCriterion("Mednum =", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumNotEqualTo(Integer value) {
            addCriterion("Mednum <>", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumGreaterThan(Integer value) {
            addCriterion("Mednum >", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mednum >=", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumLessThan(Integer value) {
            addCriterion("Mednum <", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumLessThanOrEqualTo(Integer value) {
            addCriterion("Mednum <=", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumIn(List<Integer> values) {
            addCriterion("Mednum in", values, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumNotIn(List<Integer> values) {
            addCriterion("Mednum not in", values, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumBetween(Integer value1, Integer value2) {
            addCriterion("Mednum between", value1, value2, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumNotBetween(Integer value1, Integer value2) {
            addCriterion("Mednum not between", value1, value2, "mednum");
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

        public Criteria andMedsumEqualTo(Float value) {
            addCriterion("MedSum =", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumNotEqualTo(Float value) {
            addCriterion("MedSum <>", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumGreaterThan(Float value) {
            addCriterion("MedSum >", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumGreaterThanOrEqualTo(Float value) {
            addCriterion("MedSum >=", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumLessThan(Float value) {
            addCriterion("MedSum <", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumLessThanOrEqualTo(Float value) {
            addCriterion("MedSum <=", value, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumIn(List<Float> values) {
            addCriterion("MedSum in", values, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumNotIn(List<Float> values) {
            addCriterion("MedSum not in", values, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumBetween(Float value1, Float value2) {
            addCriterion("MedSum between", value1, value2, "medsum");
            return (Criteria) this;
        }

        public Criteria andMedsumNotBetween(Float value1, Float value2) {
            addCriterion("MedSum not between", value1, value2, "medsum");
            return (Criteria) this;
        }

        public Criteria andGhstateIsNull() {
            addCriterion("GHState is null");
            return (Criteria) this;
        }

        public Criteria andGhstateIsNotNull() {
            addCriterion("GHState is not null");
            return (Criteria) this;
        }

        public Criteria andGhstateEqualTo(Integer value) {
            addCriterion("GHState =", value, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateNotEqualTo(Integer value) {
            addCriterion("GHState <>", value, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateGreaterThan(Integer value) {
            addCriterion("GHState >", value, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("GHState >=", value, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateLessThan(Integer value) {
            addCriterion("GHState <", value, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateLessThanOrEqualTo(Integer value) {
            addCriterion("GHState <=", value, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateIn(List<Integer> values) {
            addCriterion("GHState in", values, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateNotIn(List<Integer> values) {
            addCriterion("GHState not in", values, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateBetween(Integer value1, Integer value2) {
            addCriterion("GHState between", value1, value2, "ghstate");
            return (Criteria) this;
        }

        public Criteria andGhstateNotBetween(Integer value1, Integer value2) {
            addCriterion("GHState not between", value1, value2, "ghstate");
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