package com.atguigu.scala0722.day01.loop

import scala.util.control.Breaks
import scala.util.control.Breaks._

/**
  * Author lzc
  * Date 2019/11/29 16:07
  */
object BreakLoop {
    def main(args: Array[String]): Unit = {
        var i = 1
        
        // 退出循环的方法
        breakable {
            while (true) {
                if (i == 5) break
                println(i)
                i += 1
            }
        }
        println("----")
    }
    
    
}

/*
java中有几张办法可以结束循环:
    1. break  只能结束最内层
    2. return
    3. 抛异常
    
scala:
    1. return
    2. 抛出异常

*/