package org.example;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListZipperTest {

    @Test
    public void testZipEqualSizeIntegers() {
        List<Integer> a = List.of(1, 3, 5);
        List<Integer> b = List.of(2, 4, 6);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(expected, ListZipper.zip(a, b));
    }

    @Test
    public void testZipUnequalSizeStrings() {
        List<String> a = List.of("Red", "Green", "Blue");
        List<String> b = List.of("White", "Black", "Orange", "Pink", "Fuschia");
        List<String> expected = List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Pink", "Fuschia");
        assertEquals(expected, ListZipper.zip(a, b));
    }

    @Test
    public void testZipFirstListEmpty() {
        List<Double> a = List.of();
        List<Double> b = List.of(2.2, 3.3);
        List<Double> expected = List.of(2.2, 3.3);
        assertEquals(expected, ListZipper.zip(a, b));
    }

    @Test
    public void testZipSecondListEmpty() {
        List<Character> a = List.of('A', 'B', 'C');
        List<Character> b = List.of();
        List<Character> expected = List.of('A', 'B', 'C');
        assertEquals(expected, ListZipper.zip(a, b));
    }

    @Test
    public void testZipBothEmpty() {
        List<Object> a = List.of();
        List<Object> b = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, ListZipper.zip(a, b));
    }
}
