/*
https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java

Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
Return the resulting string.
 */

public class FakeBinary {

    public static String fakeBin(String numberString) {
        char[] charDigits = numberString.toCharArray();
        int[] intDigits = new int[charDigits.length];
        String resultStr = "";
        for (int i = 0; i < charDigits.length; i++) {
            if (Character.getNumericValue(charDigits[i]) < 5) {
                resultStr += 0;
            } else if (Character.getNumericValue(charDigits[i]) >= 5) {
                resultStr += 1;
            }
        }
        return resultStr;
    }

    public static void main(String[] args) {
        String number = "123456789";
        System.out.println(number.getClass());
        System.out.println(number);

        System.out.println(FakeBinary.fakeBin("1234567890"));

    }
}
