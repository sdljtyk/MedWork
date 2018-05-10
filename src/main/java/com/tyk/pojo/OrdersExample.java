package com.tyk.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrdersExample() {
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

        public Criteria andOrdercreatepersonIsNull() {
            addCriterion("OrderCreatePerson is null");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonIsNotNull() {
            addCriterion("OrderCreatePerson is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonEqualTo(String value) {
            addCriterion("OrderCreatePerson =", value, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonNotEqualTo(String value) {
            addCriterion("OrderCreatePerson <>", value, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonGreaterThan(String value) {
            addCriterion("OrderCreatePerson >", value, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("OrderCreatePerson >=", value, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonLessThan(String value) {
            addCriterion("OrderCreatePerson <", value, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonLessThanOrEqualTo(String value) {
            addCriterion("OrderCreatePerson <=", value, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonLike(String value) {
            addCriterion("OrderCreatePerson like", value, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonNotLike(String value) {
            addCriterion("OrderCreatePerson not like", value, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonIn(List<String> values) {
            addCriterion("OrderCreatePerson in", values, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonNotIn(List<String> values) {
            addCriterion("OrderCreatePerson not in", values, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonBetween(String value1, String value2) {
            addCriterion("OrderCreatePerson between", value1, value2, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrdercreatepersonNotBetween(String value1, String value2) {
            addCriterion("OrderCreatePerson not between", value1, value2, "ordercreateperson");
            return (Criteria) this;
        }

        public Criteria andOrderctimeIsNull() {
            addCriterion("OrderCtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderctimeIsNotNull() {
            addCriterion("OrderCtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderctimeEqualTo(String value) {
            addCriterion("OrderCtime =", value, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeNotEqualTo(String value) {
            addCriterion("OrderCtime <>", value, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeGreaterThan(String value) {
            addCriterion("OrderCtime >", value, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderCtime >=", value, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeLessThan(String value) {
            addCriterion("OrderCtime <", value, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeLessThanOrEqualTo(String value) {
            addCriterion("OrderCtime <=", value, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeLike(String value) {
            addCriterion("OrderCtime like", value, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeNotLike(String value) {
            addCriterion("OrderCtime not like", value, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeIn(List<String> values) {
            addCriterion("OrderCtime in", values, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeNotIn(List<String> values) {
            addCriterion("OrderCtime not in", values, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeBetween(String value1, String value2) {
            addCriterion("OrderCtime between", value1, value2, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrderctimeNotBetween(String value1, String value2) {
            addCriterion("OrderCtime not between", value1, value2, "orderctime");
            return (Criteria) this;
        }

        public Criteria andOrdersubIsNull() {
            addCriterion("OrderSub is null");
            return (Criteria) this;
        }

        public Criteria andOrdersubIsNotNull() {
            addCriterion("OrderSub is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersubEqualTo(String value) {
            addCriterion("OrderSub =", value, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubNotEqualTo(String value) {
            addCriterion("OrderSub <>", value, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubGreaterThan(String value) {
            addCriterion("OrderSub >", value, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubGreaterThanOrEqualTo(String value) {
            addCriterion("OrderSub >=", value, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubLessThan(String value) {
            addCriterion("OrderSub <", value, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubLessThanOrEqualTo(String value) {
            addCriterion("OrderSub <=", value, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubLike(String value) {
            addCriterion("OrderSub like", value, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubNotLike(String value) {
            addCriterion("OrderSub not like", value, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubIn(List<String> values) {
            addCriterion("OrderSub in", values, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubNotIn(List<String> values) {
            addCriterion("OrderSub not in", values, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubBetween(String value1, String value2) {
            addCriterion("OrderSub between", value1, value2, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrdersubNotBetween(String value1, String value2) {
            addCriterion("OrderSub not between", value1, value2, "ordersub");
            return (Criteria) this;
        }

        public Criteria andOrderotherIsNull() {
            addCriterion("OrderOther is null");
            return (Criteria) this;
        }

        public Criteria andOrderotherIsNotNull() {
            addCriterion("OrderOther is not null");
            return (Criteria) this;
        }

        public Criteria andOrderotherEqualTo(String value) {
            addCriterion("OrderOther =", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherNotEqualTo(String value) {
            addCriterion("OrderOther <>", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherGreaterThan(String value) {
            addCriterion("OrderOther >", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherGreaterThanOrEqualTo(String value) {
            addCriterion("OrderOther >=", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherLessThan(String value) {
            addCriterion("OrderOther <", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherLessThanOrEqualTo(String value) {
            addCriterion("OrderOther <=", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherLike(String value) {
            addCriterion("OrderOther like", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherNotLike(String value) {
            addCriterion("OrderOther not like", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherIn(List<String> values) {
            addCriterion("OrderOther in", values, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherNotIn(List<String> values) {
            addCriterion("OrderOther not in", values, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherBetween(String value1, String value2) {
            addCriterion("OrderOther between", value1, value2, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherNotBetween(String value1, String value2) {
            addCriterion("OrderOther not between", value1, value2, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("OrderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("OrderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Integer value) {
            addCriterion("OrderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Integer value) {
            addCriterion("OrderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Integer value) {
            addCriterion("OrderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Integer value) {
            addCriterion("OrderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("OrderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Integer> values) {
            addCriterion("OrderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Integer> values) {
            addCriterion("OrderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("OrderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderState not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderadviceIsNull() {
            addCriterion("OrderAdvice is null");
            return (Criteria) this;
        }

        public Criteria andOrderadviceIsNotNull() {
            addCriterion("OrderAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderadviceEqualTo(String value) {
            addCriterion("OrderAdvice =", value, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceNotEqualTo(String value) {
            addCriterion("OrderAdvice <>", value, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceGreaterThan(String value) {
            addCriterion("OrderAdvice >", value, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceGreaterThanOrEqualTo(String value) {
            addCriterion("OrderAdvice >=", value, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceLessThan(String value) {
            addCriterion("OrderAdvice <", value, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceLessThanOrEqualTo(String value) {
            addCriterion("OrderAdvice <=", value, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceLike(String value) {
            addCriterion("OrderAdvice like", value, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceNotLike(String value) {
            addCriterion("OrderAdvice not like", value, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceIn(List<String> values) {
            addCriterion("OrderAdvice in", values, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceNotIn(List<String> values) {
            addCriterion("OrderAdvice not in", values, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceBetween(String value1, String value2) {
            addCriterion("OrderAdvice between", value1, value2, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderadviceNotBetween(String value1, String value2) {
            addCriterion("OrderAdvice not between", value1, value2, "orderadvice");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeIsNull() {
            addCriterion("OrderWatime is null");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeIsNotNull() {
            addCriterion("OrderWatime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeEqualTo(String value) {
            addCriterion("OrderWatime =", value, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeNotEqualTo(String value) {
            addCriterion("OrderWatime <>", value, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeGreaterThan(String value) {
            addCriterion("OrderWatime >", value, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderWatime >=", value, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeLessThan(String value) {
            addCriterion("OrderWatime <", value, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeLessThanOrEqualTo(String value) {
            addCriterion("OrderWatime <=", value, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeLike(String value) {
            addCriterion("OrderWatime like", value, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeNotLike(String value) {
            addCriterion("OrderWatime not like", value, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeIn(List<String> values) {
            addCriterion("OrderWatime in", values, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeNotIn(List<String> values) {
            addCriterion("OrderWatime not in", values, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeBetween(String value1, String value2) {
            addCriterion("OrderWatime between", value1, value2, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderwatimeNotBetween(String value1, String value2) {
            addCriterion("OrderWatime not between", value1, value2, "orderwatime");
            return (Criteria) this;
        }

        public Criteria andOrderphoneIsNull() {
            addCriterion("OrderPhone is null");
            return (Criteria) this;
        }

        public Criteria andOrderphoneIsNotNull() {
            addCriterion("OrderPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderphoneEqualTo(String value) {
            addCriterion("OrderPhone =", value, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneNotEqualTo(String value) {
            addCriterion("OrderPhone <>", value, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneGreaterThan(String value) {
            addCriterion("OrderPhone >", value, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneGreaterThanOrEqualTo(String value) {
            addCriterion("OrderPhone >=", value, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneLessThan(String value) {
            addCriterion("OrderPhone <", value, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneLessThanOrEqualTo(String value) {
            addCriterion("OrderPhone <=", value, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneLike(String value) {
            addCriterion("OrderPhone like", value, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneNotLike(String value) {
            addCriterion("OrderPhone not like", value, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneIn(List<String> values) {
            addCriterion("OrderPhone in", values, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneNotIn(List<String> values) {
            addCriterion("OrderPhone not in", values, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneBetween(String value1, String value2) {
            addCriterion("OrderPhone between", value1, value2, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrderphoneNotBetween(String value1, String value2) {
            addCriterion("OrderPhone not between", value1, value2, "orderphone");
            return (Criteria) this;
        }

        public Criteria andOrdernameIsNull() {
            addCriterion("OrderName is null");
            return (Criteria) this;
        }

        public Criteria andOrdernameIsNotNull() {
            addCriterion("OrderName is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernameEqualTo(String value) {
            addCriterion("OrderName =", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotEqualTo(String value) {
            addCriterion("OrderName <>", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameGreaterThan(String value) {
            addCriterion("OrderName >", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameGreaterThanOrEqualTo(String value) {
            addCriterion("OrderName >=", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLessThan(String value) {
            addCriterion("OrderName <", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLessThanOrEqualTo(String value) {
            addCriterion("OrderName <=", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLike(String value) {
            addCriterion("OrderName like", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotLike(String value) {
            addCriterion("OrderName not like", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameIn(List<String> values) {
            addCriterion("OrderName in", values, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotIn(List<String> values) {
            addCriterion("OrderName not in", values, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameBetween(String value1, String value2) {
            addCriterion("OrderName between", value1, value2, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotBetween(String value1, String value2) {
            addCriterion("OrderName not between", value1, value2, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("OrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("OrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("OrderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("OrderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("OrderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("OrderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("OrderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("OrderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("OrderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("OrderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("OrderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("OrderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("OrderNumber not between", value1, value2, "ordernumber");
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