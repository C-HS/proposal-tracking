package com.sbm.proposal.dto;

public class Ulb {
    private String ulb;

    private String is_distance_from_landfill_greater_than50;

    public void setUlb(String ulb){
        this.ulb = ulb;
    }
    public String getUlb(){
        return this.ulb;
    }
    public void setIs_distance_from_landfill_greater_than50(String is_distance_from_landfill_greater_than50){
        this.is_distance_from_landfill_greater_than50 = is_distance_from_landfill_greater_than50;
    }
    public String getIs_distance_from_landfill_greater_than50(){
        return this.is_distance_from_landfill_greater_than50;
    }
}
