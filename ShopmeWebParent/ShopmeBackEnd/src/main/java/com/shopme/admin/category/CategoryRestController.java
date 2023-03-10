package com.shopme.admin.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CategoryRestController {

	@Autowired
	private CategoryService service;
	
	@PostMapping("/categories/check_unique")
    public String checkUnique( Integer id, String name, String alias) {
		return service.checkUnique(id, name, alias);
	}
}