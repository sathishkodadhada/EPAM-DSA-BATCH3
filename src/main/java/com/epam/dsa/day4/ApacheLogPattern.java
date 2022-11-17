package com.epam.dsa.day4;

import org.apache.logging.log4j.util.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApacheLogPattern {
    public String findTopIPAddress(String[] lines) {
        int maxCnt = 0;
        Map<String, Integer> count = new LinkedHashMap<>();
        for (String line : lines) {
            String ip = line.split(" ")[0].trim();
            int cnt = count.getOrDefault(ip, 0) + 1;
            if (cnt > maxCnt) {
                maxCnt = cnt;
            }
            count.put(ip, cnt);
        }
        int finalMaxCnt = maxCnt;
        return Strings.join(count.keySet().stream().filter(key -> count.get(key) == finalMaxCnt).iterator(), ',');
    }


}
