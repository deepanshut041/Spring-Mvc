package deepanshu.me.sample.services;

import deepanshu.me.sample.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

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

    @Override
    public Product saveOrUpdateProduct(Product product) {
        if (product != null){
            if(product.getId() == null){
                product.setId(genId());
            }
            products.put(product.getId(),product);
            return product;
        }
        else {
            throw new RuntimeException("Product can't be null");
        }
    }

    private Integer genId(){
        return Collections.max(products.keySet()) + 1;
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
