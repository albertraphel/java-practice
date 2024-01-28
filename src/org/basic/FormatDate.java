package org.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class FormatDate {
    public static void main(String[] args) {
        SimpleDateFormat sm = new SimpleDateFormat("dd:MM:YYYY HH:mm:ss");
        System.out.println(sm.format(System.currentTimeMillis()));
    }
}
