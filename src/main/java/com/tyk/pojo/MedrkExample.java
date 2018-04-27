package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class MedrkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MedrkExample() {
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
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
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

        public Criteria andMednumIsNull() {
            addCriterion("MedNum is null");
            return (Criteria) this;
        }

        public Criteria andMednumIsNotNull() {
            addCriterion("MedNum is not null");
            return (Criteria) this;
        }

        public Criteria andMednumEqualTo(Integer value) {
            addCriterion("MedNum =", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumNotEqualTo(Integer value) {
            addCriterion("MedNum <>", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumGreaterThan(Integer value) {
            addCriterion("MedNum >", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedNum >=", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumLessThan(Integer value) {
            addCriterion("MedNum <", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumLessThanOrEqualTo(Integer value) {
            addCriterion("MedNum <=", value, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumIn(List<Integer> values) {
            addCriterion("MedNum in", values, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumNotIn(List<Integer> values) {
            addCriterion("MedNum not in", values, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumBetween(Integer value1, Integer value2) {
            addCriterion("MedNum between", value1, value2, "mednum");
            return (Criteria) this;
        }

        public Criteria andMednumNotBetween(Integer value1, Integer value2) {
            addCriterion("MedNum not between", value1, value2, "mednum");
            return (Criteria) this;
        }

        public Criteria andMedtimeIsNull() {
            addCriterion("MedTime is null");
            return (Criteria) this;
        }

        public Criteria andMedtimeIsNotNull() {
            addCriterion("MedTime is not null");
            return (Criteria) this;
        }

        public Criteria andMedtimeEqualTo(String value) {
            addCriterion("MedTime =", value, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeNotEqualTo(String value) {
            addCriterion("MedTime <>", value, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeGreaterThan(String value) {
            addCriterion("MedTime >", value, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("MedTime >=", value, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeLessThan(String value) {
            addCriterion("MedTime <", value, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeLessThanOrEqualTo(String value) {
            addCriterion("MedTime <=", value, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeLike(String value) {
            addCriterion("MedTime like", value, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeNotLike(String value) {
            addCriterion("MedTime not like", value, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeIn(List<String> values) {
            addCriterion("MedTime in", values, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeNotIn(List<String> values) {
            addCriterion("MedTime not in", values, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeBetween(String value1, String value2) {
            addCriterion("MedTime between", value1, value2, "medtime");
            return (Criteria) this;
        }

        public Criteria andMedtimeNotBetween(String value1, String value2) {
            addCriterion("MedTime not between", value1, value2, "medtime");
            return (Criteria) this;
        }

        public Criteria andDiduserIsNull() {
            addCriterion("DidUser is null");
            return (Criteria) this;
        }

        public Criteria andDiduserIsNotNull() {
            addCriterion("DidUser is not null");
            return (Criteria) this;
        }

        public Criteria andDiduserEqualTo(String value) {
            addCriterion("DidUser =", value, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserNotEqualTo(String value) {
            addCriterion("DidUser <>", value, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserGreaterThan(String value) {
            addCriterion("DidUser >", value, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserGreaterThanOrEqualTo(String value) {
            addCriterion("DidUser >=", value, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserLessThan(String value) {
            addCriterion("DidUser <", value, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserLessThanOrEqualTo(String value) {
            addCriterion("DidUser <=", value, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserLike(String value) {
            addCriterion("DidUser like", value, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserNotLike(String value) {
            addCriterion("DidUser not like", value, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserIn(List<String> values) {
            addCriterion("DidUser in", values, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserNotIn(List<String> values) {
            addCriterion("DidUser not in", values, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserBetween(String value1, String value2) {
            addCriterion("DidUser between", value1, value2, "diduser");
            return (Criteria) this;
        }

        public Criteria andDiduserNotBetween(String value1, String value2) {
            addCriterion("DidUser not between", value1, value2, "diduser");
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