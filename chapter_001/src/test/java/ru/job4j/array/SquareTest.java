package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void checkMassiveSquare() {
        Square square = new Square();
        int[] result = square.calculate(5);
        for (int x : result) {
            System.out.println(x); // Вывод на печать для визуальной проверки. (знаю что не стоит так делать, но это первый мой тест для массивов)
        }
        assertThat(result[4], is(25));
    }
}