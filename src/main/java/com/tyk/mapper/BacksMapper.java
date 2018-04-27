package com.tyk.mapper;

import com.tyk.pojo.Backs;
import com.tyk.pojo.BacksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BacksMapper {
    long countByExample(BacksExample example);

    int deleteByExample(BacksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Backs record);

    int insertSelective(Backs record);

    List<Backs> selectByExample(BacksExample example);

    Backs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Backs record, @Param("example") BacksExample example);

    int updateByExample(@Param("record") Backs record, @Param("example") BacksExample example);

    int updateByPrimaryKeySelective(Backs record);

    int updateByPrimaryKey(Backs record);
}