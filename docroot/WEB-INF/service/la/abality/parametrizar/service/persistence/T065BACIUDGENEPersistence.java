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

import com.liferay.portal.service.persistence.BasePersistence;

import la.abality.parametrizar.model.T065BACIUDGENE;

/**
 * The persistence interface for the t065 b a c i u d g e n e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author VillarTechnologies
 * @see T065BACIUDGENEPersistenceImpl
 * @see T065BACIUDGENEUtil
 * @generated
 */
public interface T065BACIUDGENEPersistence extends BasePersistence<T065BACIUDGENE> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link T065BACIUDGENEUtil} to access the t065 b a c i u d g e n e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the t065 b a c i u d g e n e in the entity cache if it is enabled.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	*/
	public void cacheResult(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene);

	/**
	* Caches the t065 b a c i u d g e n es in the entity cache if it is enabled.
	*
	* @param t065baciudgenes the t065 b a c i u d g e n es
	*/
	public void cacheResult(
		java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> t065baciudgenes);

	/**
	* Creates a new t065 b a c i u d g e n e with the primary key. Does not add the t065 b a c i u d g e n e to the database.
	*
	* @param A065CODICIUD the primary key for the new t065 b a c i u d g e n e
	* @return the new t065 b a c i u d g e n e
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE create(
		java.lang.String A065CODICIUD);

	/**
	* Removes the t065 b a c i u d g e n e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was removed
	* @throws la.abality.parametrizar.NoSuchT065BACIUDGENEException if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE remove(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.abality.parametrizar.NoSuchT065BACIUDGENEException;

	public la.abality.parametrizar.model.T065BACIUDGENE updateImpl(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t065 b a c i u d g e n e with the primary key or throws a {@link la.abality.parametrizar.NoSuchT065BACIUDGENEException} if it could not be found.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e
	* @throws la.abality.parametrizar.NoSuchT065BACIUDGENEException if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE findByPrimaryKey(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.abality.parametrizar.NoSuchT065BACIUDGENEException;

	/**
	* Returns the t065 b a c i u d g e n e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e, or <code>null</code> if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE fetchByPrimaryKey(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t065 b a c i u d g e n es.
	*
	* @return the t065 b a c i u d g e n es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t065 b a c i u d g e n es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t065 b a c i u d g e n es.
	*
	* @return the number of t065 b a c i u d g e n es
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}