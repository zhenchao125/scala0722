package com.atguigu.scala0722.day03.traitdemo

/**
  * Author lzc
  * Date 2019/12/2 15:45
  */
object TraitDemo2 {
    def main(args: Array[String]): Unit = {
        val d = new D
        d.foo()
    }
}

trait F {
    println("F")
    def foo() = {
        println("F foo")
    }
}


trait A extends F {
    println("A")
    override def foo() = {
        
        println("A foo")
    }
}

trait B extends F {
    println("B")
    override def foo() = {
        
        println("B foo")
    }
}

trait C extends F {
    println("C")
    override def foo() = {
        super[F].foo()
        println("C foo")
    }
}

class D extends A with B with C {
    println("D")
    //    override def foo(): Unit = println("D foo...")
}

/*
1. 当继承的trait中, 有相同的方法的时候, 是直接调用的最后一个trait的对应的方法
2. 构造器的顺序和继承顺序一致

*/