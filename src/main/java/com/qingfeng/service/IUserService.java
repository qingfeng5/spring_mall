package com.qingfeng.service;

import com.qingfeng.common.ServerResponse;
import com.qingfeng.pojo.User;

/**
 * @author 清风
 * @date 2020/2/18 13:51
 */
public interface IUserService {
    //登录
    ServerResponse<User> login(String username, String password);

    //注册
    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    //选择问题
    ServerResponse selectQuestion(String username);

    //检查密码
    ServerResponse<String> checkAnswer(String username,String question,String answer);

    //忘记密码
    ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken);

    //用户状态重置密码
    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    //更新个人信息
    ServerResponse<User> updateInformation(User user);

    /**获取用户详情的个人信息**/
    ServerResponse<User> getInformation(Integer userId);

    //检验是否是管理员
    ServerResponse checkAdminRole(User user);
}
