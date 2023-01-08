import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }


    public static void task1() {
        System.out.println("Задача 1");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if ((i + k) % 2 == 0) {
                    matrix[i][k] = 1;
                } else {
                    matrix[i][k] = 0;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array1 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arr));
        int i = 0;
        do {
            int number = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = number;
            i++;
        }
        while ((arr[i] - arr[arr.length - 1 - i]) != 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int result = -2;
        for (int i = 0; i < arr.length; i++) {
            for (int index = i + 1; index < arr.length; index++) {
                if ((arr[i] + arr[index]) == result) {
                    System.out.println(arr[i] + " " + arr[index]);
                    break;
                }
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, -10};
        int sum;
        int i = 0;
        int j = i + 1;
        while (i < arr.length) {
            sum = arr[i] + arr[j];
            if (sum == -2) {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j = i + 1;
            } else if (j < arr.length - 1) {
                j++;
            } else {
                i++;
                if (i< arr.length-1) {
                    j = i+1;
                }
            }
        }
    }
}