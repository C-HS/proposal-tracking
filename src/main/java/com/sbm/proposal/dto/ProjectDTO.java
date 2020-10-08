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

	private long projectTypeId;

	private long disposalTypeId;

	private long componentId;

	private double projectCost;

	private double centralShare;

	private double stateShare;

	private double otherShare;

	private String fundedBy;

	private String dprFileURL;

	private int cleaningOfWater;

	private long noOfToilets;

	private int solidWasteVisible;

	private int openDumpSitePresent;

	private int gvpPresent;

	private int cleanlinessDisplayed;

	private int adequateTwin;

	private int cleaningArrangements;

	private int trashCleanerAvailable;

	private String stateName;

	private String districtName;

	private String cityNameUlb;

	private String ward;

	private String plantType;

	private String subCategory;

	private int isIntegrated;

	private int inputCapacityHazardous;

	private int inputCapacitySanitory;

	private String address;

	private String landmark;

	private String latitude;

	private String longitude;

	private String landFillMisId;

	private String landFillName;

	private String status;

	private Date startDate;

	private String projectYear;

	private String area;

	private String heightDesigned;

	private String heightCurrent;

	private String averageWaste;

	private String qtyDisposed;

	private String storageAreaAvailable;

	private String inspectionAreaAvailable;

	private String nearestWaterBody;

	private String nearestHabitation;

	private int isHillSide;

	private int nonPermeable;

	private int laeachateCollection;

	private String dailyCovering;

	private String quantityMonitoring;

	private int isRegionalSfl;

	private String brief;

	private String imageUrl;

	private Date dateCreated;

	private String projectStatus;
}
