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

package la.ability.parametrizar.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import la.abality.parametrizar.model.T065BACIUDGENE;

import java.io.Serializable;

/**
 * The cache model class for representing T065BACIUDGENE in entity cache.
 *
 * @author VillarTechnologies
 * @see T065BACIUDGENE
 * @generated
 */
public class T065BACIUDGENECacheModel implements CacheModel<T065BACIUDGENE>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{A065CODICIUD=");
		sb.append(A065CODICIUD);
		sb.append(", A065DESCCIUD=");
		sb.append(A065DESCCIUD);
		sb.append(", A065CODIORG=");
		sb.append(A065CODIORG);
		sb.append("}");

		return sb.toString();
	}

	public T065BACIUDGENE toEntityModel() {
		T065BACIUDGENEImpl t065baciudgeneImpl = new T065BACIUDGENEImpl();

		if (A065CODICIUD == null) {
			t065baciudgeneImpl.setA065CODICIUD(StringPool.BLANK);
		}
		else {
			t065baciudgeneImpl.setA065CODICIUD(A065CODICIUD);
		}

		if (A065DESCCIUD == null) {
			t065baciudgeneImpl.setA065DESCCIUD(StringPool.BLANK);
		}
		else {
			t065baciudgeneImpl.setA065DESCCIUD(A065DESCCIUD);
		}

		if (A065CODIORG == null) {
			t065baciudgeneImpl.setA065CODIORG(StringPool.BLANK);
		}
		else {
			t065baciudgeneImpl.setA065CODIORG(A065CODIORG);
		}

		t065baciudgeneImpl.resetOriginalValues();

		return t065baciudgeneImpl;
	}

	public String A065CODICIUD;
	public String A065DESCCIUD;
	public String A065CODIORG;
}