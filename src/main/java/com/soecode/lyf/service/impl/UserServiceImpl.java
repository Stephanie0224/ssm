package com.soecode.lyf.service.impl;

import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soecode.lyf.dao.UserDao;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private UserDao userDao;


	public User getById(long user) {
		return userDao.queryById(user);
	}

	public List<User> getList() {
		return userDao.queryAll(1,100);
	}

	public void save(User user) {
        userDao.save(user);
	}

	public Integer findUserByUserNameAndPass(User user) {
     return   userDao.findUserByUserNameAndPass(user);
	}

	public void delete(Long userId) {
		userDao.delete(userId);
	}

	public void update(User user) {
		userDao.updateUser(user);
	}


}
