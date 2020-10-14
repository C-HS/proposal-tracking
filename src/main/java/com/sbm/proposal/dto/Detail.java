package com.sbm.proposal.dto;

public class Detail {
	private String distance_to_nearest_water_body_meter;

    private String distance_of_landfill_boundry_to_nearest_habitation_kms;

    private String is_it_located_on_hill_side;
    
    private String cost;

    private String funded_by;

    private String dpr_file_name;

    public void setDistance_to_nearest_water_body_meter(String distance_to_nearest_water_body_meter){
        this.distance_to_nearest_water_body_meter = distance_to_nearest_water_body_meter;
    }
    public String getDistance_to_nearest_water_body_meter(){
        return this.distance_to_nearest_water_body_meter;
    }
    public void setDistance_of_landfill_boundry_to_nearest_habitation_kms(String distance_of_landfill_boundry_to_nearest_habitation_kms){
        this.distance_of_landfill_boundry_to_nearest_habitation_kms = distance_of_landfill_boundry_to_nearest_habitation_kms;
    }
    public String getDistance_of_landfill_boundry_to_nearest_habitation_kms(){
        return this.distance_of_landfill_boundry_to_nearest_habitation_kms;
    }
    public void setIs_it_located_on_hill_side(String is_it_located_on_hill_side){
        this.is_it_located_on_hill_side = is_it_located_on_hill_side;
    }
    public String getIs_it_located_on_hill_side(){
        return this.is_it_located_on_hill_side;
    }
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getFunded_by() {
		return funded_by;
	}
	public void setFunded_by(String funded_by) {
		this.funded_by = funded_by;
	}
	public String getDpr_file_name() {
		return dpr_file_name;
	}
	public void setDpr_file_name(String dpr_file_name) {
		this.dpr_file_name = dpr_file_name;
	}
    
    
}
