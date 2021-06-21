package com.example.chachedemo.mapper;

import com.example.chachedemo.entity.po.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TestMapper {
    @Select("select * from test where id = #{id}")
    Test getTestById(@Param("id")int id);

    @Update("update test set name = #{t.name} where id = #{t.id}")
    void updateTestById(@Param("t")Test test);

    @Update("delete from test where id = #{id} ")
    void deleteTestById(@Param("id")int id);

}
