package com.atguigu.scala0722.day04.arr

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019/12/3 10:23
  */
object ArrayBufferDemo {
    def main(args: Array[String]): Unit = {
        var ab: ArrayBuffer[Int] = ArrayBuffer(1, 1,2, 3, 10)
//        var ab1: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 10)
        
//        val ab1 = ab :+ 10
//        ab += 10
//        ab +:= 100.0
//        ab ++= ab1
//        ab.remove(0)
//        ab.remove(1, 2)
//        ab -= 1
        // 可变数组变成定长数组
        val arr: Array[Int] = ab.toArray
        val ab2: mutable.Buffer[Int] = arr.toBuffer
        println(ab)
        
    }
}

/*
: 有新的集合产生的

 */