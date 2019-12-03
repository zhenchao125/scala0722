package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 16:19
  */
object Sort3 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        println(list1.sortWith((x1, x2) => x1 > x2))
        println(list1.sortWith(_ > _))
        
    }
}


/*
scala中提供了3个支持排序的方法:

sorted
    返回一个已经拍好序的集合, 对原集合不做任何变化

sortBy
    指定排序的指标

sortWith
        ...
    

 */