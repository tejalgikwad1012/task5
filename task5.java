package tejal;


import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- 1D ARRAY ----------
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sum, Max, Min
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        double average = (double) sum / n;

        // ---------- MANUAL SORTING (Bubble Sort) ----------
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // ---------- OUTPUT ----------
        System.out.println("\n--- Array Analysis Output ---");
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ---------- 2D ARRAY ----------
        System.out.println("\n\n--- 2D Array Example ---");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ---------- EXCEPTION HANDLING ----------
        try {
            System.out.println("\nAccessing invalid index:");
            System.out.println(arr[100]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: Array index out of bounds!");
        }

        sc.close();
    }
}