package com.issmailturan.BuildInExceptions;

public class ClassCastExceptionEx {

    public static void main(String[] args) {

        // nesne adında string deger barindiran object oluşturuldu.
        Object nesne = "Java";

        try{
            Integer integer = (Integer) nesne;
        } catch (ClassCastException e) {
            System.out.println("Farklı nesne türleri arasında bir dönüşüm yapılamaz: " + e.getMessage());;
        }
        System.out.println("DEVAM EDEBİLİYORUM...");

    }
}
