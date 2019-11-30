package com.atguigu.scala0722.day01

/**
  * Author lzc
  * Date 2019/11/29 14:21
  */
object EqualDemo {
    def main(args: Array[String]): Unit = {
        println(1 << 3)  // 乘以2
        println(-8 >> 1)  // 除以2
        println(-8 >>> 1)  // 除以2
        
        println(1 ^ 2)  // 异或
        
        
        
        var a = 1
        a += 1
        
        
        
        
    }
}

/*
1. scala没有运算符, 所有的运算符本质都是方法

2.
== equals  eq

== equals 等价的, 表示 比的内容.  一般是重新 equals (hashCode)

eq 引用类型才有, 表示比较的两个对象的地址

3. ++ -- ? : scala没有

 */