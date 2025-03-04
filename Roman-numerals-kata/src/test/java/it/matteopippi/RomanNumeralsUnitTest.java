package it.matteopippi;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsUnitTest {


    @Test
    void verifyOne() {
        String result = RomanNumeral.convert(1);
        assertEquals("I", result);
    }

    @Test
    void convertFour() {
        String result = RomanNumeral.convert(4);
        assertEquals("IV", result);
    }

    @Test
    void convertFive() {
        String result = RomanNumeral.convert(5);
        assertEquals("V", result);
    }

    @Test
    void convertTen() {
        String result = RomanNumeral.convert(10);
        assertEquals("X", result);
    }
    @Test
    void convertFifty() {
        String result = RomanNumeral.convert(50);
        assertEquals("L", result);
    }
    @Test
    void convertOneHundred() {
        String result = RomanNumeral.convert(100);
        assertEquals("C", result);
    }
    @Test
    void convertFiveHundred() {
        String result = RomanNumeral.convert(500);
        assertEquals("D", result);
    }
    @Test
    void convertFourHundred() {
        String result = RomanNumeral.convert(400);
        assertEquals("CD", result);
    }
    @Test
    void convertNineHundred() {
        String result = RomanNumeral.convert(900);
        assertEquals("CM", result);
    }
    @Test
    void convertOneThousand() {
        String result = RomanNumeral.convert(1000);
        assertEquals("M", result);
    }

    @Test
    void verifyFiftyEight() {
        String result = RomanNumeral.convert(58);
        assertEquals("LVIII", result);
    }

    @Test
    void verifyNinety() {
        String result = RomanNumeral.convert(90);
        assertEquals("XC", result);
    }
    @Test
    void verifyNinetyNinetyFour() {
        String result = RomanNumeral.convert(1994);
        assertEquals("MCMXCIV", result);
    }

    private static class RomanNumeral {
        static Map<Integer, String> conversionMap = new LinkedHashMap<Integer, String>(){{
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(9, "IX");
            put(10, "X");
            put(40, "XL");
            put(50, "L");
            put(90, "XC");
            put(100, "C");
            put(400, "CD");
            put(500, "D");
            put(900, "CM");
            put(1000, "M");
        }};

        public static String convert(Integer number) {
            StringBuilder result = new StringBuilder();
            Queue<Integer> queue = conversionMap.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedList::new));
            while (number > 0) {
                Integer biggestNumber = queue.poll();
                assert biggestNumber != null;
                double quotient = number.doubleValue() / biggestNumber.doubleValue();
                if(quotient >= 1) {
                    while (quotient >= 1) {
                        result.append(conversionMap.get(biggestNumber));
                        number = number - biggestNumber;
                        quotient--;
                    }
                }
            }
            return result.toString();
        }
    }
}
