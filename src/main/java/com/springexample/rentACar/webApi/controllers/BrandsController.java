package com.springexample.rentACar.webApi.controllers;


import com.springexample.rentACar.business.abstracts.BrandService;
import com.springexample.rentACar.entities.concretes.Brand;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<Brand> getAll() {
        return brandService.getAll();
    }
}
