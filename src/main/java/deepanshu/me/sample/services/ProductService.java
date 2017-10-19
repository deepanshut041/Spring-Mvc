package deepanshu.me.sample.services;

import deepanshu.me.sample.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);
}
