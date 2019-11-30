package com.atguigu.scala0722.day02.high

/**
  * Author lzc
  * Date 2019/11/30 14:27
  */
object CurryDemo2 {
    def main(args: Array[String]): Unit = {
        /*val f = add(10)
        println(f(20))*/
        println(add(10)(20))
        
        
    }
//    def add(a: Int) = (b:Int) => a + b
    def add(a:Int)(b:Int) = a + b
    
}

/*
函数编程的标配:
    1. 高阶函数
    2. 闭包
        一个函数, 如果他访问的外部的变量, 就是一个闭包. 闭包会持有外部变量
        
        
    3. 柯里化
        把一个参数列表的多个参数, 变成多个参数列表, 就是函数的柯里化
        
        柯里化的理论基础是闭包
    

 */
