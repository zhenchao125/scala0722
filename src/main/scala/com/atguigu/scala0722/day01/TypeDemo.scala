package com.atguigu.scala0722.day01

/**
  * Author lzc
  * Date 2019/11/29 11:39
  */
object TypeDemo {
    def main(args: Array[String]): Unit = {
        val a: Any = 1
        println(a)
    }
}
/*
java的类型:
    基本类型
        8个
        byte short int long float double  char
        boolean
    
    
    引用类型(对象类型)
        Object
        
        包装类型
        
scala:

Any
    AnyVal  值类型
        Unit 对应java的void
            唯一的值是 ()
            一般用于函数的返回值, 当不需要返回值的使用, 把返回值类型设置为Unit
    AnyRef  引用类型
    Null 类型, null


 */
