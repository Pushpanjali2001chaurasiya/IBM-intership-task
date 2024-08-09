public class oppo {
    public static void main(String[] args) {
        int number = 15;
        for (int i = 5; i >= 1; i--) {  // outer loop for the rows, starting from 5 to 1
            for (int j = 1; j <= i; j++) {  // inner loop for the columns
                System.out.print(number + " ");
                number--;
            }
            System.out.println();  // move to the next line after each row
        }
    }
}
