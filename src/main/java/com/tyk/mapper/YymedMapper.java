package com.tyk.mapper;

import com.tyk.pojo.Yymed;
import com.tyk.pojo.YymedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YymedMapper {
    long countByExample(YymedExample example);

    int deleteByExample(YymedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Yymed record);

    int insertSelective(Yymed record);

    List<Yymed> selectByExample(YymedExample example);

    Yymed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Yymed record, @Param("example") YymedExample example);

    int updateByExample(@Param("record") Yymed record, @Param("example") YymedExample example);

    int updateByPrimaryKeySelective(Yymed record);

    int updateByPrimaryKey(Yymed record);
}