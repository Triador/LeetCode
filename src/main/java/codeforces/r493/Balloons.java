package codeforces.r493;

import java.util.Scanner;
//Шарики
public class Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(-1);
            return;
        }
        int sum1 = sc.nextInt();
        int sum2 = 0;
        for (int i = 0; i < n - 1; i++) {
            sum2 += sc.nextInt();
        }
        if (sum1 == sum2) {
            if (n > 2) {
                System.out.println(2);
                System.out.println("1 2");
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(1);
            System.out.println(1);
        }
    }
}
