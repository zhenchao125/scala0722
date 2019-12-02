package com.atguigu.scala0722.day03.obj

import scala.beans.BeanProperty

/**
  * Author lzc
  * Date 2019/12/2 8:58
  */
object ObjDemo2 {
    def main(args: Array[String]): Unit = {
        val user = new User1(10, "lisi", "男")
        
        
    }
}

class User1(var age:Int, val name: String, sex: String){
    
    var country :String = _
    println("这个是构造器")
    
    // 一个辅助构造函数:  首行必须调用当前类的主构造
    def this(age: Int, name:String){
        this(age, name, "nv")
        println("aaa")
    }
    
    def this(contry: String){
        this(10, "abc")
        println(contry)
    }
    
    
    
    override def toString: String = s"age=${this.age}, name=$name, sex=$sex"
    
}




/*
构造器, 构造方法, 构造函数
1. 方法名和类名一致
2. 不能有返回值, void都不能添加

和类名放在一起的构造器: 主构造器
辅构造器


面向对的总结:
1. 属性定义
    a: 类的内部定义
    b: 在主构造的形参中定义
    
    getter setter 已经自动提供了
    user.age   (age())
    user.age = 10  (age_$eq(int))
    
    不符合javabean规范
    @BeanProperty
    
    
2. 定义方法
    直接在类中定义函数
    
3. 定义构造函数
    a:主构造函数
        直接在类名的后面
    b:辅构造函数
        在类的内部(主构造的内部)

 */