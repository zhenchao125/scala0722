package com.atguigu.scala0722.day05.homework

import scala.io.Source

/**
  * Author lzc
  * Date 2019/12/4 8:16
  */
object Homework5 {
    def main(args: Array[String]): Unit = {
        val source = Source.fromFile("C:\\Users\\lzc\\Desktop\\class_code\\2019_07_22\\02_scala\\scala0722\\src\\main\\scala\\com\\atguigu\\scala0722\\day05\\homework\\Homework5.scala", "utf-8").getLines()
        val res = source.flatMap(line => line.split("\\W+")).toList
            .filter(_.length > 0)
            .groupBy(x => x)
            .map(kv => (kv._1, kv._2.length))
            .toList
//            .sortWith(_._2 > _._2)
            .sortWith((x, y) => x._2 > y._2)
            .take(3)
        println(res)
        
        
    }
}

/*5. 实现一个 scala 版的 wordcount
读取文件, 然后实现*/
