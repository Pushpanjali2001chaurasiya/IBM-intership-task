public class Num {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i <= 4; i++) {  // outer loop for the rows
            for (int j = 1; j <= i; j++) {  // inner loop for the columns
                System.out.print(number + " ");
                number++;
            }
            System.out.println();  // move to the next line after each row
        }
    }
}




11 12 13 14 15
7 8 9 10
4 5 6
2 3 
1