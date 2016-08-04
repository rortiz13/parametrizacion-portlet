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

package la.abality.parametrizar.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link T065BACIUDGENE}.
 * </p>
 *
 * @author    VillarTechnologies
 * @see       T065BACIUDGENE
 * @generated
 */
public class T065BACIUDGENEWrapper implements T065BACIUDGENE,
	ModelWrapper<T065BACIUDGENE> {
	public T065BACIUDGENEWrapper(T065BACIUDGENE t065baciudgene) {
		_t065baciudgene = t065baciudgene;
	}

	public Class<?> getModelClass() {
		return T065BACIUDGENE.class;
	}

	public String getModelClassName() {
		return T065BACIUDGENE.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("A065CODICIUD", getA065CODICIUD());
		attributes.put("A065DESCCIUD", getA065DESCCIUD());
		attributes.put("A065CODIORG", getA065CODIORG());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String A065CODICIUD = (String)attributes.get("A065CODICIUD");

		if (A065CODICIUD != null) {
			setA065CODICIUD(A065CODICIUD);
		}

		String A065DESCCIUD = (String)attributes.get("A065DESCCIUD");

		if (A065DESCCIUD != null) {
			setA065DESCCIUD(A065DESCCIUD);
		}

		String A065CODIORG = (String)attributes.get("A065CODIORG");

		if (A065CODIORG != null) {
			setA065CODIORG(A065CODIORG);
		}
	}

	/**
	* Returns the primary key of this t065 b a c i u d g e n e.
	*
	* @return the primary key of this t065 b a c i u d g e n e
	*/
	public java.lang.String getPrimaryKey() {
		return _t065baciudgene.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t065 b a c i u d g e n e.
	*
	* @param primaryKey the primary key of this t065 b a c i u d g e n e
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_t065baciudgene.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the a065 c o d i c i u d of this t065 b a c i u d g e n e.
	*
	* @return the a065 c o d i c i u d of this t065 b a c i u d g e n e
	*/
	public java.lang.String getA065CODICIUD() {
		return _t065baciudgene.getA065CODICIUD();
	}

	/**
	* Sets the a065 c o d i c i u d of this t065 b a c i u d g e n e.
	*
	* @param A065CODICIUD the a065 c o d i c i u d of this t065 b a c i u d g e n e
	*/
	public void setA065CODICIUD(java.lang.String A065CODICIUD) {
		_t065baciudgene.setA065CODICIUD(A065CODICIUD);
	}

	/**
	* Returns the a065 d e s c c i u d of this t065 b a c i u d g e n e.
	*
	* @return the a065 d e s c c i u d of this t065 b a c i u d g e n e
	*/
	public java.lang.String getA065DESCCIUD() {
		return _t065baciudgene.getA065DESCCIUD();
	}

	/**
	* Sets the a065 d e s c c i u d of this t065 b a c i u d g e n e.
	*
	* @param A065DESCCIUD the a065 d e s c c i u d of this t065 b a c i u d g e n e
	*/
	public void setA065DESCCIUD(java.lang.String A065DESCCIUD) {
		_t065baciudgene.setA065DESCCIUD(A065DESCCIUD);
	}

	/**
	* Returns the a065 c o d i o r g of this t065 b a c i u d g e n e.
	*
	* @return the a065 c o d i o r g of this t065 b a c i u d g e n e
	*/
	public java.lang.String getA065CODIORG() {
		return _t065baciudgene.getA065CODIORG();
	}

	/**
	* Sets the a065 c o d i o r g of this t065 b a c i u d g e n e.
	*
	* @param A065CODIORG the a065 c o d i o r g of this t065 b a c i u d g e n e
	*/
	public void setA065CODIORG(java.lang.String A065CODIORG) {
		_t065baciudgene.setA065CODIORG(A065CODIORG);
	}

	public boolean isNew() {
		return _t065baciudgene.isNew();
	}

	public void setNew(boolean n) {
		_t065baciudgene.setNew(n);
	}

	public boolean isCachedModel() {
		return _t065baciudgene.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_t065baciudgene.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _t065baciudgene.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _t065baciudgene.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_t065baciudgene.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _t065baciudgene.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_t065baciudgene.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new T065BACIUDGENEWrapper((T065BACIUDGENE)_t065baciudgene.clone());
	}

	public int compareTo(T065BACIUDGENE t065baciudgene) {
		return _t065baciudgene.compareTo(t065baciudgene);
	}

	@Override
	public int hashCode() {
		return _t065baciudgene.hashCode();
	}

	public com.liferay.portal.model.CacheModel<T065BACIUDGENE> toCacheModel() {
		return _t065baciudgene.toCacheModel();
	}

	public T065BACIUDGENE toEscapedModel() {
		return new T065BACIUDGENEWrapper(_t065baciudgene.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _t065baciudgene.toString();
	}

	public java.lang.String toXmlString() {
		return _t065baciudgene.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_t065baciudgene.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public T065BACIUDGENE getWrappedT065BACIUDGENE() {
		return _t065baciudgene;
	}

	public T065BACIUDGENE getWrappedModel() {
		return _t065baciudgene;
	}

	public void resetOriginalValues() {
		_t065baciudgene.resetOriginalValues();
	}

	private T065BACIUDGENE _t065baciudgene;
}