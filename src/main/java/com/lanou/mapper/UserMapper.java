package com.lanou.mapper;

import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.entity.User;
@MapperScan
public interface UserMapper {
	
	
	/**
	 * 根据用户名和密码登录
	 * @param name
	 * @param password
	 * @return
	 */
	User  login(Map<String,Object> map);
	
	
	/**
	 * 根据名字查找用户
	 * @return
	 */
	User  selectByName(String name);
	
	
	
	
	//*************************************************************************
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTH_USER_P
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */


    int deleteByPrimaryKey(String AUTH_USER_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTH_USER_P
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTH_USER_P
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTH_USER_P
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    User selectByPrimaryKey(String AUTH_USER_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTH_USER_P
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTH_USER_P
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int updateByPrimaryKey(User record);
}