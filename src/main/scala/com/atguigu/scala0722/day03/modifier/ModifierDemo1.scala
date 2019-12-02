package com.atguigu.scala0722.day03.modifier

import scala.beans.BeanProperty

/**
  * Author lzc
  * Date 2019/12/2 11:45
  */
object ModifierDemo1 {
    def main(args: Array[String]): Unit = {
        val a = new A
        println(a.a)
        
    }
}

class A{
   private[modifier] val a = 10
   
}


class B{
    def foo() = {
        val a = new A()
        println(a.a)
    }
}

/*
java的权限修饰符:
    1. private
    2. protected
        同包和子父类中
    3. [default] friendly
        同包
    4. public

scala;
    3个:
        private
        protected
            只能子父类, 同包不行
        [default] 相当于java的public
        
    定制访问权限:
        private[modifier]  给modifier开放访问权限
    
 */