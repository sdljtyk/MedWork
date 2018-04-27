package com.tyk.mapper;

import com.tyk.pojo.Xzqy;
import com.tyk.pojo.XzqyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XzqyMapper {
    long countByExample(XzqyExample example);

    int deleteByExample(XzqyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xzqy record);

    int insertSelective(Xzqy record);

    List<Xzqy> selectByExample(XzqyExample example);

    Xzqy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xzqy record, @Param("example") XzqyExample example);

    int updateByExample(@Param("record") Xzqy record, @Param("example") XzqyExample example);

    int updateByPrimaryKeySelective(Xzqy record);

    int updateByPrimaryKey(Xzqy record);
}