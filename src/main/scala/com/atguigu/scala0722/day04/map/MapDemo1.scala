package com.atguigu.scala0722.day04.map

/**
  * Author lzc
  * Date 2019/12/3 11:21
  */
object MapDemo1 {
    def main(args: Array[String]): Unit = {
        // 用元组来存储了map的键值对
        val map: Map[String, Int] = Map(("a", 97), ("b", 98), ("c", 99), ("d", 99))
//        val opt: Option[Int] = map.get("a")
//        if(!opt.isEmpty) println(opt.get)
//        if(opt.isDefined) println(opt.get)
//        println(map.getOrElse("a", 0))
//        println(map.getOrElse("d", 0))
    
//        println(map("a"))
//        println(map("d"))
    
        /*for (elem <- map) {
            println(elem._1)
        }*/
    
        /*for ((k, v) <- map if v == 99) {
            println(k)
        }*/
    
        /*for ((k, _) <- map) {
            println(k)
        }*/
    }
}
/*
Option
    Some
    None


 */
