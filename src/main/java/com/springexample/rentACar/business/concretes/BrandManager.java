package com.springexample.rentACar.business.concretes;

import com.springexample.rentACar.business.abstracts.BrandService;
import com.springexample.rentACar.dataAccess.abstracts.BrandRepository;
import com.springexample.rentACar.entities.concretes.Brand;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //work rules
        return brandRepository.getAll();
    }
}
