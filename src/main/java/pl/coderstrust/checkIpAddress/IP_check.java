package pl.coderstrust.checkIpAddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP_check {


    public boolean isIpAddress(String input) {

        Pattern pattern = Pattern.compile("^((([0-9])|([0-9]\\d)|(1\\d{2})|(2[0-4][0-9])|(25[0-5]))\\.){3}?(([0-9])|([0-9]\\d)|(1\\d{2})|(2[0-4][0-9])|(25[0-5]))$");
        Matcher matcher = pattern.matcher(input);

        return matcher.find();
    }

}
