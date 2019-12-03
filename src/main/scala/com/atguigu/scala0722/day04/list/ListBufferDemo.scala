package com.atguigu.scala0722.day04.list

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


/**
  * Author lzc
  * Date 2019/12/3 10:50
  */
object ListBufferDemo {
    def main(args: Array[String]): Unit = {
        val lb: ListBuffer[Int] = ListBuffer(10, 20, 30)
        lb += 100
        val lb2: ListBuffer[Int] = 200 +: lb
        println(lb)
        println(lb ++ lb2)
    }
}
/*
ListBuffer
    可变List
 */
