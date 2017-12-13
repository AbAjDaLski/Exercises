package com.Ado;

public class Main {

    public static void main(String[] args) {

        String MySting = "This is string";
        System.out.println("my String is equal to " + MySting);
        MySting = MySting + ", and this is more";
        System.out.println("my String is equal to " + MySting);
        MySting = MySting + " \u00A9 2015";
        System.out.println("my Sting is equal to " + MySting);

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("The resoult is " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString  is equal to" + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value " + lastString);

    }
}
