package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFlippingAnImage {

    @Test
    public void flipAndInvertImage() {
        FlippingAnImage flippingAnImage = new FlippingAnImage();
        assertTrue(Arrays.deepEquals(new int[][]{{1,0,0},{0,1,0},{1,1,1}}, flippingAnImage.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}})));
        assertTrue(Arrays.deepEquals(new int[][]{{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}}, flippingAnImage.flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}})));
    }
}
