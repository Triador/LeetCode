package codeforces.r503;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {

            int[] temp = new int[n];
            temp[i] = 1;
            int j = i;
            for (;;) {
                if (temp[input[j] - 1] > 0) {
                    result[i] = input[j];
                    break;
                }
                else {
                    temp[input[j] - 1]++;
                    j = input[j] - 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] test(int n, int[] data) {

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {

            int[] temp = new int[n];
            temp[i] = 1;
            int j = i;
            for (;;) {
                if (temp[data[j] - 1] > 0) {
                    result[i] = data[j];
                    break;
                }
                else {
                    temp[data[j] - 1]++;
                    j = data[j] - 1;
                }
            }
        }

        return result;
    }
}
