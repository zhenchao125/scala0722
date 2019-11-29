package com.atguigu.scala0722.day01.fun

/**
  * Author lzc
  * Date 2019/11/29 16:30
  */
object FunDemo1 {
    def main(args: Array[String]) {
        //        val res: Int = add(1, 2)
        
        
        //        println(res)
        //        foo()
        //        foo
        
        foo1
        
        val a = foo2()
        println(a)
    }
    
    
    //    def add(a:Int, b:Int)  =  a + b
    
    def foo() = {
        println("foo...")
    }
    
    def foo1 = {
        println("foo1...")
    }
    
    //
    def foo2() {
        println("aaa")
        1
    }
    
}

/*
对象是: 数据和行为的封装

函数的签名:
    def 函数名(形参列表): 返回值类型 = {
    
    }
函数的化简:
   1. 如果函数体内只有一行代码, 大括号可以省略
   2. 如果最后一行代码就是要返回的值, 则return也可以省略
   3. 如果没有return语句,  返回值类型可以省略, scala会自动推导
   4. 当函数没有形参, 调用的时候可以省略圆括号
   5. 如果函数没有形参, 在声明的时候可以省略圆括号, 但是调用的时候不能再使用括号
   
   6. 如果函数返回值是 Unit, 这个时候, =和返回值类型都可以省略. 这个时候, 即使最后一行不是Unit, 也是返回Unit
 */