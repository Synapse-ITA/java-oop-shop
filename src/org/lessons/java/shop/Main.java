package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto productOne = new Prodotto(42, "Banana", "Un frutto molto buono", 10.50, 22);
        Prodotto productTwo = new Prodotto(87, "Mela", "Un frutto poco buono", 5.50, 22);

        // TESTO I METODI
        System.out.println("LISTA PRODOTTI");
        System.out.println(productOne.getFullName());
        System.out.println(productOne.getIvaPrice());
        System.out.println(" ");
        System.out.println(productTwo.getFullName());
        System.out.println(productTwo.getIvaPrice());






    }
}
