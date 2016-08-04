/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package la.ability.parametrizar.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import la.abality.parametrizar.NoSuchT065BACIUDGENEException;
import la.abality.parametrizar.model.T065BACIUDGENE;
import la.abality.parametrizar.service.persistence.T065BACIUDGENEPersistence;
import la.abality.parametrizar.service.persistence.T065BACIUDGENEUtil;
import la.ability.parametrizar.model.impl.T065BACIUDGENEImpl;
import la.ability.parametrizar.model.impl.T065BACIUDGENEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t065 b a c i u d g e n e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author VillarTechnologies
 * @see T065BACIUDGENEPersistence
 * @see T065BACIUDGENEUtil
 * @generated
 */
public class T065BACIUDGENEPersistenceImpl extends BasePersistenceImpl<T065BACIUDGENE>
	implements T065BACIUDGENEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link T065BACIUDGENEUtil} to access the t065 b a c i u d g e n e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = T065BACIUDGENEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
			T065BACIUDGENEModelImpl.FINDER_CACHE_ENABLED,
			T065BACIUDGENEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
			T065BACIUDGENEModelImpl.FINDER_CACHE_ENABLED,
			T065BACIUDGENEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
			T065BACIUDGENEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the t065 b a c i u d g e n e in the entity cache if it is enabled.
	 *
	 * @param t065baciudgene the t065 b a c i u d g e n e
	 */
	public void cacheResult(T065BACIUDGENE t065baciudgene) {
		EntityCacheUtil.putResult(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
			T065BACIUDGENEImpl.class, t065baciudgene.getPrimaryKey(),
			t065baciudgene);

		t065baciudgene.resetOriginalValues();
	}

	/**
	 * Caches the t065 b a c i u d g e n es in the entity cache if it is enabled.
	 *
	 * @param t065baciudgenes the t065 b a c i u d g e n es
	 */
	public void cacheResult(List<T065BACIUDGENE> t065baciudgenes) {
		for (T065BACIUDGENE t065baciudgene : t065baciudgenes) {
			if (EntityCacheUtil.getResult(
						T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
						T065BACIUDGENEImpl.class, t065baciudgene.getPrimaryKey()) == null) {
				cacheResult(t065baciudgene);
			}
			else {
				t065baciudgene.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t065 b a c i u d g e n es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(T065BACIUDGENEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(T065BACIUDGENEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t065 b a c i u d g e n e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(T065BACIUDGENE t065baciudgene) {
		EntityCacheUtil.removeResult(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
			T065BACIUDGENEImpl.class, t065baciudgene.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<T065BACIUDGENE> t065baciudgenes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (T065BACIUDGENE t065baciudgene : t065baciudgenes) {
			EntityCacheUtil.removeResult(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
				T065BACIUDGENEImpl.class, t065baciudgene.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t065 b a c i u d g e n e with the primary key. Does not add the t065 b a c i u d g e n e to the database.
	 *
	 * @param A065CODICIUD the primary key for the new t065 b a c i u d g e n e
	 * @return the new t065 b a c i u d g e n e
	 */
	public T065BACIUDGENE create(String A065CODICIUD) {
		T065BACIUDGENE t065baciudgene = new T065BACIUDGENEImpl();

		t065baciudgene.setNew(true);
		t065baciudgene.setPrimaryKey(A065CODICIUD);

		return t065baciudgene;
	}

	/**
	 * Removes the t065 b a c i u d g e n e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e that was removed
	 * @throws la.abality.parametrizar.NoSuchT065BACIUDGENEException if a t065 b a c i u d g e n e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public T065BACIUDGENE remove(String A065CODICIUD)
		throws NoSuchT065BACIUDGENEException, SystemException {
		return remove((Serializable)A065CODICIUD);
	}

	/**
	 * Removes the t065 b a c i u d g e n e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e that was removed
	 * @throws la.abality.parametrizar.NoSuchT065BACIUDGENEException if a t065 b a c i u d g e n e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public T065BACIUDGENE remove(Serializable primaryKey)
		throws NoSuchT065BACIUDGENEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			T065BACIUDGENE t065baciudgene = (T065BACIUDGENE)session.get(T065BACIUDGENEImpl.class,
					primaryKey);

			if (t065baciudgene == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchT065BACIUDGENEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(t065baciudgene);
		}
		catch (NoSuchT065BACIUDGENEException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected T065BACIUDGENE removeImpl(T065BACIUDGENE t065baciudgene)
		throws SystemException {
		t065baciudgene = toUnwrappedModel(t065baciudgene);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, t065baciudgene);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(t065baciudgene);

		return t065baciudgene;
	}

	@Override
	public T065BACIUDGENE updateImpl(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene,
		boolean merge) throws SystemException {
		t065baciudgene = toUnwrappedModel(t065baciudgene);

		boolean isNew = t065baciudgene.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, t065baciudgene, merge);

			t065baciudgene.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
			T065BACIUDGENEImpl.class, t065baciudgene.getPrimaryKey(),
			t065baciudgene);

		return t065baciudgene;
	}

	protected T065BACIUDGENE toUnwrappedModel(T065BACIUDGENE t065baciudgene) {
		if (t065baciudgene instanceof T065BACIUDGENEImpl) {
			return t065baciudgene;
		}

		T065BACIUDGENEImpl t065baciudgeneImpl = new T065BACIUDGENEImpl();

		t065baciudgeneImpl.setNew(t065baciudgene.isNew());
		t065baciudgeneImpl.setPrimaryKey(t065baciudgene.getPrimaryKey());

		t065baciudgeneImpl.setA065CODICIUD(t065baciudgene.getA065CODICIUD());
		t065baciudgeneImpl.setA065DESCCIUD(t065baciudgene.getA065DESCCIUD());
		t065baciudgeneImpl.setA065CODIORG(t065baciudgene.getA065CODIORG());

		return t065baciudgeneImpl;
	}

	/**
	 * Returns the t065 b a c i u d g e n e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e
	 * @throws com.liferay.portal.NoSuchModelException if a t065 b a c i u d g e n e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public T065BACIUDGENE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the t065 b a c i u d g e n e with the primary key or throws a {@link la.abality.parametrizar.NoSuchT065BACIUDGENEException} if it could not be found.
	 *
	 * @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e
	 * @throws la.abality.parametrizar.NoSuchT065BACIUDGENEException if a t065 b a c i u d g e n e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public T065BACIUDGENE findByPrimaryKey(String A065CODICIUD)
		throws NoSuchT065BACIUDGENEException, SystemException {
		T065BACIUDGENE t065baciudgene = fetchByPrimaryKey(A065CODICIUD);

		if (t065baciudgene == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + A065CODICIUD);
			}

			throw new NoSuchT065BACIUDGENEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				A065CODICIUD);
		}

		return t065baciudgene;
	}

	/**
	 * Returns the t065 b a c i u d g e n e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e, or <code>null</code> if a t065 b a c i u d g e n e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public T065BACIUDGENE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the t065 b a c i u d g e n e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e, or <code>null</code> if a t065 b a c i u d g e n e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public T065BACIUDGENE fetchByPrimaryKey(String A065CODICIUD)
		throws SystemException {
		T065BACIUDGENE t065baciudgene = (T065BACIUDGENE)EntityCacheUtil.getResult(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
				T065BACIUDGENEImpl.class, A065CODICIUD);

		if (t065baciudgene == _nullT065BACIUDGENE) {
			return null;
		}

		if (t065baciudgene == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				t065baciudgene = (T065BACIUDGENE)session.get(T065BACIUDGENEImpl.class,
						A065CODICIUD);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (t065baciudgene != null) {
					cacheResult(t065baciudgene);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(T065BACIUDGENEModelImpl.ENTITY_CACHE_ENABLED,
						T065BACIUDGENEImpl.class, A065CODICIUD,
						_nullT065BACIUDGENE);
				}

				closeSession(session);
			}
		}

		return t065baciudgene;
	}

	/**
	 * Returns all the t065 b a c i u d g e n es.
	 *
	 * @return the t065 b a c i u d g e n es
	 * @throws SystemException if a system exception occurred
	 */
	public List<T065BACIUDGENE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t065 b a c i u d g e n es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t065 b a c i u d g e n es
	 * @param end the upper bound of the range of t065 b a c i u d g e n es (not inclusive)
	 * @return the range of t065 b a c i u d g e n es
	 * @throws SystemException if a system exception occurred
	 */
	public List<T065BACIUDGENE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t065 b a c i u d g e n es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t065 b a c i u d g e n es
	 * @param end the upper bound of the range of t065 b a c i u d g e n es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t065 b a c i u d g e n es
	 * @throws SystemException if a system exception occurred
	 */
	public List<T065BACIUDGENE> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<T065BACIUDGENE> list = (List<T065BACIUDGENE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_T065BACIUDGENE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_T065BACIUDGENE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<T065BACIUDGENE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<T065BACIUDGENE>)QueryUtil.list(q,
							getDialect(), start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the t065 b a c i u d g e n es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (T065BACIUDGENE t065baciudgene : findAll()) {
			remove(t065baciudgene);
		}
	}

	/**
	 * Returns the number of t065 b a c i u d g e n es.
	 *
	 * @return the number of t065 b a c i u d g e n es
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_T065BACIUDGENE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the t065 b a c i u d g e n e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.abality.parametrizar.model.T065BACIUDGENE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<T065BACIUDGENE>> listenersList = new ArrayList<ModelListener<T065BACIUDGENE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<T065BACIUDGENE>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(T065BACIUDGENEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = T065BACIUDGENEPersistence.class)
	protected T065BACIUDGENEPersistence t065baciudgenePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_T065BACIUDGENE = "SELECT t065baciudgene FROM T065BACIUDGENE t065baciudgene";
	private static final String _SQL_COUNT_T065BACIUDGENE = "SELECT COUNT(t065baciudgene) FROM T065BACIUDGENE t065baciudgene";
	private static final String _ORDER_BY_ENTITY_ALIAS = "t065baciudgene.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No T065BACIUDGENE exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(T065BACIUDGENEPersistenceImpl.class);
	private static T065BACIUDGENE _nullT065BACIUDGENE = new T065BACIUDGENEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<T065BACIUDGENE> toCacheModel() {
				return _nullT065BACIUDGENECacheModel;
			}
		};

	private static CacheModel<T065BACIUDGENE> _nullT065BACIUDGENECacheModel = new CacheModel<T065BACIUDGENE>() {
			public T065BACIUDGENE toEntityModel() {
				return _nullT065BACIUDGENE;
			}
		};
}