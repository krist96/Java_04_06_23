package klient;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private String numerTelefonu;
    private String miasto;
    private String kodPocztowy;
    private String ulica;

    public boolean setDom(String dom) {
        boolean poprawne = true;

        String regex = "[A-Za-z0-9\s]{0,5}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dom);
        poprawne = matcher.matches();

        if(poprawne)
            this.dom = dom;

        return poprawne;
    }

    private String dom;
    private String lokal;

    public boolean setImie(String imie) {
        boolean poprawne = true;

        String regex = "[A-Za-z\s]{2,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(imie);
        poprawne = matcher.matches();

        if(poprawne)
            this.imie = imie;

        return poprawne;
    }

    public boolean setNazwisko(String nazwisko) {
        boolean poprawne = true;

        nazwisko = nazwisko.toLowerCase();
        nazwisko = wielkaLitera(nazwisko);

        String regex = "[A-Za-z-\s]{2,30}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nazwisko);
        poprawne = matcher.matches();

        if(poprawne)
            this.nazwisko = nazwisko;

        return poprawne;
    }

    private String wielkaLitera(String original) {
        String[] words = original.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1));

                // Sprawdź, czy słowo zawiera myślnik i czy nie jest ostatnim słowem
                if (word.contains("-") && i < words.length - 1) {
                    sb.append(" ");
                    sb.append(Character.toUpperCase(words[i + 1].charAt(0)));
                    sb.append(words[i + 1].substring(1));
                    i++; // Przejdź do kolejnego słowa
                }
            }
            sb.append(" ");
        }

        String result = sb.toString().trim();

        return result;
    }


    public boolean setEmail(String email) {
        boolean poprawne = true;

        String regex = "([A-Za-z0-9]+)@([A-Za-z0-9.]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        poprawne = matcher.matches();

        if(poprawne)
            this.email = email;

        return poprawne;
    }

    public boolean setNumerTelefonu(String numerTelefonu) {
        boolean poprawne = true;

        String regex = "[0-9+]{5,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numerTelefonu);
        poprawne = matcher.matches();

        if(poprawne)
            this.numerTelefonu = numerTelefonu;

        return poprawne;
    }

    public boolean setMiasto(String miasto) {
        boolean poprawne = true;

        String regex = "[A-Za-z-\s]{3,30}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(miasto);
        poprawne = matcher.matches();

        if(poprawne)
            this.miasto = miasto;

        return poprawne;
    }

    public boolean setKodPocztowy(String kodPocztowy) {
        boolean poprawne = true;

        kodPocztowy = weryfikacjaMyslnika(kodPocztowy);
        String regex = "\\d{2}-?\\d{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(kodPocztowy);
        poprawne = matcher.matches();

        if(poprawne)
            this.kodPocztowy = kodPocztowy;

        return poprawne;
    }

    private String weryfikacjaMyslnika(String text){
        if(!text.contains("-")){
            char newChar = '-'; // Nowy znak do dodania
            int index = 2; // Indeks, na którym chcesz dodać nowy znak

            text = text.substring(0, index) + newChar + text.substring(index);
        }

        return text;
    }

    public boolean setUlica(String ulica) {
        boolean poprawne = true;


        String regex = "[A-Za-z0-9\s-.]{0,30}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ulica);
        poprawne = matcher.matches();

        if(poprawne)
            this.ulica = ulica;

        return poprawne;
    }

    public boolean setLokal(String lokal) {
        boolean poprawne = true;

        String regex = "[A-Za-z0-9\s]{0,5}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lokal);
        poprawne = matcher.matches();

        if(poprawne)
            this.lokal = lokal;

        return poprawne;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public String getAll() {
        return  "Imię: " + imie +
                "\nNazwisko: " + nazwisko +
                "\nMiasto: " + miasto +
                "\nUlica: " + ulica +
                "\nKod pocztowy: " + kodPocztowy +
                "\nNumer domu: " + dom +
                "\nNumer lokalu: " + lokal +
                "\ne-mail: " + email +
                "\nTelefon: " + numerTelefonu;
    }
}
