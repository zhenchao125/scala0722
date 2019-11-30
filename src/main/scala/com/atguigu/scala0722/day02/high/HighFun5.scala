package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 14:09
  */
object HighFun5 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        
        foreach(arr1, println(_))
        //        foreach(arr1, println)
        //        foreach(arr1, x => println(x + 1))
        //        foreach(arr1, println(_ + 1))  // no ok
        
        //        reduce(arr1,(x1, x2)=>  x1 + x2)
        
    }
    
    def foreach(arr: Array[Int], op: Int => Unit) = {
        for (elem <- arr) {
            op(elem)
        }
    }
    
    def reduce(arr: Array[Int], f: (Int, Int) => Int): Int = {
        if (arr.length == 0) return 0
        var last: Int = arr(0)
        for (i <- 1 until arr.length) {
            last = f(last, arr(i))
        }
        last
    }
    
    
}
