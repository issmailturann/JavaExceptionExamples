package com.issmailturan.BuildInExceptions;

public class ArrayIndexOutOfBoundsExceptionEx {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try{
            System.out.println("3. indeksin degeri: " + arr[3]);
            System.out.println("7. indeksin degeri: " + arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Burada bir hata oluştu: " + e.getCause());;
        }
        System.out.println("DEVAM EDEBİLİYORUM...");

    }
}
