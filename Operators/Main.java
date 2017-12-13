package com.Ado;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);

        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("This is not an Alien!");

        int topScore = 80;
        if (topScore != 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these test is true");
        int newValue = 50;
        if (newValue == 50)
            System.out.println("This i true");
        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to heppen");
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double myFirstValue = 20d;
        double mySecond = 80;
        double myTotal = (myFirstValue + mySecond) * 25;
        System.out.println("myTotal =" + myTotal);
        double theRemaindor = myTotal % 40;
        System.out.println("theRemaindor is =" + theRemaindor);
        if (theRemaindor <= 20)
            System.out.println("Total was over limit");


    }
}
