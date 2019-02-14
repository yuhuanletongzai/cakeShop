package com.xzy.mapper;

import com.xzy.pojo.Collects;
import com.xzy.pojo.CollectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectsMapper {
    int countByExample(CollectsExample example);

    int deleteByExample(CollectsExample example);

    int insert(Collects record);

    int insertSelective(Collects record);

    List<Collects> selectByExample(CollectsExample example);

    int updateByExampleSelective(@Param("record") Collects record, @Param("example") CollectsExample example);

    int updateByExample(@Param("record") Collects record, @Param("example") CollectsExample example);
}