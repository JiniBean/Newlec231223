package com.newlecture.ex15Exception;

public class 백을넘는예외 extends RuntimeException {
    @Override
    public String getMessage() {
        return "변수에는 100이하의 값으로만 가능합니다";
    }
}
