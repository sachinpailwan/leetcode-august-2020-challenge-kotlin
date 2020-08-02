package com.pailsom.kotlin


fun main(args:Array<String>) {
    var key = 1
    var obj = MyHashSet()
    obj.add(key)
    obj.remove(key)
    var param_3 = obj.contains(key)
    println(param_3)
}

class MyHashSet() {

    private var data = IntArray(1000000){-1}

    fun add(key: Int) {
        data[key]=key
    }

    fun remove(key: Int) {
        if(key > 0 && key < data.size){
            val res = data.toMutableList()
            res.removeAt(key)
            data = res.toIntArray()
        }
    }

    /** Returns true if this set contains the specified element */
    fun contains(key: Int): Boolean {
        return data[key]!=-1
    }

}
