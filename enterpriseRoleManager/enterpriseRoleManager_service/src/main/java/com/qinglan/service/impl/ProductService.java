package com.qinglan.service.impl;

import com.qinglan.dao.IProductDao;
import com.qinglan.domain.Product;
import com.qinglan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService implements IProductService {

    @Autowired
    private IProductDao iProductDao;

    public List<Product> findAll() {
        return iProductDao.finAll();
    }
}
