package com.issmailturan.BuildInExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionEx {

    public static void main(String[] args) {

        File file = new File("ismail.txt");
        try (Scanner scanner = new Scanner(file)) {
        } catch (FileNotFoundException e) {
            System.out.println("Hata verdi: " + e.getMessage());
        }
        System.out.println("DEVAM EDEBİLİYORUM...");

    }
}
