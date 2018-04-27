package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MenuExample() {
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

        public Criteria andMenunameIsNull() {
            addCriterion("MenuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MenuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MenuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MenuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MenuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MenuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MenuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MenuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MenuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MenuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MenuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MenuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MenuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MenuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuparentIsNull() {
            addCriterion("MenuParent is null");
            return (Criteria) this;
        }

        public Criteria andMenuparentIsNotNull() {
            addCriterion("MenuParent is not null");
            return (Criteria) this;
        }

        public Criteria andMenuparentEqualTo(Integer value) {
            addCriterion("MenuParent =", value, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentNotEqualTo(Integer value) {
            addCriterion("MenuParent <>", value, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentGreaterThan(Integer value) {
            addCriterion("MenuParent >", value, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentGreaterThanOrEqualTo(Integer value) {
            addCriterion("MenuParent >=", value, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentLessThan(Integer value) {
            addCriterion("MenuParent <", value, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentLessThanOrEqualTo(Integer value) {
            addCriterion("MenuParent <=", value, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentIn(List<Integer> values) {
            addCriterion("MenuParent in", values, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentNotIn(List<Integer> values) {
            addCriterion("MenuParent not in", values, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentBetween(Integer value1, Integer value2) {
            addCriterion("MenuParent between", value1, value2, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenuparentNotBetween(Integer value1, Integer value2) {
            addCriterion("MenuParent not between", value1, value2, "menuparent");
            return (Criteria) this;
        }

        public Criteria andMenulevelIsNull() {
            addCriterion("MenuLevel is null");
            return (Criteria) this;
        }

        public Criteria andMenulevelIsNotNull() {
            addCriterion("MenuLevel is not null");
            return (Criteria) this;
        }

        public Criteria andMenulevelEqualTo(String value) {
            addCriterion("MenuLevel =", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotEqualTo(String value) {
            addCriterion("MenuLevel <>", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelGreaterThan(String value) {
            addCriterion("MenuLevel >", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelGreaterThanOrEqualTo(String value) {
            addCriterion("MenuLevel >=", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLessThan(String value) {
            addCriterion("MenuLevel <", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLessThanOrEqualTo(String value) {
            addCriterion("MenuLevel <=", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLike(String value) {
            addCriterion("MenuLevel like", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotLike(String value) {
            addCriterion("MenuLevel not like", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelIn(List<String> values) {
            addCriterion("MenuLevel in", values, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotIn(List<String> values) {
            addCriterion("MenuLevel not in", values, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelBetween(String value1, String value2) {
            addCriterion("MenuLevel between", value1, value2, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotBetween(String value1, String value2) {
            addCriterion("MenuLevel not between", value1, value2, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenuplaceIsNull() {
            addCriterion("MenuPlace is null");
            return (Criteria) this;
        }

        public Criteria andMenuplaceIsNotNull() {
            addCriterion("MenuPlace is not null");
            return (Criteria) this;
        }

        public Criteria andMenuplaceEqualTo(Integer value) {
            addCriterion("MenuPlace =", value, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceNotEqualTo(Integer value) {
            addCriterion("MenuPlace <>", value, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceGreaterThan(Integer value) {
            addCriterion("MenuPlace >", value, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("MenuPlace >=", value, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceLessThan(Integer value) {
            addCriterion("MenuPlace <", value, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceLessThanOrEqualTo(Integer value) {
            addCriterion("MenuPlace <=", value, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceIn(List<Integer> values) {
            addCriterion("MenuPlace in", values, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceNotIn(List<Integer> values) {
            addCriterion("MenuPlace not in", values, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceBetween(Integer value1, Integer value2) {
            addCriterion("MenuPlace between", value1, value2, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuplaceNotBetween(Integer value1, Integer value2) {
            addCriterion("MenuPlace not between", value1, value2, "menuplace");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("MenuURL is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("MenuURL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("MenuURL =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("MenuURL <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("MenuURL >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("MenuURL >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("MenuURL <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("MenuURL <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("MenuURL like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("MenuURL not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("MenuURL in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("MenuURL not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("MenuURL between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("MenuURL not between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNull() {
            addCriterion("IsUsed is null");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNotNull() {
            addCriterion("IsUsed is not null");
            return (Criteria) this;
        }

        public Criteria andIsusedEqualTo(Integer value) {
            addCriterion("IsUsed =", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotEqualTo(Integer value) {
            addCriterion("IsUsed <>", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThan(Integer value) {
            addCriterion("IsUsed >", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsUsed >=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThan(Integer value) {
            addCriterion("IsUsed <", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThanOrEqualTo(Integer value) {
            addCriterion("IsUsed <=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedIn(List<Integer> values) {
            addCriterion("IsUsed in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotIn(List<Integer> values) {
            addCriterion("IsUsed not in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedBetween(Integer value1, Integer value2) {
            addCriterion("IsUsed between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsUsed not between", value1, value2, "isused");
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