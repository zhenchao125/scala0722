package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 15:32
  */
object ReduceDemo1 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
    
        println(arr1.reduce(_ * _))
        
    }
}
