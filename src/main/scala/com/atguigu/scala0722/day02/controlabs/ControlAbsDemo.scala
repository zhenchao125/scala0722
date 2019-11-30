package com.atguigu.scala0722.day02.controlabs

/**
  * Author lzc
  * Date 2019/11/30 14:58
  */
object ControlAbsDemo {
    def main(args: Array[String]): Unit = {
        val f = () => {
            println("f....")
            10
        }
        
        foo(f())
        
        foo(3 + 4)
    }
    
    def foo(n: => Int) = {
//        println(n)
//        println(n)
    }
}

/*
控制抽象:
    写出来类型与while if.. 这些控制语句出来
    
名调用和值调用



 */
