import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AverageOfTwoPoints {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] points = new int[n][2];

        // Outer loop controls which row is currently being modified.
        for(int i = 0; i < points.length; i++){
            // Inner loop controls which column is currently being modified.
            for(int j = 0; j < points[i].length; j++){

                points[i][j] = in.nextInt();

            }
        }

        // Sorting the array
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        // Setting the 2 middle rows of points[][1](we just want the "y-coordinate") to y1 and y2, the median element is the same as what y1 outputs.
        int y1, y2;
        y1 = points[points.length/2][1];
        y2 = points[(points.length/2) - 1][1];
        int median = y1;

        // Checking if the amount of array rows is even or odd.
        if (points.length % 2 == 0) {
            int avg;
            // Checking if y1 is smaller than y2 to correctly do average math.
            if (y1 < y2){
                avg = (y1 + ((y2 - y1) / 2));
                System.out.println(avg);
            } else {
                avg = (y2 + ((y1 - y2 )/ 2));
                System.out.println(avg);
            }
        } else {
            // If the array rows are odd then we can just output the median.
            System.out.println(median);
        }
    }
}
