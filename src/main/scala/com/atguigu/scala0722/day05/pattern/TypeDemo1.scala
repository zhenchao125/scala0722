package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 16:44
  */
object TypeDemo1 {
    def main(args: Array[String]): Unit = {
        val map = Map(1 -> 10, 2-> 20, 3->30)
        for ((k, v) <- map) {
        
        }
        
        val (a, b) = (1, 2)
        
        val Array(c, d, _*) = Array(1, 2, 3,4,5)
        println(c)
    }
}
