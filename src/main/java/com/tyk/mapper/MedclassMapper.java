package com.tyk.mapper;

import com.tyk.pojo.Medclass;
import com.tyk.pojo.MedclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedclassMapper {
    long countByExample(MedclassExample example);

    int deleteByExample(MedclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medclass record);

    int insertSelective(Medclass record);

    List<Medclass> selectByExample(MedclassExample example);

    Medclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medclass record, @Param("example") MedclassExample example);

    int updateByExample(@Param("record") Medclass record, @Param("example") MedclassExample example);

    int updateByPrimaryKeySelective(Medclass record);

    int updateByPrimaryKey(Medclass record);
}