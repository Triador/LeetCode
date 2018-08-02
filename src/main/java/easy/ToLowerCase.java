package easy;

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char symbol: str.toCharArray()) {
            if (symbol > 64 && symbol < 91) {
                symbol += 32;
            }
            sb.append(symbol);
        }
        return sb.toString();
    }
}
