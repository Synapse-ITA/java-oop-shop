package org.lessons.java.shop;

public class Prodotto {

    // ATTRIBUTI
    private int productCode;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productIva;

    // COSTRUTTORI
    public Prodotto(int productCode, String productName, String productDescription, double productPrice, int productIva) {
        this.productCode = productCode;
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

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductIva() {
        return productIva;
    }

    public void setProductIva(int productIva) {
        this.productIva = productIva;
    }

    // METODI

    // METODO CHE MOSTRA PREZZO NO IVA

    public String showPrice(){
        return "Il prezzo base è: " + productPrice + " €";
    }
    // METODO CHE MOSTRA PREZZO INCLUSO IVA
    public String getIvaPrice(){
        return "Il prezzo incluso di IVA è: " + (productPrice + (productPrice * ((double) productIva / 100))) + " €";
    }

    // METODO CHE RESTITUISCE PRODUCTNAME + PRODUCTCODE
    public String getFullName(){
        return "Nome prodotto: " + productName + " - Codice prodotto: " + productCode;
    }

    // METODO UTILITA' CREAZIONE CODICE PER IL PRODOTTO






}



