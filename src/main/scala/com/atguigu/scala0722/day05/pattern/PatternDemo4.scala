package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 14:46
  */
object PatternDemo4 {
    def main(args: Array[String]): Unit = {
        /*val list = List(10, 20, 3, "aaa")
        
        for (ele <- list) {
            ele match {
                case a: Int if a % 2 == 0 =>
                    
                    println(a)
                case _ =>
            }
            
        }*/
        
        
        val a = 10
        val b = a match {
            case a: Int => a * a

            case _ => 0
        }
        println(b)
        
        
    }
}
