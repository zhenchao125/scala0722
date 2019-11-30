package com.atguigu.scala0722.day02.controlabs

/**
  * Author lzc
  * Date 2019/11/30 16:37
  */
object LazyCacl {
    def f1 = {
        println("f1...")
        1
    }
    
    val f2 = {
        println("f2....")
        2
    }
    
    lazy val f3 = {
        println("f3....")
        3
    }
    
    def main(args: Array[String]): Unit = {
        f3
        f3
        f3
        f3
        f3
        
    }
}

/*
惰性求值:

 */