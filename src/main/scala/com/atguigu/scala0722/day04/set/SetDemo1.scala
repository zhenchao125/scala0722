package com.atguigu.scala0722.day04.set

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019/12/3 11:01
  */
object SetDemo1 {
    def main(args: Array[String]): Unit = {
        val set1: Set[Int] = Set(1, 2, 10, 30, 1)
        val set2: Set[Int] = Set(10, 20, 100, 300, 400, 10)
        //
//        println(set1(0))
        System.out.println(set1 ++ set2)
        System.out.println(set1 | set2)
        System.out.println(set1 & set2)
        System.out.println(set1 &~ set2)  // 差集
        
        
        mutable.Set(1,2,3)
    }
}
/*
并集

交集

差集

 */