package com.jmy.dao;

import com.jmy.entity.Noticeread;
import com.jmy.entity.NoticereadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticereadMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int countByExample(NoticereadExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int deleteByExample(NoticereadExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int insert(Noticeread record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int insertSelective(Noticeread record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	List<Noticeread> selectByExample(NoticereadExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	Noticeread selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Noticeread record, @Param("example") NoticereadExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByExample(@Param("record") Noticeread record, @Param("example") NoticereadExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByPrimaryKeySelective(Noticeread record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_noticeread
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByPrimaryKey(Noticeread record);
}