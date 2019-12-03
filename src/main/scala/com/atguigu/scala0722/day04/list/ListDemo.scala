package com.atguigu.scala0722.day04.list

import scala.collection.immutable.Nil

/**
  * Author lzc
  * Date 2019/12/3 10:42
  */
object ListDemo {
    def main(args: Array[String]): Unit = {
        // 不可变的List
//        var list = List(1, 2,310, 20)
//        println(list(0))
//        val list2: List[Int] = list :+ 100
//        list :+= 100
        
//        val list2: List[Int] = 10 :: 100 :: list
//
//        val list3: List[Int] = list ::: list2
//        println(list2)
//        println(list3)
    
        println(2:: 1:: Nil)
        
    }
}
/*
List
Nil 空集合, 一般使用::来构成新的list
专用
::
2:: 1:: Nil

:::

 */