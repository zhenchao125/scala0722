package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 10:21
  */
object HighFun2 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        travel(arr1, (a :Int) => {
            println(a)
            println(a * a)
            println(a * a * a)
        })
        
    }
    
    
    // 定义函数, 这个函数可以遍历给定的数组, 遍历到元素之后如何操作, 通过函数传递进去
    
    
    def travel(arr: Array[Int], f: Int => Unit) = {
        for (elem <- arr) {
            f(elem)
        }
    }
}
