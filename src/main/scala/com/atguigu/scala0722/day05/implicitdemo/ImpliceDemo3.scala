package com.atguigu.scala0722.day05.implicitdemo

import java.io.File

import scala.io.Source


/**
  * Author lzc
  * Date 2019/12/4 10:24
  */
object ImpliceDemo3 {
    
    
    def main(args: Array[String]): Unit = {
        println(new File("c:/agent.log").readContent)
        
        val s = "aa"
        // 从冥界召唤隐式值
        
    
    }
    
    
    implicit class RichFile1(file:File) {
        def readContent: String = Source.fromFile(file).mkString
    }
}



/*
隐式转换简化我们代码的调用, 增强我们一些已有的类的功能
1. 隐式转换函数
    implicit def double2Int(d: Double): Int = d.toInt
2. 隐式类(隐式转换函数 转换函数的升级版)
    必须是内部类
    implicit class RichFile1(file: File) {
        def readContent: String = Source.fromFile(file).mkString
    }
    
3. 隐式参数和隐式值

 */