package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class BacksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BacksExample() {
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

        public Criteria andYylxrIsNull() {
            addCriterion("YYLxr is null");
            return (Criteria) this;
        }

        public Criteria andYylxrIsNotNull() {
            addCriterion("YYLxr is not null");
            return (Criteria) this;
        }

        public Criteria andYylxrEqualTo(String value) {
            addCriterion("YYLxr =", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrNotEqualTo(String value) {
            addCriterion("YYLxr <>", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrGreaterThan(String value) {
            addCriterion("YYLxr >", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrGreaterThanOrEqualTo(String value) {
            addCriterion("YYLxr >=", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrLessThan(String value) {
            addCriterion("YYLxr <", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrLessThanOrEqualTo(String value) {
            addCriterion("YYLxr <=", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrLike(String value) {
            addCriterion("YYLxr like", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrNotLike(String value) {
            addCriterion("YYLxr not like", value, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrIn(List<String> values) {
            addCriterion("YYLxr in", values, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrNotIn(List<String> values) {
            addCriterion("YYLxr not in", values, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrBetween(String value1, String value2) {
            addCriterion("YYLxr between", value1, value2, "yylxr");
            return (Criteria) this;
        }

        public Criteria andYylxrNotBetween(String value1, String value2) {
            addCriterion("YYLxr not between", value1, value2, "yylxr");
            return (Criteria) this;
        }

        public Criteria andBackcreatIsNull() {
            addCriterion("BackCreat is null");
            return (Criteria) this;
        }

        public Criteria andBackcreatIsNotNull() {
            addCriterion("BackCreat is not null");
            return (Criteria) this;
        }

        public Criteria andBackcreatEqualTo(String value) {
            addCriterion("BackCreat =", value, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatNotEqualTo(String value) {
            addCriterion("BackCreat <>", value, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatGreaterThan(String value) {
            addCriterion("BackCreat >", value, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatGreaterThanOrEqualTo(String value) {
            addCriterion("BackCreat >=", value, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatLessThan(String value) {
            addCriterion("BackCreat <", value, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatLessThanOrEqualTo(String value) {
            addCriterion("BackCreat <=", value, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatLike(String value) {
            addCriterion("BackCreat like", value, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatNotLike(String value) {
            addCriterion("BackCreat not like", value, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatIn(List<String> values) {
            addCriterion("BackCreat in", values, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatNotIn(List<String> values) {
            addCriterion("BackCreat not in", values, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatBetween(String value1, String value2) {
            addCriterion("BackCreat between", value1, value2, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackcreatNotBetween(String value1, String value2) {
            addCriterion("BackCreat not between", value1, value2, "backcreat");
            return (Criteria) this;
        }

        public Criteria andBackalterIsNull() {
            addCriterion("BackAlter is null");
            return (Criteria) this;
        }

        public Criteria andBackalterIsNotNull() {
            addCriterion("BackAlter is not null");
            return (Criteria) this;
        }

        public Criteria andBackalterEqualTo(String value) {
            addCriterion("BackAlter =", value, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterNotEqualTo(String value) {
            addCriterion("BackAlter <>", value, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterGreaterThan(String value) {
            addCriterion("BackAlter >", value, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterGreaterThanOrEqualTo(String value) {
            addCriterion("BackAlter >=", value, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterLessThan(String value) {
            addCriterion("BackAlter <", value, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterLessThanOrEqualTo(String value) {
            addCriterion("BackAlter <=", value, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterLike(String value) {
            addCriterion("BackAlter like", value, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterNotLike(String value) {
            addCriterion("BackAlter not like", value, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterIn(List<String> values) {
            addCriterion("BackAlter in", values, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterNotIn(List<String> values) {
            addCriterion("BackAlter not in", values, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterBetween(String value1, String value2) {
            addCriterion("BackAlter between", value1, value2, "backalter");
            return (Criteria) this;
        }

        public Criteria andBackalterNotBetween(String value1, String value2) {
            addCriterion("BackAlter not between", value1, value2, "backalter");
            return (Criteria) this;
        }

        public Criteria andBacksubIsNull() {
            addCriterion("BackSub is null");
            return (Criteria) this;
        }

        public Criteria andBacksubIsNotNull() {
            addCriterion("BackSub is not null");
            return (Criteria) this;
        }

        public Criteria andBacksubEqualTo(String value) {
            addCriterion("BackSub =", value, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubNotEqualTo(String value) {
            addCriterion("BackSub <>", value, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubGreaterThan(String value) {
            addCriterion("BackSub >", value, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubGreaterThanOrEqualTo(String value) {
            addCriterion("BackSub >=", value, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubLessThan(String value) {
            addCriterion("BackSub <", value, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubLessThanOrEqualTo(String value) {
            addCriterion("BackSub <=", value, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubLike(String value) {
            addCriterion("BackSub like", value, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubNotLike(String value) {
            addCriterion("BackSub not like", value, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubIn(List<String> values) {
            addCriterion("BackSub in", values, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubNotIn(List<String> values) {
            addCriterion("BackSub not in", values, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubBetween(String value1, String value2) {
            addCriterion("BackSub between", value1, value2, "backsub");
            return (Criteria) this;
        }

        public Criteria andBacksubNotBetween(String value1, String value2) {
            addCriterion("BackSub not between", value1, value2, "backsub");
            return (Criteria) this;
        }

        public Criteria andBackotherIsNull() {
            addCriterion("BackOther is null");
            return (Criteria) this;
        }

        public Criteria andBackotherIsNotNull() {
            addCriterion("BackOther is not null");
            return (Criteria) this;
        }

        public Criteria andBackotherEqualTo(String value) {
            addCriterion("BackOther =", value, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherNotEqualTo(String value) {
            addCriterion("BackOther <>", value, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherGreaterThan(String value) {
            addCriterion("BackOther >", value, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherGreaterThanOrEqualTo(String value) {
            addCriterion("BackOther >=", value, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherLessThan(String value) {
            addCriterion("BackOther <", value, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherLessThanOrEqualTo(String value) {
            addCriterion("BackOther <=", value, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherLike(String value) {
            addCriterion("BackOther like", value, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherNotLike(String value) {
            addCriterion("BackOther not like", value, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherIn(List<String> values) {
            addCriterion("BackOther in", values, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherNotIn(List<String> values) {
            addCriterion("BackOther not in", values, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherBetween(String value1, String value2) {
            addCriterion("BackOther between", value1, value2, "backother");
            return (Criteria) this;
        }

        public Criteria andBackotherNotBetween(String value1, String value2) {
            addCriterion("BackOther not between", value1, value2, "backother");
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

        public Criteria andBacknameIsNull() {
            addCriterion("BackName is null");
            return (Criteria) this;
        }

        public Criteria andBacknameIsNotNull() {
            addCriterion("BackName is not null");
            return (Criteria) this;
        }

        public Criteria andBacknameEqualTo(String value) {
            addCriterion("BackName =", value, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameNotEqualTo(String value) {
            addCriterion("BackName <>", value, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameGreaterThan(String value) {
            addCriterion("BackName >", value, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameGreaterThanOrEqualTo(String value) {
            addCriterion("BackName >=", value, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameLessThan(String value) {
            addCriterion("BackName <", value, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameLessThanOrEqualTo(String value) {
            addCriterion("BackName <=", value, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameLike(String value) {
            addCriterion("BackName like", value, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameNotLike(String value) {
            addCriterion("BackName not like", value, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameIn(List<String> values) {
            addCriterion("BackName in", values, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameNotIn(List<String> values) {
            addCriterion("BackName not in", values, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameBetween(String value1, String value2) {
            addCriterion("BackName between", value1, value2, "backname");
            return (Criteria) this;
        }

        public Criteria andBacknameNotBetween(String value1, String value2) {
            addCriterion("BackName not between", value1, value2, "backname");
            return (Criteria) this;
        }

        public Criteria andBackphoneIsNull() {
            addCriterion("Backphone is null");
            return (Criteria) this;
        }

        public Criteria andBackphoneIsNotNull() {
            addCriterion("Backphone is not null");
            return (Criteria) this;
        }

        public Criteria andBackphoneEqualTo(String value) {
            addCriterion("Backphone =", value, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneNotEqualTo(String value) {
            addCriterion("Backphone <>", value, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneGreaterThan(String value) {
            addCriterion("Backphone >", value, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneGreaterThanOrEqualTo(String value) {
            addCriterion("Backphone >=", value, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneLessThan(String value) {
            addCriterion("Backphone <", value, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneLessThanOrEqualTo(String value) {
            addCriterion("Backphone <=", value, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneLike(String value) {
            addCriterion("Backphone like", value, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneNotLike(String value) {
            addCriterion("Backphone not like", value, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneIn(List<String> values) {
            addCriterion("Backphone in", values, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneNotIn(List<String> values) {
            addCriterion("Backphone not in", values, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneBetween(String value1, String value2) {
            addCriterion("Backphone between", value1, value2, "backphone");
            return (Criteria) this;
        }

        public Criteria andBackphoneNotBetween(String value1, String value2) {
            addCriterion("Backphone not between", value1, value2, "backphone");
            return (Criteria) this;
        }

        public Criteria andBacknumberIsNull() {
            addCriterion("BackNumber is null");
            return (Criteria) this;
        }

        public Criteria andBacknumberIsNotNull() {
            addCriterion("BackNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBacknumberEqualTo(String value) {
            addCriterion("BackNumber =", value, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberNotEqualTo(String value) {
            addCriterion("BackNumber <>", value, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberGreaterThan(String value) {
            addCriterion("BackNumber >", value, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberGreaterThanOrEqualTo(String value) {
            addCriterion("BackNumber >=", value, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberLessThan(String value) {
            addCriterion("BackNumber <", value, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberLessThanOrEqualTo(String value) {
            addCriterion("BackNumber <=", value, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberLike(String value) {
            addCriterion("BackNumber like", value, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberNotLike(String value) {
            addCriterion("BackNumber not like", value, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberIn(List<String> values) {
            addCriterion("BackNumber in", values, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberNotIn(List<String> values) {
            addCriterion("BackNumber not in", values, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberBetween(String value1, String value2) {
            addCriterion("BackNumber between", value1, value2, "backnumber");
            return (Criteria) this;
        }

        public Criteria andBacknumberNotBetween(String value1, String value2) {
            addCriterion("BackNumber not between", value1, value2, "backnumber");
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