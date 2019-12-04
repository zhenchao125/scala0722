package com.atguigu.scala0722.day05.implicitdemo

import java.time.LocalDate


/**
  * Author lzc
  * Date 2019/12/4 10:24
  */
object ImpliceDemo2 {
    
    
    def main(args: Array[String]): Unit = {
        
        //       2 days ago   // 2019-12-02
        //       2 days later   // 2019-12-06
        val ago = "ago"
        val later = "later"
        
        implicit def int2RichInt(day: Int) = new RichInt(day)
        
        println(2 days ago)
        println(44 days later)
        
    }
    
    
}

class RichInt(day: Int) {
    def days(when: String) = {
        if(when == "ago"){
            LocalDate.now().minusDays(day)
        }else{
            LocalDate.now().plusDays(day)
        }
    }
}

/*
隐式转换简化我们代码的调用, 增强我们一些已有的类的功能
1. 隐式转换函数
    implicit def double2Int(d: Double): Int = d.toInt
2. 隐式类
3. 隐式参数和隐式值

 */