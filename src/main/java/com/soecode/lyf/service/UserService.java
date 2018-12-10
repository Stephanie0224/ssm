package com.soecode.lyf.service;

import java.awt.print.Book;
import java.util.List;

import com.soecode.lyf.entity.User;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface UserService {

	/**
	 * 查询一本图书
	 * 
	 * @param userId
	 * @return
	 */
	User getById(long userId);

	/**
	 * 查询所有图书
	 * 
	 * @return
	 */
	List<User> getList();

	void save(User user);

	Integer findUserByUserNameAndPass(User user);

    void delete(Long userId);

	void update(User user);
}
