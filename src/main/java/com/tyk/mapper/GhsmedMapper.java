package com.tyk.mapper;

import com.tyk.pojo.Ghsmed;
import com.tyk.pojo.GhsmedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhsmedMapper {
    long countByExample(GhsmedExample example);

    int deleteByExample(GhsmedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ghsmed record);

    int insertSelective(Ghsmed record);

    List<Ghsmed> selectByExample(GhsmedExample example);

    Ghsmed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ghsmed record, @Param("example") GhsmedExample example);

    int updateByExample(@Param("record") Ghsmed record, @Param("example") GhsmedExample example);

    int updateByPrimaryKeySelective(Ghsmed record);

    int updateByPrimaryKey(Ghsmed record);
}