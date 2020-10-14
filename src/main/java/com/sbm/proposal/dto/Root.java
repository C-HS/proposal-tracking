package com.sbm.proposal.dto;

import java.util.ArrayList;
import java.util.List;

public class Root {
	private String proposalId;

    private String dateReceive;

    private String stateName;

    private String totalProposalCost;

    private String totalCentralShare;

    private String totalStateShare;

    private String totalOtherShare;

    private String amountApproved;

    private String proposalDocumentURL;

    private String shpcDocumentURL;

    private String dateLastUpdate;

    private String proposalStatus;

    private List<Components> components;

    public void setProposalId(String proposalId){
        this.proposalId = proposalId;
    }
    public String getProposalId(){
        return this.proposalId;
    }
    public void setDateReceive(String dateReceive){
        this.dateReceive = dateReceive;
    }
    public String getDateReceive(){
        return this.dateReceive;
    }
    public void setStateName(String stateName){
        this.stateName = stateName;
    }
    public String getStateName(){
        return this.stateName;
    }
    public void setTotalProposalCost(String totalProposalCost){
        this.totalProposalCost = totalProposalCost;
    }
    public String getTotalProposalCost(){
        return this.totalProposalCost;
    }
    public void setTotalCentralShare(String totalCentralShare){
        this.totalCentralShare = totalCentralShare;
    }
    public String getTotalCentralShare(){
        return this.totalCentralShare;
    }
    public void setTotalStateShare(String totalStateShare){
        this.totalStateShare = totalStateShare;
    }
    public String getTotalStateShare(){
        return this.totalStateShare;
    }
    public void setTotalOtherShare(String totalOtherShare){
        this.totalOtherShare = totalOtherShare;
    }
    public String getTotalOtherShare(){
        return this.totalOtherShare;
    }
    public void setAmountApproved(String amountApproved){
        this.amountApproved = amountApproved;
    }
    public String getAmountApproved(){
        return this.amountApproved;
    }
    public void setProposalDocumentURL(String proposalDocumentURL){
        this.proposalDocumentURL = proposalDocumentURL;
    }
    public String getProposalDocumentURL(){
        return this.proposalDocumentURL;
    }
    public void setShpcDocumentURL(String shpcDocumentURL){
        this.shpcDocumentURL = shpcDocumentURL;
    }
    public String getShpcDocumentURL(){
        return this.shpcDocumentURL;
    }
    public void setDateLastUpdate(String dateLastUpdate){
        this.dateLastUpdate = dateLastUpdate;
    }
    public String getDateLastUpdate(){
        return this.dateLastUpdate;
    }
    public void setProposalStatus(String proposalStatus){
        this.proposalStatus = proposalStatus;
    }
    public String getProposalStatus(){
        return this.proposalStatus;
    }
    public void setComponents(List<Components> components){
        this.components = components;
    }
    public List<Components> getComponents(){
        return this.components;
    }
}
