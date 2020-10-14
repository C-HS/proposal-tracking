package com.sbm.proposal.dto;

public class STP_technology_detail {

	
    private String technology_used;

    private String disposal_method;

    public void setTechnology_used(String technology_used){
        this.technology_used = technology_used;
    }
    public String getTechnology_used(){
        return this.technology_used;
    }
    public void setDisposal_method(String disposal_method){
        this.disposal_method = disposal_method;
    }
    public String getDisposal_method(){
        return this.disposal_method;
    }
}
