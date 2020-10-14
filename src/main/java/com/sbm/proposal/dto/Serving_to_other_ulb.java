package com.sbm.proposal.dto;

import java.util.List;

public class Serving_to_other_ulb {
    private String is_landfill_shared_regional_slf;

    private List<Ulb> ulb;

    public void setIs_landfill_shared_regional_slf(String is_landfill_shared_regional_slf){
        this.is_landfill_shared_regional_slf = is_landfill_shared_regional_slf;
    }
    public String getIs_landfill_shared_regional_slf(){
        return this.is_landfill_shared_regional_slf;
    }
    public void setUlb(List<Ulb> ulb){
        this.ulb = ulb;
    }
    public List<Ulb> getUlb(){
        return this.ulb;
    }
}
