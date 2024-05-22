package com.newlecture.ex15Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args){


//        try {
//           int x = Calculator.add(100,-1);
//           System.out.println(x);
//        } catch (백을넘는예외 e) {
//            // 예외 시 정리할 수 있는 공간
//            //e.printStackTrace(); // 위에 애가 출력하는 오류가 나옴
//            System.out.println("예외가 발생했습니다 잠시후 다시 실행해 보시고 오류가 계속 될 경우 관리자에게 어쩌고");
//            //소켓 close() 등
//            //심각할 때는 프로그램 종료, 아니라면 문구만 출력되게 할수도 있다
//      //예외를 같이 적을 수도, 따로 관리할 수도 있음
////        } catch (백을넘는예외 | 음수가되는예외 e) {
////
////        }
//        } catch (음수가되는예외 e) {
//            System.out.println("음수는 안됩니다");
//        // 예외의 최상위 -> 모든 오류를 다 먹음
//        } catch (Exception e){
//            System.out.println("오류입니다");
//        }


        FileInputStream fis = null;
        try {
            System.out.println("시작");
            fis = new FileInputStream("res/data.txt");
            System.out.println("파일 스트림 생성됨");
            int b = fis.read();
        } catch (FileNotFoundException e) {
            System.out.println("파일 없대요");

        } catch (IOException e) {
            System.out.println("입력하다 오류 생겼대요");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
            }
        }

        // try catch 를 안쓴다면 문구가 출력이 안됨
        System.out.println("종료");
    }
}
