package com.tyk.mapper;

import com.tyk.pojo.Medrk;
import com.tyk.pojo.MedrkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedrkMapper {
    long countByExample(MedrkExample example);

    int deleteByExample(MedrkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medrk record);

    int insertSelective(Medrk record);

    List<Medrk> selectByExample(MedrkExample example);

    Medrk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medrk record, @Param("example") MedrkExample example);

    int updateByExample(@Param("record") Medrk record, @Param("example") MedrkExample example);

    int updateByPrimaryKeySelective(Medrk record);

    int updateByPrimaryKey(Medrk record);
}