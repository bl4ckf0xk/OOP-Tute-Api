package uk.ac.westminster.products_api.dto;

import java.io.Serializable;

public class PhysicalProduct extends Product implements Discountable {
    private double weight;
    private String shippingAddress;
    private double discountedPrice;

    public PhysicalProduct(long id, String name, double price, double weight, String shippingAddress) {
        super(id, name, price);
        this.weight = weight;
        this.shippingAddress = shippingAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    public String getSummary() {
        return "Physical:" + getName();
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
