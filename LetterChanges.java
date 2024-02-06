public class LetterChanges {
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(letterChanges(input));
    }

    public static String letterChanges(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char originalChar = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(originalChar)) {
                // Shift the letter by one in the alphabet
                char shiftedChar = shiftCharacter(originalChar);

                // Capitalize vowels
                if (isVowel(shiftedChar)) {
                    shiftedChar = Character.toUpperCase(shiftedChar);
                }

                // Append the modified character to the result
                result.append(shiftedChar);
            } else {
                // Append non-letter characters unchanged
                result.append(originalChar);
            }
        }

        return result.toString();
    }

    // Method to shift a character by one in the alphabet
    private static char shiftCharacter(char c) {
        // Shift the character by one in the alphabet
        char shiftedChar = (char) (c + 1);

        // Handle the edge case for 'z' to 'a'
        if (shiftedChar > 'z') {
            shiftedChar = 'a';
        }

        return shiftedChar;
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        // Check if the character is a vowel
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
