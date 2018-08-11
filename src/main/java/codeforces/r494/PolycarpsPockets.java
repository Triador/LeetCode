package codeforces.r494;

import java.util.Scanner;

public class PolycarpsPockets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[101];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int coin = sc.nextInt();
            int pockets = ++array[coin];
            if (res < pockets) {
                res = pockets;
            }
        }
        System.out.println(res);
    }
    public int polycarpsPockets(int n, int[] input) {
        int res = 0;
        int[] array = new int[101];
        for (int coin: input) {
            int pockets = ++array[coin];
            if (res < pockets) {
                res = pockets;
            }
        }
        return res;
    }
}
