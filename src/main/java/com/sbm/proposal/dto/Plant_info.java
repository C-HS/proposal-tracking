package com.sbm.proposal.dto;

public class Plant_info {
	private String state;

    private String district;

    private String city_ulb;

    private String ward;

    private String landfill_mis_id;

    private String landfill_name;

    private String status;

    private String cost;

    private String date_of_start;

    private String projected_year_of_operation;
    
    private String is_it_integrated;
    
    private String plant_type;

    private String sub_category;

    private Designed_input_capacity_per_day designed_input_capacity_per_day;

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public String getDistrict(){
        return this.district;
    }
    public void setCity_ulb(String city_ulb){
        this.city_ulb = city_ulb;
    }
    public String getCity_ulb(){
        return this.city_ulb;
    }
    public void setWard(String ward){
        this.ward = ward;
    }
    public String getWard(){
        return this.ward;
    }
    public void setLandfill_mis_id(String landfill_mis_id){
        this.landfill_mis_id = landfill_mis_id;
    }
    public String getLandfill_mis_id(){
        return this.landfill_mis_id;
    }
    public void setLandfill_name(String landfill_name){
        this.landfill_name = landfill_name;
    }
    public String getLandfill_name(){
        return this.landfill_name;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setCost(String cost){
        this.cost = cost;
    }
    public String getCost(){
        return this.cost;
    }
    public void setDate_of_start(String date_of_start){
        this.date_of_start = date_of_start;
    }
    public String getDate_of_start(){
        return this.date_of_start;
    }
    public void setProjected_year_of_operation(String projected_year_of_operation){
        this.projected_year_of_operation = projected_year_of_operation;
    }
    public String getProjected_year_of_operation(){
        return this.projected_year_of_operation;
    }
	public String getIs_it_integrated() {
		return is_it_integrated;
	}
	public void setIs_it_integrated(String is_it_integrated) {
		this.is_it_integrated = is_it_integrated;
	}
	public String getPlant_type() {
		return plant_type;
	}
	public void setPlant_type(String plant_type) {
		this.plant_type = plant_type;
	}
	public String getSub_category() {
		return sub_category;
	}
	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}
	public Designed_input_capacity_per_day getDesigned_input_capacity_per_day() {
		return designed_input_capacity_per_day;
	}
	public void setDesigned_input_capacity_per_day(Designed_input_capacity_per_day designed_input_capacity_per_day) {
		this.designed_input_capacity_per_day = designed_input_capacity_per_day;
	}
    
    
}
