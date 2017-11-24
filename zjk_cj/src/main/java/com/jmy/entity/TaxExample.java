package com.jmy.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TaxExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public TaxExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
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
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andYingysIsNull() {
			addCriterion("yingys is null");
			return (Criteria) this;
		}

		public Criteria andYingysIsNotNull() {
			addCriterion("yingys is not null");
			return (Criteria) this;
		}

		public Criteria andYingysEqualTo(BigDecimal value) {
			addCriterion("yingys =", value, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysNotEqualTo(BigDecimal value) {
			addCriterion("yingys <>", value, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysGreaterThan(BigDecimal value) {
			addCriterion("yingys >", value, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("yingys >=", value, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysLessThan(BigDecimal value) {
			addCriterion("yingys <", value, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysLessThanOrEqualTo(BigDecimal value) {
			addCriterion("yingys <=", value, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysIn(List<BigDecimal> values) {
			addCriterion("yingys in", values, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysNotIn(List<BigDecimal> values) {
			addCriterion("yingys not in", values, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("yingys between", value1, value2, "yingys");
			return (Criteria) this;
		}

		public Criteria andYingysNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("yingys not between", value1, value2, "yingys");
			return (Criteria) this;
		}

		public Criteria andQysdsIsNull() {
			addCriterion("qysds is null");
			return (Criteria) this;
		}

		public Criteria andQysdsIsNotNull() {
			addCriterion("qysds is not null");
			return (Criteria) this;
		}

		public Criteria andQysdsEqualTo(BigDecimal value) {
			addCriterion("qysds =", value, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsNotEqualTo(BigDecimal value) {
			addCriterion("qysds <>", value, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsGreaterThan(BigDecimal value) {
			addCriterion("qysds >", value, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("qysds >=", value, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsLessThan(BigDecimal value) {
			addCriterion("qysds <", value, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("qysds <=", value, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsIn(List<BigDecimal> values) {
			addCriterion("qysds in", values, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsNotIn(List<BigDecimal> values) {
			addCriterion("qysds not in", values, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("qysds between", value1, value2, "qysds");
			return (Criteria) this;
		}

		public Criteria andQysdsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("qysds not between", value1, value2, "qysds");
			return (Criteria) this;
		}

		public Criteria andGrsdsIsNull() {
			addCriterion("grsds is null");
			return (Criteria) this;
		}

		public Criteria andGrsdsIsNotNull() {
			addCriterion("grsds is not null");
			return (Criteria) this;
		}

		public Criteria andGrsdsEqualTo(BigDecimal value) {
			addCriterion("grsds =", value, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsNotEqualTo(BigDecimal value) {
			addCriterion("grsds <>", value, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsGreaterThan(BigDecimal value) {
			addCriterion("grsds >", value, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("grsds >=", value, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsLessThan(BigDecimal value) {
			addCriterion("grsds <", value, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("grsds <=", value, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsIn(List<BigDecimal> values) {
			addCriterion("grsds in", values, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsNotIn(List<BigDecimal> values) {
			addCriterion("grsds not in", values, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("grsds between", value1, value2, "grsds");
			return (Criteria) this;
		}

		public Criteria andGrsdsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("grsds not between", value1, value2, "grsds");
			return (Criteria) this;
		}

		public Criteria andZysIsNull() {
			addCriterion("zys is null");
			return (Criteria) this;
		}

		public Criteria andZysIsNotNull() {
			addCriterion("zys is not null");
			return (Criteria) this;
		}

		public Criteria andZysEqualTo(BigDecimal value) {
			addCriterion("zys =", value, "zys");
			return (Criteria) this;
		}

		public Criteria andZysNotEqualTo(BigDecimal value) {
			addCriterion("zys <>", value, "zys");
			return (Criteria) this;
		}

		public Criteria andZysGreaterThan(BigDecimal value) {
			addCriterion("zys >", value, "zys");
			return (Criteria) this;
		}

		public Criteria andZysGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("zys >=", value, "zys");
			return (Criteria) this;
		}

		public Criteria andZysLessThan(BigDecimal value) {
			addCriterion("zys <", value, "zys");
			return (Criteria) this;
		}

		public Criteria andZysLessThanOrEqualTo(BigDecimal value) {
			addCriterion("zys <=", value, "zys");
			return (Criteria) this;
		}

		public Criteria andZysIn(List<BigDecimal> values) {
			addCriterion("zys in", values, "zys");
			return (Criteria) this;
		}

		public Criteria andZysNotIn(List<BigDecimal> values) {
			addCriterion("zys not in", values, "zys");
			return (Criteria) this;
		}

		public Criteria andZysBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("zys between", value1, value2, "zys");
			return (Criteria) this;
		}

		public Criteria andZysNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("zys not between", value1, value2, "zys");
			return (Criteria) this;
		}

		public Criteria andYjsIsNull() {
			addCriterion("yjs is null");
			return (Criteria) this;
		}

		public Criteria andYjsIsNotNull() {
			addCriterion("yjs is not null");
			return (Criteria) this;
		}

		public Criteria andYjsEqualTo(BigDecimal value) {
			addCriterion("yjs =", value, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsNotEqualTo(BigDecimal value) {
			addCriterion("yjs <>", value, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsGreaterThan(BigDecimal value) {
			addCriterion("yjs >", value, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("yjs >=", value, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsLessThan(BigDecimal value) {
			addCriterion("yjs <", value, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("yjs <=", value, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsIn(List<BigDecimal> values) {
			addCriterion("yjs in", values, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsNotIn(List<BigDecimal> values) {
			addCriterion("yjs not in", values, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("yjs between", value1, value2, "yjs");
			return (Criteria) this;
		}

		public Criteria andYjsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("yjs not between", value1, value2, "yjs");
			return (Criteria) this;
		}

		public Criteria andFcsIsNull() {
			addCriterion("fcs is null");
			return (Criteria) this;
		}

		public Criteria andFcsIsNotNull() {
			addCriterion("fcs is not null");
			return (Criteria) this;
		}

		public Criteria andFcsEqualTo(BigDecimal value) {
			addCriterion("fcs =", value, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsNotEqualTo(BigDecimal value) {
			addCriterion("fcs <>", value, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsGreaterThan(BigDecimal value) {
			addCriterion("fcs >", value, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("fcs >=", value, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsLessThan(BigDecimal value) {
			addCriterion("fcs <", value, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("fcs <=", value, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsIn(List<BigDecimal> values) {
			addCriterion("fcs in", values, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsNotIn(List<BigDecimal> values) {
			addCriterion("fcs not in", values, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fcs between", value1, value2, "fcs");
			return (Criteria) this;
		}

		public Criteria andFcsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fcs not between", value1, value2, "fcs");
			return (Criteria) this;
		}

		public Criteria andYhsIsNull() {
			addCriterion("yhs is null");
			return (Criteria) this;
		}

		public Criteria andYhsIsNotNull() {
			addCriterion("yhs is not null");
			return (Criteria) this;
		}

		public Criteria andYhsEqualTo(BigDecimal value) {
			addCriterion("yhs =", value, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsNotEqualTo(BigDecimal value) {
			addCriterion("yhs <>", value, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsGreaterThan(BigDecimal value) {
			addCriterion("yhs >", value, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("yhs >=", value, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsLessThan(BigDecimal value) {
			addCriterion("yhs <", value, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("yhs <=", value, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsIn(List<BigDecimal> values) {
			addCriterion("yhs in", values, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsNotIn(List<BigDecimal> values) {
			addCriterion("yhs not in", values, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("yhs between", value1, value2, "yhs");
			return (Criteria) this;
		}

		public Criteria andYhsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("yhs not between", value1, value2, "yhs");
			return (Criteria) this;
		}

		public Criteria andTdsysIsNull() {
			addCriterion("tdsys is null");
			return (Criteria) this;
		}

		public Criteria andTdsysIsNotNull() {
			addCriterion("tdsys is not null");
			return (Criteria) this;
		}

		public Criteria andTdsysEqualTo(BigDecimal value) {
			addCriterion("tdsys =", value, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysNotEqualTo(BigDecimal value) {
			addCriterion("tdsys <>", value, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysGreaterThan(BigDecimal value) {
			addCriterion("tdsys >", value, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("tdsys >=", value, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysLessThan(BigDecimal value) {
			addCriterion("tdsys <", value, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysLessThanOrEqualTo(BigDecimal value) {
			addCriterion("tdsys <=", value, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysIn(List<BigDecimal> values) {
			addCriterion("tdsys in", values, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysNotIn(List<BigDecimal> values) {
			addCriterion("tdsys not in", values, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("tdsys between", value1, value2, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdsysNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("tdsys not between", value1, value2, "tdsys");
			return (Criteria) this;
		}

		public Criteria andTdzzsIsNull() {
			addCriterion("tdzzs is null");
			return (Criteria) this;
		}

		public Criteria andTdzzsIsNotNull() {
			addCriterion("tdzzs is not null");
			return (Criteria) this;
		}

		public Criteria andTdzzsEqualTo(BigDecimal value) {
			addCriterion("tdzzs =", value, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsNotEqualTo(BigDecimal value) {
			addCriterion("tdzzs <>", value, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsGreaterThan(BigDecimal value) {
			addCriterion("tdzzs >", value, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("tdzzs >=", value, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsLessThan(BigDecimal value) {
			addCriterion("tdzzs <", value, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("tdzzs <=", value, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsIn(List<BigDecimal> values) {
			addCriterion("tdzzs in", values, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsNotIn(List<BigDecimal> values) {
			addCriterion("tdzzs not in", values, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("tdzzs between", value1, value2, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andTdzzsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("tdzzs not between", value1, value2, "tdzzs");
			return (Criteria) this;
		}

		public Criteria andCcsIsNull() {
			addCriterion("ccs is null");
			return (Criteria) this;
		}

		public Criteria andCcsIsNotNull() {
			addCriterion("ccs is not null");
			return (Criteria) this;
		}

		public Criteria andCcsEqualTo(BigDecimal value) {
			addCriterion("ccs =", value, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsNotEqualTo(BigDecimal value) {
			addCriterion("ccs <>", value, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsGreaterThan(BigDecimal value) {
			addCriterion("ccs >", value, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("ccs >=", value, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsLessThan(BigDecimal value) {
			addCriterion("ccs <", value, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("ccs <=", value, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsIn(List<BigDecimal> values) {
			addCriterion("ccs in", values, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsNotIn(List<BigDecimal> values) {
			addCriterion("ccs not in", values, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("ccs between", value1, value2, "ccs");
			return (Criteria) this;
		}

		public Criteria andCcsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("ccs not between", value1, value2, "ccs");
			return (Criteria) this;
		}

		public Criteria andYanysIsNull() {
			addCriterion("yanys is null");
			return (Criteria) this;
		}

		public Criteria andYanysIsNotNull() {
			addCriterion("yanys is not null");
			return (Criteria) this;
		}

		public Criteria andYanysEqualTo(BigDecimal value) {
			addCriterion("yanys =", value, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysNotEqualTo(BigDecimal value) {
			addCriterion("yanys <>", value, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysGreaterThan(BigDecimal value) {
			addCriterion("yanys >", value, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("yanys >=", value, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysLessThan(BigDecimal value) {
			addCriterion("yanys <", value, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysLessThanOrEqualTo(BigDecimal value) {
			addCriterion("yanys <=", value, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysIn(List<BigDecimal> values) {
			addCriterion("yanys in", values, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysNotIn(List<BigDecimal> values) {
			addCriterion("yanys not in", values, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("yanys between", value1, value2, "yanys");
			return (Criteria) this;
		}

		public Criteria andYanysNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("yanys not between", value1, value2, "yanys");
			return (Criteria) this;
		}

		public Criteria andGdzysIsNull() {
			addCriterion("gdzys is null");
			return (Criteria) this;
		}

		public Criteria andGdzysIsNotNull() {
			addCriterion("gdzys is not null");
			return (Criteria) this;
		}

		public Criteria andGdzysEqualTo(BigDecimal value) {
			addCriterion("gdzys =", value, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysNotEqualTo(BigDecimal value) {
			addCriterion("gdzys <>", value, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysGreaterThan(BigDecimal value) {
			addCriterion("gdzys >", value, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("gdzys >=", value, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysLessThan(BigDecimal value) {
			addCriterion("gdzys <", value, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysLessThanOrEqualTo(BigDecimal value) {
			addCriterion("gdzys <=", value, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysIn(List<BigDecimal> values) {
			addCriterion("gdzys in", values, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysNotIn(List<BigDecimal> values) {
			addCriterion("gdzys not in", values, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("gdzys between", value1, value2, "gdzys");
			return (Criteria) this;
		}

		public Criteria andGdzysNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("gdzys not between", value1, value2, "gdzys");
			return (Criteria) this;
		}

		public Criteria andQsIsNull() {
			addCriterion("qs is null");
			return (Criteria) this;
		}

		public Criteria andQsIsNotNull() {
			addCriterion("qs is not null");
			return (Criteria) this;
		}

		public Criteria andQsEqualTo(BigDecimal value) {
			addCriterion("qs =", value, "qs");
			return (Criteria) this;
		}

		public Criteria andQsNotEqualTo(BigDecimal value) {
			addCriterion("qs <>", value, "qs");
			return (Criteria) this;
		}

		public Criteria andQsGreaterThan(BigDecimal value) {
			addCriterion("qs >", value, "qs");
			return (Criteria) this;
		}

		public Criteria andQsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("qs >=", value, "qs");
			return (Criteria) this;
		}

		public Criteria andQsLessThan(BigDecimal value) {
			addCriterion("qs <", value, "qs");
			return (Criteria) this;
		}

		public Criteria andQsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("qs <=", value, "qs");
			return (Criteria) this;
		}

		public Criteria andQsIn(List<BigDecimal> values) {
			addCriterion("qs in", values, "qs");
			return (Criteria) this;
		}

		public Criteria andQsNotIn(List<BigDecimal> values) {
			addCriterion("qs not in", values, "qs");
			return (Criteria) this;
		}

		public Criteria andQsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("qs between", value1, value2, "qs");
			return (Criteria) this;
		}

		public Criteria andQsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("qs not between", value1, value2, "qs");
			return (Criteria) this;
		}

		public Criteria andZzsIsNull() {
			addCriterion("zzs is null");
			return (Criteria) this;
		}

		public Criteria andZzsIsNotNull() {
			addCriterion("zzs is not null");
			return (Criteria) this;
		}

		public Criteria andZzsEqualTo(BigDecimal value) {
			addCriterion("zzs =", value, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsNotEqualTo(BigDecimal value) {
			addCriterion("zzs <>", value, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsGreaterThan(BigDecimal value) {
			addCriterion("zzs >", value, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("zzs >=", value, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsLessThan(BigDecimal value) {
			addCriterion("zzs <", value, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("zzs <=", value, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsIn(List<BigDecimal> values) {
			addCriterion("zzs in", values, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsNotIn(List<BigDecimal> values) {
			addCriterion("zzs not in", values, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("zzs between", value1, value2, "zzs");
			return (Criteria) this;
		}

		public Criteria andZzsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("zzs not between", value1, value2, "zzs");
			return (Criteria) this;
		}

		public Criteria andTotalIsNull() {
			addCriterion("total is null");
			return (Criteria) this;
		}

		public Criteria andTotalIsNotNull() {
			addCriterion("total is not null");
			return (Criteria) this;
		}

		public Criteria andTotalEqualTo(BigDecimal value) {
			addCriterion("total =", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotEqualTo(BigDecimal value) {
			addCriterion("total <>", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalGreaterThan(BigDecimal value) {
			addCriterion("total >", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("total >=", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalLessThan(BigDecimal value) {
			addCriterion("total <", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
			addCriterion("total <=", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalIn(List<BigDecimal> values) {
			addCriterion("total in", values, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotIn(List<BigDecimal> values) {
			addCriterion("total not in", values, "total");
			return (Criteria) this;
		}

		public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("total between", value1, value2, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("total not between", value1, value2, "total");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNull() {
			addCriterion("add_time is null");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNotNull() {
			addCriterion("add_time is not null");
			return (Criteria) this;
		}

		public Criteria andAddTimeEqualTo(Long value) {
			addCriterion("add_time =", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotEqualTo(Long value) {
			addCriterion("add_time <>", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThan(Long value) {
			addCriterion("add_time >", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThanOrEqualTo(Long value) {
			addCriterion("add_time >=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThan(Long value) {
			addCriterion("add_time <", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThanOrEqualTo(Long value) {
			addCriterion("add_time <=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeIn(List<Long> values) {
			addCriterion("add_time in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotIn(List<Long> values) {
			addCriterion("add_time not in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeBetween(Long value1, Long value2) {
			addCriterion("add_time between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotBetween(Long value1, Long value2) {
			addCriterion("add_time not between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdIsNull() {
			addCriterion("enterprise_id is null");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdIsNotNull() {
			addCriterion("enterprise_id is not null");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdEqualTo(Integer value) {
			addCriterion("enterprise_id =", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdNotEqualTo(Integer value) {
			addCriterion("enterprise_id <>", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdGreaterThan(Integer value) {
			addCriterion("enterprise_id >", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("enterprise_id >=", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdLessThan(Integer value) {
			addCriterion("enterprise_id <", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
			addCriterion("enterprise_id <=", value, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdIn(List<Integer> values) {
			addCriterion("enterprise_id in", values, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdNotIn(List<Integer> values) {
			addCriterion("enterprise_id not in", values, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
			addCriterion("enterprise_id between", value1, value2, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
			addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
			return (Criteria) this;
		}

		public Criteria andTimeIdIsNull() {
			addCriterion("time_id is null");
			return (Criteria) this;
		}

		public Criteria andTimeIdIsNotNull() {
			addCriterion("time_id is not null");
			return (Criteria) this;
		}

		public Criteria andTimeIdEqualTo(Integer value) {
			addCriterion("time_id =", value, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdNotEqualTo(Integer value) {
			addCriterion("time_id <>", value, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdGreaterThan(Integer value) {
			addCriterion("time_id >", value, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("time_id >=", value, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdLessThan(Integer value) {
			addCriterion("time_id <", value, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdLessThanOrEqualTo(Integer value) {
			addCriterion("time_id <=", value, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdIn(List<Integer> values) {
			addCriterion("time_id in", values, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdNotIn(List<Integer> values) {
			addCriterion("time_id not in", values, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdBetween(Integer value1, Integer value2) {
			addCriterion("time_id between", value1, value2, "timeId");
			return (Criteria) this;
		}

		public Criteria andTimeIdNotBetween(Integer value1, Integer value2) {
			addCriterion("time_id not between", value1, value2, "timeId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tax
	 * @mbggenerated  Thu Jun 15 15:30:48 CST 2017
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tax
     *
     * @mbggenerated do_not_delete_during_merge Tue Jun 13 10:16:38 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}