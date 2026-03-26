package re.edu.service;

import org.springframework.stereotype.Service;
import re.edu.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(1, "Laptop Dell XPS", 25000000));
        productList.add(new Product(2, "Chuột Logitech G502", 1200000));
        productList.add(new Product(3, "Bàn phím cơ Keychron", 2000000));
    }

    public List<Product> getAllProduct(){
        return productList;
    }
}
