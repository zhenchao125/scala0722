package com.atguigu.scala0722.day04.high

import scala.io.Source

/**
  * Author lzc
  * Date 2019/12/3 16:19
  */
object Sort4 {
    def main(args: Array[String]): Unit = {
        val list = List(new Person(10, "lisi"), new Person(20, "zs"), new Person(15, "ww"))
//        println(list.sorted)
        println(list.sortBy(user => (user.age, user.name.length)))
        
//        new Person(10, "lisi") < new Person(10, "aaa")

//        Source.fromFile("C:\\Users\\lzc\\Desktop\\class_code\\2019_07_22\\02_scala\\scala0722\\src\\main\\scala\\com\\atguigu\\scala0722\\day04\\high\\Sort3.scala", "utf-8")
    
    }
}

class Person(val age: Int, val name: String) extends Ordered[Person] {
    override def toString: String = s"[age = $age, name = $name]"
    
    override def compare(that: Person): Int = {
        var res = this.age - that.age
        if (res == 0) {
            res = this.name.compareTo(that.name)
        }
        res
    }
    
}


/*
scala中提供了3个支持排序的方法:

sorted
    返回一个已经拍好序的集合, 对原集合不做任何变化

sortBy
    指定排序的指标

sortWith
        ...
    

 */