package com.atguigu.scala0722.day05.homework

import scala.collection.immutable

/**
  * Author lzc
  * Date 2019/12/4 8:15
  */
object Homework3 {
    def main(args: Array[String]): Unit = {
        println(indexes("HelloeeHelloehellohhhhhheHelloee"))
    }
    
    def indexes(s: String) = {
        val charIndex: immutable.IndexedSeq[(Char, Int)] = s.zipWithIndex
//        charIndex.groupBy(ci => ci._1)
        val charCharIndex: Map[Char, immutable.IndexedSeq[(Char, Int)]] = charIndex.groupBy(_._1)
        val res = charCharIndex.map(kv => {
            val key = kv._1
            val value = kv._2.map(_._2).toList
            (key, value)
        })
    
        res.toList.sortBy(-_._2.length).take(3)
    }
    
}
/*
3. 编写一个函数, 接收一个字符串, 返回一个 Map.
    比如: indexes("Helloee")

   返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标
 */