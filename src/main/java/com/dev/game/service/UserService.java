package com.dev.game.service;

import java.util.List;

import javax.management.relation.Role;

import com.dev.game.domain.User;

public interface UserService {

	public User findById(Long id);

	public List<User> findByRole(Role role);

	public List<User> getAll();

	public void saveOrUpdate(User user);

	public void saveOrUpdate(List<User> users);

	public void remove(User user);

	public void removeById(Long id);

}
