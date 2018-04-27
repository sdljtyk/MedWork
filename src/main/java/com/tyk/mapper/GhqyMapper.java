package com.tyk.mapper;

import com.tyk.pojo.Ghqy;
import com.tyk.pojo.GhqyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhqyMapper {
    long countByExample(GhqyExample example);

    int deleteByExample(GhqyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ghqy record);

    int insertSelective(Ghqy record);

    List<Ghqy> selectByExample(GhqyExample example);

    Ghqy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ghqy record, @Param("example") GhqyExample example);

    int updateByExample(@Param("record") Ghqy record, @Param("example") GhqyExample example);

    int updateByPrimaryKeySelective(Ghqy record);

    int updateByPrimaryKey(Ghqy record);
}