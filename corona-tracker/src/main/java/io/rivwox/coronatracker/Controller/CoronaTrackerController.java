package io.rivwox.coronatracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.rivwox.coronatracker.models.LocationStats;
import io.rivwox.coronatracker.services.CoronaVirusDataService;

@Controller
public class CoronaTrackerController {
	
	@Autowired
	CoronaVirusDataService coronaService; 
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = coronaService.getAllStats();
		int totalReportedCases =  allStats.stream().mapToInt(stat -> stat.getLatestReportedCases()).sum();		
		int totalNewReportedCases =  allStats.stream().mapToInt(stat -> stat.getDiffFromYesterday()).sum();
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", totalReportedCases);
		model.addAttribute("totalNewReportedCases", totalNewReportedCases); 
		return "index";
	}
}
