package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class MedinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MedinfoExample() {
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

        public Criteria andMednumberIsNull() {
            addCriterion("MedNumber is null");
            return (Criteria) this;
        }

        public Criteria andMednumberIsNotNull() {
            addCriterion("MedNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMednumberEqualTo(String value) {
            addCriterion("MedNumber =", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberNotEqualTo(String value) {
            addCriterion("MedNumber <>", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberGreaterThan(String value) {
            addCriterion("MedNumber >", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberGreaterThanOrEqualTo(String value) {
            addCriterion("MedNumber >=", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberLessThan(String value) {
            addCriterion("MedNumber <", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberLessThanOrEqualTo(String value) {
            addCriterion("MedNumber <=", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberLike(String value) {
            addCriterion("MedNumber like", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberNotLike(String value) {
            addCriterion("MedNumber not like", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberIn(List<String> values) {
            addCriterion("MedNumber in", values, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberNotIn(List<String> values) {
            addCriterion("MedNumber not in", values, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberBetween(String value1, String value2) {
            addCriterion("MedNumber between", value1, value2, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberNotBetween(String value1, String value2) {
            addCriterion("MedNumber not between", value1, value2, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMedmakeIsNull() {
            addCriterion("MedMake is null");
            return (Criteria) this;
        }

        public Criteria andMedmakeIsNotNull() {
            addCriterion("MedMake is not null");
            return (Criteria) this;
        }

        public Criteria andMedmakeEqualTo(String value) {
            addCriterion("MedMake =", value, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeNotEqualTo(String value) {
            addCriterion("MedMake <>", value, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeGreaterThan(String value) {
            addCriterion("MedMake >", value, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeGreaterThanOrEqualTo(String value) {
            addCriterion("MedMake >=", value, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeLessThan(String value) {
            addCriterion("MedMake <", value, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeLessThanOrEqualTo(String value) {
            addCriterion("MedMake <=", value, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeLike(String value) {
            addCriterion("MedMake like", value, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeNotLike(String value) {
            addCriterion("MedMake not like", value, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeIn(List<String> values) {
            addCriterion("MedMake in", values, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeNotIn(List<String> values) {
            addCriterion("MedMake not in", values, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeBetween(String value1, String value2) {
            addCriterion("MedMake between", value1, value2, "medmake");
            return (Criteria) this;
        }

        public Criteria andMedmakeNotBetween(String value1, String value2) {
            addCriterion("MedMake not between", value1, value2, "medmake");
            return (Criteria) this;
        }

        public Criteria andMednameIsNull() {
            addCriterion("MedName is null");
            return (Criteria) this;
        }

        public Criteria andMednameIsNotNull() {
            addCriterion("MedName is not null");
            return (Criteria) this;
        }

        public Criteria andMednameEqualTo(String value) {
            addCriterion("MedName =", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameNotEqualTo(String value) {
            addCriterion("MedName <>", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameGreaterThan(String value) {
            addCriterion("MedName >", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameGreaterThanOrEqualTo(String value) {
            addCriterion("MedName >=", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameLessThan(String value) {
            addCriterion("MedName <", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameLessThanOrEqualTo(String value) {
            addCriterion("MedName <=", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameLike(String value) {
            addCriterion("MedName like", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameNotLike(String value) {
            addCriterion("MedName not like", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameIn(List<String> values) {
            addCriterion("MedName in", values, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameNotIn(List<String> values) {
            addCriterion("MedName not in", values, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameBetween(String value1, String value2) {
            addCriterion("MedName between", value1, value2, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameNotBetween(String value1, String value2) {
            addCriterion("MedName not between", value1, value2, "medname");
            return (Criteria) this;
        }

        public Criteria andMedpicIsNull() {
            addCriterion("MedPic is null");
            return (Criteria) this;
        }

        public Criteria andMedpicIsNotNull() {
            addCriterion("MedPic is not null");
            return (Criteria) this;
        }

        public Criteria andMedpicEqualTo(String value) {
            addCriterion("MedPic =", value, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicNotEqualTo(String value) {
            addCriterion("MedPic <>", value, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicGreaterThan(String value) {
            addCriterion("MedPic >", value, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicGreaterThanOrEqualTo(String value) {
            addCriterion("MedPic >=", value, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicLessThan(String value) {
            addCriterion("MedPic <", value, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicLessThanOrEqualTo(String value) {
            addCriterion("MedPic <=", value, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicLike(String value) {
            addCriterion("MedPic like", value, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicNotLike(String value) {
            addCriterion("MedPic not like", value, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicIn(List<String> values) {
            addCriterion("MedPic in", values, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicNotIn(List<String> values) {
            addCriterion("MedPic not in", values, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicBetween(String value1, String value2) {
            addCriterion("MedPic between", value1, value2, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpicNotBetween(String value1, String value2) {
            addCriterion("MedPic not between", value1, value2, "medpic");
            return (Criteria) this;
        }

        public Criteria andMedpzIsNull() {
            addCriterion("MedPz is null");
            return (Criteria) this;
        }

        public Criteria andMedpzIsNotNull() {
            addCriterion("MedPz is not null");
            return (Criteria) this;
        }

        public Criteria andMedpzEqualTo(String value) {
            addCriterion("MedPz =", value, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzNotEqualTo(String value) {
            addCriterion("MedPz <>", value, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzGreaterThan(String value) {
            addCriterion("MedPz >", value, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzGreaterThanOrEqualTo(String value) {
            addCriterion("MedPz >=", value, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzLessThan(String value) {
            addCriterion("MedPz <", value, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzLessThanOrEqualTo(String value) {
            addCriterion("MedPz <=", value, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzLike(String value) {
            addCriterion("MedPz like", value, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzNotLike(String value) {
            addCriterion("MedPz not like", value, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzIn(List<String> values) {
            addCriterion("MedPz in", values, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzNotIn(List<String> values) {
            addCriterion("MedPz not in", values, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzBetween(String value1, String value2) {
            addCriterion("MedPz between", value1, value2, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedpzNotBetween(String value1, String value2) {
            addCriterion("MedPz not between", value1, value2, "medpz");
            return (Criteria) this;
        }

        public Criteria andMedjkIsNull() {
            addCriterion("MedJk is null");
            return (Criteria) this;
        }

        public Criteria andMedjkIsNotNull() {
            addCriterion("MedJk is not null");
            return (Criteria) this;
        }

        public Criteria andMedjkEqualTo(Integer value) {
            addCriterion("MedJk =", value, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkNotEqualTo(Integer value) {
            addCriterion("MedJk <>", value, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkGreaterThan(Integer value) {
            addCriterion("MedJk >", value, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedJk >=", value, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkLessThan(Integer value) {
            addCriterion("MedJk <", value, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkLessThanOrEqualTo(Integer value) {
            addCriterion("MedJk <=", value, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkIn(List<Integer> values) {
            addCriterion("MedJk in", values, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkNotIn(List<Integer> values) {
            addCriterion("MedJk not in", values, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkBetween(Integer value1, Integer value2) {
            addCriterion("MedJk between", value1, value2, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedjkNotBetween(Integer value1, Integer value2) {
            addCriterion("MedJk not between", value1, value2, "medjk");
            return (Criteria) this;
        }

        public Criteria andMedzlIsNull() {
            addCriterion("MedZl is null");
            return (Criteria) this;
        }

        public Criteria andMedzlIsNotNull() {
            addCriterion("MedZl is not null");
            return (Criteria) this;
        }

        public Criteria andMedzlEqualTo(String value) {
            addCriterion("MedZl =", value, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlNotEqualTo(String value) {
            addCriterion("MedZl <>", value, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlGreaterThan(String value) {
            addCriterion("MedZl >", value, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlGreaterThanOrEqualTo(String value) {
            addCriterion("MedZl >=", value, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlLessThan(String value) {
            addCriterion("MedZl <", value, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlLessThanOrEqualTo(String value) {
            addCriterion("MedZl <=", value, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlLike(String value) {
            addCriterion("MedZl like", value, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlNotLike(String value) {
            addCriterion("MedZl not like", value, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlIn(List<String> values) {
            addCriterion("MedZl in", values, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlNotIn(List<String> values) {
            addCriterion("MedZl not in", values, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlBetween(String value1, String value2) {
            addCriterion("MedZl between", value1, value2, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedzlNotBetween(String value1, String value2) {
            addCriterion("MedZl not between", value1, value2, "medzl");
            return (Criteria) this;
        }

        public Criteria andMedaboutIsNull() {
            addCriterion("MedAbout is null");
            return (Criteria) this;
        }

        public Criteria andMedaboutIsNotNull() {
            addCriterion("MedAbout is not null");
            return (Criteria) this;
        }

        public Criteria andMedaboutEqualTo(String value) {
            addCriterion("MedAbout =", value, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutNotEqualTo(String value) {
            addCriterion("MedAbout <>", value, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutGreaterThan(String value) {
            addCriterion("MedAbout >", value, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutGreaterThanOrEqualTo(String value) {
            addCriterion("MedAbout >=", value, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutLessThan(String value) {
            addCriterion("MedAbout <", value, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutLessThanOrEqualTo(String value) {
            addCriterion("MedAbout <=", value, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutLike(String value) {
            addCriterion("MedAbout like", value, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutNotLike(String value) {
            addCriterion("MedAbout not like", value, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutIn(List<String> values) {
            addCriterion("MedAbout in", values, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutNotIn(List<String> values) {
            addCriterion("MedAbout not in", values, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutBetween(String value1, String value2) {
            addCriterion("MedAbout between", value1, value2, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedaboutNotBetween(String value1, String value2) {
            addCriterion("MedAbout not between", value1, value2, "medabout");
            return (Criteria) this;
        }

        public Criteria andMedstateIsNull() {
            addCriterion("MedState is null");
            return (Criteria) this;
        }

        public Criteria andMedstateIsNotNull() {
            addCriterion("MedState is not null");
            return (Criteria) this;
        }

        public Criteria andMedstateEqualTo(Integer value) {
            addCriterion("MedState =", value, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateNotEqualTo(Integer value) {
            addCriterion("MedState <>", value, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateGreaterThan(Integer value) {
            addCriterion("MedState >", value, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedState >=", value, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateLessThan(Integer value) {
            addCriterion("MedState <", value, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateLessThanOrEqualTo(Integer value) {
            addCriterion("MedState <=", value, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateIn(List<Integer> values) {
            addCriterion("MedState in", values, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateNotIn(List<Integer> values) {
            addCriterion("MedState not in", values, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateBetween(Integer value1, Integer value2) {
            addCriterion("MedState between", value1, value2, "medstate");
            return (Criteria) this;
        }

        public Criteria andMedstateNotBetween(Integer value1, Integer value2) {
            addCriterion("MedState not between", value1, value2, "medstate");
            return (Criteria) this;
        }

        public Criteria andMeddwIsNull() {
            addCriterion("MedDw is null");
            return (Criteria) this;
        }

        public Criteria andMeddwIsNotNull() {
            addCriterion("MedDw is not null");
            return (Criteria) this;
        }

        public Criteria andMeddwEqualTo(String value) {
            addCriterion("MedDw =", value, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwNotEqualTo(String value) {
            addCriterion("MedDw <>", value, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwGreaterThan(String value) {
            addCriterion("MedDw >", value, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwGreaterThanOrEqualTo(String value) {
            addCriterion("MedDw >=", value, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwLessThan(String value) {
            addCriterion("MedDw <", value, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwLessThanOrEqualTo(String value) {
            addCriterion("MedDw <=", value, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwLike(String value) {
            addCriterion("MedDw like", value, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwNotLike(String value) {
            addCriterion("MedDw not like", value, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwIn(List<String> values) {
            addCriterion("MedDw in", values, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwNotIn(List<String> values) {
            addCriterion("MedDw not in", values, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwBetween(String value1, String value2) {
            addCriterion("MedDw between", value1, value2, "meddw");
            return (Criteria) this;
        }

        public Criteria andMeddwNotBetween(String value1, String value2) {
            addCriterion("MedDw not between", value1, value2, "meddw");
            return (Criteria) this;
        }

        public Criteria andMedggIsNull() {
            addCriterion("MedGg is null");
            return (Criteria) this;
        }

        public Criteria andMedggIsNotNull() {
            addCriterion("MedGg is not null");
            return (Criteria) this;
        }

        public Criteria andMedggEqualTo(String value) {
            addCriterion("MedGg =", value, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggNotEqualTo(String value) {
            addCriterion("MedGg <>", value, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggGreaterThan(String value) {
            addCriterion("MedGg >", value, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggGreaterThanOrEqualTo(String value) {
            addCriterion("MedGg >=", value, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggLessThan(String value) {
            addCriterion("MedGg <", value, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggLessThanOrEqualTo(String value) {
            addCriterion("MedGg <=", value, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggLike(String value) {
            addCriterion("MedGg like", value, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggNotLike(String value) {
            addCriterion("MedGg not like", value, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggIn(List<String> values) {
            addCriterion("MedGg in", values, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggNotIn(List<String> values) {
            addCriterion("MedGg not in", values, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggBetween(String value1, String value2) {
            addCriterion("MedGg between", value1, value2, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedggNotBetween(String value1, String value2) {
            addCriterion("MedGg not between", value1, value2, "medgg");
            return (Criteria) this;
        }

        public Criteria andMedjxIsNull() {
            addCriterion("MedJx is null");
            return (Criteria) this;
        }

        public Criteria andMedjxIsNotNull() {
            addCriterion("MedJx is not null");
            return (Criteria) this;
        }

        public Criteria andMedjxEqualTo(String value) {
            addCriterion("MedJx =", value, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxNotEqualTo(String value) {
            addCriterion("MedJx <>", value, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxGreaterThan(String value) {
            addCriterion("MedJx >", value, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxGreaterThanOrEqualTo(String value) {
            addCriterion("MedJx >=", value, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxLessThan(String value) {
            addCriterion("MedJx <", value, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxLessThanOrEqualTo(String value) {
            addCriterion("MedJx <=", value, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxLike(String value) {
            addCriterion("MedJx like", value, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxNotLike(String value) {
            addCriterion("MedJx not like", value, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxIn(List<String> values) {
            addCriterion("MedJx in", values, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxNotIn(List<String> values) {
            addCriterion("MedJx not in", values, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxBetween(String value1, String value2) {
            addCriterion("MedJx between", value1, value2, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedjxNotBetween(String value1, String value2) {
            addCriterion("MedJx not between", value1, value2, "medjx");
            return (Criteria) this;
        }

        public Criteria andMedclassIsNull() {
            addCriterion("MedClass is null");
            return (Criteria) this;
        }

        public Criteria andMedclassIsNotNull() {
            addCriterion("MedClass is not null");
            return (Criteria) this;
        }

        public Criteria andMedclassEqualTo(Integer value) {
            addCriterion("MedClass =", value, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassNotEqualTo(Integer value) {
            addCriterion("MedClass <>", value, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassGreaterThan(Integer value) {
            addCriterion("MedClass >", value, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedClass >=", value, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassLessThan(Integer value) {
            addCriterion("MedClass <", value, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassLessThanOrEqualTo(Integer value) {
            addCriterion("MedClass <=", value, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassIn(List<Integer> values) {
            addCriterion("MedClass in", values, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassNotIn(List<Integer> values) {
            addCriterion("MedClass not in", values, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassBetween(Integer value1, Integer value2) {
            addCriterion("MedClass between", value1, value2, "medclass");
            return (Criteria) this;
        }

        public Criteria andMedclassNotBetween(Integer value1, Integer value2) {
            addCriterion("MedClass not between", value1, value2, "medclass");
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