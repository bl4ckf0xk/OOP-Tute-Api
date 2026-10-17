package uk.ac.westminster.products_api.dto;

public class PhysicalProduct extends Product {
    private double weight;
    private String shippingAddress;

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
}
