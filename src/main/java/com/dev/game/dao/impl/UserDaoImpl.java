package com.dev.game.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dev.game.dao.UserDao;
import com.dev.game.domain.User;

@Repository(value = "userDao")
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Transactional(readOnly = true)
	public User getByLogin(String login) {
		User result = null;
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("login", login));
		result = (User) criteria.uniqueResult();
		return result;
	}

}
