package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 16:19
  */
object Sort1 {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        println(list1.sortBy(x => x)(Ordering.Int.reverse))
        //        println(list1.sortBy(x => -x))
//        val list1 = List("aaa", "ac", "bccc", "aaaa", "aa")
//       val list2: List[String] = list1.sortBy(x => (x.length, x))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String.reverse))\
    
        val list = List(new User(10, "lisi"), new User(20, "zs"), new User(15, "ww"))
        val list2 = list.sortBy(user => (user.age, user.name))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String.reverse))
        println(list2)
    }
}


/*
scala中提供了3个支持排序的方法:

sorted
    返回一个已经拍好序的集合, 对原集合不做任何变化

sortBy
    指定排序的指标

sortWith
 

 */