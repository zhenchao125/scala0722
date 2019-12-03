package com.atguigu.scala0722.day04.high

/**
  * Author lzc
  * Date 2019/12/3 16:19
  */
object Sort {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        val list2: List[Int] = list1.sorted
        //        val list2 = list1.sorted(Ordering.Int.reverse)
        //        println(list1)
        //        println(list2)
        
        //        val list1 = List("a", "c", "b", "d", "aa")
        //        println(list1.sorted)
        //        println(list1.sorted(Ordering.String.reverse))
        val list = List(new User(10, "lisi"), new User(20, "zs"), new User(15, "ww"))
        println(list.sorted(new OrderingUser().reverse))  // Ordering[User]
    }
}

class OrderingUser extends Ordering[User]{
    override def compare(x: User, y: User): Int = x.age - y.age
}


class User(val age: Int, val name: String) {
    override def toString: String = s"[age = $age, name = $name]"
}


/*
scala中提供了3个支持排序的方法:

sorted
    返回一个已经拍好序的集合, 对原集合不做任何变化

sortBy

sortWith

 */