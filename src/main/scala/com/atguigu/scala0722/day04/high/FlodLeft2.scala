package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 15:38
  */
object FlodLeft2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        list1./: (0)(_ + _)
        //        list1.foldLeft(0)(_ + _)
        //        println((0 /: list1) (_ + _))
        println((list1 :\ 0) (_ + _))  // foldRight
        
    }
}
