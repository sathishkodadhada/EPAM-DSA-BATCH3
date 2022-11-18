package com.epam.dsa.day3;

import java.util.HashMap;
import java.util.Map;

public class DecimalConversion {
    public String toDecimal(Long numerator, Long denominator) {
        if (denominator == 0) return "";
        StringBuilder res = new StringBuilder();
        res.append(numerator / denominator);
        long rem = (numerator % denominator) * 10;
        if (rem != 0) res.append(".");
        Map<String, Integer> map = new HashMap<>();
        while (rem != 0) {
            long quotient = rem / denominator;
            if (map.containsKey(quotient + "")) {
                int index = map.get(quotient + "");
                String part1 = res.substring(0, index);
                String part2 = "(" + res.substring(index) + ")";
                return part1 + part2;
            } else {
                res.append(quotient);
                map.put(quotient + "", res.length() - 1);
            }
            rem = (rem % denominator) * 10;
        }
        return res.toString();
    }
}
