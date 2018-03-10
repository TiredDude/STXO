package com.dev.game.service.impl;

import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.game.dao.UserDao;
import com.dev.game.domain.User;
import com.dev.game.service.UserService;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User findById(Long id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findByRole(Role role) {
		return userDao.findByProperty("role", role);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}

	@Override
	public void saveOrUpdate(List<User> users) {
		userDao.saveOrUpdate(users);
	}

	@Override
	public void remove(User user) {
		userDao.delete(user);
	}

	@Override
	public void removeById(Long id) {
		User user = userDao.findById(id);
		userDao.delete(user);
	}

}
