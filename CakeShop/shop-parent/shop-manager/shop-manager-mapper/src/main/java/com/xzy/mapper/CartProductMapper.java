package com.xzy.mapper;

import com.xzy.pojo.CartProduct;
import com.xzy.pojo.CartProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartProductMapper {
    int countByExample(CartProductExample example);

    int deleteByExample(CartProductExample example);

    int insert(CartProduct record);

    int insertSelective(CartProduct record);

    List<CartProduct> selectByExample(CartProductExample example);

    int updateByExampleSelective(@Param("record") CartProduct record, @Param("example") CartProductExample example);

    int updateByExample(@Param("record") CartProduct record, @Param("example") CartProductExample example);
}