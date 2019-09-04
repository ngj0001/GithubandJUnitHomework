import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTest{


    @Test
    public void maxFull() {
        int[] array = new int[] {5, 25, 50, 75, 125, 150, 30};
        int max = Finder.max(array);
        Assert.assertEquals(150, max);

    }
    @Test
    public void minFull() {
        int[] array = new int[] {5, 25, 50, 75, 125, 150, 30};
        int min = Finder.min(array);
        Assert.assertEquals(5, min);

    }

    @Test(expected = IllegalArgumentException.class)
    public void maxEmpty() {
        int[] intArray = new int[]{};
        int max = Finder.max(intArray);
        Assert.assertEquals(intArray, max);
    }
    @Test(expected = IllegalArgumentException.class)
    public void minEmpty() {
        int[] intArray = new int[]{};
        int min = Finder.min(intArray);
        Assert.assertEquals(intArray, min);
    }
    @Test(expected = IllegalArgumentException.class)
    public void maxNull() {
        int[] intArray = null;
        int max = Finder.max(intArray);
        Assert.assertNull(null, max);

    }
    @Test(expected = IllegalArgumentException.class)
    public void minNull() {
        int[] intArray = null;
        int min = Finder.min(intArray);
        Assert.assertNull(null, min);

    }


}
