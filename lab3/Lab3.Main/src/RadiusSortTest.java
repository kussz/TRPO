import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class RadiusSortTest {
    @Test
    public void testSort1() {
        int[] actual = {68, 123, 37, 769, 134, 7, 221, 468, 387};
        int[] expected = {7, 37, 68, 123, 134, 221, 387, 468, 769};

        RadiusSort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2() {
        int[] actual = {5, 8, 8, 1, 10, 4, 9, 7, 8, 3, 2, 6};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 10};

        RadiusSort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort3() {
        int[] actual = {0, 0, 0, 0, 0, 0};
        int[] expected = {0, 0,\sf 0, 0, 0, 0};

        RadiusSort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort4() {
        int[] actual = {};
        int[] expected = {};

        RadiusSort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort5() {
        int[] actual = {5};
        int[] expected = {5};

        RadiusSort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}