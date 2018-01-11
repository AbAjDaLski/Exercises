package pl.coderstrust.NumbersForFile;
// The class is responsible for delegating particular tasks to File and Number Processors
import java.util.List;

public class Processor {
    private NumberProcessor numbersProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumberProcessor numbersProcessor, FileProcessor fileProcessor) {
        this.numbersProcessor = numbersProcessor;
        this.fileProcessor = fileProcessor;
    }

    public void process(String fileName, String resultFileName) {
        List<String> linesFromFile = fileProcessor.readLinesFromFile(C:\Users\Lambda\IdeaProjects\test\src\main\java\pl\coderstrust\NumbersForFile);

        List<String> resultLines = new ArrayList<>();
        for (String line : linesFromFile) {
            resultLines.add(numbersProcessor.processLine(line));
        }

        fileProcessor.writeLinesToFile(resultLines, resultFileName);
    }
}

