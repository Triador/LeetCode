package easy;

public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 1, lineLength = 0;
        char[] charArray = S.toCharArray();
        for (char c: charArray) {
            int width = widths[c - 'a'];
            lineLength += width;
            if (lineLength > 100) {
                lines++;
                lineLength = width;
            }
        }
        return new int[]{lines, lineLength};
    }
}
