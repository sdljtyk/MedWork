package com.tyk.mapper;

import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.DicinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicinfoMapper {
    long countByExample(DicinfoExample example);

    int deleteByExample(DicinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dicinfo record);

    int insertSelective(Dicinfo record);

    List<Dicinfo> selectByExample(DicinfoExample example);

    Dicinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dicinfo record, @Param("example") DicinfoExample example);

    int updateByExample(@Param("record") Dicinfo record, @Param("example") DicinfoExample example);

    int updateByPrimaryKeySelective(Dicinfo record);

    int updateByPrimaryKey(Dicinfo record);
}