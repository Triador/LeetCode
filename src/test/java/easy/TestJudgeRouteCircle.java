package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJudgeRouteCircle {

    @Test
    public void judgeCircle() {
        JudgeRouteCircle judgeRouteCircle = new JudgeRouteCircle();
        assertEquals(true, judgeRouteCircle.judgeCircle("UD"));
        assertEquals(false, judgeRouteCircle.judgeCircle("LL"));
    }
}
