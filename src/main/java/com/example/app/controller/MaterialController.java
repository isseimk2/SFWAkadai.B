package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MaterialController {

	@GetMapping("/admin/material/list")
	public String list() {
		return "admin/list-material";
	}

	@GetMapping("/admin/material/show/{id}")
	public String show(
			@PathVariable Integer id) {
		return "admin/show-material";
	}

	@GetMapping("/admin/material/add")
	public String add() {
		return "admin/add-material";
	}

	@GetMapping("/admin/material/edit/{id}")
	public String edit(
			@PathVariable Integer id) {
		return "admin/edit-material";
	}
}
