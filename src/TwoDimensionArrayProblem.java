import java.util.Scanner;

public class TwoDimensionArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myArr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                myArr[i][j] = sc.nextInt();
            }
        }
        TwoDimensionArrayProblem twoDimensionArrayProblem = new TwoDimensionArrayProblem();
        int result = twoDimensionArrayProblem.sumHourGlass(myArr);
        System.out.println(result);
    }

    public int sumHourGlass(int arr[][]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
