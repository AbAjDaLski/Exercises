package com.Ado;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 byte)
        int myIntValue = 5 / 3;
        // width of float = 32 ( 4 byte)
        float myFloatValue = 5f / 3f;
        // width of double = (8 byte)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue =" + myIntValue);
        System.out.println("myFloatValue =" + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);
        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
    }
}
