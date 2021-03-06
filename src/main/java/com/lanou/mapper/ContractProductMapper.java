package com.lanou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.lanou.bean.OutProductBean;
import com.lanou.bean.ProductBean;
import com.lanou.entity.ContractProduct;
@MapperScan
public interface ContractProductMapper {
	
	/**
	 * 根据船期查询出货表
	 * @return
	 */
	List<OutProductBean> selectOutProductBeanByShipTime(@Param("ship_time")String ship_time);
	
	
		
	 /**
	  * 根据合同id 查询货物列表
	  * @param contractId
	  * @return
	  */
	 List<ContractProduct> selectProductByContractID(@Param("contractId") String contractId);
	/**
	 * 添加货物
	 * @param record
	 * @return
	 */
	 int insert(ContractProduct record);
	/**
	 * 查询所有货物
	 * @return
	 */
	 List<ContractProduct> selectAll();
	 /**
	  * 根据货物id查询货物
	  * @param contractProductId
	  * @return
	  */
	 ContractProduct selectContractProductByProductId(@Param("CONTRACT_PRODUCT_ID") String contractProductId);
	 /**
	  * 根据货物id修改货物
	  * @param record
	  * @return
	  */
	 int updateContractProductByProductId(ContractProduct record);
	 /**
	  * 根据货物id删除货物
	  * @param contractProductId
	  * @return
	  */
	 int deleteContract_Product(@Param("CONTRACT_PRODUCT_ID") String contractProductId);
	 
	 /**
	  * 货物销量前十
	  * @return
	  */
	 List<ProductBean> selectProduct();
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRACT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int deleteByPrimaryKey(String CONTRACT_PRODUCT_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRACT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int insertSelective(ContractProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRACT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
   // ContractProduct selectByPrimaryKey(String CONTRACT_PRODUCT_ID);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTRACT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:47:56 CST 2018
     */
    int updateByPrimaryKey(ContractProduct record);



	List<ContractProduct> selectProById(String id);
    
   
}