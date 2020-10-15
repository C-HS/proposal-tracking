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
	private String projectTypeId;

	
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
	
	
	@Column(name = "sub_type")
	private String subType;
	
	@Column(name = "project_brief")
	private String projectBrief;
	
	@Column(name = "file_name")
	private String fileName;
	
	
	/* Water Body Start */
	
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
	
	/* Water Body End */
	
	
	/* Plant Info Start */
	
	@Column(name = "state_name")
	private String stateName;
	
	@Column(name = "district_name")
	private String districtName;
	
	@Column(name = "city_name_ulb")
	private String cityNameUlb;
	
	@Column(name = "ward")
	private String ward;
	
	@Column(name = "landfill_mis_id")
	private String landfillMisId;
	
	@Column(name = "landfill_name")
	private String landfillName;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "cost")
	private String cost;
	
	@Column(name = "date_of_start")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfStart;
	
	@Column(name = "projected_year_of_operation")
	private String projectedYearOfOperation;
	
	         /* For Plant Type - Plant Processing */
	
				@Column(name = "is_it_integrated")
				private int isItIntegrated;
				
				@Column(name = "plant_type")
				private String plantType;
				
				@Column(name = "sub_category")
				private String subCategory;
				
					/* designed_input_capacity_per_day  Start */
					
							@Column(name = "C_D_Waste")
							private int cDWaste;
							
							@Column(name = "C_D_Waste_ton")
							private String cDWasteTon;
							
							@Column(name = "domestic_hazardous")
							private int domesticHazardous;
							
							@Column(name = "domestic_hazardous_ton")
							private String domesticHazardousTon;
							
							@Column(name = "sanitary")
							private int sanitary;
							
							@Column(name = "sanitary_ton")
							private String sanitaryTon;
							
							@Column(name = "mixed")
							private int mixed;
							
							@Column(name = "mixed_ton")
							private String mixedTon;
							
							@Column(name = "dry")
							private int dry;
							
							@Column(name = "dry_ton")
							private String dryTon;	
							
							@Column(name = "wet")
							private int wet;
							
							@Column(name = "wet_ton")
							private String wetTon;
							
							@Column(name = "rdf")
							private int rdf;
							
							@Column(name = "rdf_ton")
							private String rdfTon;
							
							@Column(name = "sewage")
							private int sewage;
							
							@Column(name = "sewage_ton")
							private String sewageTon;
							
							@Column(name = "faecal")
							private int faecal;
							
							@Column(name = "faecal_kl")
							private String faecalKl;
							
					
					/* designed_input_capacity_per_day  End */
						
							
					/* fstp_technology_details  Start */
							
							@Column(name = "level_of_treatement")
							private String levelOfTreatement;
							
							@Column(name = "technology_used_for_primary_and_secondary")
							private String technologyUsedForPrimaryAndSecondary;
							
							@Column(name = "method_of_disposal_of_treated_effluent")
							private String methodOfDisposalOfTreatedEffluent;
							
							@Column(name = "is_co-treatement_of_faecal_sludge_happening")
							private int isCoTreatementOfFaecalSludgeHappening;
							
					/* fstp_technology_details  End */
							
					/* STP_technology_detail  Start */
							
							@Column(name = "technology_used")
							private String technologyUsed;
							
							@Column(name = "disposal_method")
							private String disposalMethod;
					
					/* STP_technology_detail  Start */
	
	/* Plant Info End */
	
	
	
	/* Size And Capacity Start */
	
	@Column(name = "area_acre")
	private String areaAcre;
	
	@Column(name = "designed_height_of_top")
	private String designedHeightOfTop;
	
	@Column(name = "current_height_of_top")
	private String currentHeightOfTop;
	
	@Column(name = "average_waste_went_to_slf")
	private String averageWasteWentToSlf;
	
	@Column(name = "quantity_disposed_till_date_ton")
	private String quantityDisposedTillTateTon;
	
	@Column(name = "temporary_waste_storage_area_available")
	private String temporaryWasteStorageAreaAvailable;
	
	@Column(name = "temporary_waste_inspection_area_available")
	private String temporaryWasteInspectionAreaAvailable;
	
	/* Size And Capacity End */
	
	
	
	/* Address Start */
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "longitude")
	private String longitude;
	
	/* Address End */
	
	
	/* Detail Start */
	
	@Column(name = "distance_to_nearest_water_body_meter")
	private String distanceToNearestWaterBodyMeter;
	
	@Column(name = "distance_of_landfill_boundry_to_nearest_habitation_kms")
	private String distanceOfLandfillBoundryToNearestHabitationKms;
	
	@Column(name = "is_it_located_on_hill_side")
	private int isItLocatedOnHillSide;
	
	@Column(name = "detail_cost")
	private String detailCost;
	
	@Column(name = "funded_by")
	private String fundedBy;
	
	@Column(name = "dpr_file_name")
	private String dprFileName;
	
	/* Detail End */
	
	
	/* Feature Start */
	@Column(name = "is_non_permeable_lining_system_available")
	private int isNonPermeableLiningSystemAvailable;
	
	@Column(name = "is_there_mechanism_for_laeachate_collection")
	private int isThereMechanismForLaeachateCollection;
	
	@Column(name = "is_there_mechanism_for_daily_covering")
	private int isThereMechanismForDailyCovering;
	
	@Column(name = "is_ground_water_quality_monitoring")
	private int isGroundWaterQualityMonitoring;
	
	/* Feature End */
	
	
	
	/* Serving To Other ULB Start */
	
	@Column(name = "is_landfill_shared_regional_slf")
	private int isLandfillSharedRegionalSlf;
	
	/* Serving To Other ULB End */
	
	
	
	@Column(name = "date_created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	
	@Column(name = "project_status")
	private String projectStatus;
}
