package com.atguigu.scala0722.day04.arr

/**
  * Author lzc
  * Date 2019/12/3 10:17
  */
object ArrayDemo3 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        val arr2 = Array(3, 5, 7, 6, 1, 2)
        
        val arr3: Array[Int] = arr1 ++ arr2  // arr1.++(arr2)
        val arr4: Array[Int] = arr1 ++: arr2  // arr2.++:(arr1)
        println(arr3.mkString(", "))
    }
}
/*
:+
+:
++
++:

val immutable

 */