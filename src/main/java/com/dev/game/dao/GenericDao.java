package com.dev.game.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.dev.game.dao.exceptions.DaoException;

/**
 * The Interface GenericDao.
 * 
 * @param <T>
 *            the generic type
 */
public interface GenericDao<T> {

    /**
     * Find by id.
     * 
     * @param id
     *            the id
     * @return T
     * @throws DaoException
     *             the dao exception
     */
    T findById(Long id) throws DaoException;

    /**
     * Find by example.
     * 
     * @param example
     *            the example
     * @return the list
     * @throws DaoException
     *             the dao exception
     */
    List<T> findByExample(T example) throws DaoException;

    /**
     * Find unique by example.
     * 
     * @param example
     *            the example
     * @return T
     * @throws DaoException
     *             the dao exception
     */
    T findUniqueByExample(T example) throws DaoException;

    /**
     * Find by property.
     * 
     * @param propertyName
     *            the property name
     * @param propertyValue
     *            the property value
     * @return the list
     * @throws DaoException
     *             the dao exception
     */
    List<T> findByProperty(String propertyName, Object propertyValue)
	    throws DaoException;

    /**
     * Find by property.
     * 
     * @param propertyName
     *            the property name
     * @param propertyValue
     *            the property value
     * @param orderBy
     *            the order by
     * @return the list
     * @throws DaoException
     *             the dao exception
     */
    List<T> findByProperty(String propertyName, Object propertyValue,
	    String orderBy) throws DaoException;

    /**
     * Get all
     * 
     * @return list
     * @throws DaoException
     */
    List<T> getAll() throws DaoException;

    /**
     * Persist.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void persist(Collection<T> entities) throws DaoException;

    /**
     * Persist.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void persist(T... entities) throws DaoException;

    /**
     * Save or update.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void saveOrUpdate(Collection<T> entities) throws DaoException;

    /**
     * Save or update.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void saveOrUpdate(T... entities) throws DaoException;

    /**
     * Update.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void update(Collection<T> entities) throws DaoException;

    /**
     * Update.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void update(T... entities) throws DaoException;

    /**
     * Refresh.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void refresh(Collection<T> entities) throws DaoException;

    /**
     * Refresh.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void refresh(T... entities) throws DaoException;

    /**
     * Merge.
     * 
     * @param detachedEntity
     *            the detached entity
     * @return T
     * @throws DaoException
     *             the dao exception
     */
    T merge(T detachedEntity) throws DaoException;

    /**
     * Delete.
     * 
     * @param entities
     *            the entities
     * @throws DaoException
     *             the dao exception
     */
    void delete(Collection<T> entities) throws DaoException;

    /**
     * Delete.
     * 
     * @param entities
     *            the entities to delete
     * @throws DaoException
     *             the dao exception
     */
    void delete(T... entities) throws DaoException;

    /**
     * Delete all.
     * 
     * @throws DaoException
     *             the dao exception
     */
    void deleteAll() throws DaoException;

    /**
     * Find by criteria.
     * 
     * @param criteria
     *            the criteria
     * @return the list
     * @throws DaoException
     *             the dao exception
     */
    @SuppressWarnings("rawtypes")
    List findByCriteria(DetachedCriteria criteria) throws DaoException;

    /**
     * Find by criteria.
     * 
     * @param criteria
     *            the criteria
     * @param from
     *            the from
     * @param size
     *            the size
     * @param sortProperty
     *            the sort property
     * @param sortDirection
     *            the sort direction
     * @return the list
     * @throws DaoException
     *             the dao exception
     */
    List<T> findByCriteria(DetachedCriteria criteria, Integer from,
	    Integer size, String sortProperty, String sortDirection)
	    throws DaoException;

    /**
     * Find by named query.
     * 
     * @param queryName
     *            the query name
     * @param parameters
     *            the parameters
     * @return the list
     * @throws DaoException
     *             the dao exception
     */
    List<T> findByNamedQuery(String queryName, Object... parameters)
	    throws DaoException;
}
