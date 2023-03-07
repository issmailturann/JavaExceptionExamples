package com.issmailturan.BuildInExceptions;

public class NumberFormatExceptionEx {

    public static void main(String[] args) {

        String metinMiSayiMi = "123ismail";

        try{
            int sayiyaDonustur = Integer.parseInt(metinMiSayiMi);
        }
        catch(NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("DEVAM EDEBİLİYORUM...");
    }


}
