package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println(" ");

        // TESTO LE EXCEPTION
        System.out.println("TESTO LE EXCEPTIONS");
        try {
            productOne.setProductIva(10);
            System.out.println("Valore dell'IVA: " + productOne.getProductIva() + "%");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: VALORE NON VALIDO");
        }

        try {
            productOne.setProductIva(0);
            System.out.println("Valore dell'IVA: " + productOne.getProductIva() + "%");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        System.out.println(" ");
        System.out.println("TESTO L'EXCEPTION DEL NOME");

        try {
            // Chiedi all'utente di inserire il nome del prodotto
            System.out.print("Inserisci il nome del prodotto: ");
            String userInput = scanner.nextLine();
            productOne.setProductName(userInput);
            System.out.println("Il nome è: " + productOne.getProductName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


