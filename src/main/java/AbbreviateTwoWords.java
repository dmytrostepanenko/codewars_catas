public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return Character.toUpperCase(name.charAt(0)) + "." + Character.toUpperCase(name.charAt(name.indexOf(' ') + 1));
    }
}
