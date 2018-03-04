package pl.coderstrust.numbersFromFile;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class FileProcessorTest {

    @Test
    @Parameters({"src/test/resources/1000.txt"})
    public void shouldReadLineFromFileIsRight(String lineResult) throws Exception {
        //given
        String expected0 = "                        The First 1,000 Primes";
        String expected1 = "                          (the 1,000th is 7919)";

        //when
        List<String> given = new FileProcessor().readLinesFromFile(lineResult);

        //then
        assertEquals(expected0, given.get(0));
        assertEquals(expected1, given.get(1));
    }

    @Test
    @Parameters(method = "parametersProvider")
    public void shouldWriteLinesToFileIsRight(List<String> resultLines, String resultFileName) throws Exception {
        //given

        //when
        new FileProcessor().writeLinesToFile(resultLines, resultFileName);
        List<String> givenList1 = new FileProcessor().readLinesFromFile(resultFileName);

        //then
        assertEquals(givenList1.get(0), resultLines.get(0));
        assertEquals(givenList1.get(1), resultLines.get(1));
    }

    private Object[] parametersProvider() {
        return new Object[]{
                new Object[]{Arrays.asList("283+293+307+311+313+317+331+337+347+349=3188", "1153+1163+1171+1181+1187+1193+1201+1213+1217+1223=11902"), "src/test/resources/output1Test.txt"},
                new Object[]{Arrays.asList("607+613+617+619+631+641+643+647+653+659=6330", "1087+1091+1093+1097+1103+1109+1117+1123+1129+1151=11100"), "src/test/resources/output2Test.txt"}
        };
    }
}