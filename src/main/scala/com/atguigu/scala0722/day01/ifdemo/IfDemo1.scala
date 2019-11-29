package com.atguigu.scala0722.day01.ifdemo

/**
  * Author lzc
  * Date 2019/11/29 14:40
  */
object IfDemo1 {
    def main(args: Array[String]): Unit = {
        /*val a = 10
        val b = 20
        
        val max = if (a > b) a else b
        
        println(max)*/
        
        
        /*val num = -9
        val res = if (num >= 0) {
            Math.sqrt(num)
//            throw new IllegalArgumentException
        }else{
            throw new IllegalArgumentException
        }
        println(res)*/
        
        
        var a = 10
        val b = a = 30
        println(a = 20)
    }
}

/*
在scala中, 任何的语法结构都有值!

1. if语句最后一行会自动成为整个语句的值
2. scala中, 赋值语句的值是Unit



switch分支:
 switch(6种)
{
    case 常量: ...
}

模式匹配
 */