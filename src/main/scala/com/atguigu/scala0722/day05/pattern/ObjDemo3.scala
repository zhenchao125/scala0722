package com.atguigu.scala0722.day05.pattern

import java.util

/**
  * Author lzc
  * Date 2019/12/4 16:03
  */
object ObjDemo3 {
    def main(args: Array[String]): Unit = {
        val names = "zs,lisi,ww,zs"
        
        names match {
            case Names(a, b, rest@_*) =>
                println(a)
                println(b)
                println(rest.mkString(", "))
        }
        
    }
}

object Names {
    // Seq
    def unapplySeq(s: String) = {
        if (s != null && s.length > 0) Some(s.split(",").toIndexedSeq)
        else None
    }
}

