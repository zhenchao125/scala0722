package com.atguigu.scala0722.day02.fun

/**
  * Author lzc
  * Date 2019/11/30 9:03
  */
object FunDemo1 {
    def main(args: Array[String]): Unit = {
                println(add(20))
            println(add1(b = 20))
               /* println(add(20, 20))
                println(add())
    
//        println(add1(b = 100))  // 命名参数
    
        println(add1(b = 10, a = 20))
        println(add1(10, b = 20))*/
        
        
        
    }
    
    def add(a: Int = 100, b: Int = 10) = a + b
    
    def add1(a: Int = 1, b: Int) = a + b
}

/*
默认值
    形参上

命名参数
    实参上
 */