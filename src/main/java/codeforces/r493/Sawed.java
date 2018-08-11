package codeforces.r493;

import java.util.Scanner;

//Распил
public class Sawed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int btcAmount = sc.nextInt();
        int[] btcCosts = new int[100];
        int even = 0, odd = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            int left = 0;
            if (right == 0) {
                left = sc.nextInt();
            } else {
                left = right;
                right = 0;
            }
            if (left % 2 == 0) even++;
            else odd++;
            if (even == odd && i != n - 1) {
                right = sc.nextInt();
                int btcCost = Math.abs(left - right);
                btcCosts[btcCost] += 1;
                even = 0;
                odd = 0;
            }
        }
        int sawedAmount = 0;
        int currentBTCCost = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < btcCosts[i]; j++) {
                currentBTCCost += i;
                if (currentBTCCost <= btcAmount) {
                    sawedAmount++;
                } else break;
            }
        }
        System.out.println(sawedAmount);
    }

    public int getSawedAmount(int n, int b, int[] array) {
        int[] btcCosts = new int[100];
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            int left = array[i];
            if (left % 2 == 0) even++;
            else odd++;
            if (even == odd && i != n - 1) {
                int right = array[i + 1];
                int btcCost = Math.abs(left - right);
                btcCosts[btcCost] += 1;
                even = 0;
                odd = 0;
            }
        }
        int sawedAmount = 0;
        int currentBTCCost = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < btcCosts[i]; j++) {
                currentBTCCost += i;
                if (currentBTCCost <= b) {
                    sawedAmount++;
                } else break;
            }
        }
        return sawedAmount;
    }
}
