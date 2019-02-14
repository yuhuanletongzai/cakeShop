package com.xzy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDetailsExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdIsNull() {
            addCriterion("product_kinds_id is null");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdIsNotNull() {
            addCriterion("product_kinds_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdEqualTo(Long value) {
            addCriterion("product_kinds_id =", value, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdNotEqualTo(Long value) {
            addCriterion("product_kinds_id <>", value, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdGreaterThan(Long value) {
            addCriterion("product_kinds_id >", value, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_kinds_id >=", value, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdLessThan(Long value) {
            addCriterion("product_kinds_id <", value, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdLessThanOrEqualTo(Long value) {
            addCriterion("product_kinds_id <=", value, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdIn(List<Long> values) {
            addCriterion("product_kinds_id in", values, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdNotIn(List<Long> values) {
            addCriterion("product_kinds_id not in", values, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdBetween(Long value1, Long value2) {
            addCriterion("product_kinds_id between", value1, value2, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andProductKindsIdNotBetween(Long value1, Long value2) {
            addCriterion("product_kinds_id not between", value1, value2, "productKindsId");
            return (Criteria) this;
        }

        public Criteria andRelishIsNull() {
            addCriterion("relish is null");
            return (Criteria) this;
        }

        public Criteria andRelishIsNotNull() {
            addCriterion("relish is not null");
            return (Criteria) this;
        }

        public Criteria andRelishEqualTo(Integer value) {
            addCriterion("relish =", value, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishNotEqualTo(Integer value) {
            addCriterion("relish <>", value, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishGreaterThan(Integer value) {
            addCriterion("relish >", value, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishGreaterThanOrEqualTo(Integer value) {
            addCriterion("relish >=", value, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishLessThan(Integer value) {
            addCriterion("relish <", value, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishLessThanOrEqualTo(Integer value) {
            addCriterion("relish <=", value, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishIn(List<Integer> values) {
            addCriterion("relish in", values, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishNotIn(List<Integer> values) {
            addCriterion("relish not in", values, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishBetween(Integer value1, Integer value2) {
            addCriterion("relish between", value1, value2, "relish");
            return (Criteria) this;
        }

        public Criteria andRelishNotBetween(Integer value1, Integer value2) {
            addCriterion("relish not between", value1, value2, "relish");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andSellnumIsNull() {
            addCriterion("sellnum is null");
            return (Criteria) this;
        }

        public Criteria andSellnumIsNotNull() {
            addCriterion("sellnum is not null");
            return (Criteria) this;
        }

        public Criteria andSellnumEqualTo(Integer value) {
            addCriterion("sellnum =", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotEqualTo(Integer value) {
            addCriterion("sellnum <>", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumGreaterThan(Integer value) {
            addCriterion("sellnum >", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellnum >=", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumLessThan(Integer value) {
            addCriterion("sellnum <", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumLessThanOrEqualTo(Integer value) {
            addCriterion("sellnum <=", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumIn(List<Integer> values) {
            addCriterion("sellnum in", values, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotIn(List<Integer> values) {
            addCriterion("sellnum not in", values, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumBetween(Integer value1, Integer value2) {
            addCriterion("sellnum between", value1, value2, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sellnum not between", value1, value2, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSizesIsNull() {
            addCriterion("sizes is null");
            return (Criteria) this;
        }

        public Criteria andSizesIsNotNull() {
            addCriterion("sizes is not null");
            return (Criteria) this;
        }

        public Criteria andSizesEqualTo(Integer value) {
            addCriterion("sizes =", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotEqualTo(Integer value) {
            addCriterion("sizes <>", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesGreaterThan(Integer value) {
            addCriterion("sizes >", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sizes >=", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesLessThan(Integer value) {
            addCriterion("sizes <", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesLessThanOrEqualTo(Integer value) {
            addCriterion("sizes <=", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesIn(List<Integer> values) {
            addCriterion("sizes in", values, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotIn(List<Integer> values) {
            addCriterion("sizes not in", values, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesBetween(Integer value1, Integer value2) {
            addCriterion("sizes between", value1, value2, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotBetween(Integer value1, Integer value2) {
            addCriterion("sizes not between", value1, value2, "sizes");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIsNull() {
            addCriterion("advertisement is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIsNotNull() {
            addCriterion("advertisement is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementEqualTo(String value) {
            addCriterion("advertisement =", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNotEqualTo(String value) {
            addCriterion("advertisement <>", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementGreaterThan(String value) {
            addCriterion("advertisement >", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement >=", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLessThan(String value) {
            addCriterion("advertisement <", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLessThanOrEqualTo(String value) {
            addCriterion("advertisement <=", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLike(String value) {
            addCriterion("advertisement like", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNotLike(String value) {
            addCriterion("advertisement not like", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIn(List<String> values) {
            addCriterion("advertisement in", values, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNotIn(List<String> values) {
            addCriterion("advertisement not in", values, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementBetween(String value1, String value2) {
            addCriterion("advertisement between", value1, value2, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNotBetween(String value1, String value2) {
            addCriterion("advertisement not between", value1, value2, "advertisement");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

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