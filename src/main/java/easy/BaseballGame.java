package easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Deque<Integer> stack =  new ArrayDeque<>();
        int result = 0;
        for (String s : ops) {
            switch (s) {
                case "+":
                    int firstElem = stack.poll();
                    int secondElem = stack.peek();
                    int sum = firstElem + secondElem;
                    stack.push(firstElem);
                    stack.push(sum);
                    result += sum;
                    break;
                case "D":
                    int elem = stack.peek();
                    int doubledPoints = elem * 2;
                    stack.push(doubledPoints);
                    result += doubledPoints;
                    break;
                case "C":
                    int points = stack.remove();
                    result -= points;
                    break;
                default:
                    points = Integer.valueOf(s);
                    stack.push(points);
                    result += points;
            }
        }
        return result;
    }
}
