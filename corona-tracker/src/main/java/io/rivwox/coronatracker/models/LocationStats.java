package io.rivwox.coronatracker.models;

public class LocationStats {
	private String state;
	private String country;
	private int latestReportedCases;
	private int diffFromYesterday;
	
	public int getDiffFromYesterday() {
		return diffFromYesterday;
	}

	public void setDiffFromYesterday(int diffFromYesterday) {
		this.diffFromYesterday = diffFromYesterday;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getLatestReportedCases() {
		return latestReportedCases;
	}

	public void setLatestReportedCases(int latestReportedCases) {
		this.latestReportedCases = latestReportedCases;
	}

	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestReportedCases=" + latestReportedCases
				+ "]";
	}

}
