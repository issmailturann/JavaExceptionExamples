package com.issmailturan.BuildInExceptions;

public class NullPointerExceptionEx {

    public static void main(String[] args) {

        String str = null;

        try {
            System.out.println(str.length());
        }
        catch (Exception a){
            a.printStackTrace();
        }
        System.out.println("DEVAM EDEBİLİYORUM...");
    }
}
