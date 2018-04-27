package com.tyk.mapper;

import com.tyk.pojo.Backinfo;
import com.tyk.pojo.BackinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackinfoMapper {
    long countByExample(BackinfoExample example);

    int deleteByExample(BackinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Backinfo record);

    int insertSelective(Backinfo record);

    List<Backinfo> selectByExample(BackinfoExample example);

    Backinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Backinfo record, @Param("example") BackinfoExample example);

    int updateByExample(@Param("record") Backinfo record, @Param("example") BackinfoExample example);

    int updateByPrimaryKeySelective(Backinfo record);

    int updateByPrimaryKey(Backinfo record);
}