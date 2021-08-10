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

}
