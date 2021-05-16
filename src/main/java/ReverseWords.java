/*
https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java

Complete the solution so that it reverses all of the words within the string passed in.

Example:
"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

 */

public class ReverseWords {
    public static String reverseWords(String str){
        String[] strArray = str.split(" ");
        String reversedStr = "";
        int i;
        for (i = strArray.length - 1; i > 0; i--) {
            reversedStr += String.format("%s ", strArray[i]);
        }
        reversedStr += strArray[i];
        return reversedStr;
    }
}
