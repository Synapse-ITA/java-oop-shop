package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private Random random = new Random();

    // ATTRIBUTI
    private int productCode;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productIva;

    // COSTRUTTORI
    public Prodotto(String productName, String productDescription, double productPrice, int productIva) {
        this.productCode = generateRandomCode();
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

    // METODO CHE MOSTRA PREZZO INCLUSO IVA
        public String getIvaPrice(){
        double productIvaPrice = (productPrice + (productPrice * ((double) productIva / 100)));
        String decimalPrice = String.format("%.2f", productIvaPrice);
        return "Il prezzo incluso IVA (" + productIva + "%) è: " + decimalPrice + " €";
    }

    // METODO PER PREZZO BASE
    public String getBasePrice(){
        double showBasePrice = productPrice;
        String decimalBasePrice = String.format("%.2f", showBasePrice);
        return "Il prezzo escluso IVA è: " + decimalBasePrice + "€";
    }

    // METODO CHE RESTITUISCE PRODUCTNAME + PRODUCTCODE
    public String getFullName(){
        return "Nome completo prodotto: " + productCode + "-" + productName;
    }

    // METODO UTILITA' CREAZIONE CODICE PER IL PRODOTTO
    private int generateRandomCode() {
        // Num random tra 1000 e 9999
        return 1000 + random.nextInt(9000);
    }
}



