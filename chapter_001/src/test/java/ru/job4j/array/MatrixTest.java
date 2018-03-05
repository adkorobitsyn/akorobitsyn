package ru.job4j.array;

import org.junit.Test;

//import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenMatrixFiveElement() {
        Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(4);
        //System.out.println(Arrays.deepToString(result)); //Просто для того, что бы понять, что выводится.
        int[][] exception =
                {
                        {0, 0, 0, 0},
                        {0, 1, 2, 3},
                        {0, 2, 4, 6},
                        {0, 3, 6, 9},
                };
        assertThat(result, is(exception));
    }
}
