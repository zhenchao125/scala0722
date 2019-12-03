package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 16:06
  */
object ScanLeft {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val list2: List[Int] = list1.scanLeft(0)(_ + _)
        val list2: List[Int] = list1.scanRight(0)(_ + _)
        println(list2)
    }
}
