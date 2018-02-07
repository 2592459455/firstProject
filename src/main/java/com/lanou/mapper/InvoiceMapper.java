package com.lanou.mapper;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.entity.Invoice;
@MapperScan
public interface InvoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVOICE_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int deleteByPrimaryKey(String INVOICE_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVOICE_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int insert(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVOICE_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int insertSelective(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVOICE_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    Invoice selectByPrimaryKey(String INVOICE_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVOICE_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int updateByPrimaryKeySelective(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVOICE_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int updateByPrimaryKey(Invoice record);
}