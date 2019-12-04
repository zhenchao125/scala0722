package com.atguigu.scala0722.day05.homework

/**
  * Author lzc
  * Date 2019/12/4 8:15
  */
object Homework4 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        println(mkString(list1, ","))
    }
    
    def mkString(list: List[Int], seq:String = "" ):String = {
        list.foldLeft("")((last, ele) => last + ele + seq).dropRight(seq.length)
//        list.foldLeft(seq)((last, ele) => last + seq +ele)
    }
}
/*

4. 实现一个函数，作用与mkString相同，使用foldLeft
 */