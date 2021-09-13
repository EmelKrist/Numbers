package tasknumbers;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaskNumbersTest {

    private static Calculation C1;

    public TaskNumbersTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        int[] example = new int[]{-2, 3};
        C1 = new Calculation(2, example);
    }

    @Test //проверка переменной n на null
    public void N_NO_NULL() {
        int expected = C1.n;
        Assert.assertNotNull(expected);
    }

    @Test //проверка значений массива numbers на null
    public void Numbers_NO_NULL() {
        int[] expected = C1.numbers;
        Assert.assertNotNull(expected);
    }

    @Test //проверка правильности сложения
    public void SumTest() {
        int expected = C1.numbers[0] + C1.numbers[1];
        int actual = C1.sum;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test //проверка правильности умножения
    public void MultiplicationTest() {
        int expected = C1.numbers[0] * C1.numbers[1];
        int actual = C1.multipl;
        Assert.assertEquals(expected, actual, 0.01);
    }
    
    

}
