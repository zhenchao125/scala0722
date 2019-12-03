package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 14:24
  */
object ForeachDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        list1.foreach(x => println(x))
        list1.foreach(println)
    }
}
