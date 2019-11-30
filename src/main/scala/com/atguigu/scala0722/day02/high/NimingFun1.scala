package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 9:28
  */
object NimingFun1 {
    def main(args: Array[String]): Unit = {
        // 把函数的引用传给变量f
        val f = add _
        println(add(1, 2))
        println(f(1, 2))
        
        // 直接给变量赋值函数
        val f1 = (a: Int, b:Int) => a + b
    
        println(f1(1, 2))
        
    }
    
    def add(a: Int, b:Int) = a + b
}
/*
变量(常量)可以存储任意的值!
因为函数也是一种值!

1. 把函数当做值传递给变量
2. 把函数定义直接赋值给变量
 */
