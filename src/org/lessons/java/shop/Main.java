package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto productOne = new Prodotto("Banana", "Un frutto molto buono", 7.50, 22);
        Prodotto productTwo = new Prodotto("Mela", "Un frutto poco buono", 5.50, 15);
        Prodotto productThree = new Prodotto("Pera", "Un frutto mediocre", 3.50, 10);

        // TESTO I METODI
        System.out.println("LISTA PRODOTTI");
        System.out.println(productOne.getFullName());
        System.out.println(productOne.getBasePrice());
        System.out.println(productOne.getIvaPrice());
        System.out.println(" ");
        System.out.println(productTwo.getFullName());
        System.out.println(productTwo.getBasePrice());
        System.out.println(productTwo.getIvaPrice());
        System.out.println(" ");
        System.out.println(productThree.getFullName());
        System.out.println(productThree.getBasePrice());
        System.out.println(productThree.getIvaPrice());
        System.out.println(" ");
        System.out.println("VISUALIZZO E TESTO L'IVA AGGIORNATA DEI PRODOTTI DOPO IL SETTER");
        productOne.setProductIva(50);
        productTwo.setProductIva(30);
        productThree.setProductIva(70);
        System.out.println(productOne.getIvaPrice());
        System.out.println(productTwo.getIvaPrice());
        System.out.println(productThree.getIvaPrice());

        // TESTO LE EXCEPTION

        try {
            productOne.setProductIva(10);
            System.out.println("Valore dell'IVA: " + productOne.getProductIva());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: VALORE NON VALIDO");
        }

        try {
            productOne.setProductIva(0);
            System.out.println("Valore dell'IVA: " + productOne.getProductIva());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        }
    }

