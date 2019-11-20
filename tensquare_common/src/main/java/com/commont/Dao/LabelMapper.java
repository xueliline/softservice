package com.commont.Dao;

import com.commont.entity.Label;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LabelMapper {
    @Select(value = "select * from tb_label where id=#{id}")
    Label findbyid(@Param("id") String id);

    @Select(value = "select * from tb_label")
    List<Label> findall();

    @Insert(value = "insert into tb_label(id,labelname,state,fans,recommend) values(#{id},#{labelname},#{state},#{fans},#{recommend})")
    int insert(Label label);

    @Update(value = "update tb_label set labelname=#{labelname} where id=#{id}")
    int update(Label label);
}
