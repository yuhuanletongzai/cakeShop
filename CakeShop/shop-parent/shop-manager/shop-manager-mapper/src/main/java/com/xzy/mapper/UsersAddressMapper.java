package com.xzy.mapper;

import com.xzy.pojo.UsersAddress;
import com.xzy.pojo.UsersAddressExample;
import com.xzy.pojo.UsersAddressKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersAddressMapper {
    int countByExample(UsersAddressExample example);

    int deleteByExample(UsersAddressExample example);

    int deleteByPrimaryKey(UsersAddressKey key);

    int insert(UsersAddress record);

    int insertSelective(UsersAddress record);

    List<UsersAddress> selectByExample(UsersAddressExample example);

    UsersAddress selectByPrimaryKey(UsersAddressKey key);

    int updateByExampleSelective(@Param("record") UsersAddress record, @Param("example") UsersAddressExample example);

    int updateByExample(@Param("record") UsersAddress record, @Param("example") UsersAddressExample example);

    int updateByPrimaryKeySelective(UsersAddress record);

    int updateByPrimaryKey(UsersAddress record);
}