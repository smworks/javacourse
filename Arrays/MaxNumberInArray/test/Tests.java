import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testSolution() {
        int[] array = new int[]{1, 3, -20, 3, 55, 999, -243, 10 * 999, 57};
        int maxNumber = Task.findMaxNumber(array);
        Assert.assertEquals(maxNumber, 9990);
    }
}