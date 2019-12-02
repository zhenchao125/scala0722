package com.atguigu.scala0722.day03.abscass

/**
  * Author lzc
  * Date 2019/12/2 14:34
  */
object AbsDemo1 {
    def main(args: Array[String]): Unit = {
        val b: A = new B
        b.foo(10)
        
        
        /*var a = new  A{
            override var a: Int = _
    
            override def foo(p: Int): Int = ???
        }
        a.foo(10)*/
        
        new Thread(){
            override def run(): Unit = println("xxxx")
        }.start()
        
    }
}

abstract class A {
    // 抽象字段
    var a: Int
    
    // 抽象方法
    def foo(p: Int): Int
}

class B extends A {
    override var a: Int = _
    
    override def foo(p: Int): Int = {
        println("FOO")
        1
    }
}

/*
java:
    用abstract修饰
    1. 可以有抽象方法
    2. 不能直接new对象
    3. 抽象方法必须被子类实现
    
scala:
    多了一个有抽象字段(属性)!!!
    
    
 */