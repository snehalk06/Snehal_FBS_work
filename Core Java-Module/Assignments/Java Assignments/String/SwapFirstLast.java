public class SwapFirstLast {
    public static void main(String[] args) {
        String str = "Snehal Kale";

        if (str.length() <= 1) {
            System.out.println("Result: " + str);
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            String middle = str.substring(1, str.length() - 1);

            String result = last + middle + first;

            System.out.println("Original: " + str);
            System.out.println("Result: " + result);
        }
    }
}