package com.dev.game.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dev.game.dao.GenericDao;
import com.dev.game.dao.exceptions.DaoException;

@SuppressWarnings("unchecked")
public abstract class GenericDaoImpl<T> extends HibernateDaoSupport implements
		GenericDao<T> {

	public GenericDaoImpl(SessionFactory sessionFactory) {
		setHibernateTemplate(new HibernateTemplate(sessionFactory));
	}

	public synchronized T findById(Long id) throws DaoException {
		try {
			return (T) getHibernateTemplate().get(getEntityClass(), id);
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized List<T> findByExample(T example) throws DaoException {
		try {
			return (List<T>) getHibernateTemplate().findByExample(example);
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized T findUniqueByExample(T example) throws DaoException {
		try {
			return (T) getHibernateTemplate().findByExample(example, 0, 1);
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized List<T> findByProperty(String propertyName,
			Object propertyValue) throws DaoException {
		return findByProperty(propertyName, propertyValue, null);
	}

	public synchronized List<T> findByProperty(String propertyName,
			Object propertyValue, String orderBy) throws DaoException {
		try {
			return getHibernateTemplate().find(
					orderBy != null ? String.format(
							"from %s o where o.%s = '%s' order by %s",
							getEntityClass().getSimpleName(), propertyName,
							propertyValue, orderBy) : String.format(
							"from %s o where o.%s = '%s'", getEntityClass()
									.getSimpleName(), propertyName,
							propertyValue));
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized List<T> getAll() throws DaoException {
		try {
			return (List<T>) getHibernateTemplate().loadAll(getEntityClass());
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized void persist(Collection<T> entities)
			throws DaoException {
		try {
			for (T entity : entities) {
				getHibernateTemplate().persist(entity);
			}
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized void persist(T... entities) throws DaoException {
		persist(Arrays.asList(entities));
	}

	public synchronized void saveOrUpdate(Collection<T> entities)
			throws DaoException {
		try {
			for (T entity : entities) {
				getHibernateTemplate().saveOrUpdate(entity);
				getHibernateTemplate().flush();
			}
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized void saveOrUpdate(T... entities) throws DaoException {
		saveOrUpdate(Arrays.asList(entities));
	}

	public synchronized void update(Collection<T> entities) throws DaoException {
		try {
			for (T entity : entities) {
				getHibernateTemplate().update(entity);
			}
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized void update(T... entities) throws DaoException {
		update(Arrays.asList(entities));
	}

	public synchronized void refresh(Collection<T> entities)
			throws DaoException {
		try {
			for (T entity : entities) {
				getHibernateTemplate().refresh(entity);
			}
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized void refresh(T... entities) throws DaoException {
		refresh(Arrays.asList(entities));
	}

	public synchronized T merge(T detachedEntity) throws DaoException {
		try {
			return (T) getHibernateTemplate().merge(detachedEntity);
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized void delete(Collection<T> entities) throws DaoException {
		try {
			if (entities != null) {
				for (T entity : entities) {
					getHibernateTemplate().delete(entity);
				}
			}
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized void delete(T... entities) throws DaoException {
		delete(Arrays.asList(entities));
	}

	public synchronized void deleteAll() throws DaoException {
		try {
			getHibernateTemplate().deleteAll(
					getHibernateTemplate().loadAll(getEntityClass()));
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	@SuppressWarnings("rawtypes")
	public synchronized List findByCriteria(DetachedCriteria criteria)
			throws DaoException {
		try {
			return getHibernateTemplate().findByCriteria(criteria);
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized List<T> findByCriteria(DetachedCriteria criteria,
			Integer from, Integer size, String sortProperty,
			String sortDirection) throws DaoException {

		try {
			String[] splitSortProperty = sortProperty.split("\\.");
			int length = splitSortProperty.length;
			for (int i = 0; i < length - 1; i++) {
				criteria = criteria.createCriteria(splitSortProperty[i]);
			}
			criteria.addOrder(sortDirection.equals("asc") ? Order
					.asc(splitSortProperty[length - 1]) : Order
					.desc(splitSortProperty[length - 1]));

			return getHibernateTemplate().findByCriteria(criteria, from, size);

		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	public synchronized List<T> findByNamedQuery(String queryName,
			Object... parameters) throws DaoException {
		try {
			return getHibernateTemplate().findByNamedQuery(queryName,
					parameters);
		} catch (RuntimeException re) {
			throw new DaoException(re);
		}
	}

	private Class<?> getEntityClass() {
		ParameterizedType superclass = (ParameterizedType) getClass()
				.getGenericSuperclass();
		return (Class<?>) superclass.getActualTypeArguments()[0];
	}
}
