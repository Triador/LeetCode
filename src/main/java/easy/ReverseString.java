package easy;

public class ReverseString {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        int l = c.length - 1;
        int mid = (l + 1) / 2;
        for (int i = 0; i < mid; i++) {
            char temp = c[i];
            c[i] = c[l - i];
            c[l - i] = temp;
        }
        return String.valueOf(c);
    }
}
