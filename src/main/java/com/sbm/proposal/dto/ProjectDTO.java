package com.sbm.proposal.dto;

import java.util.Date;

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
public class ProjectDTO {

	private long projectId;
	
	private String projectTypeId;

	private long componentId;

	private double projectCost;

	private double centralShare;

	private double stateShare;

	private double otherShare;

	private String subType;

	private String projectBrief;

	private String fileName;
	
	
	/* Water Body Start */

	private int cleaningOfWater;

	private long noOfToilets;

	private int solidWasteVisible;

	private int openDumpSitePresent;

	private int gvpPresent;

	private int cleanlinessDisplayed;

	private int adequateTwin;

	private int cleaningArrangements;

	private int trashCleanerAvailable;
	
	/* Water Body End */
	
	
	/* Plant Info Start */

	private String stateName;

	private String districtName;

	private String cityNameUlb;

	private String ward;

	private String landfillMisId;

	private String landfillName;

	private String status;

	private String cost;
	
	private Date dateOfStart;

	private String projectedYearOfOperation;
	
	         /* For Plant Type - Plant Processing */

				private int isItIntegrated;

				private String plantType;

				private String subCategory;
				
					/* designed_input_capacity_per_day  Start */

							private int cDWaste;

							private String cDWasteTon;

							private int domesticHazardous;

							private String domesticHazardousTon;

							private int sanitary;

							private String sanitaryTon;

							private int mixed;

							private String mixedTon;

							private int dry;

							private String dryTon;	

							private int wet;

							private String wetTon;

							private int rdf;

							private String rdfTon;

							private int sewage;

							private String sewageTon;

							private int faecal;

							private String faecalKl;
							
					
					/* designed_input_capacity_per_day  End */
						
							
					/* fstp_technology_details  Start */

							private String levelOfTreatement;

							private String technologyUsedForPrimaryAndSecondary;

							private String methodOfDisposalOfTreatedEffluent;

							private int isCoTreatementOfFaecalSludgeHappening;
							
					/* fstp_technology_details  End */
							
					/* STP_technology_detail  Start */

							private String technologyUsed;

							private String disposalMethod;
					
					/* STP_technology_detail  Start */
	
	/* Plant Info End */
	
	
	
	/* Size And Capacity Start */
	
	private String areaAcre;

	private String designedHeightOfTop;

	private String currentHeightOfTop;

	private String averageWasteWentToSlf;

	private String quantityDisposedTillTateTon;

	private String temporaryWasteStorageAreaAvailable;

	private String temporaryWasteInspectionAreaAvailable;
	
	/* Size And Capacity End */
	
	
	/* Address Start */

	private String address;

	private String landmark;

	private String latitude;

	private String longitude;
	
	/* Address End */
	
	
	/* Detail Start */

	private String distanceToNearestWaterBodyMeter;

	private String distanceOfLandfillBoundryToNearestHabitationKms;

	private int isItLocatedOnHillSide;
	
	private String detailCost;
	
	private String fundedBy;
	
	private String dprFileName;
	
	/* Detail End */
	
	
	/* Feature Start */
	private int isNonPermeableLiningSystemAvailable;
	
	private int isThereMechanismForLaeachateCollection;

	private int isThereMechanismForDailyCovering;

	private int isGroundWaterQualityMonitoring;
	
	/* Feature End */
	
	
	
	/* Serving To Other ULB Start */
	
	private int isLandfillSharedRegionalSlf;
	
	/* Serving To Other ULB End */
	
	private Date dateCreated;

	private String projectStatus;
}
