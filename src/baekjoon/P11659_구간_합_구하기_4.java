package baekjoon;

import java.util.Scanner;

public class P11659_구간_합_구하기_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dataSize = sc.nextInt();
        int questionSize = sc.nextInt();

        int[] dataArr = new int[dataSize];
        int[] dataSumArr = new int[dataSize + 1];
        dataSumArr[0] = 0;

        for (int i = 0; i < dataSize; i++) {
            dataArr[i] = sc.nextInt();
            dataSumArr[i+1] = dataSumArr[i] + dataArr[i];
        }

        int[] resultArr = new int[questionSize];
        for (int i = 0; i < questionSize; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            resultArr[i] = dataSumArr[to] - dataSumArr[from - 1];
        }

        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
