package com.vpomo.shedule.model;

import java.util.ArrayList;
import java.util.List;

public class SheduleGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SheduleGroupExample() {
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

        public Criteria andId_groupIsNull() {
            addCriterion("id_group is null");
            return (Criteria) this;
        }

        public Criteria andId_groupIsNotNull() {
            addCriterion("id_group is not null");
            return (Criteria) this;
        }

        public Criteria andId_groupEqualTo(Integer value) {
            addCriterion("id_group =", value, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupNotEqualTo(Integer value) {
            addCriterion("id_group <>", value, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupGreaterThan(Integer value) {
            addCriterion("id_group >", value, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_group >=", value, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupLessThan(Integer value) {
            addCriterion("id_group <", value, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupLessThanOrEqualTo(Integer value) {
            addCriterion("id_group <=", value, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupIn(List<Integer> values) {
            addCriterion("id_group in", values, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupNotIn(List<Integer> values) {
            addCriterion("id_group not in", values, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupBetween(Integer value1, Integer value2) {
            addCriterion("id_group between", value1, value2, "id_group");
            return (Criteria) this;
        }

        public Criteria andId_groupNotBetween(Integer value1, Integer value2) {
            addCriterion("id_group not between", value1, value2, "id_group");
            return (Criteria) this;
        }

        public Criteria andFaculty_idIsNull() {
            addCriterion("faculty_id is null");
            return (Criteria) this;
        }

        public Criteria andFaculty_idIsNotNull() {
            addCriterion("faculty_id is not null");
            return (Criteria) this;
        }

        public Criteria andFaculty_idEqualTo(Integer value) {
            addCriterion("faculty_id =", value, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idNotEqualTo(Integer value) {
            addCriterion("faculty_id <>", value, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idGreaterThan(Integer value) {
            addCriterion("faculty_id >", value, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("faculty_id >=", value, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idLessThan(Integer value) {
            addCriterion("faculty_id <", value, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idLessThanOrEqualTo(Integer value) {
            addCriterion("faculty_id <=", value, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idIn(List<Integer> values) {
            addCriterion("faculty_id in", values, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idNotIn(List<Integer> values) {
            addCriterion("faculty_id not in", values, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idBetween(Integer value1, Integer value2) {
            addCriterion("faculty_id between", value1, value2, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andFaculty_idNotBetween(Integer value1, Integer value2) {
            addCriterion("faculty_id not between", value1, value2, "faculty_id");
            return (Criteria) this;
        }

        public Criteria andName_groupIsNull() {
            addCriterion("name_group is null");
            return (Criteria) this;
        }

        public Criteria andName_groupIsNotNull() {
            addCriterion("name_group is not null");
            return (Criteria) this;
        }

        public Criteria andName_groupEqualTo(String value) {
            addCriterion("name_group =", value, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupNotEqualTo(String value) {
            addCriterion("name_group <>", value, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupGreaterThan(String value) {
            addCriterion("name_group >", value, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupGreaterThanOrEqualTo(String value) {
            addCriterion("name_group >=", value, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupLessThan(String value) {
            addCriterion("name_group <", value, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupLessThanOrEqualTo(String value) {
            addCriterion("name_group <=", value, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupLike(String value) {
            addCriterion("name_group like", value, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupNotLike(String value) {
            addCriterion("name_group not like", value, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupIn(List<String> values) {
            addCriterion("name_group in", values, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupNotIn(List<String> values) {
            addCriterion("name_group not in", values, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupBetween(String value1, String value2) {
            addCriterion("name_group between", value1, value2, "name_group");
            return (Criteria) this;
        }

        public Criteria andName_groupNotBetween(String value1, String value2) {
            addCriterion("name_group not between", value1, value2, "name_group");
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