package com.atguigu.scala0722.day05.pattern

import com.atguigu.scala0722.day04.high.Person

/**
  * Author lzc
  * Date 2019/12/4 16:30
  */
object CassDemo1 {
    def main(args: Array[String]): Unit = {
        /*Person("a", 20) match {
            case Person(name, age) => println(name)
        }*/
        
        val p1 = new Person("a", 10)
        val p2 =new  Person("ab", 10)
//        println(p)
        println(p1.equals(p2))  // ==
        println(p1.eq(p2))
    }
}

// 样例类
case class Person( name: String, age:Int){
    override def equals(obj: Any): Boolean = obj match {
        case other : Person => this.age == other.age
    }
}