package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberOfLinesToWriteString {

    @Test
    public void numberOfLines() {
        NumberOfLinesToWriteString numberOfLinesToWriteString = new NumberOfLinesToWriteString();
        int[] result = numberOfLinesToWriteString.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
        assertEquals(3, result[0]);
        assertEquals(60, result[1]);
        result = numberOfLinesToWriteString.numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa");
        assertEquals(2, result[0]);
        assertEquals(4, result[1]);
        result = numberOfLinesToWriteString.numberOfLines(new int[]{7,5,4,7,10,7,9,4,8,9,6,5,4,2,3,10,9,9,3,7,5,2,9,4,8,9}, "zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie");
        assertEquals(7, result[0]);
        assertEquals(69, result[1]);
    }
}
