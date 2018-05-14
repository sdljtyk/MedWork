package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class BackinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BackinfoExample() {
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

        public Criteria andBackidIsNull() {
            addCriterion("BackID is null");
            return (Criteria) this;
        }

        public Criteria andBackidIsNotNull() {
            addCriterion("BackID is not null");
            return (Criteria) this;
        }

        public Criteria andBackidEqualTo(Integer value) {
            addCriterion("BackID =", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotEqualTo(Integer value) {
            addCriterion("BackID <>", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidGreaterThan(Integer value) {
            addCriterion("BackID >", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BackID >=", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidLessThan(Integer value) {
            addCriterion("BackID <", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidLessThanOrEqualTo(Integer value) {
            addCriterion("BackID <=", value, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidIn(List<Integer> values) {
            addCriterion("BackID in", values, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotIn(List<Integer> values) {
            addCriterion("BackID not in", values, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidBetween(Integer value1, Integer value2) {
            addCriterion("BackID between", value1, value2, "backid");
            return (Criteria) this;
        }

        public Criteria andBackidNotBetween(Integer value1, Integer value2) {
            addCriterion("BackID not between", value1, value2, "backid");
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

        public Criteria andGhsidIsNull() {
            addCriterion("GhsId is null");
            return (Criteria) this;
        }

        public Criteria andGhsidIsNotNull() {
            addCriterion("GhsId is not null");
            return (Criteria) this;
        }

        public Criteria andGhsidEqualTo(Integer value) {
            addCriterion("GhsId =", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidNotEqualTo(Integer value) {
            addCriterion("GhsId <>", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidGreaterThan(Integer value) {
            addCriterion("GhsId >", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GhsId >=", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidLessThan(Integer value) {
            addCriterion("GhsId <", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidLessThanOrEqualTo(Integer value) {
            addCriterion("GhsId <=", value, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidIn(List<Integer> values) {
            addCriterion("GhsId in", values, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidNotIn(List<Integer> values) {
            addCriterion("GhsId not in", values, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidBetween(Integer value1, Integer value2) {
            addCriterion("GhsId between", value1, value2, "ghsid");
            return (Criteria) this;
        }

        public Criteria andGhsidNotBetween(Integer value1, Integer value2) {
            addCriterion("GhsId not between", value1, value2, "ghsid");
            return (Criteria) this;
        }

        public Criteria andBacknumIsNull() {
            addCriterion("BackNum is null");
            return (Criteria) this;
        }

        public Criteria andBacknumIsNotNull() {
            addCriterion("BackNum is not null");
            return (Criteria) this;
        }

        public Criteria andBacknumEqualTo(Integer value) {
            addCriterion("BackNum =", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotEqualTo(Integer value) {
            addCriterion("BackNum <>", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumGreaterThan(Integer value) {
            addCriterion("BackNum >", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BackNum >=", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumLessThan(Integer value) {
            addCriterion("BackNum <", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumLessThanOrEqualTo(Integer value) {
            addCriterion("BackNum <=", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumIn(List<Integer> values) {
            addCriterion("BackNum in", values, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotIn(List<Integer> values) {
            addCriterion("BackNum not in", values, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumBetween(Integer value1, Integer value2) {
            addCriterion("BackNum between", value1, value2, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotBetween(Integer value1, Integer value2) {
            addCriterion("BackNum not between", value1, value2, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacksumIsNull() {
            addCriterion("BackSum is null");
            return (Criteria) this;
        }

        public Criteria andBacksumIsNotNull() {
            addCriterion("BackSum is not null");
            return (Criteria) this;
        }

        public Criteria andBacksumEqualTo(Float value) {
            addCriterion("BackSum =", value, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumNotEqualTo(Float value) {
            addCriterion("BackSum <>", value, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumGreaterThan(Float value) {
            addCriterion("BackSum >", value, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumGreaterThanOrEqualTo(Float value) {
            addCriterion("BackSum >=", value, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumLessThan(Float value) {
            addCriterion("BackSum <", value, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumLessThanOrEqualTo(Float value) {
            addCriterion("BackSum <=", value, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumIn(List<Float> values) {
            addCriterion("BackSum in", values, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumNotIn(List<Float> values) {
            addCriterion("BackSum not in", values, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumBetween(Float value1, Float value2) {
            addCriterion("BackSum between", value1, value2, "backsum");
            return (Criteria) this;
        }

        public Criteria andBacksumNotBetween(Float value1, Float value2) {
            addCriterion("BackSum not between", value1, value2, "backsum");
            return (Criteria) this;
        }

        public Criteria andBackstateIsNull() {
            addCriterion("BackState is null");
            return (Criteria) this;
        }

        public Criteria andBackstateIsNotNull() {
            addCriterion("BackState is not null");
            return (Criteria) this;
        }

        public Criteria andBackstateEqualTo(Integer value) {
            addCriterion("BackState =", value, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateNotEqualTo(Integer value) {
            addCriterion("BackState <>", value, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateGreaterThan(Integer value) {
            addCriterion("BackState >", value, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("BackState >=", value, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateLessThan(Integer value) {
            addCriterion("BackState <", value, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateLessThanOrEqualTo(Integer value) {
            addCriterion("BackState <=", value, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateIn(List<Integer> values) {
            addCriterion("BackState in", values, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateNotIn(List<Integer> values) {
            addCriterion("BackState not in", values, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateBetween(Integer value1, Integer value2) {
            addCriterion("BackState between", value1, value2, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackstateNotBetween(Integer value1, Integer value2) {
            addCriterion("BackState not between", value1, value2, "backstate");
            return (Criteria) this;
        }

        public Criteria andBackreasonIsNull() {
            addCriterion("BackReason is null");
            return (Criteria) this;
        }

        public Criteria andBackreasonIsNotNull() {
            addCriterion("BackReason is not null");
            return (Criteria) this;
        }

        public Criteria andBackreasonEqualTo(String value) {
            addCriterion("BackReason =", value, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonNotEqualTo(String value) {
            addCriterion("BackReason <>", value, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonGreaterThan(String value) {
            addCriterion("BackReason >", value, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonGreaterThanOrEqualTo(String value) {
            addCriterion("BackReason >=", value, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonLessThan(String value) {
            addCriterion("BackReason <", value, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonLessThanOrEqualTo(String value) {
            addCriterion("BackReason <=", value, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonLike(String value) {
            addCriterion("BackReason like", value, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonNotLike(String value) {
            addCriterion("BackReason not like", value, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonIn(List<String> values) {
            addCriterion("BackReason in", values, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonNotIn(List<String> values) {
            addCriterion("BackReason not in", values, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonBetween(String value1, String value2) {
            addCriterion("BackReason between", value1, value2, "backreason");
            return (Criteria) this;
        }

        public Criteria andBackreasonNotBetween(String value1, String value2) {
            addCriterion("BackReason not between", value1, value2, "backreason");
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