package datastructures.hashtables;

import java.util.LinkedList;
class HashTable {
    private class Entry {
        private int key;
        private int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, int value) {
        var index = hash(key);
        if(entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        var bucket = entries[index];
        for (var entry : bucket) {
            if(entry.key == key) {
                entry.value = value;
                return;
            }
        }

        var entry = new Entry(key, value);
        bucket.addLast(entry);
    }

    public int get(int key) {
        var bucket = entries[hash(key)];

        if(bucket != null) {
            for( var entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }

        return Integer.MIN_VALUE;
    }

    public void remove(int key) {
        var bucket = entries[hash(key)];

        if(bucket == null) {
            return;
        }

        for( var entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
    }

    private int hash(int key) {
        return key % entries.length;
    }
}