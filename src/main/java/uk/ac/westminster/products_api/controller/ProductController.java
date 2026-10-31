package uk.ac.westminster.products_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.dto.Product;
import uk.ac.westminster.products_api.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return ProductService.getProductById(id);
    }

    @PostMapping("/add-product")
    public Product create(@RequestBody Product product) {
        return product;
    }

    @GetMapping("/test/{id}")
    public String test(@PathVariable Long id) {
        return ProductService.testGetSummaryById(id);
    }

    @GetMapping("")
    public List<Product> getAll() {
        return ProductService.getAllProducts();
    }

    @PostMapping("")
    public Product createProduct(@RequestBody Product product) {
        return ProductService.addProduct(product);
    }

    @GetMapping("/summaries")
    public List<String> getSummaries() {
        return productService.getAllSummaries();
    }
}
