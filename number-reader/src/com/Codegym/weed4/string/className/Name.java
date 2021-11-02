package com.Codegym.weed4.string.className;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
    private static final String NAME_REGEX = "^[CAP]+[0-9]{4}[GHIKLM]$";
    public boolean isNameRegex(String regex){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
