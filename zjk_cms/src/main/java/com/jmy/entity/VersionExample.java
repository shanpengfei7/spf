package com.jmy.entity;

import java.util.ArrayList;
import java.util.List;

public class VersionExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public VersionExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
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

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andPicIsNull() {
			addCriterion("pic is null");
			return (Criteria) this;
		}

		public Criteria andPicIsNotNull() {
			addCriterion("pic is not null");
			return (Criteria) this;
		}

		public Criteria andPicEqualTo(String value) {
			addCriterion("pic =", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotEqualTo(String value) {
			addCriterion("pic <>", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicGreaterThan(String value) {
			addCriterion("pic >", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicGreaterThanOrEqualTo(String value) {
			addCriterion("pic >=", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLessThan(String value) {
			addCriterion("pic <", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLessThanOrEqualTo(String value) {
			addCriterion("pic <=", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLike(String value) {
			addCriterion("pic like", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotLike(String value) {
			addCriterion("pic not like", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicIn(List<String> values) {
			addCriterion("pic in", values, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotIn(List<String> values) {
			addCriterion("pic not in", values, "pic");
			return (Criteria) this;
		}

		public Criteria andPicBetween(String value1, String value2) {
			addCriterion("pic between", value1, value2, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotBetween(String value1, String value2) {
			addCriterion("pic not between", value1, value2, "pic");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andIsdelIsNull() {
			addCriterion("isdel is null");
			return (Criteria) this;
		}

		public Criteria andIsdelIsNotNull() {
			addCriterion("isdel is not null");
			return (Criteria) this;
		}

		public Criteria andIsdelEqualTo(Byte value) {
			addCriterion("isdel =", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelNotEqualTo(Byte value) {
			addCriterion("isdel <>", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelGreaterThan(Byte value) {
			addCriterion("isdel >", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelGreaterThanOrEqualTo(Byte value) {
			addCriterion("isdel >=", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelLessThan(Byte value) {
			addCriterion("isdel <", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelLessThanOrEqualTo(Byte value) {
			addCriterion("isdel <=", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelIn(List<Byte> values) {
			addCriterion("isdel in", values, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelNotIn(List<Byte> values) {
			addCriterion("isdel not in", values, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelBetween(Byte value1, Byte value2) {
			addCriterion("isdel between", value1, value2, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelNotBetween(Byte value1, Byte value2) {
			addCriterion("isdel not between", value1, value2, "isdel");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNull() {
			addCriterion("createtime is null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNotNull() {
			addCriterion("createtime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeEqualTo(Integer value) {
			addCriterion("createtime =", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotEqualTo(Integer value) {
			addCriterion("createtime <>", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThan(Integer value) {
			addCriterion("createtime >", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("createtime >=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThan(Integer value) {
			addCriterion("createtime <", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
			addCriterion("createtime <=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIn(List<Integer> values) {
			addCriterion("createtime in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotIn(List<Integer> values) {
			addCriterion("createtime not in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
			addCriterion("createtime between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
			addCriterion("createtime not between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreateuserIsNull() {
			addCriterion("createuser is null");
			return (Criteria) this;
		}

		public Criteria andCreateuserIsNotNull() {
			addCriterion("createuser is not null");
			return (Criteria) this;
		}

		public Criteria andCreateuserEqualTo(Integer value) {
			addCriterion("createuser =", value, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserNotEqualTo(Integer value) {
			addCriterion("createuser <>", value, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserGreaterThan(Integer value) {
			addCriterion("createuser >", value, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserGreaterThanOrEqualTo(Integer value) {
			addCriterion("createuser >=", value, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserLessThan(Integer value) {
			addCriterion("createuser <", value, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserLessThanOrEqualTo(Integer value) {
			addCriterion("createuser <=", value, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserIn(List<Integer> values) {
			addCriterion("createuser in", values, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserNotIn(List<Integer> values) {
			addCriterion("createuser not in", values, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserBetween(Integer value1, Integer value2) {
			addCriterion("createuser between", value1, value2, "createuser");
			return (Criteria) this;
		}

		public Criteria andCreateuserNotBetween(Integer value1, Integer value2) {
			addCriterion("createuser not between", value1, value2, "createuser");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNull() {
			addCriterion("updatetime is null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNotNull() {
			addCriterion("updatetime is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeEqualTo(Integer value) {
			addCriterion("updatetime =", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotEqualTo(Integer value) {
			addCriterion("updatetime <>", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThan(Integer value) {
			addCriterion("updatetime >", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("updatetime >=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThan(Integer value) {
			addCriterion("updatetime <", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
			addCriterion("updatetime <=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIn(List<Integer> values) {
			addCriterion("updatetime in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotIn(List<Integer> values) {
			addCriterion("updatetime not in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
			addCriterion("updatetime between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
			addCriterion("updatetime not between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateuserIsNull() {
			addCriterion("updateuser is null");
			return (Criteria) this;
		}

		public Criteria andUpdateuserIsNotNull() {
			addCriterion("updateuser is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateuserEqualTo(Integer value) {
			addCriterion("updateuser =", value, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserNotEqualTo(Integer value) {
			addCriterion("updateuser <>", value, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserGreaterThan(Integer value) {
			addCriterion("updateuser >", value, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserGreaterThanOrEqualTo(Integer value) {
			addCriterion("updateuser >=", value, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserLessThan(Integer value) {
			addCriterion("updateuser <", value, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserLessThanOrEqualTo(Integer value) {
			addCriterion("updateuser <=", value, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserIn(List<Integer> values) {
			addCriterion("updateuser in", values, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserNotIn(List<Integer> values) {
			addCriterion("updateuser not in", values, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserBetween(Integer value1, Integer value2) {
			addCriterion("updateuser between", value1, value2, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUpdateuserNotBetween(Integer value1, Integer value2) {
			addCriterion("updateuser not between", value1, value2, "updateuser");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateIsNull() {
			addCriterion("isadminupdate is null");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateIsNotNull() {
			addCriterion("isadminupdate is not null");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateEqualTo(Byte value) {
			addCriterion("isadminupdate =", value, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateNotEqualTo(Byte value) {
			addCriterion("isadminupdate <>", value, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateGreaterThan(Byte value) {
			addCriterion("isadminupdate >", value, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateGreaterThanOrEqualTo(Byte value) {
			addCriterion("isadminupdate >=", value, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateLessThan(Byte value) {
			addCriterion("isadminupdate <", value, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateLessThanOrEqualTo(Byte value) {
			addCriterion("isadminupdate <=", value, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateIn(List<Byte> values) {
			addCriterion("isadminupdate in", values, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateNotIn(List<Byte> values) {
			addCriterion("isadminupdate not in", values, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateBetween(Byte value1, Byte value2) {
			addCriterion("isadminupdate between", value1, value2, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andIsadminupdateNotBetween(Byte value1, Byte value2) {
			addCriterion("isadminupdate not between", value1, value2, "isadminupdate");
			return (Criteria) this;
		}

		public Criteria andYearsIsNull() {
			addCriterion("years is null");
			return (Criteria) this;
		}

		public Criteria andYearsIsNotNull() {
			addCriterion("years is not null");
			return (Criteria) this;
		}

		public Criteria andYearsEqualTo(Integer value) {
			addCriterion("years =", value, "years");
			return (Criteria) this;
		}

		public Criteria andYearsNotEqualTo(Integer value) {
			addCriterion("years <>", value, "years");
			return (Criteria) this;
		}

		public Criteria andYearsGreaterThan(Integer value) {
			addCriterion("years >", value, "years");
			return (Criteria) this;
		}

		public Criteria andYearsGreaterThanOrEqualTo(Integer value) {
			addCriterion("years >=", value, "years");
			return (Criteria) this;
		}

		public Criteria andYearsLessThan(Integer value) {
			addCriterion("years <", value, "years");
			return (Criteria) this;
		}

		public Criteria andYearsLessThanOrEqualTo(Integer value) {
			addCriterion("years <=", value, "years");
			return (Criteria) this;
		}

		public Criteria andYearsIn(List<Integer> values) {
			addCriterion("years in", values, "years");
			return (Criteria) this;
		}

		public Criteria andYearsNotIn(List<Integer> values) {
			addCriterion("years not in", values, "years");
			return (Criteria) this;
		}

		public Criteria andYearsBetween(Integer value1, Integer value2) {
			addCriterion("years between", value1, value2, "years");
			return (Criteria) this;
		}

		public Criteria andYearsNotBetween(Integer value1, Integer value2) {
			addCriterion("years not between", value1, value2, "years");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNull() {
			addCriterion("money is null");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNotNull() {
			addCriterion("money is not null");
			return (Criteria) this;
		}

		public Criteria andMoneyEqualTo(Integer value) {
			addCriterion("money =", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotEqualTo(Integer value) {
			addCriterion("money <>", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThan(Integer value) {
			addCriterion("money >", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
			addCriterion("money >=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThan(Integer value) {
			addCriterion("money <", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThanOrEqualTo(Integer value) {
			addCriterion("money <=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyIn(List<Integer> values) {
			addCriterion("money in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotIn(List<Integer> values) {
			addCriterion("money not in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyBetween(Integer value1, Integer value2) {
			addCriterion("money between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
			addCriterion("money not between", value1, value2, "money");
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

		public Criteria andStatusEqualTo(Byte value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Byte value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Byte value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Byte value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Byte value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Byte> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Byte> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Byte value1, Byte value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andLastTimeIsNull() {
			addCriterion("last_time is null");
			return (Criteria) this;
		}

		public Criteria andLastTimeIsNotNull() {
			addCriterion("last_time is not null");
			return (Criteria) this;
		}

		public Criteria andLastTimeEqualTo(Integer value) {
			addCriterion("last_time =", value, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeNotEqualTo(Integer value) {
			addCriterion("last_time <>", value, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeGreaterThan(Integer value) {
			addCriterion("last_time >", value, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("last_time >=", value, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeLessThan(Integer value) {
			addCriterion("last_time <", value, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeLessThanOrEqualTo(Integer value) {
			addCriterion("last_time <=", value, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeIn(List<Integer> values) {
			addCriterion("last_time in", values, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeNotIn(List<Integer> values) {
			addCriterion("last_time not in", values, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeBetween(Integer value1, Integer value2) {
			addCriterion("last_time between", value1, value2, "lastTime");
			return (Criteria) this;
		}

		public Criteria andLastTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("last_time not between", value1, value2, "lastTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(Integer value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(Integer value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(Integer value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(Integer value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Integer value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<Integer> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<Integer> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(Integer value1, Integer value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table version
	 * @mbggenerated  Sat Jun 17 10:59:42 CST 2017
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
     * This class corresponds to the database table version
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 14 17:47:30 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}