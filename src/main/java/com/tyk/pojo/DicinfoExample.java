package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class DicinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DicinfoExample() {
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

        public Criteria andDiccodeIsNull() {
            addCriterion("DicCode is null");
            return (Criteria) this;
        }

        public Criteria andDiccodeIsNotNull() {
            addCriterion("DicCode is not null");
            return (Criteria) this;
        }

        public Criteria andDiccodeEqualTo(Integer value) {
            addCriterion("DicCode =", value, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeNotEqualTo(Integer value) {
            addCriterion("DicCode <>", value, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeGreaterThan(Integer value) {
            addCriterion("DicCode >", value, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DicCode >=", value, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeLessThan(Integer value) {
            addCriterion("DicCode <", value, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeLessThanOrEqualTo(Integer value) {
            addCriterion("DicCode <=", value, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeIn(List<Integer> values) {
            addCriterion("DicCode in", values, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeNotIn(List<Integer> values) {
            addCriterion("DicCode not in", values, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeBetween(Integer value1, Integer value2) {
            addCriterion("DicCode between", value1, value2, "diccode");
            return (Criteria) this;
        }

        public Criteria andDiccodeNotBetween(Integer value1, Integer value2) {
            addCriterion("DicCode not between", value1, value2, "diccode");
            return (Criteria) this;
        }

        public Criteria andDictypeIsNull() {
            addCriterion("DicType is null");
            return (Criteria) this;
        }

        public Criteria andDictypeIsNotNull() {
            addCriterion("DicType is not null");
            return (Criteria) this;
        }

        public Criteria andDictypeEqualTo(String value) {
            addCriterion("DicType =", value, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeNotEqualTo(String value) {
            addCriterion("DicType <>", value, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeGreaterThan(String value) {
            addCriterion("DicType >", value, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeGreaterThanOrEqualTo(String value) {
            addCriterion("DicType >=", value, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeLessThan(String value) {
            addCriterion("DicType <", value, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeLessThanOrEqualTo(String value) {
            addCriterion("DicType <=", value, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeLike(String value) {
            addCriterion("DicType like", value, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeNotLike(String value) {
            addCriterion("DicType not like", value, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeIn(List<String> values) {
            addCriterion("DicType in", values, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeNotIn(List<String> values) {
            addCriterion("DicType not in", values, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeBetween(String value1, String value2) {
            addCriterion("DicType between", value1, value2, "dictype");
            return (Criteria) this;
        }

        public Criteria andDictypeNotBetween(String value1, String value2) {
            addCriterion("DicType not between", value1, value2, "dictype");
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

        public Criteria andOrthersIsNull() {
            addCriterion("Orthers is null");
            return (Criteria) this;
        }

        public Criteria andOrthersIsNotNull() {
            addCriterion("Orthers is not null");
            return (Criteria) this;
        }

        public Criteria andOrthersEqualTo(String value) {
            addCriterion("Orthers =", value, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersNotEqualTo(String value) {
            addCriterion("Orthers <>", value, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersGreaterThan(String value) {
            addCriterion("Orthers >", value, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersGreaterThanOrEqualTo(String value) {
            addCriterion("Orthers >=", value, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersLessThan(String value) {
            addCriterion("Orthers <", value, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersLessThanOrEqualTo(String value) {
            addCriterion("Orthers <=", value, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersLike(String value) {
            addCriterion("Orthers like", value, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersNotLike(String value) {
            addCriterion("Orthers not like", value, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersIn(List<String> values) {
            addCriterion("Orthers in", values, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersNotIn(List<String> values) {
            addCriterion("Orthers not in", values, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersBetween(String value1, String value2) {
            addCriterion("Orthers between", value1, value2, "orthers");
            return (Criteria) this;
        }

        public Criteria andOrthersNotBetween(String value1, String value2) {
            addCriterion("Orthers not between", value1, value2, "orthers");
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