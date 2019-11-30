package com.atguigu.scala0722.day02.controlabs

import scala.annotation.tailrec

/**
  * Author lzc
  * Date 2019/11/30 15:32
  */
object RecursiveDemo {
    def main(args: Array[String]): Unit = {
        println(jiecheng(8, 1))
//        println(jiecheng1(8))
    }
//    @tailrec
    def jiecheng1(n: Int):Int = {
//        if(n == 1) throw new RuntimeException
        if(n == 1) 1
        else n * jiecheng1(n - 1)
    }
    @tailrec
    def jiecheng(n: Int, acc: Int):Int = {
        if(n == 1) acc
        else jiecheng(n -1, n * acc)
    }
    //
}
/*
一个函数自己调用自己

1. 一定要有结束条件
2. 随着递归的深入, 要逐步的靠近结束条件

尾递归:
    "累加器"
    
    scala 对尾递归优化
    
    java没有
    
 */