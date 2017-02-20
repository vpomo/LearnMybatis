package com.vpomo.shedule.model;

import java.util.ArrayList;
import java.util.List;

public class FacultyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FacultyExample() {
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

        public Criteria andId_facultyIsNull() {
            addCriterion("id_faculty is null");
            return (Criteria) this;
        }

        public Criteria andId_facultyIsNotNull() {
            addCriterion("id_faculty is not null");
            return (Criteria) this;
        }

        public Criteria andId_facultyEqualTo(Integer value) {
            addCriterion("id_faculty =", value, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyNotEqualTo(Integer value) {
            addCriterion("id_faculty <>", value, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyGreaterThan(Integer value) {
            addCriterion("id_faculty >", value, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_faculty >=", value, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyLessThan(Integer value) {
            addCriterion("id_faculty <", value, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyLessThanOrEqualTo(Integer value) {
            addCriterion("id_faculty <=", value, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyIn(List<Integer> values) {
            addCriterion("id_faculty in", values, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyNotIn(List<Integer> values) {
            addCriterion("id_faculty not in", values, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyBetween(Integer value1, Integer value2) {
            addCriterion("id_faculty between", value1, value2, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andId_facultyNotBetween(Integer value1, Integer value2) {
            addCriterion("id_faculty not between", value1, value2, "id_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyIsNull() {
            addCriterion("name_faculty is null");
            return (Criteria) this;
        }

        public Criteria andName_facultyIsNotNull() {
            addCriterion("name_faculty is not null");
            return (Criteria) this;
        }

        public Criteria andName_facultyEqualTo(String value) {
            addCriterion("name_faculty =", value, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyNotEqualTo(String value) {
            addCriterion("name_faculty <>", value, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyGreaterThan(String value) {
            addCriterion("name_faculty >", value, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyGreaterThanOrEqualTo(String value) {
            addCriterion("name_faculty >=", value, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyLessThan(String value) {
            addCriterion("name_faculty <", value, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyLessThanOrEqualTo(String value) {
            addCriterion("name_faculty <=", value, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyLike(String value) {
            addCriterion("name_faculty like", value, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyNotLike(String value) {
            addCriterion("name_faculty not like", value, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyIn(List<String> values) {
            addCriterion("name_faculty in", values, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyNotIn(List<String> values) {
            addCriterion("name_faculty not in", values, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyBetween(String value1, String value2) {
            addCriterion("name_faculty between", value1, value2, "name_faculty");
            return (Criteria) this;
        }

        public Criteria andName_facultyNotBetween(String value1, String value2) {
            addCriterion("name_faculty not between", value1, value2, "name_faculty");
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