package com.iflytek.abk.service.imp;

import com.iflytek.abk.service.UserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/**
 * @author huangzhiqiang
 * 用户管理-业务层
 */
@Service("userService")
public class UserServiceImp implements UserService {
    private static Logger log = Logger.getLogger("UserServiceImp");
    private Map<String, String> usersData = new ConcurrentHashMap<String, String>();

    public UserServiceImp() {
        log.info("调试开始～～～");
        usersData.put("1", "花超");
        usersData.put("2", "沈阳");
        usersData.put("3", "黄君成");
        usersData.put("4", "郭宝照");
        usersData.put("5", "黄智强");
        log.info("用户数据初始化..完毕");
    }

    /**
     * 获取用户
     *
     * @param userNo
     * @return
     */
    @Override
    @Cacheable(value = "userCache", key = "'get'+#userNo")
    public String get(String userNo) {
        log.info("数据库中查到此用户号[" + userNo + "]对应的用户名为[" + usersData.get(userNo) + "]");
        return usersData.get(userNo);
    }

    /**
     * 更新用户
     *
     * @param userNo
     */
    @Override
    @CacheEvict(value = "userCache", key = "'get'+#userNo")
    public void update(String userNo) {
        log.info("移除缓存中此用户号[" + userNo + "]对应的用户名[" + usersData.get(userNo) + "]的缓存");
    }

    /**
     * 删除全部用户
     */
    @Override
    @CacheEvict(value = "userCache", allEntries = true)
    public void removeAll() {
        log.info("移除缓存中的所有数据");
    }
}
