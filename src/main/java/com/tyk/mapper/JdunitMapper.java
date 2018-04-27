package com.tyk.mapper;

import com.tyk.pojo.Jdunit;
import com.tyk.pojo.JdunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JdunitMapper {
    long countByExample(JdunitExample example);

    int deleteByExample(JdunitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jdunit record);

    int insertSelective(Jdunit record);

    List<Jdunit> selectByExample(JdunitExample example);

    Jdunit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jdunit record, @Param("example") JdunitExample example);

    int updateByExample(@Param("record") Jdunit record, @Param("example") JdunitExample example);

    int updateByPrimaryKeySelective(Jdunit record);

    int updateByPrimaryKey(Jdunit record);
}