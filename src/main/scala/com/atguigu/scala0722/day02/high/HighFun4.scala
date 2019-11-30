package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 11:19
  */
object HighFun4 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 5, 70, 6, 1, 20)
        // 把数组内所有的偶数的平方求和
        //        val res: Array[Int] = filter(arr1, ele => ele %2 == 1)
        val res1: Array[Int] = filter(arr1, _ % 2 == 1)
        
        // 偶数进行平方
        val res2 = map(res1, ele => ele * ele)
        
        // 聚合
        val res: Int = reduce(res2, _ + _)
        println(res)
        
        
    }
    
    
    
    //过滤
    def filter(arr: Array[Int], op: Int => Boolean): Array[Int] = {
        for (ele <- arr if op(ele)) yield ele
    }
    
    // map
    def map(arr: Array[Int], op: Int => Int) = {
        for(ele <- arr ) yield  op(ele)
    }
    
    // 聚合
    def reduce(arr: Array[Int], f: (Int, Int) => Int): Int = {
        if (arr.length == 0) return 0
        var last: Int = arr(0)
        for (i <- 1 until arr.length) {
            last = f(last, arr(i))
        }
        last
    }
}
