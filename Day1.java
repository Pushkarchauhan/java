import java.util.*;

public class Day1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 3, 6, 1, 2, 5 };

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("THis is new Code NAd Reasudinasd");
            for(int i = 0; i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        }

    }
}