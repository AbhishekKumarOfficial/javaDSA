package hashtables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HashTableTest {

    @Test
    void putTest() {
        HashTable ht = new HashTable();
        ht.put(11, 121);
    }

    @Test
    void getTest() {
        HashTable ht = new HashTable();
        ht.put(11, 121);
        Assertions.assertEquals(ht.get(11), 121);
        Assertions.assertEquals(ht.get(2), Integer.MIN_VALUE);
    }

    @Test
    void removeTest() {
        HashTable ht = new HashTable();
        ht.put(1,1);
        ht.put(2,2);
        Assertions.assertEquals(ht.get(1), 1);
        Assertions.assertEquals(ht.get(3), -1);
        ht.put(2,1);
        Assertions.assertEquals(ht.get(2), 1);
        ht.remove(2);
        Assertions.assertEquals(ht.get(2), -1);
    }

}