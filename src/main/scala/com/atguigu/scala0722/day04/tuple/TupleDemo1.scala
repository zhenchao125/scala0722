package com.atguigu.scala0722.day04.tuple

/**
  * Author lzc
  * Date 2019/12/3 11:22
  */
object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        // 创建元组
        //        val t2 = Tuple2(10, false)
        //        val t2 = (1, false)
        //        println(t2._1)
        //        println(t2._2)
        //        val t2: (Int, Int) = /%(10, 3)
        //        println(t2._1)
        //        println(t2._2)
        
        // 模式匹配
        val (a, _) = /%(10, 3)
        println(a);
//        println(b)
        
        println (4) ;
        println
        (1, 2)
        val t2 = (10, 20)
        
        // 遍历元组
        val it: Iterator[Any] = t2.productIterator
        for (elem <- it) {
            println(elem)
        }
        
        
    }
    
    
    def /%(n1: Int, n2: Int) = (n1 / n2, n1 % n2)
    
}

/*
元组:

 */