package codeforces.r494;

import java.util.Scanner;

public class ConstructBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String s = x % 2 == 0 ? "01" : "10";
        x -= 1;
        a -= x;
        b -= x;
        while (x != 0) {
            sb.append(s); x--;
        }
        while (a != 0) {
            sb.append('0'); a--;
        }
        while (b != 0) {
            sb.append('1'); b--;
        }
        System.out.println(sb.toString());
    }
}
