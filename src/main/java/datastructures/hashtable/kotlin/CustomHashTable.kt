package datastructures.hashtable.kotlin

import java.util.*

class CustomHashTable<K, V> {
    var dataList: Array<LinkedList<Data<K, V>>?> = arrayOfNulls(5)

    data class Data<K, V>(val key: K, var value: V)

    open fun put(key: K, value: V): Boolean {
        val index = getIndexForKey(key)
        if (dataList[index] == null) {
            val bucket = LinkedList<Data<K, V>>()
            bucket.addLast(Data(key, value))
            dataList[index] = bucket
            return true
        }

        for (data in dataList[index]!!) {
            if (data.key == key) {
                data.value = value
                return true;
            }
        }
        dataList[index]?.addLast(Data(key, value))
        return true;
    }

    open fun getValue(key: K): V? {
        val data = get(key)
        if (data != null) return data.value
        return null
    }

    open fun remove(key: K): Boolean {
        val index = getIndexForKey(key)
        val data = get(key)
        if (data != null) {
            dataList[index]?.remove(data)
            return true
        }
        return false
    }

    private fun get(key: K): Data<K, V>? {
        val index = getIndexForKey(key)
        for (data in dataList[index]!!) {
            if (data.key == key) return data
        }
        return null
    }

    private fun getIndexForKey(key: K): Int {
        if (key != null) {
            return key.hashCode() % dataList.size
        }
        return 0;
    }
}