package com.atguigu.scala0722.day02.fun

/**
  * Author lzc
  * Date 2019/11/30 9:17
  */
object FunDemo2 {
    def main(args: Array[String]): Unit = {
        println(add(1))
        println(add(1, 2))
        println(add(1, 2, 3))
        
        // 把数组展开, 一个一个的传给可变参数
        println(add(Array(1, 2, 3): _*))
    }
    
    // 可变参数
    def add(nums: Int*) = {
        nums.sum
        /*var sum = 0
        for (elem <- nums) {
            sum += elem
        }
        sum*/
    }
}
