/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.microsite.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MicroSite service. Represents a row in the &quot;rivetlogic_micro_site_MicroSite&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.microsite.model.impl.MicroSiteModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.microsite.model.impl.MicroSiteImpl}.
 * </p>
 *
 * @author steven.barba
 * @see MicroSite
 * @see com.rivetlogic.microsite.model.impl.MicroSiteImpl
 * @see com.rivetlogic.microsite.model.impl.MicroSiteModelImpl
 * @generated
 */
public interface MicroSiteModel extends BaseModel<MicroSite>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a micro site model instance should use the {@link MicroSite} interface instead.
	 */

	/**
	 * Returns the primary key of this micro site.
	 *
	 * @return the primary key of this micro site
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this micro site.
	 *
	 * @param primaryKey the primary key of this micro site
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the micro site ID of this micro site.
	 *
	 * @return the micro site ID of this micro site
	 */
	public long getMicroSiteId();

	/**
	 * Sets the micro site ID of this micro site.
	 *
	 * @param microSiteId the micro site ID of this micro site
	 */
	public void setMicroSiteId(long microSiteId);

	/**
	 * Returns the company ID of this micro site.
	 *
	 * @return the company ID of this micro site
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this micro site.
	 *
	 * @param companyId the company ID of this micro site
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this micro site.
	 *
	 * @return the user ID of this micro site
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this micro site.
	 *
	 * @param userId the user ID of this micro site
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this micro site.
	 *
	 * @return the user uuid of this micro site
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this micro site.
	 *
	 * @param userUuid the user uuid of this micro site
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this micro site.
	 *
	 * @return the user name of this micro site
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this micro site.
	 *
	 * @param userName the user name of this micro site
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this micro site.
	 *
	 * @return the create date of this micro site
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this micro site.
	 *
	 * @param createDate the create date of this micro site
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this micro site.
	 *
	 * @return the modified date of this micro site
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this micro site.
	 *
	 * @param modifiedDate the modified date of this micro site
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the group ID of this micro site.
	 *
	 * @return the group ID of this micro site
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this micro site.
	 *
	 * @param groupId the group ID of this micro site
	 */
	@Override
	public void setGroupId(long groupId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(MicroSite microSite);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MicroSite> toCacheModel();

	@Override
	public MicroSite toEscapedModel();

	@Override
	public MicroSite toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}