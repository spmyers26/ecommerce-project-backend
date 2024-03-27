package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luv2code.ecommerce.entity.ProductCategory;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}