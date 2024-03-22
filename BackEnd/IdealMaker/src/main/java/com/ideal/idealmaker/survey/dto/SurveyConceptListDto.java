package com.ideal.idealmaker.survey.dto;

import java.util.ArrayList;
import java.util.List;

import com.ideal.idealmaker.component.domain.EyeStyle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SurveyConceptListDto {

	private String type;

	private String gender;

	private SurveyDto[] questions;

}
