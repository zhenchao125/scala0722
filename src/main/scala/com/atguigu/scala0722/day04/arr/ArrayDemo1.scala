package com.atguigu.scala0722.day04.arr

/**
  * Author lzc
  * Date 2019/12/3 9:15
  */
object ArrayDemo1 {
    def main(args: Array[String]): Unit = {
        // 创建数组
        // 1. 创建一个长度为10的数组
        val arr = new Array[Int](10)
        arr(1) = 100
        
        /*for(i <- 0 until arr.length){
            println(arr(i))
        }*/
        /*for (elem <- arr) {
        
        }*/
    
//        for (i <- arr.indices) {}
        
        // 2. 直接初始化数组的元素
        val arr1 = Array(1, 2,3, 5, 10)
        for (elem <- arr1) {
            println(elem)}
        
        
        
    }
}
/*
java的集合框架:
    collection
        set
            无序不重复
            HashSet
            TreeSet  红黑树
                自动排序
                
            LinkedHashSet
        list
            有序棵重复
            ArrayList
            LinkedList
            
        Stack
        Queue
            
    map
        HashMap
        TreeMap
        LinkedHashMap
        
Collections
        ...
        
Arrays
 
    
    
 */