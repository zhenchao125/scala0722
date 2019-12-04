package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 16:48
  */
object PartitionDemo1 {
    def main(args: Array[String]): Unit = {
        val list: List[(Int, (Int, (Int, Int)))] = List((1, (2, (3, 4))), (10, (20, (30, 40))))
        list.foreach({
            case (a, (b, (c, d))) => println(d)
        })
        
        // 偏函数 PartialFunction
        
        /*val f: PartialFunction[(Int, Int), Unit] = {
            case (a, b) => println(a, b)
        }
        
        
        f((10, 20))*/
        
        
        //        val a = List(1, 2, 3, "a", false)
        
        /*val rest: List[Int] = a.map({
            case a: Int => a * a
            case _ => 0
        })*/
        // filter + map
        /* val rest = a.collect({
             case a:Int => a * a
         })
         println(rest)*/
        
    }
}

/*
什么是偏函数:
 用大括号括起来的一堆case语句
 */