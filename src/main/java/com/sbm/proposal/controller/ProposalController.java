package com.sbm.proposal.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sbm.proposal.dto.Components;
import com.sbm.proposal.dto.Dumpsites;
import com.sbm.proposal.dto.Root;
import com.sbm.proposal.model.Component;
import com.sbm.proposal.model.Dumpsite;
import com.sbm.proposal.model.ImageAndVideo;
import com.sbm.proposal.model.Project;
import com.sbm.proposal.model.Proposal;
import com.sbm.proposal.service.ComponentService;
import com.sbm.proposal.service.DumpsiteService;
import com.sbm.proposal.service.ImageAndVideoService;
import com.sbm.proposal.service.ProjectService;
import com.sbm.proposal.service.ProposalService;
import com.sbm.proposal.service.UlbService;

@Controller
public class ProposalController {

	@Autowired ProposalService proposalService;
	
	@Autowired ComponentService componentService;
	
	@Autowired ProjectService projectService;
	
	@Autowired ImageAndVideoService ImageAndVideoService;
	
	@Autowired UlbService ulbService;
	
	@Autowired DumpsiteService dumpsiteService;
	
	@PostMapping("/api/proposal/create")
	public ResponseEntity<String> registerRFIDTag(@RequestBody Root root) {
		
		
		/*
		 * System.out.println("Components "+root.getComponents().size());
		 * 
		 * for(Components c : root.getComponents()) {
		 * System.out.println("Projects "+c.getProjects().size());
		 * 
		 * for(com.sbm.proposal.dto.Projects p : c.getProjects()) {
		 * System.out.println("Dumpsite "+p.getDumpsites());
		 * 
		 * System.out.println("waterbody "+p.getWaterbody());
		 * 
		 * System.out.println("plant_info "+p.getPlant_info()); }
		 * 
		 * }
		 */
		
		Proposal proposal = new Proposal();
		
		proposal.setProposalId(root.getProposalId());
		proposal.setDateReceive(new Date());
		proposal.setStateName(root.getStateName());
		proposal.setTotalProposalCost(Double.parseDouble(root.getTotalProposalCost()));
		proposal.setTotalCentralShare(Double.parseDouble(root.getTotalCentralShare()));
		proposal.setTotalStateShare(Double.parseDouble(root.getTotalStateShare()));
		proposal.setTotalOtherShare(Double.parseDouble(root.getTotalOtherShare()));
		proposal.setAmountApproved(Double.parseDouble(root.getAmountApproved()));
		proposal.setProposalDocumentURL(root.getProposalDocumentURL());
		proposal.setShpcDocumentURL(root.getShpcDocumentURL());
		proposal.setProposalStatus("CREATED");
		
		long proposalId = proposalService.addProposal(proposal);

		if(proposalId>0)
		{
			  for(Components c : root.getComponents()) {
				  
				  Component component = new Component();
				  
				  component.setProposalId(proposalId);
				  component.setComponentName(c.getComponentName());
				  component.setProjectCost(Double.parseDouble(c.getProjectCost()));
				  component.setCentralShare(Double.parseDouble(c.getCentralShare()));
				  component.setStateShare(Double.parseDouble(c.getStateShare()));
				  component.setOtherShare(Double.parseDouble(c.getOtherShare()));
				  component.setUnit(Double.parseDouble(c.getUnit()));
				  component.setFirstInstallment(Double.parseDouble(c.getFirstInstallment()));
				  component.setBothInstallment(Double.parseDouble(c.getBothInstallment()));
				  component.setActionPlanDocumentURL(c.getActionPlanDocumentURL());
				  component.setShpcDocumentURL(c.getShpcDocumentURL());
				  component.setDateTime(new Date());
				  component.setComponentStatus("CREATED");
				  
			 
				  long componentId = componentService.addComponent(component);
				  
				  if(componentId>0)
				  {
					  for(com.sbm.proposal.dto.Projects p : c.getProjects()) {
						  
						  Project project = new Project();
						  project.setProjectTypeId(p.getProjectTypeId());
						  project.setComponentId(componentId);
						  project.setProjectCost(Double.parseDouble(p.getProjectCost()));
						  project.setCentralShare(Double.parseDouble(p.getCentralShare()));
						  project.setStateShare(Double.parseDouble(p.getStateShare()));
						  project.setOtherShare(Double.parseDouble(p.getOtherShare()));
						  project.setSubType(p.getSubType());
						  project.setProjectBrief(p.getProject_brief());
						  project.setFileName(p.getFile_name());
						  
						  if(p.getWaterbody()!=null)
						  {
							  project.setCleaningOfWater(Integer.parseInt(p.getWaterbody().getCleaningOfWater()));
							  project.setNoOfToilets(Long.parseLong(p.getWaterbody().getNoOfToilets()));
							  project.setSolidWasteVisible(Integer.parseInt(p.getWaterbody().getSolidWasteVisible()));
							  project.setOpenDumpSitePresent(Integer.parseInt(p.getWaterbody().getOpenDumpSitePresent()));
							  project.setGvpPresent(Integer.parseInt(p.getWaterbody().getGvpPresent()));
							  project.setCleanlinessDisplayed(Integer.parseInt(p.getWaterbody().getCleanlinessDisplayed()));
							  project.setAdequateTwin(Integer.parseInt(p.getWaterbody().getAdequateTwin()));
							  project.setCleaningArrangements(Integer.parseInt(p.getWaterbody().getCleaningArrangements()));
							  project.setTrashCleanerAvailable(Integer.parseInt(p.getWaterbody().getTrashCleanerAvailable()));
						  }
						  if(p.getPlant_info()!=null)
						  {
							  project.setStateName(p.getPlant_info().getState());
							  project.setDistrictName(p.getPlant_info().getDistrict());
							  project.setCityNameUlb(p.getPlant_info().getCity_ulb());
							  project.setWard(p.getPlant_info().getWard());
							  project.setLandfillMisId(p.getPlant_info().getLandfill_mis_id());
							  project.setLandfillName(p.getPlant_info().getLandfill_name());
							  project.setStatus(p.getPlant_info().getStatus());
							  project.setCost(p.getPlant_info().getCost());
							  
							  if(p.getPlant_info().getDate_of_start()!=null && !p.getPlant_info().equals(""))
							  project.setDateOfStart(new Date()); //&&&&&&&&&&&&&&&
							  
							  project.setProjectedYearOfOperation(p.getPlant_info().getProjected_year_of_operation());
							  project.setIsItIntegrated(Integer.parseInt(p.getPlant_info().getIs_it_integrated()));
							  project.setPlantType(p.getPlant_info().getPlant_type());
							  project.setSubCategory(p.getPlant_info().getSub_category());
							  
							  if(p.getPlant_info().getDesigned_input_capacity_per_day()!=null)
							  {
								  
								  project.setCDWaste(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getC_D_Waste()));
								  project.setCDWasteTon(p.getPlant_info().getDesigned_input_capacity_per_day().getC_D_Waste_ton());
								  project.setDomesticHazardous(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getDomestic_hazardous()));
								  project.setDomesticHazardousTon(p.getPlant_info().getDesigned_input_capacity_per_day().getDomestic_hazardous_ton());
								  project.setSanitary(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getSanitary()));
								  project.setSanitaryTon(p.getPlant_info().getDesigned_input_capacity_per_day().getSanitary_ton());
								  project.setMixed(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getMixed()));
								  project.setMixedTon(p.getPlant_info().getDesigned_input_capacity_per_day().getMixed_ton());
								  project.setDry(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getDry()));
								  project.setDryTon(p.getPlant_info().getDesigned_input_capacity_per_day().getDry_ton());
								  project.setWet(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getWet()));
								  project.setWetTon(p.getPlant_info().getDesigned_input_capacity_per_day().getWet_ton());
								  project.setRdf(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getRdf()));
								  project.setRdfTon(p.getPlant_info().getDesigned_input_capacity_per_day().getRdf_ton());
								  project.setSewage(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getSewage()));
								  project.setSewageTon(p.getPlant_info().getDesigned_input_capacity_per_day().getSewage_ton());
								  project.setFaecal(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getFaecal()));
								  project.setFaecalKl(p.getPlant_info().getDesigned_input_capacity_per_day().getFaecal_kl());
								  
								  
								   if(p.getPlant_info().getDesigned_input_capacity_per_day().getFstp_technology_details()!=null)
								  {
									  project.setLevelOfTreatement(p.getPlant_info().getDesigned_input_capacity_per_day().getFstp_technology_details().getLevel_of_treatement());
									  project.setTechnologyUsedForPrimaryAndSecondary(p.getPlant_info().getDesigned_input_capacity_per_day().getFstp_technology_details().getTechnology_used_for_primary_and_secondary());
									  project.setMethodOfDisposalOfTreatedEffluent(p.getPlant_info().getDesigned_input_capacity_per_day().getFstp_technology_details().getMethod_of_disposal_of_treated_effluent());
									  project.setIsCoTreatementOfFaecalSludgeHappening(Integer.parseInt(p.getPlant_info().getDesigned_input_capacity_per_day().getFstp_technology_details().getIs_co_treatement_of_faecal_sludge_happening()));
								  }
								  
								  if(p.getPlant_info().getDesigned_input_capacity_per_day().getSTP_technology_detail()!=null)
								  {
									  project.setTechnologyUsed(p.getPlant_info().getDesigned_input_capacity_per_day().getSTP_technology_detail().getTechnology_used());
									  project.setDisposalMethod(p.getPlant_info().getDesigned_input_capacity_per_day().getSTP_technology_detail().getDisposal_method());
								  }
							  }
							  
						  }
						  if(p.getSize_and_capacity()!=null)
						  {
							  project.setAreaAcre(p.getSize_and_capacity().getArea_acre());
							  project.setDesignedHeightOfTop(p.getSize_and_capacity().getDesigned_height_of_top());
							  project.setCurrentHeightOfTop(p.getSize_and_capacity().getCurrent_height_of_top());
							  project.setAverageWasteWentToSlf(p.getSize_and_capacity().getAverage_waste_went_to_slf());
							  project.setQuantityDisposedTillTateTon(p.getSize_and_capacity().getQuantity_disposed_till_date_ton());
							  project.setTemporaryWasteInspectionAreaAvailable(p.getSize_and_capacity().getTemporary_waste_inspection_area_awailable());
							  project.setTemporaryWasteStorageAreaAvailable(p.getSize_and_capacity().getTemporary_waste_storage_area_awailable());
						  }
						  
						  if(p.getAddress()!=null)
						  {
							  project.setAddress(p.getAddress().getAddress());
							  project.setLandmark(p.getAddress().getLandmark());
							  project.setLatitude(p.getAddress().getLatitude());
							  project.setLongitude(p.getAddress().getLongitude());
						  }
						  
						  if(p.getDetail()!=null)
						  {
							  project.setDistanceToNearestWaterBodyMeter(p.getDetail().getDistance_to_nearest_water_body_meter());
							  project.setDistanceOfLandfillBoundryToNearestHabitationKms(p.getDetail().getDistance_of_landfill_boundry_to_nearest_habitation_kms());
							  project.setIsItLocatedOnHillSide(Integer.parseInt(p.getDetail().getIs_it_located_on_hill_side()));
							  project.setDetailCost(p.getDetail().getCost());
							  project.setFundedBy(p.getDetail().getFunded_by());
							  project.setDprFileName(p.getDetail().getDpr_file_name());
							  
						  }
						  
						  if(p.getFeatures()!=null)
						  {
							  project.setIsNonPermeableLiningSystemAvailable(Integer.parseInt(p.getFeatures().getIs_non_permeable_lining_system_available()));
							  project.setIsThereMechanismForLaeachateCollection(Integer.parseInt(p.getFeatures().getIs_there_mechanism_for_laeachate_collection()));
							  project.setIsThereMechanismForDailyCovering(Integer.parseInt(p.getFeatures().getIs_there_mechanism_for_daily_covering()));
							  project.setIsGroundWaterQualityMonitoring(Integer.parseInt(p.getFeatures().getIs_ground_water_quality_monitoring()));
						  }
						  
						  if(p.getServing_to_other_ulb()!=null)
						  {
							  project.setIsLandfillSharedRegionalSlf(Integer.parseInt(p.getServing_to_other_ulb().getIs_landfill_shared_regional_slf()));
						  }
						  
						  
						  
						 long projectId = projectService.addProject(project);
						  
							  if(projectId > 0)
							  {
								  
								  if(p.getPlant_video_image()!=null)
								  { 
									  for(String name : p.getPlant_video_image())
									  {
										  ImageAndVideo iv = new ImageAndVideo();
										  
										  iv.setProjectId(projectId); 
										  iv.setFileName(name);
										  iv.setDateTime(new Date());
										  iv.setImageVideoStatus("CREATED");
										  
										  long imageNViewId = ImageAndVideoService.addImageAndVideo(iv);
										  
									  }
								  }
								  
								  if(p.getServing_to_other_ulb()!=null)
								  {
									 // project.setIsLandfillSharedRegionalSlf(Integer.parseInt(p.getServing_to_other_ulb().getIs_landfill_shared_regional_slf()));
								   
									  for(com.sbm.proposal.dto.Ulb u : p.getServing_to_other_ulb().getUlb())
									  {
										  com.sbm.proposal.model.Ulb ulb = new com.sbm.proposal.model.Ulb();
										  
										  ulb.setProjectId(projectId); 
										  ulb.setUlb(u.getUlb());
										  ulb.setUlbDistanceAboveFifty(Integer.parseInt(u.getIs_distance_from_landfill_greater_than50()));
										  ulb.setDateTime(new Date());
										  ulb.setUlbStatus("CREATED");
										  
										  long ulbId = ulbService.addUlb(ulb);
										  
										  
									  }
								  }
								  
								  if(p.getDumpsites()!=null)
								  {
									  for(Dumpsites d : p.getDumpsites())
									  {
										  Dumpsite dumpsite = new Dumpsite();
										  
										  dumpsite.setProjectId(projectId);
										  dumpsite.setDumpsite(d.getDumpsite());
										  dumpsite.setArea(d.getArea());
										  dumpsite.setQuantity(Long.parseLong(d.getQuantity()));
										  dumpsite.setHeight(d.getHeight());
										  dumpsite.setYear_of_start(d.getYear_of_start());
										  dumpsite.setDumpsiteStatus("CREATED");
										  
										  long dumpsiteId = dumpsiteService.addDumpsite(dumpsite);
										  
										  
									  }
								  }
								  
								  if(p.getUlb()!=null)
								  {
									  for(String name : p.getUlb())
									  {
										  com.sbm.proposal.model.Ulb ulb = new com.sbm.proposal.model.Ulb();
										  
										  ulb.setProjectId(projectId);
										  ulb.setUlb(name);
										  ulb.setUlbDistanceAboveFifty(0);
										  ulb.setDateTime(new Date());
										  ulb.setUlbStatus("CREATED");
										  
										  long ulbId = ulbService.addUlb(ulb);
									  }
								  }
								  
							  }
						  
					  }
				  }
			  }
		}
		
		  
		return ResponseEntity.status(200).body("created"); 
	
	}
}
