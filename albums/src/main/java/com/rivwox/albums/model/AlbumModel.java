package com.rivwox.albums.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Album")
public class AlbumModel {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "artist")
	private String artist;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "released_year")
	private Long released_year;
	
	@Column(name = "year")
	private Long year;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "format")
	private String format;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Long getReleased_year() {
		return released_year;
	}

	public void setReleased_year(Long released_year) {
		this.released_year = released_year;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	
}
