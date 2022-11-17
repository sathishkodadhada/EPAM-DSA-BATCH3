package com.epam.dsa.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApacheLogPatternTest {
    private final ApacheLogPattern apacheLogPattern = new ApacheLogPattern();

    @Test
    void findTopIPAddressTest1() {
        String[] lines = new String[]{

                "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",

                "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",

                "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234",

                "10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0\" 200 234",

                "10.0.0.3 - logan [10/Dec/2000:12:34:59 -0500] \"GET /d.gif HTTP/1.0\" 200 234",};
        Assertions.assertEquals("10.0.0.1,10.0.0.2", apacheLogPattern.findTopIPAddress(lines));
    }

    @Test
    void findTopIPAddressTest2() {
        String[] lines = new String[]{"10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234", "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234", "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234"};
        Assertions.assertEquals("10.0.0.1", apacheLogPattern.findTopIPAddress(lines));

    }

    @Test
    void findTopIPAddressWithEmptyRecords() {
        String[] lines = new String[0];
        Assertions.assertEquals("", apacheLogPattern.findTopIPAddress(lines));
    }
}