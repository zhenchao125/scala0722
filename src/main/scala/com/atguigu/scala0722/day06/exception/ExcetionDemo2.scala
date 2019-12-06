package com.atguigu.scala0722.day06.exception

import com.atguigu.scala0722.day05.pattern
import com.atguigu.scala0722.day05.pattern.Person

/**
  * Author lzc
  * Date 2019/12/6 10:39
  */
object ExcetionDemo2 {
    def main(args: Array[String]): Unit = {
        //        println(compare(1, 2))
        
        //        println(compare(User(10), User(2)))
        
        foo(User(10))
        foo(new Object)
        
        val a : Object = new Person(20)
        foo(a)
        foo(1)
        
    }
    
    
    def foo[T >: User](a: T) = {
        println("foo...")
    }
    
    
    def compare[T <: Ordered[T]](first: T, second: T) = {
        if (first < second) -1
        else if (first == second) 0
        else 1
    }
}

case class User(age: Int) extends Ordered[User] {
    override def compare(that: User): Int = this.age - that.age
}

class Person(override val age: Int) extends User(age)


/*
给泛型添加
    上限(上界):
        T <: Ordered[T]
     下限:
        T >: User
  

 */