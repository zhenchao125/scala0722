package com.atguigu.scala0722.day01

/**
  * Author lzc
  * Date 2019/11/29 14:12
  */
object TypeConversion {
    def main(args: Array[String]): Unit = {
        val a = 1.1
        val b: Int = a.toInt
        
        val s = a + ""
        val s1 = a.toString
        
        val num = "1.1"
        println(num.toDouble)
    }
}
/*
byte->short->int->long->float->double
char->int->long->...


 */
