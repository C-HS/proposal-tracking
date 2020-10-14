package com.sbm.proposal.dto;

public class Dumpsites {
	private String dumpsite;

    private String quantity;

    private String area;

    private String year_of_start;

    private String height;

    public void setDumpsite(String dumpsite){
        this.dumpsite = dumpsite;
    }
    public String getDumpsite(){
        return this.dumpsite;
    }
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }
    public String getQuantity(){
        return this.quantity;
    }
    public void setArea(String area){
        this.area = area;
    }
    public String getArea(){
        return this.area;
    }
    public void setYear_of_start(String year_of_start){
        this.year_of_start = year_of_start;
    }
    public String getYear_of_start(){
        return this.year_of_start;
    }
    public void setHeight(String height){
        this.height = height;
    }
    public String getHeight(){
        return this.height;
    }
}
