package com.tyk.mapper;

import com.tyk.pojo.Ghsunit;
import com.tyk.pojo.GhsunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhsunitMapper {
    long countByExample(GhsunitExample example);

    int deleteByExample(GhsunitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ghsunit record);

    int insertSelective(Ghsunit record);

    List<Ghsunit> selectByExample(GhsunitExample example);

    Ghsunit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ghsunit record, @Param("example") GhsunitExample example);

    int updateByExample(@Param("record") Ghsunit record, @Param("example") GhsunitExample example);

    int updateByPrimaryKeySelective(Ghsunit record);

    int updateByPrimaryKey(Ghsunit record);
}