package com.atguigu.scala0722.day03.extend

import a.B

/**
  * Author lzc
  * Date 2019/12/2 10:28
  */
object ExtendsDemo1 {
    def main(args: Array[String]): Unit = {
        val b: B = new B
        val a: A = b
    
        println(b.a)
        println(a.a)
    }
}

class A{
    val a = 10
}
class B extends A{
    override val a = 20
}



/*
继承:
    extends
    
 方法的覆写:
  1. 必须加override关键字
  2. 其他和java一致
    
 属性的覆写:
    1. 必须加override关键字
    2. val 只能覆写val的和没有形参def
    2. var只能覆写抽象的var
    
    java的属性没有多态, scala的属性有多态
 */