package com.atguigu.scala0722.day06.generic

/**
  * Author lzc
  * Date 2019/12/6 11:28
  */
object GenericDemo3 {
    def main(args: Array[String]): Unit = {
        println(compare(1, 2))
        println(compare("a", "aa"))
//        println(compare(new A, new A))
//        implicit def int2AA(a: Int) = new AA
        foo(1)
    }
    
    /*def compare[T](a: T, b:T)(implicit ord: Ordering[T]) = {
        if(ord.lt(a, b)) -1
        else if(ord.equiv(a, b)) 0
        else 1
    }*/
    
    // 必须要有一个隐式值  Ordering[T]  泛型上下文  上下文界定
    def compare[T : Ordering](a: T, b:T): Int = {
        val ord: Ordering[T] = implicitly[Ordering[T]]
        if(ord.lt(a, b)) -1
        else if(ord.equiv(a, b)) 0
        else 1
    }
    
    
    // 视图界定  表示有一个从 T->AA的隐式转换函数
    def foo[T <% AA](t: T) = {
        t.foo()
    }
    
    implicit class AA(a: Int){
        def foo() = println("foo...")
    }
}

