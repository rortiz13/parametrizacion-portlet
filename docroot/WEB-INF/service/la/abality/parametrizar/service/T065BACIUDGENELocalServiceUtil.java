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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the t065 b a c i u d g e n e local service. This utility wraps {@link la.abality.parametrizar.service.impl.T065BACIUDGENELocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author VillarTechnologies
 * @see T065BACIUDGENELocalService
 * @see la.abality.parametrizar.service.base.T065BACIUDGENELocalServiceBaseImpl
 * @see la.abality.parametrizar.service.impl.T065BACIUDGENELocalServiceImpl
 * @generated
 */
public class T065BACIUDGENELocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link la.abality.parametrizar.service.impl.T065BACIUDGENELocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the t065 b a c i u d g e n e to the database. Also notifies the appropriate model listeners.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was added
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE addT065BACIUDGENE(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addT065BACIUDGENE(t065baciudgene);
	}

	/**
	* Creates a new t065 b a c i u d g e n e with the primary key. Does not add the t065 b a c i u d g e n e to the database.
	*
	* @param A065CODICIUD the primary key for the new t065 b a c i u d g e n e
	* @return the new t065 b a c i u d g e n e
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE createT065BACIUDGENE(
		java.lang.String A065CODICIUD) {
		return getService().createT065BACIUDGENE(A065CODICIUD);
	}

	/**
	* Deletes the t065 b a c i u d g e n e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was removed
	* @throws PortalException if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE deleteT065BACIUDGENE(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteT065BACIUDGENE(A065CODICIUD);
	}

	/**
	* Deletes the t065 b a c i u d g e n e from the database. Also notifies the appropriate model listeners.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE deleteT065BACIUDGENE(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteT065BACIUDGENE(t065baciudgene);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static la.abality.parametrizar.model.T065BACIUDGENE fetchT065BACIUDGENE(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchT065BACIUDGENE(A065CODICIUD);
	}

	/**
	* Returns the t065 b a c i u d g e n e with the primary key.
	*
	* @param A065CODICIUD the primary key of the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e
	* @throws PortalException if a t065 b a c i u d g e n e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE getT065BACIUDGENE(
		java.lang.String A065CODICIUD)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getT065BACIUDGENE(A065CODICIUD);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<la.abality.parametrizar.model.T065BACIUDGENE> getT065BACIUDGENEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getT065BACIUDGENEs(start, end);
	}

	/**
	* Returns the number of t065 b a c i u d g e n es.
	*
	* @return the number of t065 b a c i u d g e n es
	* @throws SystemException if a system exception occurred
	*/
	public static int getT065BACIUDGENEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getT065BACIUDGENEsCount();
	}

	/**
	* Updates the t065 b a c i u d g e n e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	* @return the t065 b a c i u d g e n e that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE updateT065BACIUDGENE(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateT065BACIUDGENE(t065baciudgene);
	}

	/**
	* Updates the t065 b a c i u d g e n e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param t065baciudgene the t065 b a c i u d g e n e
	* @param merge whether to merge the t065 b a c i u d g e n e with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t065 b a c i u d g e n e that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.abality.parametrizar.model.T065BACIUDGENE updateT065BACIUDGENE(
		la.abality.parametrizar.model.T065BACIUDGENE t065baciudgene,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateT065BACIUDGENE(t065baciudgene, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static T065BACIUDGENELocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					T065BACIUDGENELocalService.class.getName());

			if (invokableLocalService instanceof T065BACIUDGENELocalService) {
				_service = (T065BACIUDGENELocalService)invokableLocalService;
			}
			else {
				_service = new T065BACIUDGENELocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(T065BACIUDGENELocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(T065BACIUDGENELocalService service) {
	}

	private static T065BACIUDGENELocalService _service;
}