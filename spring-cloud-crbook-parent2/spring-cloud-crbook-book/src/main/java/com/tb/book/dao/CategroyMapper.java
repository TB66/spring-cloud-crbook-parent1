package com.tb.book.dao;

import com.tb.crbook.bean.Categroy;
import com.tb.crbook.bean.CategroyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategroyMapper {
    long countByExample(CategroyExample example);

    int deleteByExample(CategroyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Categroy record);

    int insertSelective(Categroy record);

    List<Categroy> selectByExample(CategroyExample example);

    Categroy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Categroy record, @Param("example") CategroyExample example);

    int updateByExample(@Param("record") Categroy record, @Param("example") CategroyExample example);

    int updateByPrimaryKeySelective(Categroy record);

    int updateByPrimaryKey(Categroy record);
}