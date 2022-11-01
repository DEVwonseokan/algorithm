package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double sum = 0;
        double[] inputArr = new double[N];
        for (int i = 0; i < N; i++) {
            inputArr[i]= sc.nextInt();
        }
        Arrays.sort(inputArr);
        double max = inputArr[N - 1];
        for (int i = 0; i < N; i++) {
            sum += inputArr[i] / max * 100;
        }
        System.out.println(sum/N);
    }
}
