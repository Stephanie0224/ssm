package com.soecode.lyf.dao;

import java.util.List;
import com.soecode.lyf.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {


	User queryById(long id);


	List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	int updateUser(User user);

	void save(User user);

	Integer findUserByUserNameAndPass(User user);

    void delete(Long userId);
}
