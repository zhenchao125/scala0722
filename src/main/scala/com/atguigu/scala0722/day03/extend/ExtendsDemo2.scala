package com.atguigu.scala0722.day03.extend

/**
  * Author lzc
  * Date 2019/12/2 14:24
  */
object ExtendsDemo2 {
    def main(args: Array[String]): Unit = {
        new C
    }
}

class F(val m1:Int){
    def this(){
        this(10)
        println("F 辅构造")
    }
    println("F 主构造")
}

class C extends F{
    
    println("C 主构造")
}

/*
先调用父类的构造函数 -> 子类的构造函数

java: 类的成员
    静态代码  构造代码  构造函数  成员变量 静态变量  成员方法  静态方法
    
    构造对象的时候, 考虑子父类
    
    父静态代码块->子的静态代码->父类的构造代码块->父类的构造器->子类的构造代码块->子类的构造器
    
scala:
    主构造和辅构造

   父的主构造->(显示的指定)辅构造->子的主构造->?辅构造
 */