package com.atguigu.scala0722.day04.arr

/**
  * Author lzc
  * Date 2019/12/3 10:36
  */
object DimDemo {
    def main(args: Array[String]): Unit = {
        // 长度为3的一维数组
        val arr: Array[Int] = Array.ofDim[Int](3)
        
        val arr1: Array[Array[Int]] = Array.ofDim[Int](3, 3)
        for (arr <- arr1; ele <- arr) {
            println(ele)
        }
    }
}
/*
在java没有真正的二维数组, 都是由一维数组构成
 */