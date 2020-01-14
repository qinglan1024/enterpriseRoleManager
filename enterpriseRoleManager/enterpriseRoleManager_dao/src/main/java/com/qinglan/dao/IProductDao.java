package com.qinglan.dao;

import com.qinglan.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    @Select("select * from product")
    List<Product> finAll();
}
