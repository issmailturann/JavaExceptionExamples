package com.issmailturan.userDefinedExceptions2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesabınızdaki parayı giriniz.");

        double hesaptakiPara = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(hesaptakiPara);

        try{
            System.out.println("Çekim yapmak istediğiniz miktarı giriniz. ");
            double cekim = scanner.nextDouble();

            bankAccount.withdraw(cekim);
            System.out.println("paranız azaldı, yeni paranız: " + bankAccount.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage() + "BU kadar paranız yok. Ekstra para lazım: " + e.getAmount());;
        }



    }
}
