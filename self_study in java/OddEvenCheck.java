public class OddEvenCheck {
    public static void main(String[] args) {
        // Define the numbers to check
        double[] numbers = {212, 1995, 204.64, 2024};

        // Iterate through each number and check if it's odd or even
        for (double num : numbers) {
            String result = isOddOrEven(num);
            System.out.println(num + " is " + result + ".");
        }
    }

    // Method to check if a number is odd or even
    public static String isOddOrEven(double n) {
        // Convert the number to an integer
        int intPart = (int) n;
        // Check if the integer part is even or odd
        if (intPart % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
