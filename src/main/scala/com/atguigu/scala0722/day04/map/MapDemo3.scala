package com.atguigu.scala0722.day04.map

import scala.collection.mutable

object MapDemo3 {
    def main(args: Array[String]): Unit = {
        val map: mutable.Map[String, Int] = mutable.Map("a" -> 97, ("b", 98), ("c", 99), ("d", 99))
        
        map += "a" -> 100
        val v = map.getOrElseUpdate("z", 126)
        println(map)
    
        /*println(foo(9).getOrElse(0))
        println(foo(-9).getOrElse(0))*/
    }
    
    
    def foo(x: Double) = {
        if(x >= 0) Some(math.sqrt(x))
        else None
    }
}

/*



*/
