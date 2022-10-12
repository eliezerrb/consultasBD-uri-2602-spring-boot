package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projections.CustomerMinProjection;

public class CostumerMinDTO {

	private String name;

	public CostumerMinDTO() {
	}

	public CostumerMinDTO(String name) {
		this.name = name;
	}
	
	public CostumerMinDTO(CustomerMinProjection projection) {
		name = projection.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CostumerMinDTO [name=" + name + "]";
	}

}
