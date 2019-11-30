package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 14:27
  */
object CurryDemo1 {
    def main(args: Array[String]): Unit = {
        
        val f1: () => Int = foo()
        println(f1())
        
    }
    
    def foo(): () => Int = {
        var a = 20
        val f = () => a + 10
        f
    }
}
/*
函数编程的标配:
    1. 高阶函数
    2. 闭包
        一个函数, 如果他访问的外部的变量, 就是一个闭包. 闭包会持有外部变量
        
        
    3. 柯里化

 */
