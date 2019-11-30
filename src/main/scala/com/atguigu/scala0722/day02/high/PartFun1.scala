package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 14:16
  */
object PartFun1 {
    def main(args: Array[String]): Unit = {
        // 部分应用函数
//        val f1: Int => Int = add(10, _)
//        println(f1(20))
//        println(f1(30))
        
        val a = 10
        val three: Double => Double = Math.pow(_, 3)
        println(three(10))
        println(three(20))
    
    
    }
    
    def add(a: Int, b: Int) = a + b
}
