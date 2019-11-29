package com.atguigu.scala0722.day01.loop

/**
  * Author lzc
  * Date 2019/11/29 14:58
  */
object WhileDemo1 {
    def main(args: Array[String]): Unit = {
        var i = 1
        while (i <= 100){
            println(i)
            i += 1
        }
    }
}
/*
java:
    while
    
    do...while
    
    
    for
scala:
    while
    
    do ...while
    
   循环语句的值是 Unit
    
    for: 本质不是循环, 而是一种遍历


 */