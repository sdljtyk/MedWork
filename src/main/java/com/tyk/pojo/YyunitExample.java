package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class YyunitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public YyunitExample() {
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

        public Criteria andYynameIsNull() {
            addCriterion("YYName is null");
            return (Criteria) this;
        }

        public Criteria andYynameIsNotNull() {
            addCriterion("YYName is not null");
            return (Criteria) this;
        }

        public Criteria andYynameEqualTo(String value) {
            addCriterion("YYName =", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameNotEqualTo(String value) {
            addCriterion("YYName <>", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameGreaterThan(String value) {
            addCriterion("YYName >", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameGreaterThanOrEqualTo(String value) {
            addCriterion("YYName >=", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameLessThan(String value) {
            addCriterion("YYName <", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameLessThanOrEqualTo(String value) {
            addCriterion("YYName <=", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameLike(String value) {
            addCriterion("YYName like", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameNotLike(String value) {
            addCriterion("YYName not like", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameIn(List<String> values) {
            addCriterion("YYName in", values, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameNotIn(List<String> values) {
            addCriterion("YYName not in", values, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameBetween(String value1, String value2) {
            addCriterion("YYName between", value1, value2, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameNotBetween(String value1, String value2) {
            addCriterion("YYName not between", value1, value2, "yyname");
            return (Criteria) this;
        }

        public Criteria andYyaddrIsNull() {
            addCriterion("YYaddr is null");
            return (Criteria) this;
        }

        public Criteria andYyaddrIsNotNull() {
            addCriterion("YYaddr is not null");
            return (Criteria) this;
        }

        public Criteria andYyaddrEqualTo(String value) {
            addCriterion("YYaddr =", value, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrNotEqualTo(String value) {
            addCriterion("YYaddr <>", value, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrGreaterThan(String value) {
            addCriterion("YYaddr >", value, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("YYaddr >=", value, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrLessThan(String value) {
            addCriterion("YYaddr <", value, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrLessThanOrEqualTo(String value) {
            addCriterion("YYaddr <=", value, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrLike(String value) {
            addCriterion("YYaddr like", value, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrNotLike(String value) {
            addCriterion("YYaddr not like", value, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrIn(List<String> values) {
            addCriterion("YYaddr in", values, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrNotIn(List<String> values) {
            addCriterion("YYaddr not in", values, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrBetween(String value1, String value2) {
            addCriterion("YYaddr between", value1, value2, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYyaddrNotBetween(String value1, String value2) {
            addCriterion("YYaddr not between", value1, value2, "yyaddr");
            return (Criteria) this;
        }

        public Criteria andYydqidIsNull() {
            addCriterion("YYDqId is null");
            return (Criteria) this;
        }

        public Criteria andYydqidIsNotNull() {
            addCriterion("YYDqId is not null");
            return (Criteria) this;
        }

        public Criteria andYydqidEqualTo(Integer value) {
            addCriterion("YYDqId =", value, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidNotEqualTo(Integer value) {
            addCriterion("YYDqId <>", value, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidGreaterThan(Integer value) {
            addCriterion("YYDqId >", value, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YYDqId >=", value, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidLessThan(Integer value) {
            addCriterion("YYDqId <", value, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidLessThanOrEqualTo(Integer value) {
            addCriterion("YYDqId <=", value, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidIn(List<Integer> values) {
            addCriterion("YYDqId in", values, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidNotIn(List<Integer> values) {
            addCriterion("YYDqId not in", values, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidBetween(Integer value1, Integer value2) {
            addCriterion("YYDqId between", value1, value2, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYydqidNotBetween(Integer value1, Integer value2) {
            addCriterion("YYDqId not between", value1, value2, "yydqid");
            return (Criteria) this;
        }

        public Criteria andYyjbIsNull() {
            addCriterion("YYJb is null");
            return (Criteria) this;
        }

        public Criteria andYyjbIsNotNull() {
            addCriterion("YYJb is not null");
            return (Criteria) this;
        }

        public Criteria andYyjbEqualTo(String value) {
            addCriterion("YYJb =", value, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbNotEqualTo(String value) {
            addCriterion("YYJb <>", value, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbGreaterThan(String value) {
            addCriterion("YYJb >", value, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbGreaterThanOrEqualTo(String value) {
            addCriterion("YYJb >=", value, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbLessThan(String value) {
            addCriterion("YYJb <", value, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbLessThanOrEqualTo(String value) {
            addCriterion("YYJb <=", value, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbLike(String value) {
            addCriterion("YYJb like", value, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbNotLike(String value) {
            addCriterion("YYJb not like", value, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbIn(List<String> values) {
            addCriterion("YYJb in", values, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbNotIn(List<String> values) {
            addCriterion("YYJb not in", values, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbBetween(String value1, String value2) {
            addCriterion("YYJb between", value1, value2, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYyjbNotBetween(String value1, String value2) {
            addCriterion("YYJb not between", value1, value2, "yyjb");
            return (Criteria) this;
        }

        public Criteria andYycwsIsNull() {
            addCriterion("YYCws is null");
            return (Criteria) this;
        }

        public Criteria andYycwsIsNotNull() {
            addCriterion("YYCws is not null");
            return (Criteria) this;
        }

        public Criteria andYycwsEqualTo(Integer value) {
            addCriterion("YYCws =", value, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsNotEqualTo(Integer value) {
            addCriterion("YYCws <>", value, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsGreaterThan(Integer value) {
            addCriterion("YYCws >", value, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsGreaterThanOrEqualTo(Integer value) {
            addCriterion("YYCws >=", value, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsLessThan(Integer value) {
            addCriterion("YYCws <", value, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsLessThanOrEqualTo(Integer value) {
            addCriterion("YYCws <=", value, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsIn(List<Integer> values) {
            addCriterion("YYCws in", values, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsNotIn(List<Integer> values) {
            addCriterion("YYCws not in", values, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsBetween(Integer value1, Integer value2) {
            addCriterion("YYCws between", value1, value2, "yycws");
            return (Criteria) this;
        }

        public Criteria andYycwsNotBetween(Integer value1, Integer value2) {
            addCriterion("YYCws not between", value1, value2, "yycws");
            return (Criteria) this;
        }

        public Criteria andYylxrIsNull() {
            addCriterion("YYLXR is null");
            return (Criteria) this;
        }

        public Criteria andYylxrIsNotNull() {
            addCriterion("YYLXR is not null");
            return (Criteria) this;
        }

        public Criteria andYylxrEqualTo(String value) {
            addCriterion("YYLXR =", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrNotEqualTo(String value) {
            addCriterion("YYLXR <>", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrGreaterThan(String value) {
            addCriterion("YYLXR >", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrGreaterThanOrEqualTo(String value) {
            addCriterion("YYLXR >=", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrLessThan(String value) {
            addCriterion("YYLXR <", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrLessThanOrEqualTo(String value) {
            addCriterion("YYLXR <=", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrLike(String value) {
            addCriterion("YYLXR like", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrNotLike(String value) {
            addCriterion("YYLXR not like", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrIn(List<String> values) {
            addCriterion("YYLXR in", values, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrNotIn(List<String> values) {
            addCriterion("YYLXR not in", values, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrBetween(String value1, String value2) {
            addCriterion("YYLXR between", value1, value2, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrNotBetween(String value1, String value2) {
            addCriterion("YYLXR not between", value1, value2, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYyphoneIsNull() {
            addCriterion("YYPhone is null");
            return (Criteria) this;
        }

        public Criteria andYyphoneIsNotNull() {
            addCriterion("YYPhone is not null");
            return (Criteria) this;
        }

        public Criteria andYyphoneEqualTo(String value) {
            addCriterion("YYPhone =", value, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneNotEqualTo(String value) {
            addCriterion("YYPhone <>", value, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneGreaterThan(String value) {
            addCriterion("YYPhone >", value, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("YYPhone >=", value, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneLessThan(String value) {
            addCriterion("YYPhone <", value, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneLessThanOrEqualTo(String value) {
            addCriterion("YYPhone <=", value, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneLike(String value) {
            addCriterion("YYPhone like", value, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneNotLike(String value) {
            addCriterion("YYPhone not like", value, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneIn(List<String> values) {
            addCriterion("YYPhone in", values, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneNotIn(List<String> values) {
            addCriterion("YYPhone not in", values, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneBetween(String value1, String value2) {
            addCriterion("YYPhone between", value1, value2, "yyphone");
            return (Criteria) this;
        }

        public Criteria andYyphoneNotBetween(String value1, String value2) {
            addCriterion("YYPhone not between", value1, value2, "yyphone");
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