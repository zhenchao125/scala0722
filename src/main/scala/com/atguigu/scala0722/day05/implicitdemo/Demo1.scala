package com.atguigu.scala0722.day05.implicitdemo

/**
  * Author lzc
  * Date 2019/12/4 11:44
  */
object Demo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        val ord: Ordering[Int] = implicitly[Ordering[Int]]
        println(list1.sortBy(x => x)(ord.reverse))
    }
}
