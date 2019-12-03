package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 15:38
  */
object FlodLeft {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        val sum: Int = list1.foldLeft(0)(_ + _)
        //        val sum: Int = list1.foldLeft(1)(_ * _)
        //        println(sum)
        
        // 使用foldLeft实现一个wordCount
        
        val arr = Array("hello", "hello", "hell", "abc", "a", "a")
        // 1.选择 zero 值, 决定了最后的返回值的类型
        //2. 返回需要什么: hello->1 a->2  map
        /*val map: mutable.Map[String, Int] = arr.foldLeft(mutable.Map[String, Int]())((map, word) => {
            map += word -> (map.getOrElse(word, 0) + 1)
            map
        })*/
        
        val map = arr.foldLeft(Map[String, Int]())((map, word) => {
            map + (word -> (map.getOrElse(word, 0) + 1))
        })
        
        println(map)
        
        
    }
}
