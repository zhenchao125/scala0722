package com.atguigu.scala0722.day05.implicitdemo


/**
  * Author lzc
  * Date 2019/12/4 10:24
  */
object ImpliceDemo4 {
    
    def main(args: Array[String]): Unit = {
        implicit val aaa = 100
        implicit val bbb = "100"
        // 如果第二个括号没有加, 先找隐式值, 没有匹配的隐式值再用默认值
        // 如果有第二个括号, 则使用默认值
        println(add(10))
        
        
        val ccc: Int = implicitly[Int]
        println(ccc)
        val ord: Ordering[Int] = implicitly[Ordering[Int]]
        println(ord)
//        List(10,20,30).sortBy(x => x)()  // Ordering[Int]
    }
    
    def add(a: Int)(implicit b: Int = 200, c: String) = a + b
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