package com.atguigu.scala0722.day03.single

/**
  * Author lzc
  * Date 2019/12/2 15:12
  */
object Human {
    
    def main(args: Array[String]): Unit = {
        val human: Human = getHuman("白")
        human.foo
    }
    
    
    def getHuman(color: String) = {
        new Human(color)
    }
    
}


class Human private (val color:String){
   
   private def foo = {}
    
    override def toString: String = s"人种: $color"
}
/*
伴生关系:
    伴生类
    伴生对象
    
    1. 二者必须在同一个文件中声明
    2. 他们的名字必须一样
    3. 伴生类和伴生对象可以互相访问对方的私有成员
 

 */