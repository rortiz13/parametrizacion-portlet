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

package la.abality.parametrizar.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link T065BACIUDGENELocalService}.
 * </p>
 *
 * @author    VillarTechnologies
 * @see       T065BACIUDGENELocalService
 * @generated
 */
public class T065BACIUDGENELocalServiceWrapper
	implements T065BACIUDGENELocalService,
		ServiceWrapper<T065BACIUDGENELocalService> {
	public T065BACIUDGENELocalServiceWrapper(
		T065BACIUDGENELocalService t065baciudgeneLocalService) {
		_t065baciudgeneLocalService = t065baciudgeneLocalService;
	}

	/**
	* Adds the t065 b a c i u d g e n e to the database. Also notifies the appropriate model listeners.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE addT065BACIUDGENE(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.addT065BACIUDGENE(t065baciudgene);
	}

	/**
	* Creates a new t065 b a c i u d g e n e with the primary key. Does not add the t065 b a c i u d g e n e to the database.
	*
	* @param A065CODICIUD the primary key for the new t065 b a c i u d g e n e
	* @return the new t065 b a c i u d g e n e
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE createT065BACIUDGENE(
		java.lang.String A065CODICIUD) {
		return _t065baciudgeneLocalService.createT065BACIUDGENE(A065CODICIUD);
	}

	/**
	* Deletes the t065 b a c i u d g e n e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was removed
	* @throws PortalException if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE deleteT065BACIUDGENE(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.deleteT065BACIUDGENE(A065CODICIUD);
	}

	/**
	* Deletes the t065 b a c i u d g e n e from the database. Also notifies the appropriate model listeners.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE deleteT065BACIUDGENE(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.deleteT065BACIUDGENE(t065baciudgene);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _t065baciudgeneLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.abality.parametrizar.model.T065BACIUDGENE fetchT065BACIUDGENE(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.fetchT065BACIUDGENE(A065CODICIUD);
	}

	/**
	* Returns the t065 b a c i u d g e n e with the primary key.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e
	* @throws PortalException if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE getT065BACIUDGENE(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.getT065BACIUDGENE(A065CODICIUD);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> getT065BACIUDGENEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.getT065BACIUDGENEs(start, end);
	}

	/**
	* Returns the number of t065 b a c i u d g e n es.
	*
	* @return the number of t065 b a c i u d g e n es
	* @throws SystemException if a system exception occurred
	*/
	public int getT065BACIUDGENEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.getT065BACIUDGENEsCount();
	}

	/**
	* Updates the t065 b a c i u d g e n e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE updateT065BACIUDGENE(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.updateT065BACIUDGENE(t065baciudgene);
	}

	/**
	* Updates the t065 b a c i u d g e n e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	* @param merge whether to merge the t065 b a c i u d g e n e with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t065 b a c i u d g e n e that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.abality.parametrizar.model.T065BACIUDGENE updateT065BACIUDGENE(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _t065baciudgeneLocalService.updateT065BACIUDGENE(t065baciudgene,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _t065baciudgeneLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_t065baciudgeneLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _t065baciudgeneLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public T065BACIUDGENELocalService getWrappedT065BACIUDGENELocalService() {
		return _t065baciudgeneLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedT065BACIUDGENELocalService(
		T065BACIUDGENELocalService t065baciudgeneLocalService) {
		_t065baciudgeneLocalService = t065baciudgeneLocalService;
	}

	public T065BACIUDGENELocalService getWrappedService() {
		return _t065baciudgeneLocalService;
	}

	public void setWrappedService(
		T065BACIUDGENELocalService t065baciudgeneLocalService) {
		_t065baciudgeneLocalService = t065baciudgeneLocalService;
	}

	private T065BACIUDGENELocalService _t065baciudgeneLocalService;
}