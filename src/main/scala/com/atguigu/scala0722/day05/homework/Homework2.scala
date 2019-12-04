package com.atguigu.scala0722.day05.homework

/**
  * Author lzc
  * Date 2019/12/4 8:14
  */
object Homework2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        
        
        // (max, min)
        val maxMin = list1.foldLeft((Int.MinValue, Int.MaxValue))((t, ele) => (t._1.max(ele), t._2.min(ele)))
        println(maxMin)
    }
}
/*
2. 使用 foldLeft 同时计算最大值和最小值

 */