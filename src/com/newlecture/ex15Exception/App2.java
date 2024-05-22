package com.newlecture.ex15Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) {


        try (
                FileInputStream fis = new FileInputStream("res/data.txt");
                FileOutputStream fos = new FileOutputStream("null");
        ) {
            System.out.println("파일 스트림 생성됨");
            int b = fis.read();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }

        System.out.println("프로그램 종료");


    }
}
