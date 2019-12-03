package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 15:08
  */
object GroupByDemo {
    def main(args: Array[String]): Unit = {
        //
        //        val list1 = List(30, 5, 70, 6, 1, 20)
        //
        //        val map: Map[Int, List[Int]] = list1.groupBy( x => x % 2)
        //        println(map)
        //        val list1 = List("hello", "world", "atguigu", "atguigu", "hello", "atguigu", "atguigu", "hello")
        //        val map= list1.groupBy(x => x).map(kv => (kv._1, kv._2.size)).toList
        
        val arr = Array("hello world", "hello atgugiu", "hell hello hello")
        val map = arr.flatMap(_.split("\\W+")).groupBy(x => x).map(kv => kv._1 -> kv._2.length)
        println(map)
        
        
    }
}

/*



*/
