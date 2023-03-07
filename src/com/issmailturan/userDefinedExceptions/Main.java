package com.issmailturan.userDefinedExceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        try {
            System.out.println("Giriş yapabilmek için yaşınızı giriniz: ");

            int age = scanner.nextInt();
            if (age < 18){
                throw new InvalidAgeException("Yaşınız 18'den küçük");

            }
            else {
                System.out.println("HOŞGELDİNİZ GİREBİLİRSİNİZ.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("HATA: " + e.getMessage());
        }

        System.out.println("HER TÜRLÜ BURAYA DEVAM EDEBİLİYORUM");

    }
}
