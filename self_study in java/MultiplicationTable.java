public class MultiplicationTable {
    public static void main(String[] args) {
        // Define the maximum number for the table
        int maxNumber = 10;

        // Loop through rows
        for (int i = 1; i <= maxNumber; i++) {
            // Loop through columns
            for (int j = 1; j <= 3; j++) {
                // Print the product of the row and column index
                System.out.print((i * j) + "\t");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
