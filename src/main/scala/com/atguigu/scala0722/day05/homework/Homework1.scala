package com.atguigu.scala0722.day05.homework

/**
  * Author lzc
  * Date 2019/12/4 8:14
  */
object Homework1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
//        val max: Int = list1.reduce((max, a) => if(max > a) max else a)
//        val max: Int = list1.reduce((max, a) => max.max(a))
        val max: Int = list1.reduce(_.max(_))
        println(max)
    }
}
/*
1. 使用 reduce 计算集合中的最大值
 */