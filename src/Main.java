import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task-1
        int[][] array = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10, 20);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] += number;
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println();
        }

        System.out.println("The sum of array elements is: " + sum);

        //task-2
        String[][] board = new String[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        //task-3
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = temp;
                    temp++;
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    arr[i][j] = temp;
                    temp++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr[i][j] > 9) && (arr[i][j] < 100)) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    System.out.print("  " + arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}