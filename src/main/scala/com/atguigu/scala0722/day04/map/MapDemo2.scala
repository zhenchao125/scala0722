package com.atguigu.scala0722.day04.map

/**
  * Author lzc
  * Date 2019/12/3 11:21
  */
object MapDemo2 {
    def main(args: Array[String]): Unit = {
        // 用元组来存储了map的键值对
        //        var map: Map[String, Int] = Map(("a", 97), ("b", 98), ("c", 99), ("d", 99))
        var map: Map[String, Int] = Map("a" -> 97, ("b", 98), ("c", 99), ("d", 99))
        //        map += (("f", 1000))
        map += "f" -> 1000
        println(map)
        
    }
}

/*
Option
    Some
    None


 */
