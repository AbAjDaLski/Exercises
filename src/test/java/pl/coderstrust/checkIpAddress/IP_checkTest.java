package pl.coderstrust.checkIpAddress;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.*;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class IP_checkTest {

    static long timeBefore;
    IP_check ip_check = new IP_check();

    @BeforeClass
    public static void beforTest() {
        timeBefore = System.currentTimeMillis();   //System.nanoTime();
    }

    private List<String> ipProvider() {
        List<String> dataBaseIPv4 = new ArrayList<>();


        String preFix = "1.1.1.";
        String postFix = "";
        for (int j = 0; j < 4; j++) {

            for (int i = 0; i < 256; i++) {
                dataBaseIPv4.add(preFix + Integer.toString(i) + postFix);
            }
            if(preFix.length()>1) {
                preFix = preFix.substring(0, preFix.length() - 2);
            }else {
                postFix="";
            }
            postFix = postFix.concat(".1");
        }
        return dataBaseIPv4;

    }

    //@Ignore
    @Test
    @Parameters(method = "ipProvider")
    public void isIpV4Address(String input) {
        //given

        //when

        //then

        Assert.assertTrue(ip_check.isIpAddress(input));
    }

    @AfterClass
    public static void afterTest() {
        System.out.println("Operetion time = " + Long.toString(System.currentTimeMillis() - timeBefore) + "[milliseconds]");
    }

    @Test
    @Parameters({"256.156.89.9", "123.-1.123.3", "300.2.0.5"})
    public void isNotIpV4Address(String input) {
        //given

        //when

        //then

        Assert.assertFalse(ip_check.isIpAddress(input));
    }

}
