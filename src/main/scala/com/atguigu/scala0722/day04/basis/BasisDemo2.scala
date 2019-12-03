package com.atguigu.scala0722.day04.basis

object BasisDemo2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20, 100, 200)
        val list2 = List(3, 5, 7, 6, 1, 2, 1,1,1,1,1)
        
//        val list3: List[(Int, Int)] = list1.zip(list2)
//        val list3: List[(Int, Int)] = list1.zipAll(list2, -1, -2)
        val list3: List[(Int, Int)] = list1.zipWithIndex
        for ((ele, index) <- list3) {
        
        }
        println(list3)
    }
}
