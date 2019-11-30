package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 10:21
  */
object HighFun3 {
    def main(args: Array[String]): Unit = {
        //        val arr1 = Array(1,2,3)
        
        /*travel(arr1, (ele: Int, index: Int) => {
            if (index % 2 == 0) {
                println(ele)
            }
        })*/
        
        /*travel(arr1, (ele, index) => {
            val a = ele + index
            println(a)
        })*/
        
        val arr1 = Array(1, 2, 3, 4)
        //        val res: Int = reduce(arr1, (last, current) => last * current)
        val res: Int = reduce(arr1, _ + _)
        println(res)
        
    }
    
    // (Int, Int) 1. 上次聚合的结果, 2. 本次参与聚合的元素
    def reduce(arr: Array[Int], f: (Int, Int) => Int): Int = {
        if (arr.length == 0) return 0
        var last: Int = arr(0)
        for (i <- 1 until arr.length) {
            last = f(last, arr(i))
        }
        last
    }
    
    
    def travel(arr: Array[Int], f: (Int, Int) => Unit) = {
        for (i <- 0 until arr.length) {
            f(arr(i), i)
        }
    }
}

// xml <>