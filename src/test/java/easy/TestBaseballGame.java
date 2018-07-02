package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBaseballGame {

    @Test
    public void calPoints() {
        BaseballGame baseballGame = new BaseballGame();
        assertEquals(30, baseballGame.calPoints(new String[]{"5","2","C","D","+"}));
        assertEquals(27, baseballGame.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
}
