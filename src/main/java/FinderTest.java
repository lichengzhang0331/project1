import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {

    @Test
    public void test_findMaxValid() {
        Finder finder = new Finder();
        int[] intArray = new int[]{2, 30, 5, 18, 16};
        int exceptNum = 30;
        int realNum = finder.findMax(intArray);
        assertEquals(exceptNum, realNum);


    }

    @Test
    public void test_findMaxInvalid() {
        Finder finder = new Finder();
        int[] intArray = new int[]{};
        Integer exceptNum = null;
        Integer realNum = finder.findMax(intArray);
        assertEquals(exceptNum, realNum);
    }

    @Test
    public void test_findMinValid() {
        Finder finder = new Finder();
        int[] intArray = new int[]{2, 30, 5, 18, 16};
        int exceptNum = 2;
        int realNum = finder.findMin(intArray);
        assertEquals(exceptNum, realNum);


    }

    @Test
    public void test_findMinInvalid() {
        Finder finder = new Finder();
        int[] intArray = new int[]{};
        Integer exceptNum = null;
        Integer realNum = finder.findMin(intArray);
        assertEquals(exceptNum, realNum);
    }

}
