package Easy;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int[] result = new int[128];

        for (char c: moves.toCharArray()) {
            result[c]++;
        }
        return result['U'] == result['D'] && result['L'] == result['R'];
    }
}
