package org.harold;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        compteLettres(demandeNom());
        compteLettres(demandePrenom());

    }

    public static String demandeNom()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez moi votre nom");
        String nom = sc.next();
        return nom;
    }
    public static String demandePrenom()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez moi votre prénom");
        String prenom = sc.next();
        return prenom;
    }
    public static void compteLettres(String prenom) {
        int nombre = prenom.length();

        System.out.printf("%s a %d lettres%n", prenom, nombre);
    }
}