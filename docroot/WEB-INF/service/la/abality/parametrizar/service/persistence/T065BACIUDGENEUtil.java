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

package la.abality.parametrizar.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import la.abality.parametrizar.model.T065BACIUDGENE;

import java.util.List;

/**
 * The persistence utility for the t065 b a c i u d g e n e service. This utility wraps {@link T065BACIUDGENEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author VillarTechnologies
 * @see T065BACIUDGENEPersistence
 * @see T065BACIUDGENEPersistenceImpl
 * @generated
 */
public class T065BACIUDGENEUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(T065BACIUDGENE t065baciudgene) {
		getPersistence().clearCache(t065baciudgene);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<T065BACIUDGENE> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<T065BACIUDGENE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<T065BACIUDGENE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static T065BACIUDGENE update(T065BACIUDGENE t065baciudgene,
		boolean merge) throws SystemException {
		return getPersistence().update(t065baciudgene, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static T065BACIUDGENE update(T065BACIUDGENE t065baciudgene,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(t065baciudgene, merge, serviceContext);
	}

	/**
	* Caches the t065 b a c i u d g e n e in the entity cache if it is enabled.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	*/
	public static void cacheResult(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene) {
		getPersistence().cacheResult(t065baciudgene);
	}

	/**
	* Caches the t065 b a c i u d g e n es in the entity cache if it is enabled.
	*
	* @param t065baciudgenes the t065 b a c i u d g e n es
	*/
	public static void cacheResult(
		java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> t065baciudgenes) {
		getPersistence().cacheResult(t065baciudgenes);
	}

	/**
	* Creates a new t065 b a c i u d g e n e with the primary key. Does not add the t065 b a c i u d g e n e to the database.
	*
	* @param A065CODICIUD the primary key for the new t065 b a c i u d g e n e
	* @return the new t065 b a c i u d g e n e
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE create(
		java.lang.String A065CODICIUD) {
		return getPersistence().create(A065CODICIUD);
	}

	/**
	* Removes the t065 b a c i u d g e n e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was removed
	* @throws la.abality.parametrizar.NoSuchT065BACIUDGENEException if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE remove(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.abality.parametrizar.NoSuchT065BACIUDGENEException {
		return getPersistence().remove(A065CODICIUD);
	}

	public static la.abality.parametrizar.model.T065BACIUDGENE updateImpl(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(t065baciudgene, merge);
	}

	/**
	* Returns the t065 b a c i u d g e n e with the primary key or throws a {@link la.abality.parametrizar.NoSuchT065BACIUDGENEException} if it could not be found.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e
	* @throws la.abality.parametrizar.NoSuchT065BACIUDGENEException if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE findByPrimaryKey(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.abality.parametrizar.NoSuchT065BACIUDGENEException {
		return getPersistence().findByPrimaryKey(A065CODICIUD);
	}

	/**
	* Returns the t065 b a c i u d g e n e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e, or <code>null</code> if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE fetchByPrimaryKey(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(A065CODICIUD);
	}

	/**
	* Returns all the t065 b a c i u d g e n es.
	*
	* @return the t065 b a c i u d g e n es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t065 b a c i u d g e n es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of t065 b a c i u d g e n es.
	*
	* @return the number of t065 b a c i u d g e n es
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static T065BACIUDGENEPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (T065BACIUDGENEPersistence)PortletBeanLocatorUtil.locate(la.abality.parametrizar.service.ClpSerializer.getServletContextName(),
					T065BACIUDGENEPersistence.class.getName());

			ReferenceRegistry.registerReference(T065BACIUDGENEUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(T065BACIUDGENEPersistence persistence) {
	}

	private static T065BACIUDGENEPersistence _persistence;
}