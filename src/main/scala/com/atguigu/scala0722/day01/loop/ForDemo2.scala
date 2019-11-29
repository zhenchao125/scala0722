package com.atguigu.scala0722.day01.loop

import scala.collection.immutable

object ForDemo2 {
    def main(args: Array[String]): Unit = {
        // 打印99乘法表
        /*for (i <- 1 to 9) {
            for(j <- 1 to i){
                print(s"$j * $i = ${i * j}\t")
                
            }
            println()
        }*/
        
        // for的嵌套
        /*for(i <- 1 to 9 ; j <- 1 to i){
            print(s"$j * $i = ${i * j}\t")
            if(i == j) println()
        }*/
        
        /*for(i <- 1 to 10 ; j = i * i){
            
            println(i, j)
        }*/
        
//        val a: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i * i
//        println(a)
        
        // for推导
        val a: immutable.IndexedSeq[String] = for(i <- "abc") yield i + "a"
        println(a.mkString(","))
    
//        println("abc".map(x => x + "a").mkString(","))
        
    }
}
