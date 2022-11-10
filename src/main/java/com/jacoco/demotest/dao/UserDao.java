package com.jacoco.demotest.dao;

import com.jacoco.demotest.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**在接口上添加了这个注解表示这个接口是基于注解实现的CRUD**/
@Repository
public interface UserDao {
    /**
     * 新增数据
     */
    @Insert("insert into users(user_id,first_name,last_name,user) values (#{id},#{firstName},#{lastName},#{user})")
    void addUser(User user);
    /**
     * 修改数据
     */
    @Update("update users set first_name=#{firstName},last_name=#{lastName},user=#{user} where user_id=#{id}")
    void updateUser(User user);
    /**
     * 删除数据
     */
    @Delete("delete from users where user_id=#{id}")
    void deleteUser(int id);
    /**
     * 根据user查询数据
     *
     */
    @Select("select user_id,first_name,last_name,user from users where user=#{user} limit 1")
    User findByName(@Param("user") String user);
    /**
     * 查询所有数据
     */
    @Select("select user_id,first_name,last_name,user FROM users")
    List<User> findAll();
}
