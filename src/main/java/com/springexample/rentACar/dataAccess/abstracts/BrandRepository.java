package com.springexample.rentACar.dataAccess.abstracts;

import com.springexample.rentACar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();

}
