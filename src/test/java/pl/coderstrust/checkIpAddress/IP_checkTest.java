package pl.coderstrust.checkIpAddress;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class IP_checkTest {

    IP_check ip_check = new IP_check();

    private List<String> ipProvider() {
        List<String> dataBaseIPv4 = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                for (int k = 0; k < 256; k++) {
                    for (int l = 0; l < 256; l++) {
                        dataBaseIPv4.add(Integer.toString(i) + "." + Integer.toString(j) + "." + Integer.toString(k) + "." + Integer.toString(l));
                    }
                }
            }
        }
        return dataBaseIPv4;
    }

    @Test
    @Parameters(method = "ipProvider")
    public void isIpAddress(String input) {
        //given

        //when

        //then
        Assert.assertTrue(ip_check.isIpAddress(input));
    }
}
