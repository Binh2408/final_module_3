package org.example.final_module_3.model;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;
    private double saleProduct;
    private int quantityProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double priceProduct, double saleProduct, int quantityProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.saleProduct = saleProduct;
        this.quantityProduct = quantityProduct;
    }

    public Product(String nameProduct, double priceProduct, double saleProduct, int quantityProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.saleProduct = saleProduct;
        this.quantityProduct = quantityProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public double getSaleProduct() {
        return saleProduct;
    }

    public void setSaleProduct(double saleProduct) {
        this.saleProduct = saleProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }
}
