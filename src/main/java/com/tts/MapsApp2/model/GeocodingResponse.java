package com.tts.MapsApp2.model;

import java.util.List;

import lombok.Data;

@Data
public class GeocodingResponse {
	private List<Geocoding> results;

}
