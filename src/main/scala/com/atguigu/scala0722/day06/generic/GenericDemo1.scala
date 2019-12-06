package com.atguigu.scala0722.day06.generic

/**
  * Author lzc
  * Date 2019/12/6 10:28
  */
object GenericDemo1 {
    def main(args: Array[String]): Unit = {
//        val p = new Point(1.1, 2)
    
    }
}

class Point[T](val x: T, val y: T){
    def foo(a: T) = {
    
    }
    
    def foo1[V](a:T, b: V) = {
        val c:V = b
        b
    }
}


/*
类型的参数化

泛型类

泛型方法


 */