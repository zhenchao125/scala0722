package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 14:36
  */
object FilterDemo1 {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
    
        //        val list2: List[Int] = list1.filter(x => x > 30)
        //        val list2: List[Int] = list1.filter(_ > 30)
        //        println(list2)
    
    
        // 计算所有偶数的和
        val list1 = List(30, 50, 7, 6, 1, 20, "false", false, null)
        val sum: Int = list1
            .filter(_.isInstanceOf[Int])
            .map(_.asInstanceOf[Int])
            .filter(_ % 2 == 0)
            .sum
        println(sum)
    }
    
}
