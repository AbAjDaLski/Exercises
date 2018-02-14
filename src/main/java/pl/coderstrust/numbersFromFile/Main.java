package pl.coderstrust.numbersFromFile;

import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        FileProcessor t = new FileProcessor(); // Created object
        NumberProcessor d = new NumberProcessor();// Created object
        Processor processor = new Processor(d, t);
        processor.process("src/test/resources/numbers.txt", "src/test/resources/outputTest.txt");
        processor.process("src/test/resources/1000.txt", "src/test/resources/output1000Test.txt");

    }


}
