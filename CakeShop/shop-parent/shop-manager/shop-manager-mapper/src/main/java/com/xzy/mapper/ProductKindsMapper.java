package com.xzy.mapper;

import com.xzy.pojo.ProductKinds;
import com.xzy.pojo.ProductKindsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductKindsMapper {
    int countByExample(ProductKindsExample example);

    int deleteByExample(ProductKindsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductKinds record);

    int insertSelective(ProductKinds record);

    List<ProductKinds> selectByExample(ProductKindsExample example);

    ProductKinds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductKinds record, @Param("example") ProductKindsExample example);

    int updateByExample(@Param("record") ProductKinds record, @Param("example") ProductKindsExample example);

    int updateByPrimaryKeySelective(ProductKinds record);

    int updateByPrimaryKey(ProductKinds record);
}