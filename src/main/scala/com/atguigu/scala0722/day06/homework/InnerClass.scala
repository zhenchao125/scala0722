package com.atguigu.scala0722.day06.homework

/**
  * Author lzc
  * Date 2019/12/6 9:06
  */
object InnerClass {
    def main(args: Array[String]): Unit = {
        val outer1 = new Outer
        val inner1 = new outer1.Inner
    
        val outer2 = new Outer
        val inner2 = new outer2.Inner
        
        
        inner1.foo(inner1)
//        inner2.foo(inner1)
    }
}
//类型投影
class Outer{
    var a = 20
    println(this)
    class  Inner{
        var a = 10
//        def foo(in: Outer#Inner) = {
        def foo(in: Outer.this.Inner) = {
            println("bb...")
            println(a)
            println(this.a)
            println(Outer.this.a)
        }
    }
}