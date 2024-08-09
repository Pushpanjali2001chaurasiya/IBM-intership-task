public class ab {
    public static void main(String[] args) {
        int[][] numGroups = {
            {11, 12, 13, 14, 15},
            {7, 8, 9, 10},
            {4, 5, 6},
            {2, 3},
            {1}
        };

        for (int[] group : numGroups) {
            for (int number : group) {
                System.out.print(number + " ");
            }
            System.out.println();}
            
    }
}
