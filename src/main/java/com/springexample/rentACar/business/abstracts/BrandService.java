package com.springexample.rentACar.business.abstracts;

import com.springexample.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
