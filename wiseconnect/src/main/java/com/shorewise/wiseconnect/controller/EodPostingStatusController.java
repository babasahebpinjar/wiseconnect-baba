package com.shorewise.wiseconnect.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shorewise.wiseconnect.service.EODPostingService;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/wiseconnect/eodpostings")
public class EodPostingStatusController {

    @Autowired
    private EODPostingService eodPostingService;

    @Autowired 
	private babatest babaDetails;
    @PostMapping("/actions")
    public ResponseEntity<String> performAction(@RequestParam String action) {
        try {
        	
        	
            // Covering the action scenarios
            switch (action) {
                case "SendPeriodPstToWiseconnect":
                	System.out.println("debug 1 SendPeriodPstToWiseconnect ");
                    eodPostingService.insertPeriodPstIntoEODPostings();
                    return ResponseEntity.ok("Period Postings sent to Wiseconnect.");
                case "SendToFinacle":
                    eodPostingService.pushBatchEODPostings();
                    return ResponseEntity.ok("Data sent to Finacle.");
                case "babatest":
                	String babaDetailsAsString = babaDetails.toString(); // Assuming babatest has overridden toString() method
                    return ResponseEntity.ok(babaDetailsAsString);
//                	return ResponseEntity.ok(babaDetails);
                default:
                    return ResponseEntity.badRequest().body("Invalid action parameter.");
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error: " + e.getMessage());
        }
    }

   

}
