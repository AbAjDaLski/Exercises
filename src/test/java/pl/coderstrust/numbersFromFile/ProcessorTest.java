package pl.coderstrust.numbersFromFile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.FileNotFoundException;
import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

    @Mock
    NumberProcessor numbersProcessor;

    @Mock
    FileProcessor fileProcessor;

    @InjectMocks
    Processor processor;

    @Test
    public void testprocessor() throws FileNotFoundException {

        // given
        when(fileProcessor.readLinesFromFile("fileName.txt")).thenReturn(Arrays.asList("1 2 3", "4 5 6"));
        when(numbersProcessor.processLine("1 2 3")).thenReturn("1+2+3=6");
        when(numbersProcessor.processLine("4 5 6")).thenReturn("4+5+6=15");

        // when
        processor.process("fileName.txt", "output.txt");


        // then
        verify(fileProcessor).readLinesFromFile("fileName.txt");
        verify(numbersProcessor).processLine("1 2 3");
        verify(numbersProcessor).processLine("4 5 6");
        verify(fileProcessor).writeLinesToFile((Arrays.asList("1+2+3=6", "4+5+6=15")), "output.txt");

    }
}
