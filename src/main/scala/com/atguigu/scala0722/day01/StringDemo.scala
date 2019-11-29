package com.atguigu.scala0722.day01

/**
  * Author lzc
  * Date 2019/11/29 10:47
  */
object StringDemo {
    def main(args: Array[String]): Unit = {
        /*System.out.println()
        println("aaa")
        println("aaa")
        
        val a = 10
        println("a的值是: \" " + a)
        printf("a的值是: %d  %.2f  %s", a, 10.3, "abc")*/
        
        val b = 10
        val a =
            s"""
              ?select
              ?    *
              |from user
              |""
              |''
              |"         "
              |${  b+10      }
            """.stripMargin
        println(a)
        
        val s = s"abc ${b + 10}"
        println(s)
        
        val aa =
            """
              |select
              |    *
              |from user;
            """.stripMargin
    }
}
/*
输出:
   1. 使用java的输出
   2. scala: println, print
   3. printf
   4. 字符串模板
     + 插值法
 */
