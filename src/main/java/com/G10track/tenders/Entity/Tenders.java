package com.G10track.tenders.Entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Tenders")
public class Tenders {
	
	   @Id
	   private Long id;
		private String tendernum;
		private LocalDateTime tender_Float_Date;
		private String tender_Floating_Dept;
		private String User_dept;
		private String states;
		private LocalDateTime Bidding_date;
	    private LocalDateTime Prebid_date;
		private LocalDateTime Bid_Opening_date;
		private int documentfee;
		private int EMD;
		private String desc1;
		private String BG;
		private String BOM;
	    private int value;
	    private String Tender_status;
        private String verticals;
	    private String Assigned_to;
	    private String url;
        private String remarks;


}
