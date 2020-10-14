package com.sbm.proposal.dto;

import java.util.List;

public class Projects 
{
    private String projectTypeId;

    private String projectCost;

    private String centralShare;

    private String stateShare;

    private String otherShare;

    private Waterbody waterbody;
    
    private String subType;

    private String project_brief;

    private String file_name;

    private Plant_info plant_info;

    private Size_and_capacity size_and_capacity;

    private Address address;

    private List<String> plant_video_image;

    private Detail detail;

    private Features features;

    private Serving_to_other_ulb serving_to_other_ulb;

    private List<Dumpsites> dumpsites;
    
    private List<String> ulb;

	public String getProjectTypeId() {
		return projectTypeId;
	}

	public void setProjectTypeId(String projectTypeId) {
		this.projectTypeId = projectTypeId;
	}

	public String getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(String projectCost) {
		this.projectCost = projectCost;
	}

	public String getCentralShare() {
		return centralShare;
	}

	public void setCentralShare(String centralShare) {
		this.centralShare = centralShare;
	}

	public String getStateShare() {
		return stateShare;
	}

	public void setStateShare(String stateShare) {
		this.stateShare = stateShare;
	}

	public String getOtherShare() {
		return otherShare;
	}

	public void setOtherShare(String otherShare) {
		this.otherShare = otherShare;
	}

	public Waterbody getWaterbody() {
		return waterbody;
	}

	public void setWaterbody(Waterbody waterbody) {
		this.waterbody = waterbody;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getProject_brief() {
		return project_brief;
	}

	public void setProject_brief(String project_brief) {
		this.project_brief = project_brief;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public Plant_info getPlant_info() {
		return plant_info;
	}

	public void setPlant_info(Plant_info plant_info) {
		this.plant_info = plant_info;
	}

	public Size_and_capacity getSize_and_capacity() {
		return size_and_capacity;
	}

	public void setSize_and_capacity(Size_and_capacity size_and_capacity) {
		this.size_and_capacity = size_and_capacity;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getPlant_video_image() {
		return plant_video_image;
	}

	public void setPlant_video_image(List<String> plant_video_image) {
		this.plant_video_image = plant_video_image;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public Features getFeatures() {
		return features;
	}

	public void setFeatures(Features features) {
		this.features = features;
	}

	public Serving_to_other_ulb getServing_to_other_ulb() {
		return serving_to_other_ulb;
	}

	public void setServing_to_other_ulb(Serving_to_other_ulb serving_to_other_ulb) {
		this.serving_to_other_ulb = serving_to_other_ulb;
	}

	public List<Dumpsites> getDumpsites() {
		return dumpsites;
	}

	public void setDumpsites(List<Dumpsites> dumpsites) {
		this.dumpsites = dumpsites;
	}

	public List<String> getUlb() {
		return ulb;
	}

	public void setUlb(List<String> ulb) {
		this.ulb = ulb;
	}

    

}
