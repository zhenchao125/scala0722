package com.atguigu.scala0722.day04.basis

/**
  * Author lzc
  * Date 2019/12/3 14:09
  */
object BasisDemo1 {
    def main(args: Array[String]): Unit = {
         val list1 = List(30, 50, 70, 60, 10, 20)
        //首个
        println(list1.head)
        println(list1.last)
    
        println(list1.tail)
        println(list1.init)
    
        println(list1.take(1))
    
        println(list1.drop(2))
        
    }
}
