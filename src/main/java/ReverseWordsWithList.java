/*
https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java

Complete the solution so that it reverses all of the words within the string passed in.

Example:
"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWordsWithList {
    public static String reverseWords(String str){
        List<String> strList = Arrays.asList(str.split(" "));
        Collections.reverse(strList);
        return String.join(" ", strList);
    }
}
