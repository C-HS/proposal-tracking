package com.sbm.proposal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_id")
	private long projectId;
	
	@Column(name = "project_type_id")
	private long projectTypeId;
	
	@Column(name = "disposal_type_id")
	private long disposalTypeId;
	
	@Column(name = "component_id")
	private long componentId;
	
	@Column(name = "project_cost")
	private double projectCost;
	
	@Column(name = "central_share")
	private double centralShare;
	
	@Column(name = "state_share")
	private double stateShare;
	
	@Column(name = "other_share")
	private double otherShare;
	
	@Column(name = "funded_by")
	private String fundedBy;
	
	@Column(name = "dpr_file_url")
	private String dprFileURL;
	
	@Column(name = "cleaning_of_water")
	private int cleaningOfWater;
	
	@Column(name = "no_of_toilets")
	private long noOfToilets;
	
	@Column(name = "solid_waste_visible")
	private int solidWasteVisible;
	
	@Column(name = "open_dump_site_present")
	private int openDumpSitePresent;
	
	@Column(name = "gvp_present")
	private int gvpPresent;
	
	@Column(name = "cleanliness_displayed")
	private int cleanlinessDisplayed;
	
	@Column(name = "adequate_twin")
	private int adequateTwin;
	
	@Column(name = "cleaning_arrangements")
	private int cleaningArrangements;
	
	@Column(name = "trash_cleaner_available")
	private int trashCleanerAvailable;
	
	@Column(name = "state_name")
	private String stateName;
	
	@Column(name = "district_name")
	private String districtName;
	
	@Column(name = "city_name_ulb")
	private String cityNameUlb;
	
	@Column(name = "ward")
	private String ward;
	
	@Column(name = "plant_type")
	private String plantType;
	
	@Column(name = "sub_category")
	private String subCategory;
	
	@Column(name = "is_integrated")
	private int isIntegrated;
	
	@Column(name = "input_capacity_hazardous")
	private int inputCapacityHazardous;
	
	@Column(name = "input_capacity_sanitory")
	private int inputCapacitySanitory;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "longitude")
	private String longitude;
	
	@Column(name = "land_fill_mis_id")
	private String landFillMisId;
	
	@Column(name = "land_fill_name")
	private String landFillName;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "start_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Column(name = "project_year")
	private String projectYear;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "height_designed")
	private String heightDesigned;
	
	@Column(name = "height_current")
	private String heightCurrent;
	
	@Column(name = "average_waste")
	private String averageWaste;
	
	@Column(name = "qty_disposed")
	private String qtyDisposed;
	
	@Column(name = "storage_area_available")
	private String storageAreaAvailable;
	
	@Column(name = "inspection_area_available")
	private String inspectionAreaAvailable;
	
	@Column(name = "nearest_water_body")
	private String nearestWaterBody;
	
	@Column(name = "nearest_habitation")
	private String nearestHabitation;
	
	@Column(name = "is_hill_side")
	private int isHillSide;
	
	@Column(name = "non_permeable")
	private int nonPermeable;
	
	@Column(name = "laeachate_collection")
	private int laeachateCollection;
	
	@Column(name = "daily_covering")
	private String dailyCovering;
	
	@Column(name = "quantity_monitoring")
	private String quantityMonitoring;
	
	@Column(name = "is_regional_sfl")
	private int isRegionalSfl;
	
	@Column(name = "brief")
	private String brief;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "date_created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	
	@Column(name = "project_status")
	private String projectStatus;
}
