package codeforces.r503;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int t1 = sc.nextInt();
            int f1 = sc.nextInt();
            int t2 = sc.nextInt();
            int f2 = sc.nextInt();

            if (t1 == t2) {
                result[i] = Math.abs(f2 - f1);
                continue;
            }

            int firstTowerMove = 0;
            if (f1 > b) {
                firstTowerMove = f1 - b;
                f1 = b;
            }
            else if (f1 < a) {
                firstTowerMove = a - f1;
                f1 = a;
            }

            int transition = Math.abs(t2 - t1);

            int secondTowerMove = Math.abs(f1 - f2);

            result[i] = firstTowerMove + transition + secondTowerMove;
        }

        for (int i = 0; i < k; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] test(int n, int h, int a, int b, int k, int[][] data) {

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int t1 = data[i][0];
            int f1 = data[i][1];
            int t2 = data[i][2];
            int f2 = data[i][3];

            int firstTowerMove = 0;
            if (f1 > b){
                firstTowerMove = f1 - b;
                f1 = b;
            }
            else if (f1 < a) {
                firstTowerMove = a - f1;
                f1 = a;
            }

            int transition = t2 - t1;

            int secondTowerMove = Math.abs(f1 - f2);

            result[i] = firstTowerMove + transition + secondTowerMove;
        }

        return result;
    }
}
