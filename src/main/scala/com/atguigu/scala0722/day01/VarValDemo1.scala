package com.atguigu.scala0722.day01

/**
  * Author lzc
  * Date 2019/11/29 10:12
  */
object VarValDemo1 {
    
    def main(args: Array[String]): Unit = {
        var a: Int = 10
        a = 20
        println(a)
    
        val b :Int = 20
    
        println(b)
    
        // c会根据初始化的值, 自动推断出来这个变量或者常量的类型
        // 类型推断
        var c = 0
    
        var d: Double = 1
    
    
        var e:Int = 0
        
    }
}
/*
如何定义变量和常量

java:
    int a = 10
    final int a = 10
scala:
    var a: Int = 10
    
    val b :Int = 20
    
    val c = 30
重要: 在scala种,声明变量或者常量的同时必须初始化
4种情况推断不出来:
    1. 期望类型和推断类型不一致
 */
