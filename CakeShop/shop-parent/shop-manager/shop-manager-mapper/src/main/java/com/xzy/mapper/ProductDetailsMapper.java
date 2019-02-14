package com.xzy.mapper;

import com.xzy.pojo.ProductDetails;
import com.xzy.pojo.ProductDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailsMapper {
    int countByExample(ProductDetailsExample example);

    int deleteByExample(ProductDetailsExample example);

    int deleteByPrimaryKey(Long productId);

    int insert(ProductDetails record);

    int insertSelective(ProductDetails record);

    List<ProductDetails> selectByExample(ProductDetailsExample example);

    ProductDetails selectByPrimaryKey(Long productId);

    int updateByExampleSelective(@Param("record") ProductDetails record, @Param("example") ProductDetailsExample example);

    int updateByExample(@Param("record") ProductDetails record, @Param("example") ProductDetailsExample example);

    int updateByPrimaryKeySelective(ProductDetails record);

    int updateByPrimaryKey(ProductDetails record);
}