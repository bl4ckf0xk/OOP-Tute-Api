package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;

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
