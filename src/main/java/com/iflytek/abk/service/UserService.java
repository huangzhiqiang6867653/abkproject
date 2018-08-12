package com.iflytek.abk.service;

/**
 *
 * @author huangzhiqiang
 *
 * 用户管理
 */
public interface UserService {
    /**
     * 获取用户
     * @param userNo
     * @return
     */
    public String get(String userNo);

    /**
     * 更新用户
     * @param userNo
     */
    public void update(String userNo);

    /**
     * 删除全部用户
     */
    public void removeAll();
}
