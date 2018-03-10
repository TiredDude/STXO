package com.dev.game.dao;

import com.dev.game.domain.User;


/**
 * The Interface UserDao.
 */
public interface UserDao extends GenericDao<User> {

	/**
	 * Gets user by login.
	 * 
	 * @param login
	 *            the login
	 * @return user
	 */
	User getByLogin(String login);

}
