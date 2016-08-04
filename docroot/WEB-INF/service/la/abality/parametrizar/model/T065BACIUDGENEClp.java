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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import la.abality.parametrizar.service.T065BACIUDGENELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author VillarTechnologies
 */
public class T065BACIUDGENEClp extends BaseModelImpl<T065BACIUDGENE>
	implements T065BACIUDGENE {
	public T065BACIUDGENEClp() {
	}

	public Class<?> getModelClass() {
		return T065BACIUDGENE.class;
	}

	public String getModelClassName() {
		return T065BACIUDGENE.class.getName();
	}

	public String getPrimaryKey() {
		return _A065CODICIUD;
	}

	public void setPrimaryKey(String primaryKey) {
		setA065CODICIUD(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _A065CODICIUD;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("A065CODICIUD", getA065CODICIUD());
		attributes.put("A065DESCCIUD", getA065DESCCIUD());
		attributes.put("A065CODIORG", getA065CODIORG());

		return attributes;
	}

	@Override
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

	public String getA065CODICIUD() {
		return _A065CODICIUD;
	}

	public void setA065CODICIUD(String A065CODICIUD) {
		_A065CODICIUD = A065CODICIUD;
	}

	public String getA065DESCCIUD() {
		return _A065DESCCIUD;
	}

	public void setA065DESCCIUD(String A065DESCCIUD) {
		_A065DESCCIUD = A065DESCCIUD;
	}

	public String getA065CODIORG() {
		return _A065CODIORG;
	}

	public void setA065CODIORG(String A065CODIORG) {
		_A065CODIORG = A065CODIORG;
	}

	public BaseModel<?> getT065BACIUDGENERemoteModel() {
		return _t065baciudgeneRemoteModel;
	}

	public void setT065BACIUDGENERemoteModel(
		BaseModel<?> t065baciudgeneRemoteModel) {
		_t065baciudgeneRemoteModel = t065baciudgeneRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			T065BACIUDGENELocalServiceUtil.addT065BACIUDGENE(this);
		}
		else {
			T065BACIUDGENELocalServiceUtil.updateT065BACIUDGENE(this);
		}
	}

	@Override
	public T065BACIUDGENE toEscapedModel() {
		return (T065BACIUDGENE)Proxy.newProxyInstance(T065BACIUDGENE.class.getClassLoader(),
			new Class[] { T065BACIUDGENE.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		T065BACIUDGENEClp clone = new T065BACIUDGENEClp();

		clone.setA065CODICIUD(getA065CODICIUD());
		clone.setA065DESCCIUD(getA065DESCCIUD());
		clone.setA065CODIORG(getA065CODIORG());

		return clone;
	}

	public int compareTo(T065BACIUDGENE t065baciudgene) {
		String primaryKey = t065baciudgene.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		T065BACIUDGENEClp t065baciudgene = null;

		try {
			t065baciudgene = (T065BACIUDGENEClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = t065baciudgene.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{A065CODICIUD=");
		sb.append(getA065CODICIUD());
		sb.append(", A065DESCCIUD=");
		sb.append(getA065DESCCIUD());
		sb.append(", A065CODIORG=");
		sb.append(getA065CODIORG());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("la.abality.parametrizar.model.T065BACIUDGENE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>A065CODICIUD</column-name><column-value><![CDATA[");
		sb.append(getA065CODICIUD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A065DESCCIUD</column-name><column-value><![CDATA[");
		sb.append(getA065DESCCIUD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A065CODIORG</column-name><column-value><![CDATA[");
		sb.append(getA065CODIORG());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _A065CODICIUD;
	private String _A065DESCCIUD;
	private String _A065CODIORG;
	private BaseModel<?> _t065baciudgeneRemoteModel;
}