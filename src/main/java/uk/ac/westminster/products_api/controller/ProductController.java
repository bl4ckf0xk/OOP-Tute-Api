package uk.ac.westminster.products_api.controller;

import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.dto.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return new Product(1L, "ss", 99.22);
    }

    @PostMapping("/add-product")
    public Product create(@RequestBody Product product) {
        return product;
    }
}
