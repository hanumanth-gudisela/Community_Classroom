package com.programmmingtechie.productservice.repository;

import com.programmmingtechie.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}
