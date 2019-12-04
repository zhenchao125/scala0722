package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 14:29
  */
object PattDemo3 {
    def main(args: Array[String]): Unit = {
        /*val list = List(1, 10, "abc", false, "100", 11.1)
        
        list.foreach(x => {
            x match {
                case a: Any =>
                case n: Int => println(n * n)
                case s: String => println(s)
                case _ =>
            }
            
            
        })*/
        
        //        val arr: Any = Array(1, 2)
        val arr: Any = Set[Int](1, 2)
        arr match {
            //                        case arr: Array[Int] => println("Array[Int] ...")
            //            case arr: Array[String] => println("Array[Int] ...")
            //            case a: List[Int] => println("List[Int]...")
            case a: List[_] => println("List[_]...")
            case b: Set[_] => println("set[_]")
        }
    }
}



/*
类型的匹配

泛型:
    泛型擦除
 */