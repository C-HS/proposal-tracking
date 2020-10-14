package com.sbm.proposal.dto;

public class Address {
	private String address;

    private String landmark;

    private String latitude;

    private String longitude;

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setLandmark(String landmark){
        this.landmark = landmark;
    }
    public String getLandmark(){
        return this.landmark;
    }
    public void setLatitude(String latitude){
        this.latitude = latitude;
    }
    public String getLatitude(){
        return this.latitude;
    }
    public void setLongitude(String longitude){
        this.longitude = longitude;
    }
    public String getLongitude(){
        return this.longitude;
    }
}
