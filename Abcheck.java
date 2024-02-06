public class Abcheck {
    public static String ABCheck(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 4; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 4) == 'b') {
                return "true";
            }
        }

        return "false";
    }

    public static void main(String[] args) {
        String result1 = ABCheck("lane borrowed");
        String result2 = ABCheck("abcde");

        // Modify the logic to print only if the result is "true"
        if (result1.equals("true")) {
            System.out.println(result1);
        }
        if (result2.equals("true")) {
            System.out.println(result2);
        }
    }
}
