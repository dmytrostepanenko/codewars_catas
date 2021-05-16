/*
https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java

Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
Return the resulting string.
 */

public class FakeBinaryV2 {

    public static String fakeBin(String numberString) {
        String resultStr = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) < '5') {
                resultStr += 0;
            } else if (numberString.charAt(i) >= '5') {
                resultStr += 1;
            }
        }
        return resultStr;
    }

    public static void main(String[] args) {
        String number = "123456789";
        System.out.println(number.getClass());
        System.out.println(number);

        System.out.println(FakeBinaryV2.fakeBin("1234567890"));

    }
}
