package com.sbm.proposal.dto;

import java.util.List;

public class Components {
	private String componentId;

    private String componentName;

    private String projectCost;

    private String centralShare;

    private String stateShare;

    private String otherShare;

    private String unit;

    private String firstInstallment;

    private String bothInstallment;

    private String actionPlanDocumentURL;

    private String shpcDocumentURL;

    private String dateTime;

    private String componentStatus;

    private List<Projects> projects;

    public void setComponentId(String componentId){
        this.componentId = componentId;
    }
    public String getComponentId(){
        return this.componentId;
    }
    public void setComponentName(String componentName){
        this.componentName = componentName;
    }
    public String getComponentName(){
        return this.componentName;
    }
    public void setProjectCost(String projectCost){
        this.projectCost = projectCost;
    }
    public String getProjectCost(){
        return this.projectCost;
    }
    public void setCentralShare(String centralShare){
        this.centralShare = centralShare;
    }
    public String getCentralShare(){
        return this.centralShare;
    }
    public void setStateShare(String stateShare){
        this.stateShare = stateShare;
    }
    public String getStateShare(){
        return this.stateShare;
    }
    public void setOtherShare(String otherShare){
        this.otherShare = otherShare;
    }
    public String getOtherShare(){
        return this.otherShare;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    public String getUnit(){
        return this.unit;
    }
    public void setFirstInstallment(String firstInstallment){
        this.firstInstallment = firstInstallment;
    }
    public String getFirstInstallment(){
        return this.firstInstallment;
    }
    public void setBothInstallment(String bothInstallment){
        this.bothInstallment = bothInstallment;
    }
    public String getBothInstallment(){
        return this.bothInstallment;
    }
    public void setActionPlanDocumentURL(String actionPlanDocumentURL){
        this.actionPlanDocumentURL = actionPlanDocumentURL;
    }
    public String getActionPlanDocumentURL(){
        return this.actionPlanDocumentURL;
    }
    public void setShpcDocumentURL(String shpcDocumentURL){
        this.shpcDocumentURL = shpcDocumentURL;
    }
    public String getShpcDocumentURL(){
        return this.shpcDocumentURL;
    }
    public void setDateTime(String dateTime){
        this.dateTime = dateTime;
    }
    public String getDateTime(){
        return this.dateTime;
    }
    public void setComponentStatus(String componentStatus){
        this.componentStatus = componentStatus;
    }
    public String getComponentStatus(){
        return this.componentStatus;
    }
    public void setProjects(List<Projects> projects){
        this.projects = projects;
    }
    public List<Projects> getProjects(){
        return this.projects;
    }
}
