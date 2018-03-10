package com.dev.game.dao;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.OpenSessionInViewFilter;

public class OpenSessionInFilter extends OpenSessionInViewFilter {
	
	private FlushMode flushMode = FlushMode.COMMIT;
	
	public void setFlushMode(FlushMode flushMode) {
		this.flushMode = flushMode;
	}

	protected FlushMode getFlushMode() {
		return this.flushMode;
	}
	
	
	protected Session getSession(SessionFactory sessionFactory) throws DataAccessResourceFailureException {
		Session session = SessionFactoryUtils.getSession(sessionFactory, true);
		FlushMode flushMode = getFlushMode();
		if (flushMode != null) {
			session.setFlushMode(flushMode);
		}
		return session;
	}
	
}
