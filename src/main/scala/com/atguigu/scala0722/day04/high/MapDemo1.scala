package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 14:30
  */
object MapDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        val list2: List[Int] = list1.map(x => x * x)
        val list3: List[Unit] = list1.map(println)
        println(list3)
        
    }
}
