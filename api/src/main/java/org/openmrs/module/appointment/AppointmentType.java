/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.appointment;

import org.openmrs.BaseOpenmrsMetadata;

public class AppointmentType extends BaseOpenmrsMetadata {
	
	private static final long serialVersionUID = 1L;
	
	private Integer appointmentTypeId;
	
	private Integer duration;
	
	public AppointmentType() {
		
	}
	
	public AppointmentType(Integer appointmentTypeId) {
		setId(appointmentTypeId);
	}
	
	public AppointmentType(String name, String description, Integer duration) {
		setName(name);
		setDescription(description);
		setDuration(duration);
	}
	
	public Integer getAppointmentTypeId() {
		return appointmentTypeId;
	}
	
	public void setAppointmentTypeId(Integer appointmentTypeId) {
		this.appointmentTypeId = appointmentTypeId;
	}
	
	/**
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	@Override
	public Integer getId() {
		return getAppointmentTypeId();
	}
	
	/**
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		setAppointmentTypeId(id);
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
}
