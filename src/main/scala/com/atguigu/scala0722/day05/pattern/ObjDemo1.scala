package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 15:32
  */
object ObjDemo1 {
    def main(args: Array[String]): Unit = {
        val a = 9.0
        a match {
            case Sqrt(r) => println(r)
        }
    }
}

object Sqrt {
    //    def unapply(a: Double): Option[Double] = if (a >= 0) Some(math.sqrt(a)) else None
    def unapply(a: Double): M = new M(a)
}

class M(a: Double) {
    def isEmpty = a < 0
    
    //    def isDefined = !isEmpty
    
    def get = math.sqrt(a)
}

/*
2.11 开始对unapply返回的的类型做了放宽:
    只要返回的类型中有下面两个方法就行:
    
    1. isEmpty  返回boolean
    2. get
 */