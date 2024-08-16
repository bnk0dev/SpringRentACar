package com.springexample.rentACar.dataAccess.concretes;

import com.springexample.rentACar.dataAccess.abstracts.BrandRepository;
import com.springexample.rentACar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;
    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Audi"));
        brands.add(new Brand(3,"Ford"));
        brands.add(new Brand(4,"Honda"));
        brands.add(new Brand(5,"Honda"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
