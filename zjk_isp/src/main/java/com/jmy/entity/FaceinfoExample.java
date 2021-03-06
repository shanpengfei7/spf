package com.jmy.entity;

import java.util.ArrayList;
import java.util.List;

public class FaceinfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public FaceinfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
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

		public Criteria andTaoIdIsNull() {
			addCriterion("tao_id is null");
			return (Criteria) this;
		}

		public Criteria andTaoIdIsNotNull() {
			addCriterion("tao_id is not null");
			return (Criteria) this;
		}

		public Criteria andTaoIdEqualTo(Integer value) {
			addCriterion("tao_id =", value, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdNotEqualTo(Integer value) {
			addCriterion("tao_id <>", value, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdGreaterThan(Integer value) {
			addCriterion("tao_id >", value, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("tao_id >=", value, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdLessThan(Integer value) {
			addCriterion("tao_id <", value, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdLessThanOrEqualTo(Integer value) {
			addCriterion("tao_id <=", value, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdIn(List<Integer> values) {
			addCriterion("tao_id in", values, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdNotIn(List<Integer> values) {
			addCriterion("tao_id not in", values, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdBetween(Integer value1, Integer value2) {
			addCriterion("tao_id between", value1, value2, "taoId");
			return (Criteria) this;
		}

		public Criteria andTaoIdNotBetween(Integer value1, Integer value2) {
			addCriterion("tao_id not between", value1, value2, "taoId");
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

		public Criteria andTokenIsNull() {
			addCriterion("token is null");
			return (Criteria) this;
		}

		public Criteria andTokenIsNotNull() {
			addCriterion("token is not null");
			return (Criteria) this;
		}

		public Criteria andTokenEqualTo(String value) {
			addCriterion("token =", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotEqualTo(String value) {
			addCriterion("token <>", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenGreaterThan(String value) {
			addCriterion("token >", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenGreaterThanOrEqualTo(String value) {
			addCriterion("token >=", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLessThan(String value) {
			addCriterion("token <", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLessThanOrEqualTo(String value) {
			addCriterion("token <=", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLike(String value) {
			addCriterion("token like", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotLike(String value) {
			addCriterion("token not like", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenIn(List<String> values) {
			addCriterion("token in", values, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotIn(List<String> values) {
			addCriterion("token not in", values, "token");
			return (Criteria) this;
		}

		public Criteria andTokenBetween(String value1, String value2) {
			addCriterion("token between", value1, value2, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotBetween(String value1, String value2) {
			addCriterion("token not between", value1, value2, "token");
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

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Integer value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Integer value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Integer value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Integer value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Integer> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Integer> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateUserIsNull() {
			addCriterion("create_user is null");
			return (Criteria) this;
		}

		public Criteria andCreateUserIsNotNull() {
			addCriterion("create_user is not null");
			return (Criteria) this;
		}

		public Criteria andCreateUserEqualTo(Integer value) {
			addCriterion("create_user =", value, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserNotEqualTo(Integer value) {
			addCriterion("create_user <>", value, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserGreaterThan(Integer value) {
			addCriterion("create_user >", value, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
			addCriterion("create_user >=", value, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserLessThan(Integer value) {
			addCriterion("create_user <", value, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
			addCriterion("create_user <=", value, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserIn(List<Integer> values) {
			addCriterion("create_user in", values, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserNotIn(List<Integer> values) {
			addCriterion("create_user not in", values, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserBetween(Integer value1, Integer value2) {
			addCriterion("create_user between", value1, value2, "createUser");
			return (Criteria) this;
		}

		public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
			addCriterion("create_user not between", value1, value2, "createUser");
			return (Criteria) this;
		}

		public Criteria andMessageIsNull() {
			addCriterion("message is null");
			return (Criteria) this;
		}

		public Criteria andMessageIsNotNull() {
			addCriterion("message is not null");
			return (Criteria) this;
		}

		public Criteria andMessageEqualTo(String value) {
			addCriterion("message =", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageNotEqualTo(String value) {
			addCriterion("message <>", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageGreaterThan(String value) {
			addCriterion("message >", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageGreaterThanOrEqualTo(String value) {
			addCriterion("message >=", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageLessThan(String value) {
			addCriterion("message <", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageLessThanOrEqualTo(String value) {
			addCriterion("message <=", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageLike(String value) {
			addCriterion("message like", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageNotLike(String value) {
			addCriterion("message not like", value, "message");
			return (Criteria) this;
		}

		public Criteria andMessageIn(List<String> values) {
			addCriterion("message in", values, "message");
			return (Criteria) this;
		}

		public Criteria andMessageNotIn(List<String> values) {
			addCriterion("message not in", values, "message");
			return (Criteria) this;
		}

		public Criteria andMessageBetween(String value1, String value2) {
			addCriterion("message between", value1, value2, "message");
			return (Criteria) this;
		}

		public Criteria andMessageNotBetween(String value1, String value2) {
			addCriterion("message not between", value1, value2, "message");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table isp_faceinfo
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
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
     * This class corresponds to the database table isp_faceinfo
     *
     * @mbggenerated do_not_delete_during_merge Mon Mar 20 20:47:20 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}