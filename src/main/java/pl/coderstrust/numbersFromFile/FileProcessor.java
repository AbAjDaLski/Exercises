package pl.coderstrust.numbersFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// The class reads and writes operation on file.
public class FileProcessor {
    //read file
    public List<String> readLinesFromFile(String fileName) {
        File file = new File(fileName);
        Scanner read = null;
        try {
            read = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lineResult = new ArrayList<>();
        try {
            while (read.hasNextLine()) {
                lineResult.add(read.nextLine());
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } finally {
            read.close();
        }

        return lineResult;
    }

    // write file
    public void writeLinesToFile(List<String> resultLines, String resultFileName) throws FileNotFoundException {

        PrintWriter save = new PrintWriter(resultFileName);

        for (int i = 0; i < resultLines.size(); i++) {
            save.println(resultLines.get(i));
        }
        save.close();
    }

}