package com.jmy.entity;

public class Notice {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column isp_notice.id
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column isp_notice.title
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column isp_notice.create_time
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	private Integer createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column isp_notice.create_user
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	private Integer createUser;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column isp_notice.id
	 * @return  the value of isp_notice.id
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column isp_notice.id
	 * @param id  the value for isp_notice.id
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column isp_notice.title
	 * @return  the value of isp_notice.title
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column isp_notice.title
	 * @param title  the value for isp_notice.title
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column isp_notice.create_time
	 * @return  the value of isp_notice.create_time
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public Integer getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column isp_notice.create_time
	 * @param createTime  the value for isp_notice.create_time
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column isp_notice.create_user
	 * @return  the value of isp_notice.create_user
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public Integer getCreateUser() {
		return createUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column isp_notice.create_user
	 * @param createUser  the value for isp_notice.create_user
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
}