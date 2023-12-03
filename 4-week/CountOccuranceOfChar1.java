package practitce;
public class CountOccuranceOfChar1 {
    public static int countOccurrenceOfChar(String inputString, char targetChar) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "Hell0, how are you?";
        char target = 'o';
        int occurrence = countOccurrenceOfChar(input, target);
        System.out.println("The character '" + target + "' occurs " + occurrence + " times in the string.");
    }
}