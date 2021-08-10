package com.rivwox.unittestEx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table()
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientModel {

	@Id
	@Column(name = "year")
	private Long year;

	@Column(name = "host_city")
	private String host_city;

	@Column(name = "winner_country")
	private String winner_country;

	@Column(name = "song")
	private String song;

	@Column(name = "artist")
	private String artist;

	@Column(name = "language")
	private String language;

	@Column(name = "points")
	private Long points;

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public String getHost_city() {
		return host_city;
	}

	public void setHost_city(String host_city) {
		this.host_city = host_city;
	}

	public String getWinner_country() {
		return winner_country;
	}

	public void setWinner_country(String winner_country) {
		this.winner_country = winner_country;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	
}
