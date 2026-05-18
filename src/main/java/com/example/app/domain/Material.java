package com.example.app.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Material {
	private Integer id;
	private String name;
	private String publisher;
	private String note;
	private MaterialType materialType;
	private LocalDateTime created;
	private String status;
}
