package com.company;

public class LimitException extends Exception{
    public LimitException(String massage, double remainingAmount){
        super(massage);
    }
    public static double getRemainingAmount(){
        return 0;
    }
}
