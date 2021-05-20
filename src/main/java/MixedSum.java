/*
https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java

Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
Return your answer as a number.
 */

import java.util.ArrayList;
import java.util.List;

public class MixedSum {
    public int sum(List<?> mixed) {
        int result = 0;
        for (Object value: mixed) {
            if (value instanceof Integer) {
                result += (Integer) value;
            } else if (value instanceof String) {
                result += Integer.parseInt((String) value);
            }
        }
        return result;
    }
}
