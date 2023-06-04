package org.example;

import klient.Klient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Klient klient = new Klient();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scan.nextLine();

        if(klient.setImie(imie))
            System.out.println("Imię spełnia kryteria i zostało dodane.");
        else
            System.out.println("Imię NIE spełnia kryteriów i NIE zostało dodane.");


        scan = new Scanner(System.in);
        System.out.println("Podaj Nazwisko: ");
        String nazwisko = scan.nextLine();

        if(klient.setNazwisko(nazwisko))
            System.out.println("Nazwisko spełnia kryteria i zostało dodane.");
        else
            System.out.println("Nazwisko NIE spełnia kryteriów i NIE zostało dodane.");

        System.out.println(klient.getNazwisko());

        scan = new Scanner(System.in);
        System.out.println("Podaj Miasto: ");
        String miasto = scan.nextLine();

        if(klient.setMiasto(miasto))
            System.out.println("Miasto spełnia kryteria i zostało dodane.");
        else
            System.out.println("Miasto NIE spełnia kryteriów i NIE zostało dodane.");


        scan = new Scanner(System.in);
        System.out.println("Podaj Kod-pocztowy: ");
        String kodPocztowy = scan.nextLine();

        if(klient.setKodPocztowy(kodPocztowy))
            System.out.println("Kod-pocztowy spełnia kryteria i zostało dodane.");
        else
            System.out.println("Kod-pocztowy NIE spełnia kryteriów i NIE zostało dodane.");

        System.out.println(klient.getKodPocztowy());



        scan = new Scanner(System.in);
        System.out.println("Podaj ulice(lub aleje lub plac): ");
        String ulica = scan.nextLine();

        if(klient.setUlica(ulica))
            System.out.println("ulice spełnia kryteria i zostało dodane.");
        else
            System.out.println("ulice NIE spełnia kryteriów i NIE zostało dodane.");


        klient.getUlica();


        scan = new Scanner(System.in);
        System.out.println("Podaj numer domu: ");
        String dom = scan.nextLine();

        if(klient.setDom(dom))
            System.out.println("numer domu spełnia kryteria i zostało dodane.");
        else
            System.out.println("numer domu NIE spełnia kryteriów i NIE zostało dodane.");


        scan = new Scanner(System.in);
        System.out.println("Podaj numer lokalu: ");
        String lokal = scan.nextLine();

        if(klient.setLokal(lokal))
            System.out.println("numer lokalu spełnia kryteria i zostało dodane.");
        else
            System.out.println("numer lokalu NIE spełnia kryteriów i NIE zostało dodane.");


        scan = new Scanner(System.in);
        System.out.println("Podaj numer telefonu: ");
        String numerTel = scan.nextLine();

        if(klient.setNumerTelefonu(numerTel))
            System.out.println("numer telefonu spełnia kryteria i zostało dodane.");
        else
            System.out.println("numer telefonu NIE spełnia kryteriów i NIE zostało dodane.");


        scan = new Scanner(System.in);
        System.out.println("Podaj email: ");
        String email = scan.nextLine();

        if(klient.setEmail(email))
            System.out.println("email spełnia kryteria i zostało dodane.");
        else
            System.out.println("email NIE spełnia kryteriów i NIE zostało dodane.");

        System.out.println(klient.getAll());
    }
}