package com.chips.it.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.chips.it.entity.User;
import com.chips.it.mapper.UserMapper;
import com.chips.it.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表 服务层实现。
 *
 * @author renxingwei
 * @since 2023-10-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
