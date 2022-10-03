package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicArrayTest {
    @Test
    public void removeShouldDeleteAndShiftItemsLeft() {
        DynamicArray arr = new DynamicArray(2);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.removeAt(1);
        Assertions.assertEquals(arr.toString(),"DynamicArray{items=[1, 3, 4, 0], count=3}");
    }
}