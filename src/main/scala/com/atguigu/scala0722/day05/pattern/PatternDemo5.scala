package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 15:02
  */
object PatternDemo5 {
    def main(args: Array[String]): Unit = {
        val arr = Array(10, 20, 30, 40)
        
        arr match {
            //            case Array(a, b, _) => println(a, b)
            //            case Array(a, b, 30) => println(a, b)
            //            case Array(10, a, _*) => println(a)
            case Array(_, _, a@_*) => println(a.mkString(", "))
        }
    }
}

/*

*/
