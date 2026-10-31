package uk.ac.westminster.products_api.service;

import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;
import uk.ac.westminster.products_api.dto.DigitalProduct;
import uk.ac.westminster.products_api.dto.PhysicalProduct;
import uk.ac.westminster.products_api.dto.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class ProductService {
    private static List<Product> products =  new ArrayList<>();

    private static Long nextId = 1L;

    public ProductService() {
        System.out.println("ProductService constructor executed");
        products.add(new DigitalProduct(nextId++, "E-book", 9.99, "/dl/1", 4.2));

        products.add(new PhysicalProduct(nextId++, "Monitor", 249.99, 5.4, "60x40"));
    }

    public List<Product> getProducts() {
        System.out.println("getProducts() executed");
        return products;
    }

    public static Product addProduct(Product product) {
        System.out.println("addProduct() executed");
        product.setId(nextId++);
        nextId += 1L;
        products.add(product);
        return product;
    }

    public List<Product> findProductsByName(String name) {
        System.out.println("findProductsByName() executed");
        return products.stream()
                .filter(product -> product.getName().toLowerCase()
                .contains(name.toLowerCase())
        ).toList();
    }

    public static String Test(Long id){
        return products.get(Math.toIntExact(id)).testOver();
    }

    public static List<Product> getAllProducts(){
        System.out.println("getAllProducts() executed");
        return products;
    }

    public static String testGetSummaryById(Long id) {
        Product b = new DigitalProduct(2L, "E-book", 9.99, "/dl/2", 4.2);
        DigitalProduct c = new DigitalProduct(3L, "Audiobook", 14.99, "/dl/3", 92.0);
//        Product dummy = products.get(Math.toIntExact(id));
        return ((DigitalProduct)b).getDownloadUrl();
    }

    public static Product getProductById(Long id){
        System.out.println("getProductById() executed");
        return products.get(Math.toIntExact(id));
    }

    public List<String> getAllSummaries() {
        System.out.println("getAllSummaries() executed");
        ArrayList<String> summaries = new ArrayList<>();
        for (Product p: products) {summaries.add(p.getSummary());}
        return summaries;
    }
}
