package deepanshu.me.sample.services;

import deepanshu.me.sample.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private Map<Integer,Product> products;

    public ProductServiceImpl(){
        loadProducts();
    }

    @Override
    public List<Product> listAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product getProductById(Integer id) {
        return products.get(id);
    }


    private void loadProducts(){
        products = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("This is first product");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImgUrl("dsfsd/sdfdf/fdsf");

        products.put(1,product1);


        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("This is Second product");
        product2.setPrice(new BigDecimal("123.99"));
        product2.setImgUrl("dsfsdwefjfe/sfejhsj");

        products.put(2,product2);
    }
}
