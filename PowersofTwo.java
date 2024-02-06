public class PowersofTwo {
    public static String PowersofTwo(int num) {
        if (num <= 0) {
            return "false";
        }
        return (num & (num - 1)) == 0 ? "true" : "false";
    }

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 22;

        String result1 = PowersofTwo(num1);
        String result2 = PowersofTwo(num2);

        if (result1.equals("true")) {
            System.out.println(result1);
        }
        if (result2.equals("false")) {
            System.out.println(result2);

        }
    }
}
