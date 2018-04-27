package com.tyk.mapper;

import com.tyk.pojo.Medinfo;
import com.tyk.pojo.MedinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedinfoMapper {
    long countByExample(MedinfoExample example);

    int deleteByExample(MedinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medinfo record);

    int insertSelective(Medinfo record);

    List<Medinfo> selectByExample(MedinfoExample example);

    Medinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medinfo record, @Param("example") MedinfoExample example);

    int updateByExample(@Param("record") Medinfo record, @Param("example") MedinfoExample example);

    int updateByPrimaryKeySelective(Medinfo record);

    int updateByPrimaryKey(Medinfo record);
}