package com.atguigu.scala0722.day05.implicitdemo

import java.io.File

import scala.io.Source


/**
  * Author lzc
  * Date 2019/12/4 10:24
  */
object ImpliceDemo1 {
    
    implicit def file2RichFile(file: File): RichFile = new RichFile(file)
    
    def main(args: Array[String]): Unit = {
        
        /*implicit def double2Int(d: Double): Int = d.toInt
        
        val n: Int = 1.1
        val n1: Int = 1.1
        val n2: Int = 1.1
        println(n)*/
        
        // F
        
        
        println(new File("c:/agent.log").readContent)
        
    }
    
    
}

class RichFile(file: File) {
    def readContent: String = Source.fromFile(file).mkString
}

/*
隐式转换简化我们代码的调用, 增强我们一些已有的类的功能
1. 隐式转换函数
    implicit def double2Int(d: Double): Int = d.toInt
2. 隐式类
3. 隐式参数和隐式值

 */