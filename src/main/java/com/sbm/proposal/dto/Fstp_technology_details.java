package com.sbm.proposal.dto;

public class Fstp_technology_details {
	private String level_of_treatement;

    private String technology_used_for_primary_and_secondary;

    private String method_of_disposal_of_treated_effluent;

    private String is_co_treatement_of_faecal_sludge_happening;

    public void setLevel_of_treatement(String level_of_treatement){
        this.level_of_treatement = level_of_treatement;
    }
    public String getLevel_of_treatement(){
        return this.level_of_treatement;
    }
    public void setTechnology_used_for_primary_and_secondary(String technology_used_for_primary_and_secondary){
        this.technology_used_for_primary_and_secondary = technology_used_for_primary_and_secondary;
    }
    public String getTechnology_used_for_primary_and_secondary(){
        return this.technology_used_for_primary_and_secondary;
    }
    public void setMethod_of_disposal_of_treated_effluent(String method_of_disposal_of_treated_effluent){
        this.method_of_disposal_of_treated_effluent = method_of_disposal_of_treated_effluent;
    }
    public String getMethod_of_disposal_of_treated_effluent(){
        return this.method_of_disposal_of_treated_effluent;
    }
	public String getIs_co_treatement_of_faecal_sludge_happening() {
		return is_co_treatement_of_faecal_sludge_happening;
	}
	public void setIs_co_treatement_of_faecal_sludge_happening(String is_co_treatement_of_faecal_sludge_happening) {
		this.is_co_treatement_of_faecal_sludge_happening = is_co_treatement_of_faecal_sludge_happening;
	}

}
