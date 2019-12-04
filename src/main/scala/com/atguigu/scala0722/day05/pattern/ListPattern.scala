package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 15:19
  */
object ListPattern {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)
        list match {
            //            case List(a, b, 3, 4) => println(a, b)
            //            case List(a, b, c@_*) => println(a, b); println(c)
            //            case 1::2:: 3::a::Nil => println(a)
//            case 1 :: a :: Nil => println(a)
            case 1 :: a => println(a)
        }
    }
}
