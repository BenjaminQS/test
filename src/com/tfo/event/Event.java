package com.tfo.event;

public class Event {
	
	private String locationId;
	private int groupId;
	private Long actualBusinessTimestamp;
	private Long actualTechnicalTimestam;
	
	public Event(String locationId, int groupId) {
		super();
		this.locationId = locationId;
		this.groupId = groupId;
	}
	
	public Long getActualBusinessTimestamp() {
		return actualBusinessTimestamp;
	}

	public void setActualBusinessTimestamp(Long actualBusinessTimestamp) {
		this.actualBusinessTimestamp = actualBusinessTimestamp;
	}

	public Long getActualTechnicalTimestam() {
		return actualTechnicalTimestam;
	}

	public void setActualTechnicalTimestam(Long actualTechnicalTimestam) {
		this.actualTechnicalTimestam = actualTechnicalTimestam;
	}

	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
}
