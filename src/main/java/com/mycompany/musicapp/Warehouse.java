package com.mycompany.musicapp;

/**
 *
 * @author zemor
 */
public class Warehouse { // склад

    private String name;
    private String productName;
    private boolean productAvailability; // наличие товара 
    private Integer quantityProduct; // количество товара

    public Warehouse() {
        name = null;
        productName = null;
        productAvailability = false;
        quantityProduct = 0;
    }

    public Warehouse(String name, String productName, boolean productAvailability, Integer quantityProduct) {
        this.name = name;
        this.productName = productName;
        this.productAvailability = productAvailability;
        this.quantityProduct = quantityProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
// наличие товара
    public boolean ProductAvailability() {

        return false;
    }

    //список товаров
    public String[] listProduct() {

        return null;
    }

}
