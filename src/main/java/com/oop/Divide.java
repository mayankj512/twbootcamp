package com.oop;

public class Divide {

//    public int doOperation(int val1, int val2) throws InvalidOperationException {
//
//        if(val2 == 0) {
//            return
//        }
//        return (int)(val1/val2);
//    }

    public int doOperation(double val1, double val2) throws InvalidOperationException {

        if(val2 == 0) {
            return Integer.MIN_VALUE;
            //return Double.POSITIVE_INFINITY;
        }
        return (int)(val1/val2);
    }

    public static void main(String[] args) {
        System.out.println(1 / Double.POSITIVE_INFINITY);
    }
}
