package com.newlecture.ex15Exception;

public class Calculator {
    public static int add(int x, int y) throws 백을넘는예외, 음수가되는예외 {
        if(x > 100)
            throw new 백을넘는예외();
        if(y < 0)
            throw new 음수가되는예외();
        return x+y;
    }

    public static int sub(int x, int y){
        return x-y;
    }

    public static int multi(int x, int y){
        return x*y;
    }
    public static int div(int x, int y){
        return x/y;
    }
}
