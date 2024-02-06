public class LongestWord {
    public static void main(String[] args) {
        String input = "Hello world123 567";
        String result = LongestWord(input);
        System.out.println(result);
    }

    public static String LongestWord(String sen) {
        String[] words = sen.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        return longestWord;
    }
}
