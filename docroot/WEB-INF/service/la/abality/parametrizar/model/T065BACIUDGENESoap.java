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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    VillarTechnologies
 * @generated
 */
public class T065BACIUDGENESoap implements Serializable {
	public static T065BACIUDGENESoap toSoapModel(T065BACIUDGENE model) {
		T065BACIUDGENESoap soapModel = new T065BACIUDGENESoap();

		soapModel.setA065CODICIUD(model.getA065CODICIUD());
		soapModel.setA065DESCCIUD(model.getA065DESCCIUD());
		soapModel.setA065CODIORG(model.getA065CODIORG());

		return soapModel;
	}

	public static T065BACIUDGENESoap[] toSoapModels(T065BACIUDGENE[] models) {
		T065BACIUDGENESoap[] soapModels = new T065BACIUDGENESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static T065BACIUDGENESoap[][] toSoapModels(T065BACIUDGENE[][] models) {
		T065BACIUDGENESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new T065BACIUDGENESoap[models.length][models[0].length];
		}
		else {
			soapModels = new T065BACIUDGENESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static T065BACIUDGENESoap[] toSoapModels(List<T065BACIUDGENE> models) {
		List<T065BACIUDGENESoap> soapModels = new ArrayList<T065BACIUDGENESoap>(models.size());

		for (T065BACIUDGENE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new T065BACIUDGENESoap[soapModels.size()]);
	}

	public T065BACIUDGENESoap() {
	}

	public String getPrimaryKey() {
		return _A065CODICIUD;
	}

	public void setPrimaryKey(String pk) {
		setA065CODICIUD(pk);
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

	private String _A065CODICIUD;
	private String _A065DESCCIUD;
	private String _A065CODIORG;
}