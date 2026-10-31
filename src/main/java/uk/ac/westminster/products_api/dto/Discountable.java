package uk.ac.westminster.products_api.dto;

public interface Discountable {
    void applyDiscount(double rate);

    double getDiscountedPrice();
}
