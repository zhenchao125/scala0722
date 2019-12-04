package com.atguigu.scala0722.day05.implicitdemo


/**
  * Author lzc
  * Date 2019/12/4 10:24
  */
object ImpliceDemo4 {
    
    def main(args: Array[String]): Unit = {
        implicit val aaa = 100
        
        println(add(10))
        
//        List(10,20,30).sortBy(x => x)()  // Ordering[Int]
    }
    
    def add(a: Int)(implicit b: Int) = a + b
}


/*
隐式转换简化我们代码的调用, 增强我们一些已有的类的功能
1. 隐式转换函数
    implicit def double2Int(d: Double): Int = d.toInt
2. 隐式类
3. 隐式参数和隐式值
    implicit val aaa = 100
    
    def add(a: Int)(implicit b: Int) = a + b

 */