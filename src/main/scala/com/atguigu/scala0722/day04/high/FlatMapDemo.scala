package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 14:45
  */
object FlatMapDemo {
    def main(args: Array[String]): Unit = {
        
//        val arr = Array("hello world", "hello atgugiu", "hell hello hello")
//        val arr1 = arr.flatMap( x=> x.split("\\W+") )
//        println(arr1.mkString(", "))
        
        val list = List("hello", "helo", "atguigu")
        val chars= list.flatMap(x => x)
//        val chars= list.flatMap(_ + "")
        println(chars)
    }
}
