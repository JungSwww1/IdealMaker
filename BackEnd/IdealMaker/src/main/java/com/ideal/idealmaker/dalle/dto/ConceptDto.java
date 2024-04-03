package com.ideal.idealmaker.Dalle.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ConceptDto {

	@JsonProperty("genderId")
	private Integer genderId;

	@JsonProperty("ageId")
	private Integer ageId;

	@JsonProperty("faceShapeId")
	private Integer faceShapeId;

	@JsonProperty("skinColorId")
	private Integer skinColorId;

	@JsonProperty("eyeStyleId")
	private Integer eyeStyleId;

	@JsonProperty("pupilColor")
	private String pupilColor;

	@JsonProperty("conceptId")
	private Integer conceptId;
}
