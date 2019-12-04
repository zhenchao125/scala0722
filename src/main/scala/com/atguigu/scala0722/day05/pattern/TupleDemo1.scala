package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 15:25
  */
object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        val a: Any = (1, 2, 4,5)
        
        a match {
//            case (aa, bb) => println(aa)
//            case (aa, _) => println(aa)
            case (aa, 2) => println(aa)
            
        }
    }
}
// 偏函数