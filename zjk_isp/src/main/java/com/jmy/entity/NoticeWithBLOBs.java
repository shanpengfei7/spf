package com.jmy.entity;

public class NoticeWithBLOBs extends Notice {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column isp_notice.content
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column isp_notice.message
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	private String message;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column isp_notice.content
	 * @return  the value of isp_notice.content
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column isp_notice.content
	 * @param content  the value for isp_notice.content
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column isp_notice.message
	 * @return  the value of isp_notice.message
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column isp_notice.message
	 * @param message  the value for isp_notice.message
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}