package com.jmy.dao;

import com.jmy.entity.Action;
import com.jmy.entity.ActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int countByExample(ActionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int deleteByExample(ActionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int insert(Action record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int insertSelective(Action record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	List<Action> selectByExampleWithBLOBs(ActionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	List<Action> selectByExample(ActionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	Action selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Action record, @Param("example") ActionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByExampleWithBLOBs(@Param("record") Action record, @Param("example") ActionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByExample(@Param("record") Action record, @Param("example") ActionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByPrimaryKeySelective(Action record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByPrimaryKeyWithBLOBs(Action record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table isp_action
	 * @mbggenerated  Mon Mar 27 19:10:41 CST 2017
	 */
	int updateByPrimaryKey(Action record);
}