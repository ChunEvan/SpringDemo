package com.itheima.mapper;

import com.itheima.domain.Order;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.io.IOException;
import java.util.List;

public interface OrderMapper {

    @Select("select *,o.id oid FROM orders o,user u where o.uid=u.id")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "ordertime", property = "ordertime"),
            @Result(column = "total", property = "total"),
            @Result(
                    property = "user",
                    column = "uid",
                    javaType = User.class,
                    one = @One(select = "com.itheima.dao.UserMapper.findById")
            )
    })
    public List<Order> findAll() throws IOException;

    @Select("select * from orders where id=#{id}")
    public Order findByUid(int id);

}
