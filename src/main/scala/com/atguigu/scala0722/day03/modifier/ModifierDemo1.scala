package com.atguigu.scala0722.day03.modifier

import scala.beans.BeanProperty

/**
  * Author lzc
  * Date 2019/12/2 11:45
  */
object ModifierDemo1 {
    def main(args: Array[String]): Unit = {
        val a = new A
//        println(a.a)
    }
}

class A{
   private val a = 10
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
 */