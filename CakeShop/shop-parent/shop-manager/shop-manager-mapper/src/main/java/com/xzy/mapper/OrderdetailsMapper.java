package com.xzy.mapper;

import com.xzy.pojo.Orderdetails;
import com.xzy.pojo.OrderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailsMapper {
    int countByExample(OrderdetailsExample example);

    int deleteByExample(OrderdetailsExample example);

    int deleteByPrimaryKey(Long ordersId);

    int insert(Orderdetails record);

    int insertSelective(Orderdetails record);

    List<Orderdetails> selectByExample(OrderdetailsExample example);

    Orderdetails selectByPrimaryKey(Long ordersId);

    int updateByExampleSelective(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    int updateByExample(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    int updateByPrimaryKeySelective(Orderdetails record);

    int updateByPrimaryKey(Orderdetails record);
}