package com.xzy.mapper;

import com.xzy.pojo.ProductOrders;
import com.xzy.pojo.ProductOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductOrdersMapper {
    int countByExample(ProductOrdersExample example);

    int deleteByExample(ProductOrdersExample example);

    int insert(ProductOrders record);

    int insertSelective(ProductOrders record);

    List<ProductOrders> selectByExample(ProductOrdersExample example);

    int updateByExampleSelective(@Param("record") ProductOrders record, @Param("example") ProductOrdersExample example);

    int updateByExample(@Param("record") ProductOrders record, @Param("example") ProductOrdersExample example);
}