package org.csystem.app;
import org.csystem.util.array.ArrayUtil;

import java.sql.SQLOutput;
import java.util.Arrays;

class App {
    public static void main(String [] args)
    {
        System.out.println(Solution.findTheDifference("aaa", "aaad"));
    }
}
class Solution {
    public static char findTheDifference(String s, String t) {
        String totalString = s + t;
        char [] totalChar = totalString.toCharArray();

        int result = 0;

        for(int i = 0; i < totalChar.length; ++i) {
            result ^= totalChar[i];
    }
        return (char)result;
}}