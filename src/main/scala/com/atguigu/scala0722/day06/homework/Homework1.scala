package com.atguigu.scala0722.day06.homework

/**
  * Author lzc
  * Date 2019/12/6 8:19
  */
object Homework1 {
    def main(args: Array[String]): Unit = {
//        println(swap(Array(1, 2, 3, 4, 5)).mkString(", "))
        
        5!
    }
    
    def swap(arr: Array[Int]) ={
        arr match {
//            case Array(a, b, rest@_*) => Array(b, a, rest)  // 不符合要求, 第三个元素是一个数组
//            case Array(a, b, rest@_*) => Array(b, a, rest:_*)  // 编译无法通过
            case Array(a, b, rest@_*) => Array(b, a) ++ rest // 编译无法通过
        }
    }
    
    implicit class RichInt(n: Int) {
    
        def jiecheng(n: Int): Int = {
            if(n == 1) 1
            else n * jiecheng(n - 1)
        }
    
//        def ! = jiecheng(n)
//        def ! = (1 to n).reduce(_ * _)
        def ! = (1 to n).product
    }
    
}
/*
1. 对前面 wordcount 的结果, 按照单词的个数降序排列,如果个数相同按照单词的长度升序排列
2. 利用模式匹配，编写一个 swap 函数，交换数组中前两个元素的位置，前提条件是数组长度至少为2
3. 定义一个 ! 操作符, 计算某个整数的阶乘. 比如 5! 应该得到 120
4. 定义一个操作符 +% , 可以将一个给定的百分百添加到某个值
    比如 120 +% 10  应该得到 132
 */