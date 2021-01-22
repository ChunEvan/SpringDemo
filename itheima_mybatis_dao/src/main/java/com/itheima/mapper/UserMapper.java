package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;

import java.io.IOException;
import java.util.List;

public interface UserMapper {

    @Select("select *,o.id oid FROM orders o,user u where o.uid=u.id")
    @Results(
            {
                    @Result(id = true, column = "uid", property = "id"),
                    @Result(column = "username", property = "username"),
                    @Result(column = "password", property = "password"),
                    @Result(column = "birthday", property = "birthday"),
                    @Result(
                            property = "orderList",
                            column = "id",
                            javaType = List.class,
                            many = @Many(select = "com.itheima.dao.OrderMapper.findByUid")

                    )
            }

    )
    public List<User> findAll() throws IOException;

    @Select("select * from user where id=#{id}")
    public User findById(int id);


    public List<User> findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);

    public void save(User user);
}
