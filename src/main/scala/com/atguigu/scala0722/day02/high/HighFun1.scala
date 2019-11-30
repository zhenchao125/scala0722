package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 9:56
  */
object HighFun1 {
    def main(args: Array[String]): Unit = {
        def f() = {
            println("f....")
            1
        }
        foo(f _)
        
        
        // (a:Int) => a + 1 匿名函数
        foo1( (a:Int) => a + 1 )
        
        
    }
    def foo1(f1: (Int) => Int) = {
        println(f1(10))
    }
    
    // foo就是一个高阶函数
    def foo(f1: () => Int) = {
        println(f1())
    }
    
    /*def foo(f1: Function0[Int] ) = {
        println(f1())
    }*/
    
    
    
}

/*
高阶函数: (高级算子)
一个函数A, 可以接受一个或多个函数作为参数, 或者可以返回一个函数作为返回值
这个函数就是一个高阶函数

 */