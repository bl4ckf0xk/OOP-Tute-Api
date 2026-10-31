package uk.ac.westminster.products_api.dto;

public class DigitalProduct extends Product implements Discountable{
    private String downloadUrl;
    private Double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct(Long id, String name, Double price,String downloadUrl, Double fileSizeMB) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(Double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String testOver() {
        return "test digital";
    }


    public String getSummary() {
        return "Digital:" + getName();
    }

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
