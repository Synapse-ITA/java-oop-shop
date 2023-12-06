package org.lessons.java.shop;

public class Prodotto {

    // ATTRIBUTI
    private int productCode;
    private String productName;
    private String productDescription;
    private int productPrice;
    private int productIva;

    // COSTRUTTORI
    public Prodotto(int code, String productName, String productDescription, int productPrice, int productIva) {
        this.productCode = code;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productIva = productIva;
    }

    // GETTER E SETTER
    public int getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductIva() {
        return productIva;
    }

    // METODI

    // METODO CHE MOSTRA PREZZO NO IVA

    public String showPrice(){
        return "Il prezzo base è: " + productPrice + " €";
    }
    // METODO CHE MOSTRA PREZZO INCLUSO IVA
    public String showIvaPrice(){
        return "Il prezzo incluso di IVA è: " + (productPrice * (productIva / 100)) + " €";
    }

    // METODO CHE RESTITUISCE PRODUCTNAME + PRODUCTCODE
    public String getFullName(){
        return productName + " " + productCode;
    }
}



