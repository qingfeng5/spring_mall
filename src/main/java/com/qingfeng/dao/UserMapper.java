package com.qingfeng.dao;

import com.qingfeng.pojo.User;
import org.apache.ibatis.annotations.Param;



public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //检验存不存在的sql
    int checkUsername(String username);

    //检验邮箱
    int checkEmail(String email);

    //登录注解，一旦登录就把信息返回给前端
    User selectLogin(@Param("username") String username, @Param("password")String password);

    //选择用户问题
    String selectQuestionByUsername(String username);

    //检查密码是不是正确
    int checkAnswer(@Param("username")String username,@Param("question")String question,@Param("answer")String answer);

    //更新密码
    int updatePasswordByUsername(@Param("username")String username,@Param("passwordNew")String passwordNew);

    /**用户登录状态的重置密码**/
    int checkPassword(@Param(value="password")String password,@Param("userId")Integer userId);

    //更新个人信息参数
    int checkEmailByUserId(@Param(value="email")String email,@Param(value="userId")Integer userId);

}