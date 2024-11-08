package stringer;

public class Stringer {
    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = reverseString(cleanedInput);
        return cleanedInput.equals(reversed);
    }

    public int countVowels(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        int count = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

