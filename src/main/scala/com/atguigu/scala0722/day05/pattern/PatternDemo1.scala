package com.atguigu.scala0722.day05.pattern

import scala.io.StdIn

/**
  * Author lzc
  * Date 2019/12/4 14:12
  */
object PatternDemo1 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 5
        
        val op = StdIn.readLine("请输入一个运算符: +-*/")
        
        op match {
            case "+" =>
                println( a + b)
        
            case "-" =>
                println(a - b)
            case "/" =>
                println(a / b)
            case "*" =>
                println(a * b)
            //            case a => println(a)
            case _ =>
        
        }
        
    }
}
