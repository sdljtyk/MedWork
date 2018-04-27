package com.tyk.mapper;

import com.tyk.pojo.Yyunit;
import com.tyk.pojo.YyunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyunitMapper {
    long countByExample(YyunitExample example);

    int deleteByExample(YyunitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Yyunit record);

    int insertSelective(Yyunit record);

    List<Yyunit> selectByExample(YyunitExample example);

    Yyunit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Yyunit record, @Param("example") YyunitExample example);

    int updateByExample(@Param("record") Yyunit record, @Param("example") YyunitExample example);

    int updateByPrimaryKeySelective(Yyunit record);

    int updateByPrimaryKey(Yyunit record);
}