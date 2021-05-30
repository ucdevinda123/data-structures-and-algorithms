package datastructures.hashtable.java;

import java.util.LinkedList;

public class CustomHashTable<K, V> {
    private LinkedList<Data>[] dataList = new LinkedList[5];

    public boolean put(K key, V value) {
        Integer index = getIndexForKey(key);
        if (dataList[index] == null) {
            LinkedList<Data> bucket = new LinkedList<>();
            Data<K, V> data = new Data<>(key, value);
            bucket.addLast(data);
            dataList[index] = bucket;
            return true;
        }

        for (Data data : dataList[index]) {
            if (data.key.equals(key)) {
                data.value = value;
                return true;
            }
        }
        dataList[index].addLast(new Data<K, V>(key, value));
        return true;
    }

    public boolean remove(K key) {
        Integer index = getIndexForKey(key);
        Data data = get(key);
        if (data != null) {
            dataList[index].remove(get(key));
            return true;
        }
        return false;
    }

    public Object getValue(K key) {
        Integer index = getIndexForKey(key);
        for (Data data : dataList[index]) {
            if (data.key.equals(key)) {
                return data.value;
            }
        }
        return null;
    }


    private Data<K, V> get(K key) {
        Integer index = getIndexForKey(key);
        for (Data data : dataList[index]) {
            if (data.key.equals(key)) {
                return data;
            }
        }
        return null;
    }

    private int getIndexForKey(K key) {
        return key.hashCode() % dataList.length;
    }

    private class Data<K, V> {
        private K key;
        private V value;

        public Data(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }
    }
}
