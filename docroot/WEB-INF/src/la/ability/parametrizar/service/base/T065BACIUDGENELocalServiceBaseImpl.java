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

package la.ability.parametrizar.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import la.abality.parametrizar.model.T065BACIUDGENE;
import la.abality.parametrizar.service.T065BACIUDGENELocalService;
import la.abality.parametrizar.service.persistence.T065BACIUDGENEPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the t065 b a c i u d g e n e local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link la.ability.parametrizar.service.impl.T065BACIUDGENELocalServiceImpl}.
 * </p>
 *
 * @author VillarTechnologies
 * @see la.ability.parametrizar.service.impl.T065BACIUDGENELocalServiceImpl
 * @see la.abality.parametrizar.service.T065BACIUDGENELocalServiceUtil
 * @generated
 */
public abstract class T065BACIUDGENELocalServiceBaseImpl
	extends BaseLocalServiceImpl implements T065BACIUDGENELocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link la.abality.parametrizar.service.T065BACIUDGENELocalServiceUtil} to access the t065 b a c i u d g e n e local service.
	 */

	/**
	 * Adds the t065 b a c i u d g e n e to the database. Also notifies the appropriate model listeners.
	 *
	 * @param t065baciudgene the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public T065BACIUDGENE addT065BACIUDGENE(T065BACIUDGENE t065baciudgene)
		throws SystemException {
		t065baciudgene.setNew(true);

		return t065baciudgenePersistence.update(t065baciudgene, false);
	}

	/**
	 * Creates a new t065 b a c i u d g e n e with the primary key. Does not add the t065 b a c i u d g e n e to the database.
	 *
	 * @param A065CODICIUD the primary key for the new t065 b a c i u d g e n e
	 * @return the new t065 b a c i u d g e n e
	 */
	public T065BACIUDGENE createT065BACIUDGENE(String A065CODICIUD) {
		return t065baciudgenePersistence.create(A065CODICIUD);
	}

	/**
	 * Deletes the t065 b a c i u d g e n e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e that was removed
	 * @throws PortalException if a t065 b a c i u d g e n e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public T065BACIUDGENE deleteT065BACIUDGENE(String A065CODICIUD)
		throws PortalException, SystemException {
		return t065baciudgenePersistence.remove(A065CODICIUD);
	}

	/**
	 * Deletes the t065 b a c i u d g e n e from the database. Also notifies the appropriate model listeners.
	 *
	 * @param t065baciudgene the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public T065BACIUDGENE deleteT065BACIUDGENE(T065BACIUDGENE t065baciudgene)
		throws SystemException {
		return t065baciudgenePersistence.remove(t065baciudgene);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(T065BACIUDGENE.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return t065baciudgenePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return t065baciudgenePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return t065baciudgenePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return t065baciudgenePersistence.countWithDynamicQuery(dynamicQuery);
	}

	public T065BACIUDGENE fetchT065BACIUDGENE(String A065CODICIUD)
		throws SystemException {
		return t065baciudgenePersistence.fetchByPrimaryKey(A065CODICIUD);
	}

	/**
	 * Returns the t065 b a c i u d g e n e with the primary key.
	 *
	 * @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e
	 * @throws PortalException if a t065 b a c i u d g e n e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public T065BACIUDGENE getT065BACIUDGENE(String A065CODICIUD)
		throws PortalException, SystemException {
		return t065baciudgenePersistence.findByPrimaryKey(A065CODICIUD);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return t065baciudgenePersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<T065BACIUDGENE> getT065BACIUDGENEs(int start, int end)
		throws SystemException {
		return t065baciudgenePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of t065 b a c i u d g e n es.
	 *
	 * @return the number of t065 b a c i u d g e n es
	 * @throws SystemException if a system exception occurred
	 */
	public int getT065BACIUDGENEsCount() throws SystemException {
		return t065baciudgenePersistence.countAll();
	}

	/**
	 * Updates the t065 b a c i u d g e n e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param t065baciudgene the t065 b a c i u d g e n e
	 * @return the t065 b a c i u d g e n e that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public T065BACIUDGENE updateT065BACIUDGENE(T065BACIUDGENE t065baciudgene)
		throws SystemException {
		return updateT065BACIUDGENE(t065baciudgene, true);
	}

	/**
	 * Updates the t065 b a c i u d g e n e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param t065baciudgene the t065 b a c i u d g e n e
	 * @param merge whether to merge the t065 b a c i u d g e n e with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the t065 b a c i u d g e n e that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public T065BACIUDGENE updateT065BACIUDGENE(T065BACIUDGENE t065baciudgene,
		boolean merge) throws SystemException {
		t065baciudgene.setNew(false);

		return t065baciudgenePersistence.update(t065baciudgene, merge);
	}

	/**
	 * Returns the t065 b a c i u d g e n e local service.
	 *
	 * @return the t065 b a c i u d g e n e local service
	 */
	public T065BACIUDGENELocalService getT065BACIUDGENELocalService() {
		return t065baciudgeneLocalService;
	}

	/**
	 * Sets the t065 b a c i u d g e n e local service.
	 *
	 * @param t065baciudgeneLocalService the t065 b a c i u d g e n e local service
	 */
	public void setT065BACIUDGENELocalService(
		T065BACIUDGENELocalService t065baciudgeneLocalService) {
		this.t065baciudgeneLocalService = t065baciudgeneLocalService;
	}

	/**
	 * Returns the t065 b a c i u d g e n e persistence.
	 *
	 * @return the t065 b a c i u d g e n e persistence
	 */
	public T065BACIUDGENEPersistence getT065BACIUDGENEPersistence() {
		return t065baciudgenePersistence;
	}

	/**
	 * Sets the t065 b a c i u d g e n e persistence.
	 *
	 * @param t065baciudgenePersistence the t065 b a c i u d g e n e persistence
	 */
	public void setT065BACIUDGENEPersistence(
		T065BACIUDGENEPersistence t065baciudgenePersistence) {
		this.t065baciudgenePersistence = t065baciudgenePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("la.abality.parametrizar.model.T065BACIUDGENE",
			t065baciudgeneLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"la.abality.parametrizar.model.T065BACIUDGENE");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return T065BACIUDGENE.class;
	}

	protected String getModelClassName() {
		return T065BACIUDGENE.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = t065baciudgenePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = T065BACIUDGENELocalService.class)
	protected T065BACIUDGENELocalService t065baciudgeneLocalService;
	@BeanReference(type = T065BACIUDGENEPersistence.class)
	protected T065BACIUDGENEPersistence t065baciudgenePersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private T065BACIUDGENELocalServiceClpInvoker _clpInvoker = new T065BACIUDGENELocalServiceClpInvoker();
}